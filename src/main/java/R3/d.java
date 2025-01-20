package r3;

import C3.t;
import E3.l;
import Ec.F;
import Ec.b;
import Ec.i;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import x3.e;

public abstract class d {
    public static final HashMap a;
    public static final HashSet b;
    public static final byte[] c;
    public static final byte[] d;

    static {
        d.a = new HashMap();
        d.b = new HashSet();
        d.c = new byte[]{80, 75, 3, 4};
        d.d = new byte[]{0x1F, (byte)0x8B, 8};
    }

    public static o a(String s, Callable callable0, Runnable runnable0) {
        o o0 = null;
        a a0 = s == null ? null : e.b.a(s);
        if(a0 != null) {
            o0 = new o(a0);
        }
        HashMap hashMap0 = d.a;
        if(s != null && hashMap0.containsKey(s)) {
            o0 = (o)hashMap0.get(s);
        }
        if(o0 != null) {
            if(runnable0 != null) {
                runnable0.run();
            }
            return o0;
        }
        o o1 = new o(callable0);
        if(s != null) {
            AtomicBoolean atomicBoolean0 = new AtomicBoolean(false);
            o1.b(new c(s, atomicBoolean0, 0));
            o1.a(new c(s, atomicBoolean0, 1));
            if(!atomicBoolean0.get()) {
                hashMap0.put(s, o1);
                if(hashMap0.size() == 1) {
                    d.h();
                }
            }
        }
        return o1;
    }

    public static n b(Context context0, InputStream inputStream0, String s) {
        a a0 = s == null ? null : e.b.a(s);
        if(a0 != null) {
            return new n(a0);
        }
        try {
            F f0 = b.c(b.k(inputStream0));
            if(d.g(f0, d.c).booleanValue()) {
                return d.e(context0, new ZipInputStream(new i(f0, 1)), s);
            }
            return d.g(f0, d.d).booleanValue() ? d.c(new GZIPInputStream(new i(f0, 1)), s) : d.d(new D3.c(f0), s, true);
        }
        catch(IOException iOException0) {
            return new n(iOException0);
        }
    }

    public static n c(InputStream inputStream0, String s) {
        return d.d(new D3.c(b.c(b.k(inputStream0))), s, true);
    }

    public static n d(D3.c c0, String s, boolean z) {
        n n2;
        n n1;
        n n0;
        a a0;
        if(s == null) {
            a0 = null;
        }
        else {
            try {
                a0 = e.b.a(s);
            label_4:
                if(a0 == null) {
                    a a1 = t.a(c0);
                    if(s != null) {
                        e.b.a.l(s, a1);
                    }
                    n0 = new n(a1);
                    if(z) {
                        goto label_10;
                    }
                    return n0;
                }
                n1 = new n(a0);
                goto label_23;
            }
            catch(Exception exception0) {
                goto label_15;
            }
            catch(Throwable throwable0) {
                goto label_20;
            }
        }
        goto label_4;
    label_10:
        l.b(c0);
        return n0;
        try {
            try {
                n1 = new n(a0);
                goto label_23;
            }
            catch(Exception exception0) {
            }
        label_15:
            n2 = new n(exception0);
            if(z) {
                goto label_17;
            }
            return n2;
        }
        catch(Throwable throwable0) {
            goto label_20;
        }
    label_17:
        l.b(c0);
        return n2;
    label_20:
        if(z) {
            l.b(c0);
        }
        throw throwable0;
    label_23:
        if(z) {
            l.b(c0);
        }
        return n1;
    }

    public static n e(Context context0, ZipInputStream zipInputStream0, String s) {
        try {
            return d.f(context0, zipInputStream0, s);
        }
        finally {
            l.b(zipInputStream0);
        }
    }

