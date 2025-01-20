package j6;

import N5.r;
import android.app.Application;
import android.content.ComponentName;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.biometric.BiometricFragment;
import com.apollographql.apollo.api.b;
import com.google.android.gms.internal.measurement.U;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzno;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.logging.Level;
import jeb.synthetic.FIN;
import k6.a;
import n7.j;
import o6.c;
import o6.d;
import o6.e;
import o6.f;
import o6.g;
import o6.h;
import o6.i;
import o6.m;
import o6.n;
import o6.p;
import q9.C3;
import q9.F3;
import q9.k0;
import r.q;
import r.s;

public final class z0 implements Runnable {
    public final int X;
    public Object Y;
    public Object Z;

    public z0(int v) {
        this.X = v;
        super();
    }

    public z0(int v, Object object0, Object object1, boolean z) {
        this.X = v;
        this.Y = object1;
        this.Z = object0;
        super();
    }

    public z0(SwipeDismissBehavior swipeDismissBehavior0, View view0, boolean z) {
        this.X = 21;
        super();
        this.Z = swipeDismissBehavior0;
        this.Y = view0;
    }

    public z0(Object object0, int v, Object object1) {
        this.X = v;
        this.Z = object1;
        this.Y = object0;
        super();
    }

    public z0(j j0) {
        this.X = 10;
        super();
        this.Z = j0;
    }

    private final void a() {
        synchronized(((n)this.Z).Z) {
            ((c)((n)this.Z).b0).s(((h)this.Y));
        }
    }

    private final void b() {
        synchronized(((n)this.Z).Z) {
            d d0 = (d)((n)this.Z).b0;
            if(d0 != null) {
                Exception exception0 = ((h)this.Y).e();
                r.j(exception0);
                d0.u(exception0);
            }
        }
    }

    private final void c() {
        synchronized(((n)this.Z).Z) {
            e e0 = (e)((n)this.Z).b0;
            if(e0 != null) {
                e0.k(((h)this.Y).f());
            }
        }
    }

    public void d() {
        int v;
        boolean z = false;
        boolean z1 = false;
        while(true) {
            try {
            label_2:
                ArrayDeque arrayDeque0 = ((j)this.Z).Y;
                __monitor_enter(arrayDeque0);
                v = FIN.finallyOpen$NT();
                if(!z) {
                    j j0 = (j)this.Z;
                    if(j0.Z != 4) {
                        ++j0.b0;
                        j0.Z = 4;
                        z = true;
                        goto label_18;
                    }
                    FIN.finallyCodeBegin$NT(v);
                    __monitor_exit(arrayDeque0);
                    FIN.finallyCodeEnd$NT(v);
                    if(z1) {
                        goto label_16;
                    }
                    return;
                }
                goto label_18;
            }
            catch(Throwable throwable0) {
                break;
            }
        label_16:
            Thread.currentThread().interrupt();
            return;
            try {
            label_18:
                Runnable runnable0 = (Runnable)((j)this.Z).Y.poll();
                this.Y = runnable0;
                if(runnable0 == null) {
                    ((j)this.Z).Z = 1;
                    FIN.finallyExec$NT(v);
                    if(z1) {
                        goto label_24;
                    }
                    return;
                }
                goto label_26;
            }
            catch(Throwable throwable0) {
                break;
            }
        label_24:
            Thread.currentThread().interrupt();
            return;
            try {
            label_26:
                FIN.finallyExec$NT(v);
                z1 |= Thread.interrupted();
                try {
                    ((Runnable)this.Y).run();
                }
                catch(RuntimeException runtimeException0) {
                    j.d0.log(Level.SEVERE, "Exception while executing runnable " + ((Runnable)this.Y), runtimeException0);
                }
                finally {
                    this.Y = null;
                }
                goto label_2;
            }
            catch(Throwable throwable0) {
            }
            break;
        }
        if(z1) {
            Thread.currentThread().interrupt();
        }
        throw throwable0;
    }

