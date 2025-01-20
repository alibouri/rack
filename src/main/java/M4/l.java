package M4;

import Bb.K;
import M6.b;
import N4.j;
import R2.e;
import V4.c;
import V4.d;
import V4.i;
import Vb.q;
import a5.p;
import a5.s;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.util.Log;
import com.facebook.AccessToken;
import f5.a;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;

public final class l {
    public static final l a;
    public static final HashSet b;
    public static Executor c;
    public static volatile String d;
    public static volatile String e;
    public static volatile String f;
    public static volatile Boolean g;
    public static Context h;
    public static int i;
    public static final ReentrantLock j;
    public static final String k;
    public static final AtomicBoolean l;
    public static volatile String m;
    public static final E7.l n;
    public static boolean o;

    static {
        l.a = new l();  // initializer: Ljava/lang/Object;-><init>()V
        l.b = K.J(new y[]{y.c0});
        new AtomicLong(0x10000L);
        l.i = 0xFACE;
        l.j = new ReentrantLock();
        l.k = "v16.0";
        l.l = new AtomicBoolean(false);
        l.m = "facebook.com";
        l.n = new E7.l(8);
    }

    public static final Context a() {
        j.J();
        Context context0 = l.h;
        if(context0 != null) {
            return context0;
        }
        Nb.j.p("applicationContext");
        throw null;
    }

