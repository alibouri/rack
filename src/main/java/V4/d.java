package V4;

import Nb.j;
import T9.b;
import a5.h;
import android.app.Application;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class d {
    public static final String a;
    public static final ScheduledExecutorService b;
    public static volatile ScheduledFuture c;
    public static final Object d;
    public static final AtomicInteger e;
    public static volatile o f;
    public static final AtomicBoolean g;
    public static String h;
    public static long i;
    public static int j;
    public static WeakReference k;

    static {
        d.a = d.class.getCanonicalName() == null ? "com.facebook.appevents.internal.ActivityLifecycleTracker" : d.class.getCanonicalName();
        d.b = Executors.newSingleThreadScheduledExecutor();
        d.d = new Object();
        d.e = new AtomicInteger(0);
        d.g = new AtomicBoolean(false);
    }

    public static void a() {
        synchronized(d.d) {
            if(d.c != null) {
                ScheduledFuture scheduledFuture0 = d.c;
                if(scheduledFuture0 != null) {
                    scheduledFuture0.cancel(false);
                }
            }
            d.c = null;
        }
    }

    public static final UUID b() {
        if(d.f != null) {
            return d.f == null ? null : ((UUID)d.f.e);
        }
        return null;
    }

    public static final void c(Application application0, String s) {
        j.f(application0, "application");
        if(!d.g.compareAndSet(false, true)) {
            return;
        }
        a5.j.a(new b(3), h.c0);
        d.h = s;
        application0.registerActivityLifecycleCallbacks(new c(0));
    }
}

