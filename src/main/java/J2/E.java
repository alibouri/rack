package j2;

import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

public final class e implements Closeable {
    public final File X;
    public final long Y;
    public final File Z;
    public final RandomAccessFile b0;
    public final FileChannel c0;
    public final FileLock d0;

    public e(File file0, File file1) {
        Log.i("MultiDex", "MultiDexExtractor(" + file0.getPath() + ", " + file1.getPath() + ")");
        FileChannel fileChannel0;
        this.X = file0;
        this.Z = file1;
        this.Y = e.f(file0);
        File file2 = new File(file1, "MultiDex.lock");
        RandomAccessFile randomAccessFile0 = new RandomAccessFile(file2, "rw");
        this.b0 = randomAccessFile0;
        try {
            fileChannel0 = randomAccessFile0.getChannel();
            this.c0 = fileChannel0;
        }
        catch(IOException | RuntimeException | Error iOException0) {
            e.a(this.b0);
            throw iOException0;
        }
        try {
            Log.i("MultiDex", "Blocking on lock " + file2.getPath());
            this.d0 = fileChannel0.lock();
            goto label_16;
        }
        catch(IOException | RuntimeException | Error iOException1) {
            try {
                e.a(this.c0);
                throw iOException1;
            label_16:
                Log.i("MultiDex", file2.getPath() + " locked");
                return;
            }
            catch(IOException | RuntimeException | Error iOException0) {
            }
        }
        e.a(this.b0);
        throw iOException0;
    }

    public static void a(Closeable closeable0) {
        try {
            closeable0.close();
        }
        catch(IOException iOException0) {
            Log.w("MultiDex", "Failed to close resource", iOException0);
        }
    }