    public static final String b() {
        j.J();
        String s = l.d;
        if(s == null) {
            throw new h("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
        }
        return s;
    }

    public static final Executor c() {
        ReentrantLock reentrantLock0 = l.j;
        reentrantLock0.lock();
        if(l.c == null) {
            l.c = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        reentrantLock0.unlock();
        Executor executor0 = l.c;
        if(executor0 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        return executor0;
    }

    public static final String d() {
        AccessToken accessToken0 = b.A();
        String s = accessToken0 == null ? null : accessToken0.i0;
        String s1 = l.m;
        if(s != null) {
            if(s.equals("gaming")) {
                return q.M(s1, "facebook.com", "fb.gg");
            }
            return s.equals("instagram") ? q.M(s1, "facebook.com", "instagram.com") : s1;
        }
        return s1;
    }

    public static final boolean e(Context context0) {
        j.J();
        return context0.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    public static final boolean f() {
        synchronized(l.class) {
        }
        return l.o;
    }

    public static final void g(y y0) {
        synchronized(l.b) {
        }
    }

    public static final void h(Context context0) {
        ApplicationInfo applicationInfo0;
        if(context0 == null) {
            return;
        }
        try {
            applicationInfo0 = context0.getPackageManager().getApplicationInfo("com.wave.personal", 0x80);
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            return;
        }
        Nb.j.e(applicationInfo0, "try {\n          context.packageManager.getApplicationInfo(\n              context.packageName, PackageManager.GET_META_DATA)\n        } catch (e: PackageManager.NameNotFoundException) {\n          return\n        }");
        if(applicationInfo0.metaData == null) {
            return;
        }
        if(l.d == null) {
            Object object0 = applicationInfo0.metaData.get("com.facebook.sdk.ApplicationId");
            if(object0 instanceof String) {
                Locale locale0 = Locale.ROOT;
                Nb.j.e(locale0, "ROOT");
                String s = ((String)object0).toLowerCase(locale0);
                Nb.j.e(s, "(this as java.lang.String).toLowerCase(locale)");
                if(q.O(s, "fb", false)) {
                    String s1 = ((String)object0).substring(2);
                    Nb.j.e(s1, "(this as java.lang.String).substring(startIndex)");
                    l.d = s1;
                }
                else {
                    l.d = (String)object0;
                }
            }
            else if(object0 instanceof Number) {
                throw new h("App Ids cannot be directly placed in the manifest.They must be prefixed by \'fb\' or be placed in the string resource file.");
            }
        }
        if(l.e == null) {
            l.e = applicationInfo0.metaData.getString("com.facebook.sdk.ApplicationName");
        }
        if(l.f == null) {
            l.f = applicationInfo0.metaData.getString("com.facebook.sdk.ClientToken");
        }
        if(l.i == 0xFACE) {
            l.i = applicationInfo0.metaData.getInt("com.facebook.sdk.CallbackOffset", 0xFACE);
        }
        if(l.g == null) {
            l.g = Boolean.valueOf(applicationInfo0.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
        }
    }

    public static final void i(Context context0) {
        boolean z;
        synchronized(l.class) {
            if(l.l.get()) {
                return;
            }
            PackageManager packageManager0 = context0.getPackageManager();
            ActivityInfo activityInfo0 = null;
            if(packageManager0 != null) {
                ComponentName componentName0 = new ComponentName(context0, "com.facebook.FacebookActivity");
                try {
                    activityInfo0 = packageManager0.getActivityInfo(componentName0, 1);
                }
                catch(PackageManager.NameNotFoundException unused_ex) {
                }
            }
            if(activityInfo0 == null) {
                Log.w("N4.j", "FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.");
            }
            if(context0.checkCallingOrSelfPermission("android.permission.INTERNET") == -1) {
                Log.w("N4.j", "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
            }
            Context context1 = context0.getApplicationContext();
            Nb.j.e(context1, "applicationContext.applicationContext");
            l.h = context1;
            Bb.q.s(context0);
            Context context2 = l.h;
            if(context2 != null) {
                l.h(context2);
                if(l.d == null || l.d.length() == 0) {
                    throw new h("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
                }
                if(l.f == null || l.f.length() == 0) {
                    throw new h("A valid Facebook app client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk.");
                }
                l.l.set(true);
                Class class1 = B.class;
                if(a.b(class1)) {
                    z = false;
                }
                else {
                    try {
                        B.a.e();
                        z = B.d.a();
                    }
                    catch(Throwable throwable0) {
                        a.a(throwable0, class1);
                        z = false;
                    }
                }
                if(z) {
                    l.o = true;
                }
                Context context3 = l.h;
                if(context3 != null) {
                    if(context3 instanceof Application && B.c()) {
                        Context context4 = l.h;
                        if(context4 != null) {
                            d.c(((Application)context4), l.d);
                            goto label_49;
                        }
                        Nb.j.p("applicationContext");
                        throw null;
                    }
                label_49:
                    i i0 = i.b.b();
                    if(i0 != null) {
                        Context context5 = l.h;
                        if(context5 == null) {
                            Nb.j.p("applicationContext");
                            throw null;
                        }
                        Application application0 = (Application)context5;
                        if(!a.b(i0)) {
                            try {
                                application0.registerActivityLifecycleCallbacks(new c(1));
                            }
                            catch(Throwable throwable1) {
                                a.a(throwable1, i0);
                            }
                        }
                    }
                    p.d();
                    Class class2 = s.class;
                    if(!a.b(class2)) {
                        try {
                            if(s.c.compareAndSet(false, true)) {
                                l.c().execute(new N4.c(16));
                            }
                        }
                        catch(Throwable throwable2) {
                            a.a(throwable2, class2);
                        }
                    }
                    Context context6 = l.h;
                    if(context6 != null) {
                        b.D(context6);
                        M4.j j0 = new M4.j(0);
                        e e0 = new e();  // initializer: Ljava/lang/Object;-><init>()V
                        e0.Y = new CountDownLatch(1);
                        l.c().execute(new FutureTask(new E7.j(e0, 3, j0)));
                        a5.j.a(new E7.l(9), a5.h.u0);
                        a5.j.a(new E7.l(10), a5.h.b0);
                        a5.j.a(new E7.l(11), a5.h.C0);
                        a5.j.a(new E7.l(11), a5.h.D0);
                        a5.j.a(new E7.l(11), a5.h.E0);
                        FutureTask futureTask0 = new FutureTask(new M4.j(1));
                        l.c().execute(futureTask0);
                        return;
                    }
                    Nb.j.p("applicationContext");
                    throw null;
                }
                Nb.j.p("applicationContext");
                throw null;
            }
            Nb.j.p("applicationContext");
        }
        throw null;
    }
}

