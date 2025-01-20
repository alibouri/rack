package c7;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.Q;
import com.google.android.gms.internal.measurement.e0;
import com.google.android.gms.internal.measurement.f0;
import com.google.android.gms.internal.measurement.h0;
import com.google.android.gms.internal.measurement.i0;
import com.google.android.gms.internal.measurement.j0;
import com.google.android.gms.internal.measurement.l0;
import j6.I0;
import java.util.List;
import java.util.Map;
import java.util.Random;

public final class a implements I0 {
    public final e0 a;

    public a(e0 e00) {
        this.a = e00;
    }

    @Override  // j6.I0
    public final String b() {
        Q q0 = new Q();
        l0 l00 = new l0(this.a, q0, 1);
        this.a.e(l00);
        return (String)Q.e(q0.c(500L), String.class);
    }

    @Override  // j6.I0
    public final int c(String s) {
        return this.a.a(s);
    }

    @Override  // j6.I0
    public final void d(String s) {
        j0 j00 = new j0(this.a, s, 1);
        this.a.e(j00);
    }

    @Override  // j6.I0
    public final String e() {
        Q q0 = new Q();
        l0 l00 = new l0(this.a, q0, 4);
        this.a.e(l00);
        return (String)Q.e(q0.c(500L), String.class);
    }

    @Override  // j6.I0
    public final void f(Bundle bundle0) {
        f0 f00 = new f0(this.a, bundle0);
        this.a.e(f00);
    }

    @Override  // j6.I0
    public final void g(String s, String s1, Bundle bundle0) {
        i0 i00 = new i0(this.a, s, s1, bundle0, 1);
        this.a.e(i00);
    }

    @Override  // j6.I0
    public final List h(String s, String s1) {
        return this.a.c(s, s1);
    }

    @Override  // j6.I0
    public final long i() {
        e0 e00 = this.a;
        Q q0 = new Q();
        e00.e(new l0(e00, q0, 3));
        Long long0 = (Long)Q.e(q0.c(500L), Long.class);
        if(long0 == null) {
            e00.b.getClass();
            int v = e00.e + 1;
            e00.e = v;
            return new Random(System.nanoTime() ^ System.currentTimeMillis()).nextLong() + ((long)v);
        }
        return (long)long0;
    }

    @Override  // j6.I0
    public final void j(String s) {
        j0 j00 = new j0(this.a, s, 2);
        this.a.e(j00);
    }

    @Override  // j6.I0
    public final Map k(String s, String s1, boolean z) {
        return this.a.d(s, s1, z);
    }

    @Override  // j6.I0
    public final String l() {
        Q q0 = new Q();
        l0 l00 = new l0(this.a, q0, 2);
        this.a.e(l00);
        return (String)Q.e(q0.c(500L), String.class);
    }

    @Override  // j6.I0
    public final void m(String s, String s1, Bundle bundle0) {
        h0 h00 = new h0(this.a, s, s1, bundle0, true, 2);
        this.a.e(h00);
    }

    @Override  // j6.I0
    public final String n() {
        Q q0 = new Q();
        l0 l00 = new l0(this.a, q0, 0);
        this.a.e(l00);
        return (String)Q.e(q0.c(50L), String.class);
    }
}

