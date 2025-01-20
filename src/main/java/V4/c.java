package V4;

import M4.y;
import Nb.j;
import Q4.g;
import Q4.l;
import a5.m;
import a5.p;
import a5.w;
import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;
import f5.a;
import io.sentry.hints.i;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicInteger;

public final class c implements Application.ActivityLifecycleCallbacks {
    public final int X;

    public c(int v) {
        this.X = v;
        super();
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity0, Bundle bundle0) {
        j.f(activity0, "activity");
        if(this.X != 0) {
            return;
        }
        i.C(y.b0, d.a, "onActivityCreated");
        N4.c c0 = new N4.c(10);
        d.b.execute(c0);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity0) {
        j.f(activity0, "activity");
        if(this.X != 0) {
            return;
        }
        i.C(y.b0, d.a, "onActivityDestroyed");
        Class class0 = Q4.d.class;
        if(!a.b(class0)) {
            try {
                g g0 = g.f.a();
                if(!a.b(g0)) {
                    try {
                        g0.e.remove(activity0.hashCode());
                    }
                    catch(Throwable throwable1) {
                        a.a(throwable1, g0);
                    }
                }
            }
            catch(Throwable throwable0) {
                a.a(throwable0, class0);
            }
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity0) {
        j.f(activity0, "activity");
        if(this.X != 0) {
            return;
        }
        String s = d.a;
        i.C(y.b0, s, "onActivityPaused");
        AtomicInteger atomicInteger0 = d.e;
        if(atomicInteger0.decrementAndGet() < 0) {
            atomicInteger0.set(0);
            Log.w(s, "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application\'s onCreate method");
        }
        d.a();
        long v = System.currentTimeMillis();
        String s1 = w.C(activity0);
        Class class0 = Q4.d.class;
        if(!a.b(class0)) {
            try {
                if(Q4.d.f.get()) {
                    g.f.a().c(activity0);
                    l l0 = Q4.d.d;
                    if(l0 != null && !a.b(l0)) {
                        try {
                            if(((Activity)l0.b.get()) != null) {
                                try {
                                    Timer timer0 = l0.c;
                                    if(timer0 != null) {
                                        timer0.cancel();
                                    }
                                    l0.c = null;
                                }
                                catch(Exception exception0) {
                                    Log.e(l.e, "Error unscheduling indexing job", exception0);
                                }
                            }
                        }
                        catch(Throwable throwable1) {
                            a.a(throwable1, l0);
                        }
                    }
                    SensorManager sensorManager0 = Q4.d.c;
                    if(sensorManager0 != null) {
                        sensorManager0.unregisterListener(Q4.d.b);
                    }
                }
            }
            catch(Throwable throwable0) {
                a.a(throwable0, class0);
            }
        }
        b b0 = new b(0, v, s1);
        d.b.execute(b0);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity0) {
        j.f(activity0, "activity");
        if(this.X != 0) {
            V4.i i0 = V4.i.b.b();
            if(i0 != null) {
                i0.b(activity0);
            }
            return;
        }
        i.C(y.b0, d.a, "onActivityResumed");
        d.k = new WeakReference(activity0);
        d.e.incrementAndGet();
        d.a();
        long v = System.currentTimeMillis();
        d.i = v;
        String s = w.C(activity0);
        Class class0 = Q4.d.class;
        if(!a.b(class0)) {
            try {
                if(Q4.d.f.get()) {
                    g.f.a().a(activity0);
                    Context context0 = activity0.getApplicationContext();
                    String s1 = M4.l.b();
                    m m0 = p.b(s1);
                    boolean z = j.a((m0 == null ? null : Boolean.valueOf(m0.f)), Boolean.TRUE);
                    Q4.d d0 = Q4.d.a;
                    if(z) {
                        SensorManager sensorManager0 = (SensorManager)context0.getSystemService("sensor");
                        if(sensorManager0 != null) {
                            Q4.d.c = sensorManager0;
                            Sensor sensor0 = sensorManager0.getDefaultSensor(1);
                            l l0 = new l(activity0);
                            Q4.d.d = l0;
                            Q4.m m1 = Q4.d.b;
                            E7.g g0 = new E7.g(m0, 3, s1);
                            if(!a.b(m1)) {
                                m1.X = g0;
                            }
                            sensorManager0.registerListener(m1, sensor0, 2);
                            if(m0 != null && m0.f) {
                                l0.c();
                            }
                            a.b(d0);
                        }
                    }
                    else {
                        a.b(d0);
                        a.b(d0);
                    }
                }
                goto label_42;
            }
            catch(Throwable throwable0) {
            }
            a.a(throwable0, class0);
        }
    label_42:
        Class class1 = O4.a.class;
        if(!a.b(class1)) {
            try {
                if(O4.a.b && !new HashSet(O4.c.a()).isEmpty()) {
                    O4.a.b(activity0);
                }
                goto label_49;
            }
            catch(Exception unused_ex) {
                goto label_49;
            }
            catch(Throwable throwable1) {
            }
            a.a(throwable1, class1);
        }
    label_49:
        Z4.d.d(activity0);
        T4.j.a();
        V4.a a0 = new V4.a(v, s, activity0.getApplicationContext());
        d.b.execute(a0);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity0, Bundle bundle0) {
        j.f(activity0, "activity");
        if(this.X != 0) {
            j.f(bundle0, "bundle");
            return;
        }
        j.f(bundle0, "outState");
        i.C(y.b0, d.a, "onActivitySaveInstanceState");
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity0) {
        j.f(activity0, "activity");
        if(this.X != 0) {
            V4.i i0 = V4.i.b.b();
            if(i0 != null) {
                i0.b(activity0);
            }
            return;
        }
        ++d.j;
        i.C(y.b0, d.a, "onActivityStarted");
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity0) {
        j.f(activity0, "activity");
        if(this.X != 0) {
            return;
        }
        i.C(y.b0, d.a, "onActivityStopped");
        Class class0 = N4.i.class;
        if(!a.b(class0)) {
            try {
                N4.c c0 = new N4.c(2);
                N4.i.b.execute(c0);
            }
            catch(Throwable throwable0) {
                a.a(throwable0, class0);
            }
        }
        --d.j;
    }
}

