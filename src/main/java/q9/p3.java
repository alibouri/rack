package q9;

import Ec.i;
import Hc.b;
import U5.a;
import Wc.k;
import android.app.DownloadManager;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager.NameNotFoundException;
import hd.c;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;
import m9.d;
import m9.e;
import m9.f;
import m9.g;
import m9.h;
import m9.j;
import m9.m;

public final class p3 {
    public final Object a;
    public Integer b;
    public String c;
    public final C3 d;
    public final DownloadManager e;
    public final File f;
    public final File g;
    public final File h;
    public boolean i;
    public final boolean j;
    public static final IntentFilter k;
    public static final k l;
    public static final HashMap m;

    static {
        p3.k = new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE");
        new k(a.O(3600000, 1L));
        k.a(1L);
        p3.l = k.a(1L);
        k.a(5L);
        HashMap hashMap0 = new HashMap();
        p3.m = hashMap0;
        hashMap0.put("copy", new f(0));
        hashMap0.put("dtar-bsdiff", new f(1));
    }

    public p3(C3 c30) {
        this.a = new Object();
        this.b = null;
        this.c = null;
        this.j = false;
        this.d = c30;
        this.e = (DownloadManager)c30.getSystemService("download");
        try {
            this.f = o0.t(c30, "updates");
            this.g = o0.t(c30, "failed");
            this.h = o0.t(c30, "apks");
        }
        catch(Exception exception0) {
            c.a.n("Updater");
            c.a.m(exception0, "Exception setting up updater", new Object[0]);
            this.h = null;
            this.g = null;
            this.f = null;
            this.j = true;
        }
        a5.c c0 = new a5.c(12, this);
        w1.c.e(this.d, c0, p3.k, null, 2);
    }

