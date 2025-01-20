package z1;

import G1.j;
import P4.c;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface.Builder;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import y1.e;

public class h extends f {
    public final Class g;
    public final Constructor h;
    public final Method i;
    public final Method j;
    public final Method k;
    public final Method l;
    public final Method m;

    public h() {
        Method method4;
        Method method3;
        Method method2;
        Method method1;
        Method method0;
        Constructor constructor0;
        Class class0 = null;
        try {
            Class class1 = Class.forName("android.graphics.FontFamily");
            constructor0 = class1.getConstructor(null);
            method0 = h.X(class1);
            method1 = class1.getMethod("addFontFromBuffer", ByteBuffer.class, Integer.TYPE, FontVariationAxis[].class, Integer.TYPE, Integer.TYPE);
            method2 = class1.getMethod("freeze", null);
            method3 = class1.getMethod("abortCreation", null);
            method4 = this.Y(class1);
            class0 = class1;
        }
        catch(ClassNotFoundException | NoSuchMethodException classNotFoundException0) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + classNotFoundException0.getClass().getName(), classNotFoundException0);
            method4 = null;
            constructor0 = null;
            method0 = null;
            method1 = null;
            method2 = null;
            method3 = null;
        }
        this.g = class0;
        this.h = constructor0;
        this.i = method0;
        this.j = method1;
        this.k = method2;
        this.l = method3;
        this.m = method4;
    }

    public final void R(Object object0) {
        try {
            this.l.invoke(object0, null);
        }
        catch(IllegalAccessException | InvocationTargetException unused_ex) {
        }
    }

    public final boolean S(Context context0, Object object0, String s, int v, int v1, int v2, FontVariationAxis[] arr_fontVariationAxis) {
        try {
            Object[] arr_object = {context0.getAssets(), s, 0, Boolean.FALSE, v, v1, v2, arr_fontVariationAxis};
            return ((Boolean)this.i.invoke(object0, arr_object)).booleanValue();
        }
        catch(IllegalAccessException | InvocationTargetException unused_ex) {
            return false;
        }
    }

    public Typeface T(Object object0) {
        try {
            Object object1 = Array.newInstance(this.g, 1);
            Array.set(object1, 0, object0);
            return (Typeface)this.m.invoke(null, object1, -1, -1);
        }
        catch(IllegalAccessException | InvocationTargetException unused_ex) {
            return null;
        }
    }

    public final boolean U(Object object0) {
        try {
            return ((Boolean)this.k.invoke(object0, null)).booleanValue();
        }
        catch(IllegalAccessException | InvocationTargetException unused_ex) {
            return false;
        }
    }

    public final boolean V() {
        Method method0 = this.i;
        if(method0 == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method0 != null;
    }

    public final Object W() {
        try {
            return this.h.newInstance(null);
        }
        catch(IllegalAccessException | InstantiationException | InvocationTargetException unused_ex) {
            return null;
        }
    }

    public static Method X(Class class0) {
        return class0.getMethod("addFontFromAssetManager", AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, FontVariationAxis[].class);
    }

    public Method Y(Class class0) {
        Class[] arr_class = {Array.newInstance(class0, 1).getClass(), Integer.TYPE, Integer.TYPE};
        Method method0 = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", arr_class);
        method0.setAccessible(true);
        return method0;
    }

    @Override  // z1.f
    public final Typeface m(Context context0, e e0, Resources resources0, int v) {
        if(!this.V()) {
            return super.m(context0, e0, resources0, v);
        }
        Object object0 = this.W();
        if(object0 == null) {
            return null;
        }
        y1.f[] arr_f = e0.a;
        for(int v1 = 0; v1 < arr_f.length; ++v1) {
            y1.f f0 = arr_f[v1];
            FontVariationAxis[] arr_fontVariationAxis = FontVariationAxis.fromFontVariationSettings(f0.d);
            if(!this.S(context0, object0, f0.a, f0.e, f0.b, ((int)f0.c), arr_fontVariationAxis)) {
                this.R(object0);
                return null;
            }
        }
        return this.U(object0) ? this.T(object0) : null;
    }

    @Override  // z1.f
    public final Typeface n(Context context0, j[] arr_j, int v) {
        boolean z1;
        if(arr_j.length < 1) {
            return null;
        }
        if(!this.V()) {
            j j0 = this.A(arr_j, v);
            ContentResolver contentResolver0 = context0.getContentResolver();
            try(ParcelFileDescriptor parcelFileDescriptor0 = contentResolver0.openFileDescriptor(j0.a, "r", null)) {
                if(parcelFileDescriptor0 != null) {
                    return new Typeface.Builder(parcelFileDescriptor0.getFileDescriptor()).setWeight(j0.c).setItalic(j0.d).build();
                }
            }
            catch(IOException unused_ex) {
            }
            return null;
        }
        HashMap hashMap0 = new HashMap();
        for(int v1 = 0; v1 < arr_j.length; ++v1) {
            j j1 = arr_j[v1];
            if(j1.e == 0) {
                Uri uri0 = j1.a;
                if(!hashMap0.containsKey(uri0)) {
                    hashMap0.put(uri0, c.M(context0, uri0));
                }
            }
        }
        Map map0 = Collections.unmodifiableMap(hashMap0);
        Object object0 = this.W();
        if(object0 == null) {
            return null;
        }
        boolean z = false;
        for(int v2 = 0; v2 < arr_j.length; ++v2) {
            j j2 = arr_j[v2];
            ByteBuffer byteBuffer0 = (ByteBuffer)map0.get(j2.a);
            if(byteBuffer0 != null) {
                try {
                    z1 = ((Boolean)this.j.invoke(object0, byteBuffer0, ((int)j2.b), null, ((int)j2.c), ((int)j2.d))).booleanValue();
                }
                catch(IllegalAccessException | InvocationTargetException unused_ex) {
                    z1 = false;
                }
                if(!z1) {
                    this.R(object0);
                    return null;
                }
                z = true;
            }
        }
        if(!z) {
            this.R(object0);
            return null;
        }
        if(!this.U(object0)) {
            return null;
        }
        Typeface typeface0 = this.T(object0);
        return typeface0 == null ? null : Typeface.create(typeface0, v);
    }

    @Override  // N4.o
    public final Typeface q(Context context0, Resources resources0, int v, String s, int v1) {
        if(!this.V()) {
            return super.q(context0, resources0, v, s, v1);
        }
        Object object0 = this.W();
        if(object0 == null) {
            return null;
        }
        if(!this.S(context0, object0, s, 0, -1, -1, null)) {
            this.R(object0);
            return null;
        }
        return this.U(object0) ? this.T(object0) : null;
    }
}

