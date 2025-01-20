package h6;

import J5.g;
import N5.r;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.measurement.internal.zzon;
import io.sentry.hints.i;
import j6.B0;
import j6.L0;
import j6.a0;
import j6.d0;
import j6.n;
import j6.r1;
import j6.w0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import s.e;

public final class c extends a {
    public final d0 a;
    public final w0 b;

    public c(d0 d00) {
        r.j(d00);
        this.a = d00;
        d0.g(d00.n0);
        this.b = d00.n0;
    }

    @Override  // j6.I0
    public final String b() {
        return (String)this.b.f0.get();
    }

    @Override  // j6.I0
    public final int c(String s) {
        r.f(s);
        return 25;
    }

    @Override  // j6.I0
    public final void d(String s) {
        n n0 = this.a.l();
        this.a.l0.getClass();
        n0.z(SystemClock.elapsedRealtime(), s);
    }

    @Override  // j6.I0
    public final String e() {
        L0 l00 = ((d0)this.b.Y).m0;
        d0.g(l00);
        return l00.b0 == null ? null : l00.b0.b;
    }

    @Override  // j6.I0
    public final void f(Bundle bundle0) {
        ((d0)this.b.Y).l0.getClass();
        this.b.S(bundle0, System.currentTimeMillis());
    }

    @Override  // j6.I0
    public final void g(String s, String s1, Bundle bundle0) {
        d0.g(this.a.n0);
        this.a.n0.I(s, s1, bundle0);
    }

    @Override  // j6.I0
    public final List h(String s, String s1) {
        w0 w00 = this.b;
        if(w00.c().B()) {
            w00.b().e0.d("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if(i.Q()) {
            w00.b().e0.d("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference0 = new AtomicReference();
        a0 a00 = ((d0)w00.Y).h0;
        d0.h(a00);
        a00.v(atomicReference0, 5000L, "get conditional user properties", new B0(w00, atomicReference0, s, s1, 1));
        List list0 = (List)atomicReference0.get();
        if(list0 == null) {
            w00.b().e0.b(null, "Timed out waiting for get conditional user properties");
            return new ArrayList();
        }
        return r1.l0(list0);
    }

    @Override  // j6.I0
    public final long i() {
        d0.e(this.a.j0);
        return this.a.j0.B0();
    }

    @Override  // j6.I0
    public final void j(String s) {
        n n0 = this.a.l();
        this.a.l0.getClass();
        n0.w(SystemClock.elapsedRealtime(), s);
    }

    @Override  // j6.I0
    public final Map k(String s, String s1, boolean z) {
        w0 w00 = this.b;
        if(w00.c().B()) {
            w00.b().e0.d("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        if(i.Q()) {
            w00.b().e0.d("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference0 = new AtomicReference();
        a0 a00 = ((d0)w00.Y).h0;
        d0.h(a00);
        a00.v(atomicReference0, 5000L, "get user properties", new g(w00, atomicReference0, s, s1, z, 2));
        List list0 = (List)atomicReference0.get();
        if(list0 == null) {
            w00.b().e0.b(Boolean.valueOf(z), "Timed out waiting for handle get user properties, includeInternal");
            return Collections.emptyMap();
        }
        e e0 = new e(list0.size());  // initializer: Ls/J;-><init>(I)V
        for(Object object0: list0) {
            zzon zzon0 = (zzon)object0;
            Object object1 = zzon0.zza();
            if(object1 != null) {
                e0.put(zzon0.Y, object1);
            }
        }
        return e0;
    }

    @Override  // j6.I0
    public final String l() {
        L0 l00 = ((d0)this.b.Y).m0;
        d0.g(l00);
        return l00.b0 == null ? null : l00.b0.a;
    }

    @Override  // j6.I0
    public final void m(String s, String s1, Bundle bundle0) {
        ((d0)this.b.Y).l0.getClass();
        this.b.J(s, s1, bundle0, true, true, System.currentTimeMillis());
    }

    @Override  // j6.I0
    public final String n() {
        return (String)this.b.f0.get();
    }
}

