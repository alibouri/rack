package z1;

import G1.j;
import N4.o;
import P4.c;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import y1.e;

public class f extends o {
    public static Class b = null;
    public static Constructor c = null;
    public static Method d = null;
    public static Method e = null;
    public static boolean f = false;

    public static boolean P(boolean z, String s, int v, Object object0) {
        f.Q();
        try {
            return ((Boolean)f.d.invoke(object0, s, v, Boolean.valueOf(z))).booleanValue();
        }
        catch(IllegalAccessException | InvocationTargetException illegalAccessException0) {
            throw new RuntimeException(illegalAccessException0);
        }
    }

    public static void Q() {
        Method method1;
        Method method0;
        Class class0;
        Constructor constructor0;
        if(f.f) {
            return;
        }
        try {
            f.f = true;
            constructor0 = null;
            class0 = Class.forName("android.graphics.FontFamily");
            Constructor constructor1 = class0.getConstructor(null);
            method0 = class0.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            Class[] arr_class = {Array.newInstance(class0, 1).getClass()};
            method1 = Typeface.class.getMethod("createFromFamiliesWithDefault", arr_class);
            constructor0 = constructor1;
        }
        catch(ClassNotFoundException | NoSuchMethodException classNotFoundException0) {
            Log.e("TypefaceCompatApi21Impl", classNotFoundException0.getClass().getName(), classNotFoundException0);
            method1 = null;
            class0 = null;
            method0 = null;
        }
        f.c = constructor0;
        f.b = class0;
        f.d = method0;
        f.e = method1;
    }

    @Override  // N4.o
    public Typeface m(Context context0, e e0, Resources resources0, int v) {
        int v1;
        y1.f[] arr_f;
        Object object0;
        f.Q();
        try {
            object0 = f.c.newInstance(null);
            arr_f = e0.a;
            v1 = 0;
        }
        catch(IllegalAccessException | InstantiationException | InvocationTargetException illegalAccessException0) {
            throw new RuntimeException(illegalAccessException0);
        }
        while(v1 < arr_f.length) {
            y1.f f0 = arr_f[v1];
            File file0 = c.K(context0);
            if(file0 == null) {
                return null;
            }
            try {
                if(!c.s(file0, resources0, f0.f)) {
                    return null;
                }
                String s = file0.getPath();
                if(!f.P(f0.c, s, f0.b, object0)) {
                    return null;
                }
            }
            catch(RuntimeException unused_ex) {
                return null;
            }
            finally {
                file0.delete();
            }
            ++v1;
        }
        f.Q();
        try {
            Object object1 = Array.newInstance(f.b, 1);
            Array.set(object1, 0, object0);
            return (Typeface)f.e.invoke(null, object1);
        }
        catch(IllegalAccessException | InvocationTargetException illegalAccessException1) {
            throw new RuntimeException(illegalAccessException1);
        }
    }

    @Override  // N4.o
    public Typeface n(Context context0, j[] arr_j, int v) {
        File file0;
        if(arr_j.length < 1) {
            return null;
        }
        j j0 = this.A(arr_j, v);
        ContentResolver contentResolver0 = context0.getContentResolver();
        try(ParcelFileDescriptor parcelFileDescriptor0 = contentResolver0.openFileDescriptor(j0.a, "r", null)) {
            if(parcelFileDescriptor0 == null) {
                return null;
            }
            try {
                String s = Os.readlink(("/proc/self/fd/" + parcelFileDescriptor0.getFd()));
                file0 = null;
                if(OsConstants.S_ISREG(Os.stat(s).st_mode)) {
                    file0 = new File(s);
                }
            }
            catch(ErrnoException unused_ex) {
            }
            if(file0 != null && file0.canRead()) {
                return Typeface.createFromFile(file0);
            }
            try(FileInputStream fileInputStream0 = new FileInputStream(parcelFileDescriptor0.getFileDescriptor())) {
                return this.p(context0, fileInputStream0);
            }
        }
        catch(IOException unused_ex) {
            return null;
        }
    }
}

