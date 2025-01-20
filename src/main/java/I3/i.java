package i3;

import Bb.z;
import Nb.j;
import Xb.A;
import a3.t;
import a8.Q;
import android.content.Context;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import androidx.lifecycle.Lifecycle;
import j3.g;
import java.util.Arrays;
import k3.b;
import l3.a;
import pc.p;

public final class i {
    public final Integer A;
    public final Integer B;
    public final d C;
    public final c D;
    public final Context a;
    public final Object b;
    public final b c;
    public final Q d;
    public final Bitmap.Config e;
    public final j3.d f;
    public final t g;
    public final z h;
    public final a i;
    public final p j;
    public final q k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final i3.b p;
    public final i3.b q;
    public final i3.b r;
    public final A s;
    public final A t;
    public final A u;
    public final A v;
    public final Lifecycle w;
    public final j3.i x;
    public final g y;
    public final n z;

    public i(Context context0, Object object0, b b0, Q q0, Bitmap.Config bitmap$Config0, j3.d d0, t t0, z z0, a a0, p p0, q q1, boolean z1, boolean z2, boolean z3, boolean z4, i3.b b1, i3.b b2, i3.b b3, A a1, A a2, A a3, A a4, Lifecycle lifecycle0, j3.i i0, g g0, n n0, Integer integer0, Integer integer1, d d1, c c0) {
        this.a = context0;
        this.b = object0;
        this.c = b0;
        this.d = q0;
        this.e = bitmap$Config0;
        this.f = d0;
        this.g = t0;
        this.h = z0;
        this.i = a0;
        this.j = p0;
        this.k = q1;
        this.l = z1;
        this.m = z2;
        this.n = z3;
        this.o = z4;
        this.p = b1;
        this.q = b2;
        this.r = b3;
        this.s = a1;
        this.t = a2;
        this.u = a3;
        this.v = a4;
        this.w = lifecycle0;
        this.x = i0;
        this.y = g0;
        this.z = n0;
        this.A = integer0;
        this.B = integer1;
        this.C = d1;
        this.D = c0;
    }

    public static h a(i i0) {
        i0.getClass();
        return new h(i0, i0.a);
    }

    // Deobfuscation rating: HIGH(320)
    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 instanceof i && j.a(this.a, ((i)object0).a) && this.b.equals(((i)object0).b) && j.a(this.c, ((i)object0).c) && j.a(this.d, ((i)object0).d) && j.a(null, null) && j.a(null, null) && this.e == ((i)object0).e && (Build.VERSION.SDK_INT < 26 || j.a(null, null)) && this.f == ((i)object0).f && j.a(null, null) && j.a(this.g, ((i)object0).g) && j.a(this.h, ((i)object0).h) && j.a(this.i, ((i)object0).i) && j.a(this.j, ((i)object0).j) && this.k.equals(((i)object0).k) && this.l == ((i)object0).l && this.m == ((i)object0).m && this.n == ((i)object0).n && this.o == ((i)object0).o && this.p == ((i)object0).p && this.q == ((i)object0).q && this.r == ((i)object0).r && j.a(this.s, ((i)object0).s) && j.a(this.t, ((i)object0).t) && j.a(this.u, ((i)object0).u) && j.a(this.v, ((i)object0).v) && j.a(null, null) && j.a(this.A, ((i)object0).A) && j.a(null, null) && j.a(this.B, ((i)object0).B) && j.a(null, null) && j.a(null, null) && j.a(null, null) && j.a(this.w, ((i)object0).w) && this.x.equals(((i)object0).x) && this.y == ((i)object0).y && this.z.equals(((i)object0).z) && this.C.equals(((i)object0).C) && j.a(this.D, ((i)object0).D);
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        int v1 = this.b.hashCode();
        int v2 = 0;
        int v3 = this.c == null ? 0 : this.c.hashCode();
        int v4 = this.d == null ? 0 : this.d.hashCode();
        int v5 = this.e.hashCode();
        int v6 = this.f.hashCode();
        int v7 = this.g == null ? 0 : this.g.hashCode();
        this.h.getClass();
        this.i.getClass();
        int v8 = a.class.hashCode();
        int v9 = Arrays.hashCode(this.j.X);
        int v10 = this.k.a.hashCode();
        int v11 = 0x4D5;
        int v12 = this.l ? 0x4CF : 0x4D5;
        int v13 = this.m ? 0x4CF : 0x4D5;
        int v14 = this.n ? 0x4CF : 0x4D5;
        if(this.o) {
            v11 = 0x4CF;
        }
        int v15 = this.p.hashCode();
        int v16 = this.q.hashCode();
        int v17 = this.r.hashCode();
        int v18 = this.s.hashCode();
        int v19 = this.t.hashCode();
        int v20 = this.u.hashCode();
        int v21 = this.v.hashCode();
        int v22 = this.w.hashCode();
        int v23 = this.x.hashCode();
        int v24 = this.y.hashCode();
        int v25 = this.z.X.hashCode();
        int v26 = this.A == null ? 0 : this.A.hashCode();
        Integer integer0 = this.B;
        if(integer0 != null) {
            v2 = integer0.hashCode();
        }
        return this.D.hashCode() + (this.C.hashCode() + (((v25 + (v24 + (v23 + (v22 + (v21 + (v20 + (v19 + (v18 + (v17 + (v16 + (v15 + (((((v10 + ((v8 + (1 + ((v6 + (v5 + (((v1 + v * 0x1F) * 0x1F + v3) * 0x1F + v4) * 0x745F) * 961) * 961 + v7) * 0x1F) * 0x1F) * 0x1F + v9) * 0x1F) * 0x1F + v12) * 0x1F + v13) * 0x1F + v14) * 0x1F + v11) * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 961 + v26) * 961 + v2) * 0xE1781) * 0x1F;
    }
}

