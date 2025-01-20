package v1;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

public abstract class d {
    public static final Class a;
    public static final Field b;
    public static final Field c;
    public static final Method d;
    public static final Method e;
    public static final Method f;
    public static final Handler g;

    static {
        Method method2;
        Method method1;
        Field field1;
        Field field0;
        Class class2;
        Class class0 = IBinder.class;
        Class class1 = Activity.class;
        d.g = new Handler(Looper.getMainLooper());
        Method method0 = null;
        try {
            class2 = null;
            class2 = Class.forName("android.app.ActivityThread");
        }
        catch(Throwable unused_ex) {
        }
        try {
            d.a = class2;
            field0 = class1.getDeclaredField("mMainThread");
            field0.setAccessible(true);
        }
        catch(Throwable unused_ex) {
            field0 = null;
        }
        try {
            d.b = field0;
            field1 = class1.getDeclaredField("mToken");
            field1.setAccessible(true);
        }
        catch(Throwable unused_ex) {
            field1 = null;
        }
        d.c = field1;
        Class class3 = d.a;
        if(class3 == null) {
        label_22:
            method1 = null;
        }
        else {
            try {
                method1 = class3.getDeclaredMethod("performStopActivity", class0, Boolean.TYPE, String.class);
                method1.setAccessible(true);
                goto label_23;
            }
            catch(Throwable unused_ex) {
            }
            goto label_22;
        }
    label_23:
        d.d = method1;
        Class class4 = d.a;
        if(class4 == null) {
        label_29:
            method2 = null;
        }
        else {
            try {
                method2 = class4.getDeclaredMethod("performStopActivity", class0, Boolean.TYPE);
                method2.setAccessible(true);
                goto label_30;
            }
            catch(Throwable unused_ex) {
            }
            goto label_29;
        }
    label_30:
        d.e = method2;
        Class class5 = d.a;
        if((Build.VERSION.SDK_INT == 26 || Build.VERSION.SDK_INT == 27) && class5 != null) {
            try {
                Method method3 = class5.getDeclaredMethod("requestRelaunchActivity", class0, List.class, List.class, Integer.TYPE, Boolean.TYPE, Configuration.class, Configuration.class, Boolean.TYPE, Boolean.TYPE);
                method3.setAccessible(true);
                method0 = method3;
            }
            catch(Throwable unused_ex) {
            }
        }
        d.f = method0;
    }
}

