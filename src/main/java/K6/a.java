package k6;

import K5.c;
import K5.d;
import N5.r;
import W5.b;
import W5.e;
import android.content.Context;
import android.util.Log;
import java.lang.reflect.Method;

public abstract class a {
    public static final c a;
    public static final Object b;
    public static e c;
    public static String d;

    static {
        a.a = c.b;
        a.b = new Object();
        a.c = null;
        a.d = "0";
    }

    public static boolean a() {
        synchronized(a.b) {
        }
        return a.c != null;
    }

    public static void b(Context context0) {
        int v1;
        e e0;
        synchronized(a.b) {
            if(a.a()) {
                return;
            }
            r.k(context0, "Context must not be null");
            ClassLoader classLoader0 = a.class.getClassLoader();
            r.j(classLoader0);
            try {
                classLoader0.loadClass("org.chromium.net.CronetEngine");
            }
            catch(ClassNotFoundException classNotFoundException0) {
                Log.e("a", "Cronet API is not available. Have you included all required dependencies?");
                throw (d)new d().initCause(classNotFoundException0);  // initializer: Ljava/lang/Exception;-><init>()V
            }
            c c0 = a.a;
            c0.getClass();
            c.c(context0);
            try {
                e0 = e.c(context0, e.b, "com.google.android.gms.cronet_dynamite");
            }
            catch(b b0) {
                Log.e("a", "Unable to load Cronet module", b0);
                throw (d)new d().initCause(b0);  // initializer: Ljava/lang/Exception;-><init>()V
            }
            try {
                Class class0 = e0.a.getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                if(class0.getClassLoader() == a.class.getClassLoader()) {
                    Log.e("a", "ImplVersion class is missing from Cronet module.");
                    throw new d();  // initializer: Ljava/lang/Exception;-><init>()V
                }
                Method method0 = class0.getMethod("getApiLevel", null);
                Method method1 = class0.getMethod("getCronetVersion", null);
                Integer integer0 = (Integer)method0.invoke(null, null);
                r.j(integer0);
                v1 = (int)integer0;
                String s = (String)method1.invoke(null, null);
                r.j(s);
                a.d = s;
            }
            catch(Exception exception0) {
                Log.e("a", "Unable to read Cronet version from the Cronet module ", exception0);
                throw (d)new d().initCause(exception0);  // initializer: Ljava/lang/Exception;-><init>()V
            }
            if(3 > v1) {
                if(c0.a(2, context0, "cr") != null) {
                    throw new K5.e("Google Play Services update is required. The API Level of the client is " + 3 + ". The API Level of the implementation is " + v1 + ". The Cronet implementation version is " + a.d);  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
                }
                Log.e("a", "Unable to fetch error resolution intent");
                throw new d();  // initializer: Ljava/lang/Exception;-><init>()V
            }
            a.c = e0;
        }
    }
}

