package L;

import B.l;
import Bb.q;
import D0.J;
import D0.L;
import D0.M;
import D0.a0;
import D0.c;
import F0.n0;
import F0.o;
import F0.x;
import I.f0;
import M0.i;
import M0.s;
import O0.G;
import O0.O;
import O0.a;
import W5.f;
import Z0.j;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import g0.n;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import n0.Q;
import n0.r;
import n0.t;
import n0.v;
import n0.w;
import p0.g;

public final class p extends n implements n0, o, x {
    public String l0;
    public O m0;
    public FontFamily.Resolver n0;
    public int o0;
    public boolean p0;
    public int q0;
    public int r0;
    public w s0;
    public Map t0;
    public e u0;
    public L.o v0;
    public L.n w0;

    @Override  // F0.n0
    public final boolean Z() {
        return false;
    }

    @Override  // F0.x
    public final int a(F0.O o0, J j0, int v) {
        return f0.p(this.y0(o0).d(o0.getLayoutDirection()).d());
    }

    @Override  // F0.x
    public final int b(F0.O o0, J j0, int v) {
        return this.y0(o0).a(v, o0.getLayoutDirection());
    }

    @Override  // F0.o
    public final void c(LayoutNodeDrawScope layoutNodeDrawScope0) {
        if(!this.k0) {
            return;
        }
        e e0 = this.y0(layoutNodeDrawScope0);
        a a0 = e0.j;
        if(a0 == null) {
            throw new IllegalArgumentException(("no paragraph (layoutCache=" + this.u0 + ", textSubstitution=" + this.w0 + ')').toString());
        }
        t t0 = layoutNodeDrawScope0.X.Y.o();
        boolean z = e0.k;
        if(z) {
            float f = (float)(((int)(e0.l >> 0x20)));
            float f1 = (float)(((int)(e0.l & 0xFFFFFFFFL)));
            t0.n();
            t0.i(0.0f, 0.0f, f, f1, 1);
        }
        try {
            G g0 = this.m0.a;
            j j0 = g0.m == null ? j.b : g0.m;
            Q q0 = g0.n == null ? Q.d : g0.n;
            p0.e e1 = g0.p;
            if(e1 == null) {
                e1 = g.a;
            }
            r r0 = g0.a.e();
            if(r0 == null) {
                long v1 = this.s0 == null ? v.i : this.s0.a();
                if(v1 == 16L) {
                    v1 = this.m0.b() == 16L ? v.b : this.m0.b();
                }
                a0.f(t0, v1, q0, j0, e1, 3);
            }
            else {
                a0.g(t0, r0, this.m0.a.a.a(), q0, j0, e1, 3);
            }
        }
        finally {
            if(z) {
                t0.l();
            }
        }
    }

    @Override  // F0.n0
    public final boolean c0() {
        return false;
    }

