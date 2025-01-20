package z1;

import G1.j;
import N4.o;
import P4.c;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel.MapMode;
import java.nio.channels.FileChannel;
import java.util.List;
import s.J;
import y1.e;
import y1.f;

public final class g extends o {
    public static final Class b;
    public static final Constructor c;
    public static final Method d;
    public static final Method e;

    static {
        Method method1;
        Method method0;
        Class class0;
        Constructor constructor0 = null;
        try {
            class0 = Class.forName("android.graphics.FontFamily");
            Constructor constructor1 = class0.getConstructor(null);
            method0 = class0.getMethod("addFontWeightStyle", ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE);
            Class[] arr_class = {Array.newInstance(class0, 1).getClass()};
            method1 = Typeface.class.getMethod("createFromFamiliesWithDefault", arr_class);
            constructor0 = constructor1;
        }
        catch(ClassNotFoundException | NoSuchMethodException classNotFoundException0) {
            Log.e("TypefaceCompatApi24Impl", classNotFoundException0.getClass().getName(), classNotFoundException0);
            method1 = null;
            class0 = null;
            method0 = null;
        }
        g.c = constructor0;
        g.b = class0;
        g.d = method0;
        g.e = method1;
    }

    public static boolean P(Object object0, ByteBuffer byteBuffer0, int v, int v1, boolean z) {
        try {
            return ((Boolean)g.d.invoke(object0, byteBuffer0, v, null, v1, Boolean.valueOf(z))).booleanValue();
        }
        catch(IllegalAccessException | InvocationTargetException unused_ex) {
            return false;
        }
    }

    public static Typeface Q(Object object0) {
        try {
            Object object1 = Array.newInstance(g.b, 1);
            Array.set(object1, 0, object0);
            return (Typeface)g.e.invoke(null, object1);
        }
        catch(IllegalAccessException | InvocationTargetException unused_ex) {
            return null;
        }
    }

    @Override  // N4.o
    public final Typeface m(Context context0, e e0, Resources resources0, int v) {
        Throwable throwable3;
        FileInputStream fileInputStream0;
        ByteBuffer byteBuffer0;
        Object object0;
        try {
            object0 = g.c.newInstance(null);
        }
        catch(IllegalAccessException | InstantiationException | InvocationTargetException unused_ex) {
            object0 = null;
        }
        if(object0 == null) {
            return null;
        }
        f[] arr_f = e0.a;
        int v1 = 0;
        while(v1 < arr_f.length) {
            f f0 = arr_f[v1];
            int v2 = f0.f;
            File file0 = c.K(context0);
            if(file0 == null) {
            label_37:
                byteBuffer0 = null;
            }
            else {
                try {
                    if(c.s(file0, resources0, v2)) {
                        goto label_16;
                    }
                    else {
                        goto label_13;
                    }
                    goto label_37;
                }
                catch(Throwable throwable0) {
                    file0.delete();
                    throw throwable0;
                }
            label_13:
                file0.delete();
                byteBuffer0 = null;
                goto label_38;
                try {
                label_16:
                    fileInputStream0 = new FileInputStream(file0);
                }
                catch(IOException unused_ex) {
                    byteBuffer0 = null;
                    goto label_35;
                }
                catch(Throwable throwable0) {
                    file0.delete();
                    throw throwable0;
                }
                try {
                    FileChannel fileChannel0 = fileInputStream0.getChannel();
                    long v3 = fileChannel0.size();
                    byteBuffer0 = fileChannel0.map(FileChannel.MapMode.READ_ONLY, 0L, v3);
                    goto label_28;
                }
                catch(Throwable throwable1) {
                    try {
                        throwable3 = throwable1;
                        fileInputStream0.close();
                        throw throwable3;
                    }
                    catch(Throwable throwable2) {
                        try {
                            throwable3.addSuppressed(throwable2);
                            throw throwable3;
                        label_28:
                            fileInputStream0.close();
                            goto label_35;
                        }
                        catch(IOException unused_ex) {
                        }
                        catch(Throwable throwable0) {
                            file0.delete();
                            throw throwable0;
                        }
                    }
                }
                byteBuffer0 = null;
            label_35:
                file0.delete();
            }
        label_38:
            if(byteBuffer0 == null) {
                return null;
            }
            if(!g.P(object0, byteBuffer0, f0.e, f0.b, f0.c)) {
                return null;
            }
            ++v1;
        }
        return g.Q(object0);
    }

    @Override  // N4.o
    public final Typeface n(Context context0, j[] arr_j, int v) {
        Object object0;
        try {
            object0 = g.c.newInstance(null);
        }
        catch(IllegalAccessException | InstantiationException | InvocationTargetException unused_ex) {
            object0 = null;
        }
        if(object0 == null) {
            return null;
        }
        J j0 = new J(0);
        for(int v1 = 0; v1 < arr_j.length; ++v1) {
            j j1 = arr_j[v1];
            Uri uri0 = j1.a;
            ByteBuffer byteBuffer0 = (ByteBuffer)j0.get(uri0);
            if(byteBuffer0 == null) {
                byteBuffer0 = c.M(context0, uri0);
                j0.put(uri0, byteBuffer0);
            }
            if(byteBuffer0 == null) {
                return null;
            }
            if(!g.P(object0, byteBuffer0, j1.b, j1.c, j1.d)) {
                return null;
            }
        }
        Typeface typeface0 = g.Q(object0);
        return typeface0 == null ? null : Typeface.create(typeface0, v);
    }
}

