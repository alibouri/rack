package j6;

import E7.o;
import N5.r;
import O3.j;
import S5.a;
import S5.b;
import W6.e;
import W6.f;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.A1;
import com.google.android.gms.internal.measurement.B1;
import com.google.android.gms.internal.measurement.E1;
import com.google.android.gms.internal.measurement.K1;
import com.google.android.gms.internal.measurement.L1;
import com.google.android.gms.internal.measurement.q2;
import com.google.android.gms.internal.measurement.zzdw;
import io.sentry.hints.i;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

public final class d0 implements n0 {
    public final Boolean A0;
    public volatile boolean B0;
    public int C0;
    public int D0;
    public final AtomicInteger E0;
    public final long F0;
    public static volatile d0 G0;
    public final Context X;
    public final String Y;
    public final String Z;
    public final String b0;
    public final boolean c0;
    public final i d0;
    public final d e0;
    public final V f0;
    public final L g0;
    public final a0 h0;
    public final a1 i0;
    public final r1 j0;
    public final G k0;
    public final b l0;
    public final L0 m0;
    public final w0 n0;
    public final n o0;
    public final J0 p0;
    public final String q0;
    public E r0;
    public P0 s0;
    public m t0;
    public F u0;
    public boolean v0;
    public Boolean w0;
    public long x0;
    public volatile Boolean y0;
    public final Boolean z0;

    public d0(u0 u00) {
        e e0;
        boolean z = false;
        this.v0 = false;
        this.E0 = new AtomicInteger(0);
        Context context0 = u00.a;
        i i0 = new i(25);
        this.d0 = i0;
        t0.k = i0;
        this.X = context0;
        this.Y = u00.b;
        this.Z = u00.c;
        this.b0 = u00.d;
        this.c0 = u00.h;
        this.y0 = u00.e;
        this.q0 = u00.j;
        this.B0 = true;
        zzdw zzdw0 = u00.g;
        if(zzdw0 != null) {
            Bundle bundle0 = zzdw0.e0;
            if(bundle0 != null) {
                Object object0 = bundle0.get("measurementEnabled");
                if(object0 instanceof Boolean) {
                    this.z0 = (Boolean)object0;
                }
                Object object1 = zzdw0.e0.get("measurementDeactivated");
                if(object1 instanceof Boolean) {
                    this.A0 = (Boolean)object1;
                }
            }
        }
        if(K1.h == null && context0 != null) {
            Object object2 = K1.g;
            synchronized(object2) {
                if(K1.h == null) {
                    synchronized(object2) {
                        B1 b10 = K1.h;
                        Context context1 = context0.getApplicationContext();
                        if(context1 == null) {
                            context1 = context0;
                        }
                        if(b10 == null || b10.a != context1) {
                            if(b10 != null) {
                                A1.d();
                                L1.b();
                                E1.B();
                            }
                            q2 q20 = new q2();  // initializer: Ljava/lang/Object;-><init>()V
                            q20.X = context1;
                            if(q20 instanceof Serializable) {
                                e0 = new e(q20);
                            }
                            else {
                                e0 = new f();  // initializer: Ljava/lang/Object;-><init>()V
                                e0.X = q20;
                            }
                            K1.h = new B1(context1, e0);
                            K1.i.incrementAndGet();
                        }
                    }
                }
            }
        }
        this.l0 = b.a;
        this.F0 = u00.i == null ? System.currentTimeMillis() : ((long)u00.i);
        d d0 = new d(this);  // initializer: LO3/j;-><init>(Lj6/d0;)V
        d0.c0 = new v7.d(25);
        this.e0 = d0;
        V v0 = new V(this);
        v0.s();
        this.f0 = v0;
        L l0 = new L(this);
        l0.s();
        this.g0 = l0;
        r1 r10 = new r1(this);
        r10.s();
        this.j0 = r10;
        this.k0 = new G(new W(this, 1));
        this.o0 = new n(this);
        L0 l00 = new L0(this);
        l00.v();
        this.m0 = l00;
        w0 w00 = new w0(this);
        w00.v();
        this.n0 = w00;
        a1 a10 = new a1(this);
        a10.v();
        this.i0 = a10;
        J0 j00 = new J0(this);  // initializer: Lj6/o0;-><init>(Lj6/d0;)V
        j00.s();
        this.p0 = j00;
        a0 a00 = new a0(this);
        a00.s();
        this.h0 = a00;
        if(u00.g != null && u00.g.Y != 0L) {
            z = true;
        }
        if(context0.getApplicationContext() instanceof Application) {
            d0.g(w00);
            d0 d00 = (d0)w00.Y;
            if(d00.X.getApplicationContext() instanceof Application) {
                Application application0 = (Application)d00.X.getApplicationContext();
                if(w00.b0 == null) {
                    w00.b0 = new o(w00);
                }
                if(!z) {
                    application0.unregisterActivityLifecycleCallbacks(w00.b0);
                    application0.registerActivityLifecycleCallbacks(w00.b0);
                    w00.b().m0.d("Registered activity lifecycle callback");
                }
            }
        }
        else {
            d0.h(l0);
            l0.h0.d("Application context is not an Application");
        }
        a00.z(new Y6.b(28, this, u00, false));
    }