    public static n f(Context context0, ZipInputStream zipInputStream0, String s) {
        byte[] arr_b1;
        r3.l l0;
        File file0;
        String s3;
        String s2;
        String s1;
        a a1;
        ZipEntry zipEntry0;
        a a0;
        HashMap hashMap0 = new HashMap();
        HashMap hashMap1 = new HashMap();
        if(s == null) {
            a0 = null;
        }
        else {
            try {
                a0 = e.b.a(s);
            label_6:
                if(a0 != null) {
                    return new n(a0);
                }
                zipEntry0 = zipInputStream0.getNextEntry();
                a1 = null;
                while(true) {
                label_10:
                    if(zipEntry0 == null) {
                        goto label_65;
                    }
                    s1 = zipEntry0.getName();
                    if(!s1.contains("__MACOSX")) {
                        if(!zipEntry0.getName().equalsIgnoreCase("manifest.json")) {
                            if(!zipEntry0.getName().contains(".json")) {
                                if(s1.contains(".png") || (s1.contains(".webp") || s1.contains(".jpg") || s1.contains(".jpeg"))) {
                                }
                                else if(!s1.contains(".ttf") && !s1.contains(".otf")) {
                                    zipInputStream0.closeEntry();
                                    zipEntry0 = zipInputStream0.getNextEntry();
                                    continue;
                                }
                                else {
                                    String[] arr_s = s1.split("/");
                                    s2 = arr_s[arr_s.length - 1];
                                    s3 = s2.split("\\.")[0];
                                    if(context0 == null) {
                                        return new n(new IllegalStateException("Unable to extract font " + s3 + " please pass a non-null Context parameter"));
                                    }
                                    file0 = new File(context0.getCacheDir(), s2);
                                    goto label_25;
                                }
                                goto label_53;
                            }
                            a1 = d.d(new D3.c(b.c(b.k(zipInputStream0))), null, false).a;
                            zipEntry0 = zipInputStream0.getNextEntry();
                            continue;
                        }
                        goto label_58;
                    }
                    goto label_60;
                }
            }
            catch(IOException iOException0) {
                return new n(iOException0);
            }
        }
        goto label_6;
        try {
        label_25:
            try(FileOutputStream fileOutputStream0 = new FileOutputStream(file0); FileOutputStream fileOutputStream1 = new FileOutputStream(file0)) {
                byte[] arr_b = new byte[0x1000];
                int v;
                while((v = zipInputStream0.read(arr_b)) != -1) {
                    fileOutputStream1.write(arr_b, 0, v);
                }
                fileOutputStream1.flush();
            }
            goto label_48;
        }
        catch(Throwable throwable0) {
            try {
                E3.d.c(("Unable to save font " + s3 + " to the temporary file: " + s2 + ". "), throwable0);
            label_48:
                Typeface typeface0 = Typeface.createFromFile(file0);
                if(!file0.delete()) {
                    E3.d.b(("Failed to delete temp font file " + file0.getAbsolutePath() + "."));
                }
                hashMap1.put(s3, typeface0);
                zipEntry0 = zipInputStream0.getNextEntry();
                goto label_10;
            label_53:
                String[] arr_s1 = s1.split("/");
                hashMap0.put(arr_s1[arr_s1.length - 1], BitmapFactory.decodeStream(zipInputStream0));
                zipEntry0 = zipInputStream0.getNextEntry();
                goto label_10;
            label_58:
                zipInputStream0.closeEntry();
                zipEntry0 = zipInputStream0.getNextEntry();
                goto label_10;
            label_60:
                zipInputStream0.closeEntry();
                zipEntry0 = zipInputStream0.getNextEntry();
                goto label_10;
            }
            catch(IOException iOException0) {
                return new n(iOException0);
            }
        }
    label_65:
        if(a1 == null) {
            return new n(new IllegalArgumentException("Unable to parse composition"));
        }
        for(Object object0: hashMap0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            String s4 = (String)map$Entry0.getKey();
            for(Object object1: ((HashMap)a1.c()).values()) {
                l0 = (r3.l)object1;
                if(!l0.d.equals(s4)) {
                    continue;
                }
                goto label_79;
            }
            l0 = null;
        label_79:
            if(l0 != null) {
                l0.f = l.d(((Bitmap)map$Entry0.getValue()), l0.a, l0.b);
            }
        }
        for(Object object2: hashMap1.entrySet()) {
            Map.Entry map$Entry1 = (Map.Entry)object2;
            boolean z = false;
            for(Object object3: a1.f.values()) {
                x3.c c0 = (x3.c)object3;
                Object object4 = map$Entry1.getKey();
                if(c0.a.equals(object4)) {
                    c0.d = (Typeface)map$Entry1.getValue();
                    z = true;
                }
            }
            if(!z) {
                E3.d.b(("Parsed font for " + ((String)map$Entry1.getKey()) + " however it was not found in the animation."));
            }
        }
        if(hashMap0.isEmpty()) {
            for(Object object5: ((HashMap)a1.c()).entrySet()) {
                r3.l l1 = (r3.l)((Map.Entry)object5).getValue();
                if(l1 == null) {
                    return null;
                }
                BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
                bitmapFactory$Options0.inScaled = true;
                bitmapFactory$Options0.inDensity = 0xA0;
                String s5 = l1.d;
                if(s5.startsWith("data:") && s5.indexOf("base64,") > 0) {
                    try {
                        arr_b1 = Base64.decode(s5.substring(s5.indexOf(44) + 1), 0);
                    }
                    catch(IllegalArgumentException illegalArgumentException0) {
                        E3.d.c("data URL did not have correct base64 format.", illegalArgumentException0);
                        return null;
                    }
                    l1.f = l.d(BitmapFactory.decodeByteArray(arr_b1, 0, arr_b1.length, bitmapFactory$Options0), l1.a, l1.b);
                }
            }
        }
        if(s != null) {
            e.b.a.l(s, a1);
        }
        return new n(a1);
    }

    public static Boolean g(F f0, byte[] arr_b) {
        try {
            F f1 = f0.a();
            for(int v = 0; v < arr_b.length; ++v) {
                int v1 = arr_b[v];
                if(f1.b() != v1) {
                    return Boolean.FALSE;
                }
            }
            f1.close();
            return Boolean.TRUE;
        }
        catch(NoSuchMethodError unused_ex) {
            return Boolean.FALSE;
        }
        catch(Exception unused_ex) {
            E3.d.a.getClass();
            return Boolean.FALSE;
        }
    }

    public static void h() {
        ArrayList arrayList0 = new ArrayList(d.b);
        if(arrayList0.size() <= 0) {
            return;
        }
        arrayList0.get(0).getClass();
        throw new ClassCastException();
    }
}