    public static void a(p3 p30, File file0) {
        hd.a a1;
        File file6;
        m m1;
        File file5;
        File file7;
        ByteBuffer byteBuffer2;
        b b3;
        int v8;
        byte[] arr_b7;
        byte[] arr_b6;
        b b2;
        b b1;
        b b0;
        p30.getClass();
        m m0 = new m(file0);
        f f0 = (f)p3.m.get(m0.h);
        File file1 = p30.f(m0);
        File file2 = File.createTempFile(file1.getName(), ".tmp", p30.h);
        hd.a a0 = c.a;
        a0.n("Updater");
        a0.g("Applying patch: " + file0, new Object[0]);
        File file3 = p30.d(m0);
        if(f0.a == 0) {
            m1 = m0;
            file6 = file1;
            a1 = a0;
            try(FileInputStream fileInputStream0 = new FileInputStream(file0)) {
                file7 = file2;
                try(FileOutputStream fileOutputStream2 = new FileOutputStream(file7)) {
                    byte[] arr_b9 = new byte[0x4000];
                    int v19;
                    while((v19 = fileInputStream0.read(arr_b9)) > 0) {
                        fileOutputStream2.write(arr_b9, 0, v19);
                    }
                }
            }
        }
        else {
            File file4 = File.createTempFile("tmp", ".dtar");
            FileOutputStream fileOutputStream0 = new FileOutputStream(file4);
            byte[] arr_b = h.g;
            if(file3 != null && file3.length() != 0L) {
                i i0 = new i(file3);
                Closeable closeable0 = i0.Y;
                h h0 = new h();  // initializer: Ljava/lang/Object;-><init>()V
                h0.b = ByteBuffer.allocate(16).order(ByteOrder.BIG_ENDIAN);
                h0.c = new byte[0];
                hd.a a2 = a0;
                h0.e = -1L;
                h0.a = fileOutputStream0;
                fileOutputStream0.write(arr_b);
                m9.k k0 = new m9.k();  // initializer: Ljava/lang/Object;-><init>()V
                k0.b = new byte[0x2000];
                k0.c = new byte[0x2000];
                k0.a = h0;
                TreeSet treeSet0 = new TreeSet();
                byte[] arr_b1 = new byte[4];
                while(((RandomAccessFile)closeable0).read(arr_b1, 0, 4) == 4) {
                    if(Arrays.equals(arr_b1, m9.c.l) || Arrays.equals(arr_b1, m9.c.m)) {
                        a1 = a2;
                        file5 = file2;
                        m1 = m0;
                        file6 = file1;
                        Iterator iterator0 = treeSet0.iterator();
                        while(iterator0.hasNext()) {
                            Object object0 = iterator0.next();
                            j j0 = (j)object0;
                            if(!j0.X.isEmpty() || j0.c0 != 0L) {
                                long v = j0.c0;
                                h h1 = k0.a;
                                String s = j0.X;
                                long v1 = h1.e;
                                if(v1 >= 0L) {
                                    if(v1 != h1.d) {
                                        throw new IOException("File size does not match amount written");
                                    }
                                    h1.e = -1L;
                                }
                                byte[] arr_b2 = s.getBytes(e.b);
                                if(h.f.compare(h1.c, arr_b2) >= 0) {
                                    throw new IOException("Filenames are out of order");
                                }
                                h1.c = arr_b2;
                                ByteBuffer byteBuffer0 = h1.b;
                                byteBuffer0.clear();
                                byteBuffer0.putShort(((short)arr_b2.length));
                                byteBuffer0.putLong(v);
                                byte[] arr_b3 = byteBuffer0.array();
                                FileOutputStream fileOutputStream1 = h1.a;
                                fileOutputStream1.write(arr_b3, 0, 2);
                                fileOutputStream1.write(arr_b2);
                                fileOutputStream1.write(byteBuffer0.array(), 2, 8);
                                h1.d = v;
                                h1.e = 0L;
                                ((RandomAccessFile)closeable0).seek(j0.b0);
                                if(j0.Z) {
                                    k0.a(i0, new m9.i(3, k0));
                                }
                                else {
                                    for(long v2 = j0.c0; v2 > 0L; v2 -= (long)v3) {
                                        byte[] arr_b4 = k0.b;
                                        int v3 = ((RandomAccessFile)closeable0).read(arr_b4, 0, ((int)Math.min(v2, arr_b4.length)));
                                        h1.a(arr_b4, 0, v3);
                                    }
                                }
                                iterator0 = iterator0;
                            }
                        }
                        h h2 = k0.a;
                        long v4 = h2.e;
                        if(v4 >= 0L) {
                            if(v4 != h2.d) {
                                throw new IOException("File size does not match amount written");
                            }
                            h2.e = -1L;
                        }
                        h2.a.close();
                    label_93:
                        i i1 = new i(file4);
                        Closeable closeable1 = i1.Y;
                        m9.i i2 = new m9.i(0);
                        file5.delete();
                        i2.Y = new RandomAccessFile(file5, "rw");
                        g g0 = new g(new m9.c(i2));
                        byte[] arr_b5 = new byte[8];
                        ByteBuffer byteBuffer1 = ByteBuffer.allocate(24).order(ByteOrder.LITTLE_ENDIAN);
                        BufferedInputStream bufferedInputStream0 = new BufferedInputStream(new FileInputStream(file0));
                        bufferedInputStream0.read(arr_b5);
                        bufferedInputStream0.read(byteBuffer1.array());
                        bufferedInputStream0.close();
                        if(!Arrays.equals(arr_b5, d.a)) {
                            throw new IOException("Invalid bsdiff file header");
                        }
                        long v5 = byteBuffer1.getLong();
                        long v6 = byteBuffer1.getLong();
                        long v7 = byteBuffer1.getLong();
                        BufferedInputStream bufferedInputStream1 = new BufferedInputStream(new FileInputStream(file0));
                        BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file0));
                        BufferedInputStream bufferedInputStream3 = new BufferedInputStream(new FileInputStream(file0));
                        bufferedInputStream1.skip(0x20L);
                        bufferedInputStream2.skip(v5 + 0x20L);
                        bufferedInputStream3.skip(v5 + 0x20L + v6);
                        try {
                            Hc.d d0 = new Hc.d();  // initializer: Ljava/lang/Object;-><init>()V
                            b0 = d0.a(bufferedInputStream1);
                            b1 = d0.a(bufferedInputStream2);
                            b2 = d0.a(bufferedInputStream3);
                            arr_b6 = new byte[0x2000];
                            arr_b7 = new byte[0x2000];
                            v8 = 0;
                        }
                        catch(Hc.a unused_ex) {
                            throw new IOException("Invalid compressed data");
                        }
                        while(((long)v8) < v7) {
                            byteBuffer1.rewind();
                            b0.read(byteBuffer1.array());
                            long v9 = byteBuffer1.getLong();
                            long v10 = byteBuffer1.getLong();
                            long v11 = byteBuffer1.getLong();
                            if((v11 & 0x8000000000000000L) == 0L) {
                                b3 = b0;
                                byteBuffer2 = byteBuffer1;
                            }
                            else {
                                b3 = b0;
                                byteBuffer2 = byteBuffer1;
                                v11 = -(v11 & 0x7FFFFFFFFFFFFFFFL);
                            }
                            while(true) {
                                byteBuffer1 = byteBuffer2;
                                if(Long.compare(v9, 0L) <= 0) {
                                    break;
                                }
                                int v12 = (int)Math.min(v9, 0x2000L);
                                i1.read(arr_b6, 0, v12);
                                b1.read(arr_b7, 0, v12);
                                for(int v13 = 0; v13 < v12; ++v13) {
                                    arr_b6[v13] = (byte)(arr_b6[v13] + arr_b7[v13]);
                                }
                                g0.write(arr_b6, 0, v12);
                                v8 += v12;
                                v9 -= (long)v12;
                                byteBuffer2 = byteBuffer1;
                                v7 = v7;
                            }
                            for(long v14 = v10; v14 > 0L; v14 -= (long)v15) {
                                int v15 = (int)Math.min(v14, 0x2000L);
                                b2.read(arr_b6, 0, v15);
                                g0.write(arr_b6, 0, v15);
                                v8 += v15;
                            }
                            ((RandomAccessFile)closeable1).seek(((RandomAccessFile)closeable1).getFilePointer() + v11);
                            b0 = b3;
                            v7 = v7;
                        }
                        g0.close();
                        file7 = file5;
                        goto label_223;
                    }
                    if(!Arrays.equals(arr_b1, m9.c.j)) {
                        throw new IOException("Invalid zip file. This might be because v2 signing is enabled. Ensure that you have \'v2SigningEnabled false\' in the signing configuration for this target.");
                    }
                    j j1 = new j();  // initializer: Ljava/lang/Object;-><init>()V
                    ByteBuffer byteBuffer3 = ByteBuffer.allocate(26).order(ByteOrder.LITTLE_ENDIAN);
                    i0.read(byteBuffer3.array(), 0, 26);
                    int v16 = byteBuffer3.getShort(2);
                    boolean z = byteBuffer3.getShort(4) == 8;
                    j1.Z = z;
                    j1.c0 = (long)byteBuffer3.getInt(18);
                    int v17 = byteBuffer3.getShort(22);
                    int v18 = byteBuffer3.getShort(24);
                    byte[] arr_b8 = new byte[v17];
                    j1.Y = arr_b8;
                    ((RandomAccessFile)closeable0).read(arr_b8, 0, v17);
                    ((RandomAccessFile)closeable0).read(new byte[v18], 0, v18);
                    j1.X = new String(arr_b8, ((v16 & 0x800) == 0 ? e.b : e.a));
                    j1.b0 = ((RandomAccessFile)closeable0).getFilePointer();
                    treeSet0.add(j1);
                    if(z) {
                        j1.c0 = 0L;
                        k0.a(i0, new m9.i(2, j1));
                    }
                    else {
                        i0.skip(j1.c0);
                    }
                    if((v16 & 8) != 0) {
                        i0.skip(16L);
                    }
                    file1 = file1;
                    a2 = a2;
                    arr_b1 = arr_b1;
                    m0 = m0;
                    file2 = file2;
                }
                throw new IOException("Truncated zip file");
            }
            else {
                file5 = file2;
                m1 = m0;
                file6 = file1;
                a1 = a0;
                ByteBuffer.allocate(16).order(ByteOrder.BIG_ENDIAN);
                fileOutputStream0.write(arr_b);
                fileOutputStream0.close();
                goto label_93;
            }
        }
    label_223:
        String s1 = d.a(new FileInputStream(file7));
        if(m1.f.equals(s1)) {
            if(!file7.renameTo(file6)) {
                throw new IOException("Couldn\'t rename " + file7 + " to " + file6);
            }
            a1.n("Updater");
            a1.g("Patch successful, produced: %s", new Object[]{file6});
            Intent intent0 = new Intent("com.wave.updater.UPDATE_READY");
            i2.b.a(p30.d).c(intent0);
            return;
        }
        a1.n("Updater");
        a1.l("Patch produced a file with a bad hash.", new Object[0]);
        p3.b(file7);
        throw new IOException("Patch result had bad hash: " + s1);
    }

    public static void b(File file0) {
        if(file0.delete()) {
            c.a.n("Updater");
            c.a.g("Deleted: " + file0, new Object[0]);
            return;
        }
        c.a.n("Updater");
        c.a.l("Couldn\'t delete: " + file0, new Object[0]);
    }

    public static int c(File file0) {
        if(file0.getName().endsWith(".apk")) {
            String s = file0.getName().split("_")[0];
            try {
                return Integer.parseInt(s);
            }
            catch(NumberFormatException unused_ex) {
            }
        }
        return -1;
    }

    public final File d(m m0) {
        String s = m0.d;
        if(s == null) {
            return null;
        }
        long v = (long)this.e();
        long v1 = m0.c;
        if(v1 == v) {
            C3 c30 = this.d;
            if(this.c == null) {
                try(FileInputStream fileInputStream0 = new FileInputStream(new File(c30.getApplicationInfo().sourceDir))) {
                    this.c = d.a(fileInputStream0);
                }
                catch(IOException unused_ex) {
                }
                c.a.n("Updater");
                c.a.g("Current APK hash: " + this.c, new Object[0]);
            }
            return s.equals(this.c) ? new File(c30.getApplicationInfo().sourceDir) : new File(this.h, v1 + "_" + s + ".apk");
        }
        return new File(this.h, v1 + "_" + s + ".apk");
    }

    public final int e() {
        C3 c30 = this.d;
        if(this.b == null) {
            try {
                this.b = (int)c30.getPackageManager().getPackageInfo("com.wave.personal", 0).versionCode;
                c.a.n("Updater");
                c.a.g("Current APK version is " + this.b, new Object[0]);
                return (int)this.b;
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
                throw new RuntimeException("Can\'t find app version code");
            }
        }
        return (int)this.b;
    }

    public final File f(m m0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(m0.e);
        stringBuilder0.append("_");
        String s = m5.b.y(stringBuilder0, m0.f, ".apk");
        return new File(this.h, s);
    }

    public final boolean g(m m0) {
        if(this.f(m0).isFile()) {
            c.a.n("Updater");
            c.a.g("Unneeded because target file already exists: " + m0, new Object[0]);
            return false;
        }
        if(!p3.m.containsKey(m0.h)) {
            c.a.n("Updater");
            c.a.g("Unusable due to unsupported format: " + m0, new Object[0]);
            return false;
        }
        if(new File(this.g, m0.b).isFile()) {
            c.a.n("Updater");
            c.a.g("Previously marked as failed: " + m0, new Object[0]);
            return false;
        }
        long v = (long)this.e();
        if(m0.e <= v) {
            c.a.n("Updater");
            c.a.g("Unusable because target version is old: " + m0, new Object[0]);
            return false;
        }
        File file0 = this.d(m0);
        if(file0 != null && !file0.isFile()) {
            c.a.n("Updater");
            c.a.g("Unusable because base file not available: " + m0, new Object[0]);
            return false;
        }
        return true;
    }

    public final void h(m m0) {
        File file0 = new File(this.g, m0.b);
        try {
            new FileOutputStream(file0).close();
        }
        catch(IOException unused_ex) {
        }
    }
}