    @Override  // j6.n0
    public final i a() {
        return this.d0;
    }

    @Override  // j6.n0
    public final L b() {
        d0.h(this.g0);
        return this.g0;
    }

    @Override  // j6.n0
    public final a0 c() {
        d0.h(this.h0);
        return this.h0;
    }

    public static d0 d(Context context0, zzdw zzdw0, Long long0) {
        if(zzdw0 != null && (zzdw0.c0 == null || zzdw0.d0 == null)) {
            zzdw0 = new zzdw(zzdw0.X, zzdw0.Y, zzdw0.Z, zzdw0.b0, null, null, zzdw0.e0, null);
        }
        r.j(context0);
        r.j(context0.getApplicationContext());
        if(d0.G0 == null) {
            synchronized(d0.class) {
                if(d0.G0 == null) {
                    d0.G0 = new d0(new u0(context0, zzdw0, long0));
                }
            }
        }
        else if(zzdw0 != null && (zzdw0.e0 != null && zzdw0.e0.containsKey("dataCollectionDefaultEnabled"))) {
            r.j(d0.G0);
            d0 d00 = d0.G0;
            d00.y0 = Boolean.valueOf(zzdw0.e0.getBoolean("dataCollectionDefaultEnabled"));
        }
        r.j(d0.G0);
        return d0.G0;
    }

    public static void e(j j0) {
        if(j0 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    @Override  // j6.n0
    public final a f() {
        return this.l0;
    }

    public static void g(U u0) {
        if(u0 == null) {
            throw new IllegalStateException("Component not created");
        }
        if(!u0.Z) {
            throw new IllegalStateException("Component not initialized: " + u0.getClass());
        }
    }

    public static void h(o0 o00) {
        if(o00 == null) {
            throw new IllegalStateException("Component not created");
        }
        if(!o00.Z) {
            throw new IllegalStateException("Component not initialized: " + o00.getClass());
        }
    }

    public final boolean i() {
        return this.k() == 0;
    }

    public final boolean j() {
        if(!this.v0) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        d0.h(this.h0);
        this.h0.q();
        Boolean boolean0 = this.w0;
        b b0 = this.l0;
        if(boolean0 == null || this.x0 == 0L) {
        label_9:
            b0.getClass();
            this.x0 = SystemClock.elapsedRealtime();
            r1 r10 = this.j0;
            d0.e(r10);
            boolean z = true;
            boolean z1 = r10.t0("android.permission.INTERNET") && r10.t0("android.permission.ACCESS_NETWORK_STATE") && (U5.b.a(this.X).d() || this.e0.E() || r1.X(this.X) && r1.i0(this.X));
            this.w0 = Boolean.valueOf(z1);
            if(z1) {
                String s = this.n().y();
                F f0 = this.n();
                f0.u();
                if(!r10.b0(s, f0.l0)) {
                    F f1 = this.n();
                    f1.u();
                    if(TextUtils.isEmpty(f1.l0)) {
                        z = false;
                    }
                }
                this.w0 = Boolean.valueOf(z);
            }
        }
        else if(!boolean0.booleanValue()) {
            b0.getClass();
            if(Math.abs(SystemClock.elapsedRealtime() - this.x0) > 1000L) {
                goto label_9;
            }
        }
        return this.w0.booleanValue();
    }

    public final int k() {
        d0.h(this.h0);
        this.h0.q();
        Boolean boolean0 = this.e0.z("firebase_analytics_collection_deactivated");
        if(boolean0 != null && boolean0.booleanValue()) {
            return 1;
        }
        if(this.A0 != null && this.A0.booleanValue()) {
            return 2;
        }
        d0.h(this.h0);
        this.h0.q();
        if(!this.B0) {
            return 8;
        }
        d0.e(this.f0);
        this.f0.q();
        Boolean boolean1 = this.f0.y().contains("measurement_enabled") ? Boolean.valueOf(this.f0.y().getBoolean("measurement_enabled", true)) : null;
        if(boolean1 != null) {
            return boolean1.booleanValue() ? 0 : 3;
        }
        Boolean boolean2 = this.e0.z("firebase_analytics_collection_enabled");
        if(boolean2 != null) {
            return boolean2.booleanValue() ? 0 : 4;
        }
        Boolean boolean3 = this.z0;
        if(boolean3 != null) {
            return boolean3.booleanValue() ? 0 : 5;
        }
        return this.y0 != null && !this.y0.booleanValue() ? 7 : 0;
    }

    public final n l() {
        n n0 = this.o0;
        if(n0 == null) {
            throw new IllegalStateException("Component not created");
        }
        return n0;
    }

    public final m m() {
        d0.h(this.t0);
        return this.t0;
    }

    public final F n() {
        d0.g(this.u0);
        return this.u0;
    }

    public final E o() {
        d0.g(this.r0);
        return this.r0;
    }

    public final G p() {
        return this.k0;
    }

    public final P0 q() {
        d0.g(this.s0);
        return this.s0;
    }

    public final void r() {
        d0.e(this.j0);
    }

    @Override  // j6.n0
    public final Context zza() {
        return this.X;
    }
}

