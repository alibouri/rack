package com.google.firebase.perf.metrics;

import E7.n;
import G0.q;
import H6.e;
import I7.a;
import M7.b;
import R7.f;
import T7.A;
import T7.x;
import Z6.g;
import android.app.Activity;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.Application;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.view.View;
import androidx.annotation.Keep;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.Timer;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class AppStartTrace implements Application.ActivityLifecycleCallbacks, LifecycleObserver {
    public boolean X;
    public final f Y;
    public final a Z;
    public final x b0;
    public Application c0;
    public boolean d0;
    public final Timer e0;
    public final Timer f0;
    public Timer g0;
    public Timer h0;
    public Timer i0;
    public Timer j0;
    public Timer k0;
    public Timer l0;
    public Timer m0;
    public Timer n0;
    public PerfSession o0;
    public boolean p0;
    public int q0;
    public final b r0;
    public boolean s0;
    public static final Timer t0;
    public static final long u0;
    public static volatile AppStartTrace v0;
    public static ThreadPoolExecutor w0;

    static {
        AppStartTrace.t0 = new Timer();
        AppStartTrace.u0 = TimeUnit.MINUTES.toMicros(1L);
    }

    public AppStartTrace(f f0, e e0, a a0, ThreadPoolExecutor threadPoolExecutor0) {
        Timer timer1;
        this.X = false;
        this.d0 = false;
        Timer timer0 = null;
        this.g0 = null;
        this.h0 = null;
        this.i0 = null;
        this.j0 = null;
        this.k0 = null;
        this.l0 = null;
        this.m0 = null;
        this.n0 = null;
        this.p0 = false;
        this.q0 = 0;
        this.r0 = new b(this);
        this.s0 = false;
        this.Y = f0;
        this.Z = a0;
        AppStartTrace.w0 = threadPoolExecutor0;
        x x0 = A.N();
        x0.p("_experiment_app_start_ttid");
        this.b0 = x0;
        if(Build.VERSION.SDK_INT >= 24) {
            long v = Process.getStartElapsedRealtime();
            TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
            long v1 = timeUnit0.toMicros(v);
            timer1 = new Timer(v1 - TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos()) + timeUnit0.toMicros(System.currentTimeMillis()), v1);
        }
        else {
            timer1 = null;
        }
        this.e0 = timer1;
        Z6.a a1 = (Z6.a)g.c().b(Z6.a.class);
        if(a1 != null) {
            TimeUnit timeUnit1 = TimeUnit.MILLISECONDS;
            long v2 = timeUnit1.toMicros(a1.b);
            timer0 = new Timer(v2 - TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos()) + timeUnit1.toMicros(System.currentTimeMillis()), v2);
        }
        this.f0 = timer0;
    }

    public final Timer a() {
        return this.f0 == null ? AppStartTrace.t0 : this.f0;
    }

    public static AppStartTrace c() {
        if(AppStartTrace.v0 != null) {
            return AppStartTrace.v0;
        }
        f f0 = f.q0;
        e e0 = new e(11);
        if(AppStartTrace.v0 == null) {
            synchronized(AppStartTrace.class) {
                if(AppStartTrace.v0 == null) {
                    a a0 = a.e();
                    TimeUnit timeUnit0 = TimeUnit.SECONDS;
                    LinkedBlockingQueue linkedBlockingQueue0 = new LinkedBlockingQueue();
                    AppStartTrace.v0 = new AppStartTrace(f0, e0, a0, new ThreadPoolExecutor(0, 1, AppStartTrace.u0 + 10L, timeUnit0, linkedBlockingQueue0));
                }
            }
        }
        return AppStartTrace.v0;
    }

    public final Timer d() {
        return this.e0 == null ? this.a() : this.e0;
    }

    public static boolean e(Application application0) {
        ActivityManager activityManager0 = (ActivityManager)application0.getSystemService("activity");
        if(activityManager0 == null) {
            return true;
        }
        List list0 = activityManager0.getRunningAppProcesses();
        if(list0 != null) {
            for(Object object0: list0) {
                ActivityManager.RunningAppProcessInfo activityManager$RunningAppProcessInfo0 = (ActivityManager.RunningAppProcessInfo)object0;
                if(activityManager$RunningAppProcessInfo0.importance == 100 && (activityManager$RunningAppProcessInfo0.processName.equals("com.wave.personal") || activityManager$RunningAppProcessInfo0.processName.startsWith("com.wave.personal:"))) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }

    public final void g(x x0) {
        if(this.l0 != null && this.m0 != null && this.n0 != null) {
            AppStartTrace.w0.execute(new n(this, 7, x0));
            this.j();
        }
    }

    public final void i(Context context0) {
        synchronized(this) {
            if(this.X) {
                return;
            }
            ProcessLifecycleOwner.g0.getClass();
            ProcessLifecycleOwner.h0.d0.a(this);
            Context context1 = context0.getApplicationContext();
            if(context1 instanceof Application) {
                ((Application)context1).registerActivityLifecycleCallbacks(this);
                this.s0 = this.s0 || AppStartTrace.e(((Application)context1));
                this.X = true;
                this.c0 = (Application)context1;
            }
        }
    }

    public final void j() {
        synchronized(this) {
            if(!this.X) {
                return;
            }
            ProcessLifecycleOwner.g0.getClass();
            ProcessLifecycleOwner.h0.d0.c(this);
            this.c0.unregisterActivityLifecycleCallbacks(this);
            this.X = false;
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity0, Bundle bundle0) {
        synchronized(this) {
            if(!this.p0 && this.g0 == null) {
                this.s0 = this.s0 || AppStartTrace.e(this.c0);
                new WeakReference(activity0);
                this.g0 = new Timer();
                if(this.d().c(this.g0) > AppStartTrace.u0) {
                    this.d0 = true;
                }
            }
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity0) {
        if(!this.p0 && !this.d0 && this.Z.f()) {
            activity0.findViewById(0x1020002).getViewTreeObserver().removeOnDrawListener(this.r0);
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity0) {
        synchronized(this) {
            if(!this.p0 && !this.d0) {
                boolean z = this.Z.f();
                if(z) {
                    View view0 = activity0.findViewById(0x1020002);
                    view0.getViewTreeObserver().addOnDrawListener(this.r0);
                    S7.b b0 = new S7.b(view0, new M7.a(this, 0));
                    if(Build.VERSION.SDK_INT >= 26 || view0.getViewTreeObserver().isAlive() && view0.isAttachedToWindow()) {
                        view0.getViewTreeObserver().addOnDrawListener(b0);
                    }
                    else {
                        view0.addOnAttachStateChangeListener(new q(3, b0));
                    }
                    S7.e e0 = new S7.e(view0, new M7.a(this, 1), new M7.a(this, 2));
                    view0.getViewTreeObserver().addOnPreDrawListener(e0);
                }
                if(this.i0 != null) {
                    return;
                }
                new WeakReference(activity0);
                this.i0 = new Timer();
                this.o0 = SessionManager.getInstance().perfSession();
                L7.a.d().a("onResume(): " + activity0.getClass().getName() + ": " + this.a().c(this.i0) + " microseconds");
                AppStartTrace.w0.execute(new M7.a(this, 3));
                if(!z) {
                    this.j();
                }
            }
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity0, Bundle bundle0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity0) {
        synchronized(this) {
            if(!this.p0 && this.h0 == null && !this.d0) {
                this.h0 = new Timer();
            }
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity0) {
    }

    @Keep
    @OnLifecycleEvent(Event.ON_STOP)
    public void onAppEnteredBackground() {
        if(!this.p0 && !this.d0 && this.k0 == null) {
            this.k0 = new Timer();
            x x0 = A.N();
            x0.p("_experiment_firstBackgrounding");
            x0.n(this.d().X);
            x0.o(this.d().c(this.k0));
            A a0 = (A)x0.h();
            this.b0.k(a0);
        }
    }

    @Keep
    @OnLifecycleEvent(Event.ON_START)
    public void onAppEnteredForeground() {
        if(!this.p0 && !this.d0 && this.j0 == null) {
            this.j0 = new Timer();
            x x0 = A.N();
            x0.p("_experiment_firstForegrounding");
            x0.n(this.d().X);
            x0.o(this.d().c(this.j0));
            A a0 = (A)x0.h();
            this.b0.k(a0);
        }
    }

    @Keep
    public static void setLauncherActivityOnCreateTime(String s) {
    }

    @Keep
    public static void setLauncherActivityOnResumeTime(String s) {
    }

    @Keep
    public static void setLauncherActivityOnStartTime(String s) {
    }
}