    @Override  // F0.x
    public final L e(M m0, J j0, long v) {
        boolean z;
        long v1;
        e e0 = this.y0(m0);
        LayoutDirection layoutDirection0 = m0.getLayoutDirection();
        if(e0.g > 1) {
            b b0 = e0.m;
            O o0 = e0.b;
            Density density0 = e0.i;
            Nb.j.c(density0);
            b b1 = f.B(b0, layoutDirection0, o0, density0, e0.c);
            e0.m = b1;
            v1 = b1.a(e0.g, v);
        }
        else {
            v1 = v;
        }
        a a0 = e0.j;
        if(a0 == null || (e0.n == null || e0.n.b() || layoutDirection0 != e0.o || !a1.a.b(v1, e0.p) && (a1.a.h(v1) != a1.a.h(e0.p) || ((float)a1.a.g(v1)) < a0.b() || a0.d.d))) {
            a a2 = e0.b(v1, layoutDirection0);
            e0.p = v1;
            long v3 = f.q(v1, io.sentry.config.a.d(f0.p(a2.d()), f0.p(a2.b())));
            e0.l = v3;
            e0.k = e0.d != 3 && (((float)(((int)(v3 >> 0x20)))) >= a2.d() || ((float)(((int)(v3 & 0xFFFFFFFFL)))) >= a2.b());
            e0.j = a2;
            z = true;
        }
        else {
            if(!a1.a.b(v1, e0.p)) {
                a a1 = e0.j;
                Nb.j.c(a1);
                long v2 = f.q(v1, io.sentry.config.a.d(f0.p(Math.min(a1.a.g0.b(), a1.d())), f0.p(a1.b())));
                e0.l = v2;
                e0.k = e0.d != 3 && (((float)(((int)(v2 >> 0x20)))) >= a1.d() || ((float)(((int)(v2 & 0xFFFFFFFFL)))) >= a1.b());
                e0.p = v1;
            }
            z = false;
        }
        O0.w w0 = e0.n;
        if(w0 != null) {
            w0.b();
        }
        a a3 = e0.j;
        Nb.j.c(a3);
        long v4 = e0.l;
        if(z) {
            F0.f.t(this, 2).M0();
            Map map0 = this.t0;
            if(map0 == null) {
                map0 = new LinkedHashMap(2);
            }
            Integer integer0 = Math.round(a3.d.d(0));
            map0.put(c.a, integer0);
            Integer integer1 = Math.round(a3.d.d(a3.d.g - 1));
            map0.put(c.b, integer1);
            this.t0 = map0;
        }
        int v5 = Math.min(((int)(v4 >> 0x20)), 0x3FFFE);
        int v6 = 0x7FFFFFFF;
        int v7 = ((int)(v4 >> 0x20)) == 0x7FFFFFFF ? 0x7FFFFFFF : Math.min(((int)(v4 >> 0x20)), 0x3FFFE);
        int v8 = f.j((v7 == 0x7FFFFFFF ? v5 : v7));
        if(((int)(v4 & 0xFFFFFFFFL)) != 0x7FFFFFFF) {
            v6 = Math.min(v8, ((int)(v4 & 0xFFFFFFFFL)));
        }
        Map map1 = this.t0;
        Nb.j.c(map1);
        return m0.L(((int)(v4 >> 0x20)), ((int)(v4 & 0xFFFFFFFFL)), map1, new l(j0.a(f.b(v5, v7, Math.min(v8, ((int)(v4 & 0xFFFFFFFFL))), v6)), 8));
    }

    @Override  // F0.x
    public final int f(F0.O o0, J j0, int v) {
        return this.y0(o0).a(v, o0.getLayoutDirection());
    }

    @Override  // F0.o
    public final void f0() {
    }

    @Override  // F0.x
    public final int g(F0.O o0, J j0, int v) {
        return f0.p(this.y0(o0).d(o0.getLayoutDirection()).a());
    }

    @Override  // F0.n0
    public final void o(M0.j j0) {
        L.o o0 = this.v0;
        if(o0 == null) {
            o0 = new L.o(this, 0);
            this.v0 = o0;
        }
        List list0 = q.K(new O0.f(6, this.l0, null));
        j0.c(M0.q.u, list0);
        L.n n0 = this.w0;
        if(n0 != null) {
            boolean z = n0.c;
            Tb.e e0 = s.a[15];
            M0.q.w.a(j0, Boolean.valueOf(z));
            O0.f f0 = new O0.f(6, n0.b, null);
            Tb.e e1 = s.a[14];
            M0.q.v.a(j0, f0);
        }
        M0.a a0 = new M0.a(null, new L.o(this, 1));
        j0.c(i.j, a0);
        M0.a a1 = new M0.a(null, new L.o(this, 2));
        j0.c(i.k, a1);
        M0.a a2 = new M0.a(null, new a0(20, this));
        j0.c(i.l, a2);
        s.c(j0, o0);
    }

    public final e x0() {
        if(this.u0 == null) {
            this.u0 = new e(this.l0, this.m0, this.n0, this.o0, this.p0, this.q0, this.r0);
        }
        e e0 = this.u0;
        Nb.j.c(e0);
        return e0;
    }

    public final e y0(Density density0) {
        L.n n0 = this.w0;
        if(n0 != null && n0.c) {
            e e0 = n0.d;
            if(e0 != null) {
                e0.c(density0);
                return e0;
            }
        }
        e e1 = this.x0();
        e1.c(density0);
        return e1;
    }
}