    public static void b(ZipFile zipFile0, ZipEntry zipEntry0, d d0, String s) {
        InputStream inputStream0 = zipFile0.getInputStream(zipEntry0);
        File file0 = File.createTempFile(("tmp-" + s), ".zip", d0.getParentFile());
        Log.i("MultiDex", "Extracting " + file0.getPath());
        try {
            ZipOutputStream zipOutputStream0 = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file0)));
            try {
                ZipEntry zipEntry1 = new ZipEntry("classes.dex");
                zipEntry1.setTime(zipEntry0.getTime());
                zipOutputStream0.putNextEntry(zipEntry1);
                byte[] arr_b = new byte[0x4000];
                for(int v2 = inputStream0.read(arr_b); v2 != -1; v2 = inputStream0.read(arr_b)) {
                    zipOutputStream0.write(arr_b, 0, v2);
                }
                zipOutputStream0.closeEntry();
            }
            finally {
                zipOutputStream0.close();
            }
            if(file0.setReadOnly()) {
                Log.i("MultiDex", "Renaming to " + d0.getPath());
                if(!file0.renameTo(d0)) {
                    throw new IOException("Failed to rename \"" + file0.getAbsolutePath() + "\" to \"" + d0.getAbsolutePath() + "\"");
                }
                return;
            }
        }
        finally {
            e.a(inputStream0);
            file0.delete();
        }
        throw new IOException("Failed to mark readonly \"" + file0.getAbsolutePath() + "\" (tmp of \"" + d0.getAbsolutePath() + "\")");
    }

    @Override
    public final void close() {
        this.d0.release();
        this.c0.close();
        this.b0.close();
    }

    public static long f(File file0) {
        try(RandomAccessFile randomAccessFile0 = new RandomAccessFile(file0, "r")) {
            Fc.d d0 = yc.d.k(randomAccessFile0);
            CRC32 cRC320 = new CRC32();
            long v = d0.b;
            randomAccessFile0.seek(d0.a);
            byte[] arr_b = new byte[0x4000];
            for(int v1 = randomAccessFile0.read(arr_b, 0, ((int)Math.min(0x4000L, v))); true; v1 = randomAccessFile0.read(arr_b, 0, ((int)Math.min(0x4000L, v)))) {
                if(v1 == -1) {
                    break;
                }
                cRC320.update(arr_b, 0, v1);
                v -= (long)v1;
                if(v == 0L) {
                    break;
                }
            }
            long v2 = cRC320.getValue();
            return v2 == -1L ? -2L : v2;
        }
    }

    public final ArrayList h(b b0, boolean z) {
        ArrayList arrayList1;
        ArrayList arrayList0;
        File file0 = this.X;
        Log.i("MultiDex", "MultiDexExtractor.load(" + file0.getPath() + ", " + z + ", )");
        if(!this.d0.isValid()) {
            throw new IllegalStateException("MultiDexExtractor was closed");
        }
        if(z) {
        label_20:
            if(z) {
                Log.i("MultiDex", "Forced extraction must be performed.");
            }
            else {
                Log.i("MultiDex", "Detected that extraction must be performed.");
            }
            arrayList1 = this.q();
            long v3 = file0.lastModified();
            if(v3 == -1L) {
                v3 = -2L;
            }
            e.r(b0, v3, this.Y, arrayList1);
            arrayList0 = arrayList1;
        }
        else {
            SharedPreferences sharedPreferences0 = b0.getSharedPreferences("multidex.version", 4);
            long v = sharedPreferences0.getLong("timestamp", -1L);
            long v1 = file0.lastModified();
            if(v1 == -1L) {
                v1 = -2L;
            }
            if(v != v1 || sharedPreferences0.getLong("crc", -1L) != this.Y) {
                goto label_20;
            }
            else {
                try {
                    arrayList0 = this.l(b0);
                }
                catch(IOException iOException0) {
                    Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", iOException0);
                    arrayList1 = this.q();
                    long v2 = file0.lastModified();
                    if(v2 == -1L) {
                        v2 = -2L;
                    }
                    e.r(b0, v2, this.Y, arrayList1);
                    arrayList0 = arrayList1;
                    Log.i("MultiDex", "load found " + arrayList0.size() + " secondary dex files");
                    return arrayList0;
                }
            }
        }
        Log.i("MultiDex", "load found " + arrayList0.size() + " secondary dex files");
        return arrayList0;
    }

    public final ArrayList l(b b0) {
        Log.i("MultiDex", "loading existing secondary dex files");
        String s = this.X.getName() + ".classes";
        SharedPreferences sharedPreferences0 = b0.getSharedPreferences("multidex.version", 4);
        int v = sharedPreferences0.getInt("dex.number", 1);
        ArrayList arrayList0 = new ArrayList(v - 1);
        for(int v1 = 2; v1 <= v; ++v1) {
            d d0 = new d(this.Z, s + v1 + ".zip");
            if(!d0.isFile()) {
                throw new IOException("Missing extracted secondary dex file \'" + d0.getPath() + "\'");
            }
            d0.X = e.f(d0);
            long v2 = sharedPreferences0.getLong("dex.crc." + v1, -1L);
            long v3 = sharedPreferences0.getLong("dex.time." + v1, -1L);
            long v4 = d0.lastModified();
            if(v3 != v4 || v2 != d0.X) {
                throw new IOException("Invalid extracted dex: " + d0 + " (key \"\"), expected modification time: " + v3 + ", modification time: " + v4 + ", expected crc: " + v2 + ", file crc: " + d0.X);
            }
            arrayList0.add(d0);
        }
        return arrayList0;
    }

    public final ArrayList q() {
        Throwable throwable2;
        int v4;
        File file0 = this.X;
        String s = file0.getName() + ".classes";
        c c0 = new c();  // initializer: Ljava/lang/Object;-><init>()V
        File file1 = this.Z;
        File[] arr_file = file1.listFiles(c0);
        if(arr_file == null) {
            Log.w("MultiDex", "Failed to list secondary dex dir content (" + file1.getPath() + ").");
        }
        else {
            for(int v = 0; v < arr_file.length; ++v) {
                File file2 = arr_file[v];
                Log.i("MultiDex", "Trying to delete old file " + file2.getPath() + " of size " + file2.length());
                if(file2.delete()) {
                    Log.i("MultiDex", "Deleted old file " + file2.getPath());
                }
                else {
                    Log.w("MultiDex", "Failed to delete old file " + file2.getPath());
                }
            }
        }
        ArrayList arrayList0 = new ArrayList();
        ZipFile zipFile0 = new ZipFile(file0);
        try {
            int v1 = 2;
            ZipEntry zipEntry0 = zipFile0.getEntry("classes" + 2 + ".dex");
            while(true) {
                if(zipEntry0 == null) {
                    goto label_59;
                }
                d d0 = new d(file1, s + v1 + ".zip");
                arrayList0.add(d0);
                Log.i("MultiDex", "Extraction is needed for file " + d0);
                int v2 = 0;
                int v3 = 0;
            label_28:
                if(v2 >= 3 || v3 != 0) {
                    if(v3 == 0) {
                        throw new IOException("Could not create zip file " + d0.getAbsolutePath() + " for secondary dex (" + v1 + ")");
                    }
                    ++v1;
                    zipEntry0 = zipFile0.getEntry("classes" + v1 + ".dex");
                    s = s;
                    continue;
                }
                e.b(zipFile0, zipEntry0, d0, s);
                try {
                    d0.X = e.f(d0);
                    v4 = 1;
                }
                catch(IOException iOException0) {
                    Log.w("MultiDex", "Failed to read crc from " + d0.getAbsolutePath(), iOException0);
                    v4 = 0;
                }
                catch(Throwable throwable1) {
                    throwable2 = throwable1;
                    break;
                }
                Log.i("MultiDex", "Extraction succeeded \'" + d0.getAbsolutePath() + "\': length " + d0.length() + " - crc: " + d0.X);
                s = s;
                zipEntry0 = zipEntry0;
                v3 = v4;
                ++v2;
                goto label_28;
            }
        }
        catch(Throwable throwable0) {
            throwable2 = throwable0;
        }
        try {
            zipFile0.close();
        }
        catch(IOException iOException1) {
            Log.w("MultiDex", "Failed to close resource", iOException1);
        }
        throw throwable2;
        try {
        label_59:
            zipFile0.close();
        }
        catch(IOException iOException2) {
            Log.w("MultiDex", "Failed to close resource", iOException2);
        }
        return arrayList0;
    }

    public static void r(b b0, long v, long v1, ArrayList arrayList0) {
        SharedPreferences.Editor sharedPreferences$Editor0 = b0.getSharedPreferences("multidex.version", 4).edit();
        sharedPreferences$Editor0.putLong("timestamp", v);
        sharedPreferences$Editor0.putLong("crc", v1);
        sharedPreferences$Editor0.putInt("dex.number", arrayList0.size() + 1);
        int v2 = 2;
        for(Object object0: arrayList0) {
            sharedPreferences$Editor0.putLong("dex.crc." + v2, ((d)object0).X);
            sharedPreferences$Editor0.putLong("dex.time." + v2, ((d)object0).lastModified());
            ++v2;
        }
        sharedPreferences$Editor0.commit();
    }
}