    @Override
    public final void run() {
        p p0;
        h h0;
        Object object3;
        Long long0;
        boolean z = false;
        switch(this.X) {
            case 0: {
                w0 w00 = (w0)this.Y;
                w00.q();
                if(Build.VERSION.SDK_INT >= 30) {
                    SparseArray sparseArray0 = w00.o().z();
                    for(Object object2: ((List)this.Z)) {
                        zzno zzno0 = (zzno)object2;
                        if(!sparseArray0.contains(zzno0.Z) || ((long)(((Long)sparseArray0.get(zzno0.Z)))) < zzno0.Y) {
                            w00.L().add(zzno0);
                        }
                    }
                    w00.Q();
                }
                return;
            }
            case 1: {
                d0 d00 = (d0)((w0)this.Y).Y;
                F f0 = d00.n();
                String s = f0.o0;
                String s1 = (String)this.Z;
                if(s != null && !s.equals(s1)) {
                    z = true;
                }
                f0.o0 = s1;
                if(z) {
                    d00.n().z();
                }
                return;
            }
            case 2: {
                w0 w01 = (w0)this.Y;
                a1 a10 = w01.t();
                if(a10.o().A().i(p0.Z)) {
                    V v0 = a10.o();
                    ((d0)a10.Y).l0.getClass();
                    long0 = v0.v(System.currentTimeMillis()) || a10.o().q0.a() == 0L ? null : a10.o().q0.a();
                }
                else {
                    a10.b().j0.d("Analytics storage consent denied; will not get session id");
                    long0 = null;
                }
                d0 d01 = (d0)w01.Y;
                U u0 = (U)this.Z;
                if(long0 != null) {
                    d0.e(d01.j0);
                    d01.j0.M(u0, ((long)long0));
                    return;
                }
                try {
                    u0.f(null);
                }
                catch(RemoteException remoteException0) {
                    d0.h(d01.g0);
                    d01.g0.e0.b(remoteException0, "getSessionId failed with exception");
                }
                return;
            }
            case 3: {
                ((w0)this.Y).F(((Boolean)this.Z), true);
                return;
            }
            case 4: {
                w0 w02 = (w0)this.Y;
                V v1 = w02.o();
                v1.q();
                v1.q();
                l l0 = l.b(v1.y().getString("dma_consent_settings", null));
                l l1 = (l)this.Z;
                int v2 = l1.a;
                if(q0.h(v2, l0.a)) {
                    SharedPreferences.Editor sharedPreferences$Editor0 = v1.y().edit();
                    sharedPreferences$Editor0.putString("dma_consent_settings", l1.b);
                    sharedPreferences$Editor0.apply();
                    w02.b().m0.b(l1, "Setting DMA consent(FE)");
                    d0 d02 = (d0)w02.Y;
                    P0 p00 = b.n(d02);
                    if(!p00.G() || p00.p().v0() >= 241200) {
                        P0 p01 = b.n(d02);
                        O0 o00 = new O0(1);
                        o00.Y = p01;
                        p01.z(o00);
                        return;
                    }
                    d02.q().B(false);
                    return;
                }
                w02.b().k0.b(v2, "Lower precedence consent source ignored, proposed source");
                return;
            }
            case 5: {
                w0 w03 = ((AppMeasurementDynamiteService)this.Z).d.n0;
                d0.g(w03);
                R2.c c0 = (R2.c)this.Y;
                w03.q();
                w03.u();
                R2.c c1 = w03.c0;
                if(c0 != c1) {
                    if(c1 == null) {
                        z = true;
                    }
                    r.l("EventInterceptor already set.", z);
                }
                w03.c0 = c0;
                return;
            }
            case 6: {
                P0 p02 = (P0)this.Z;
                C c2 = p02.c0;
                if(c2 == null) {
                    p02.b().e0.d("Failed to send current screen to service");
                    return;
                }
                try {
                    M0 m00 = (M0)this.Y;
                    if(m00 == null) {
                        c2.C(0L, null, null, "com.wave.personal");
                    }
                    else {
                        c2.C(m00.c, m00.a, m00.b, "com.wave.personal");
                    }
                    p02.I();
                    return;
                }
                catch(RemoteException remoteException1) {
                }
                p02.b().e0.b(remoteException1, "Failed to send current screen to the service");
                return;
            }
            case 7: {
                P0 p03 = ((W0)this.Z).Z;
                p03.q();
                if(p03.c0 != null) {
                    p03.c0 = null;
                    p03.b().m0.b(((ComponentName)this.Y), "Disconnected from device MeasurementService");
                    p03.q();
                    p03.C();
                }
                return;
            }
            case 8: {
                k1 k10 = (k1)this.Y;
                k10.d0();
                k10.c().q();
                if(k10.n0 == null) {
                    k10.n0 = new ArrayList();
                }
                k10.n0.add(((Runnable)this.Z));
                k10.f0();
                return;
            }
            case 9: {
                C3 c30 = (C3)this.Y;
                i i0 = (i)this.Z;
                try {
                    a.b(c30);
                    i0.b(null);
                }
                catch(Exception exception0) {
                    i0.a(exception0);
                }
                return;
            }
            case 10: {
                try {
                    this.d();
                    return;
                }
                catch(Error error0) {
                    ArrayDeque arrayDeque0 = ((j)this.Z).Y;
                    synchronized(arrayDeque0) {
                        ((j)this.Z).Z = 1;
                    }
                    throw error0;
                }
            }
            case 11: {
                if(((p)(((h)this.Y))).d) {
                    ((m)this.Z).b0.p();
                    return;
                }
                try {
                    object3 = ((m)this.Z).Z.j(((h)this.Y));
                }
                catch(f f1) {
                    if(f1.getCause() instanceof Exception) {
                        ((m)this.Z).b0.n(((Exception)f1.getCause()));
                        return;
                    }
                    ((m)this.Z).b0.n(f1);
                    return;
                }
                catch(Exception exception1) {
                    ((m)this.Z).b0.n(exception1);
                    return;
                }
                ((m)this.Z).b0.o(object3);
                return;
            }
            case 12: {
                m m0 = (m)this.Z;
                try {
                    h0 = (h)m0.Z.j(((h)this.Y));
                }
                catch(f f2) {
                    if(f2.getCause() instanceof Exception) {
                        m0.b0.n(((Exception)f2.getCause()));
                        return;
                    }
                    m0.b0.n(f2);
                    return;
                }
                catch(Exception exception2) {
                    m0.b0.n(exception2);
                    return;
                }
                if(h0 == null) {
                    m0.u(new NullPointerException("Continuation returned null"));
                    return;
                }
                h0.c(o6.j.b, m0);
                h0.b(o6.j.b, m0);
                h0.a(o6.j.b, m0);
                return;
            }
            case 13: {
                this.a();
                return;
            }
            case 14: {
                this.b();
                return;
            }
            case 15: {
                this.c();
                return;
            }
            case 16: {
                n n0 = (n)this.Z;
                try {
                    Object object4 = ((h)this.Y).f();
                    p0 = ((g)n0.Z).i(object4);
                }
                catch(f f3) {
                    if(f3.getCause() instanceof Exception) {
                        n0.u(((Exception)f3.getCause()));
                        return;
                    }
                    n0.u(f3);
                    return;
                }
                catch(CancellationException unused_ex) {
                    n0.h();
                    return;
                }
                catch(Exception exception3) {
                    n0.u(exception3);
                    return;
                }
                if(p0 == null) {
                    n0.u(new NullPointerException("Continuation returned null"));
                    return;
                }
                p0.c(o6.j.b, n0);
                p0.b(o6.j.b, n0);
                p0.a(o6.j.b, n0);
                return;
            }
            case 17: {
                p p1 = (p)this.Y;
                try {
                    p1.o(((Callable)this.Z).call());
                }
                catch(Exception exception4) {
                    p1.n(exception4);
                }
                catch(Throwable throwable1) {
                    p1.n(new RuntimeException(throwable1));
                }
                return;
            }
            case 18: {
                K0 k00 = (K0)this.Z;
                androidx.recyclerview.widget.b b0 = (androidx.recyclerview.widget.b)k00.c0;
                if(b0.g == k00.Y) {
                    b0.e = (List)k00.b0;
                    b0.f = Collections.unmodifiableList(((List)k00.b0));
                    ((androidx.recyclerview.widget.c)this.Y).b(b0.a);
                    b0.a();
                }
                return;
            }
            case 19: {
                ((F3)((k0)this.Z).X).e(((T8.b)this.Y));
                return;
            }
            case 20: {
                s s2 = ((BiometricFragment)this.Z).Y0;
                if(s2.Z == null) {
                    s2.Z = new q();  // initializer: Ljava/lang/Object;-><init>()V
                }
                s2.Z.F(((r.p)this.Y));
                return;
            }
            case 21: {
                Q1.d d0 = ((SwipeDismissBehavior)this.Z).a;
                if(d0 != null && d0.f()) {
                    ((View)this.Y).postOnAnimation(this);
                }
                return;
            }
            case 22: {
                ((View)this.Y).setLayoutParams(((ViewGroup.LayoutParams)this.Z));
                return;
            }
            case 23: {
                ((v1.c)this.Y).X = this.Z;
                return;
            }
            case 24: {
                ((Application)this.Y).unregisterActivityLifecycleCallbacks(((v1.c)this.Z));
                return;
            }
            default: {
                try {
                    Method method0 = v1.d.d;
                    Object object0 = this.Z;
                    Object object1 = this.Y;
                    if(method0 != null) {
                        method0.invoke(object1, object0, Boolean.FALSE, "AppCompat recreation");
                        return;
                    }
                    v1.d.e.invoke(object1, object0, Boolean.FALSE);
                    return;
                }
                catch(RuntimeException runtimeException0) {
                }
                catch(Throwable throwable0) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", throwable0);
                    return;
                }
                if(runtimeException0.getClass() == RuntimeException.class && runtimeException0.getMessage() != null && runtimeException0.getMessage().startsWith("Unable to stop")) {
                    throw runtimeException0;
                }
            }
        }
    }

    @Override
    public String toString() {
        String s;
        if(this.X != 10) {
            return super.toString();
        }
        Runnable runnable0 = (Runnable)this.Y;
        if(runnable0 != null) {
            return "SequentialExecutorWorker{running=" + runnable0 + "}";
        }
        StringBuilder stringBuilder0 = new StringBuilder("SequentialExecutorWorker{state=");
        switch(((j)this.Z).Z) {
            case 1: {
                s = "IDLE";
                break;
            }
            case 2: {
                s = "QUEUING";
                break;
            }
            case 3: {
                s = "QUEUED";
                break;
            }
            case 4: {
                s = "RUNNING";
                break;
            }
            default: {
                s = "null";
            }
        }
        stringBuilder0.append(s);
        stringBuilder0.append("}");
        return stringBuilder0.toString();
    }
}

