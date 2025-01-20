package L;

import Bb.z;
import D0.J;
import D0.M;
import D0.a0;
import D0.c;
import F0.n0;
import F0.o;
import F0.x;
import I.f0;
import M.i0;
import M.q;
import M0.i;
import Nb.j;
import O0.G;
import O0.L;
import O0.O;
import O0.f;
import O0.s;
import a1.a;
import a8.Q;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import g0.n;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import m0.e;
import n0.t;
import n0.v;
import n0.w;
import p0.b;
import p0.g;
import v1.r;

public final class m extends n implements n0, o, x {
    public l A0;
    public k B0;
    public f l0;
    public O m0;
    public FontFamily.Resolver n0;
    public Function1 o0;
    public int p0;
    public boolean q0;
    public int r0;
    public int s0;
    public List t0;
    public Function1 u0;
    public h v0;
    public w w0;
    public Function1 x0;
    public Map y0;
    public d z0;

    public m(f f0, O o0, FontFamily.Resolver fontFamily$Resolver0, Function1 function10, int v, boolean z, int v1, int v2, List list0, Function1 function11, h h0, w w0, Function1 function12) {
        this.l0 = f0;
        this.m0 = o0;
        this.n0 = fontFamily$Resolver0;
        this.o0 = function10;
        this.p0 = v;
        this.q0 = z;
        this.r0 = v1;
        this.s0 = v2;
        this.t0 = list0;
        this.u0 = function11;
        this.v0 = h0;
        this.w0 = w0;
        this.x0 = function12;
    }

    public final boolean A0(Function1 function10, Function1 function11, h h0, Function1 function12) {
        boolean z;
        if(this.o0 == function10) {
            z = false;
        }
        else {
            this.o0 = function10;
            z = true;
        }
        if(this.u0 != function11) {
            this.u0 = function11;
            z = true;
        }
        if(!j.a(this.v0, h0)) {
            this.v0 = h0;
            z = true;
        }
        if(this.x0 != function12) {
            this.x0 = function12;
            return true;
        }
        return z;
    }

    public final boolean B0(O o0, List list0, int v, int v1, boolean z, FontFamily.Resolver fontFamily$Resolver0, int v2) {
        int v3 = !this.m0.c(o0);
        this.m0 = o0;
        if(!j.a(this.t0, list0)) {
            this.t0 = list0;
            v3 = 1;
        }
        if(this.s0 != v) {
            this.s0 = v;
            v3 = 1;
        }
        if(this.r0 != v1) {
            this.r0 = v1;
            v3 = 1;
        }
        if(this.q0 != z) {
            this.q0 = z;
            v3 = 1;
        }
        if(!j.a(this.n0, fontFamily$Resolver0)) {
            this.n0 = fontFamily$Resolver0;
            v3 = 1;
        }
        if(this.p0 != v2) {
            this.p0 = v2;
            return true;
        }
        return v3;
    }

    public final boolean C0(f f0) {
        boolean z = j.a(this.l0.X, f0.X);
        List list0 = f0.b();
        boolean z1 = this.l0.b().equals(list0);
        List list1 = this.l0.Z;
        List list2 = z.X;
        if(list1 == null) {
            list1 = list2;
        }
        List list3 = f0.Z;
        if(list3 != null) {
            list2 = list3;
        }
        boolean z2 = !z || !z1 || !list1.equals(list2) || !j.a(this.l0.b0, f0.b0);
        if(z2) {
            this.l0 = f0;
        }
        if(!z) {
            this.B0 = null;
        }
        return z2;
    }

    @Override  // F0.n0
    public final boolean Z() {
        return true;
    }

    @Override  // F0.x
    public final int a(F0.O o0, J j0, int v) {
        return f0.p(this.z0(o0).d(o0.getLayoutDirection()).d());
    }

    @Override  // F0.x
    public final int b(F0.O o0, J j0, int v) {
        return this.z0(o0).a(v, o0.getLayoutDirection());
    }

    @Override  // F0.o
    public final void c(LayoutNodeDrawScope layoutNodeDrawScope0) {
        long v4;
        Q q2;
        int v2;
        if(!this.k0) {
            return;
        }
        h h0 = this.v0;
        boolean z = false;
        b b0 = layoutNodeDrawScope0.X;
        if(h0 != null) {
            q q0 = (q)((i0)h0.Y).a().e(h0.X);
            if(q0 != null) {
                int v = q0.c ? q0.b.b : q0.a.b;
                int v1 = q0.c ? q0.a.b : q0.b.b;
                if(v != v1) {
                    M.m m0 = h0.c0;
                    if(m0 == null) {
                        v2 = 0;
                    }
                    else {
                        L l0 = (L)m0.c.invoke();
                        v2 = l0 == null ? 0 : m0.b(l0);
                    }
                    if(v > v2) {
                        v = v2;
                    }
                    if(v1 > v2) {
                        v1 = v2;
                    }
                    L l1 = h0.b0.b;
                    n0.j j0 = l1 == null ? null : l1.k(v, v1);
                    if(j0 != null) {
                        L l2 = h0.b0.b;
                        if(l2 == null || l2.a.f == 3 || !l2.d()) {
                            m5.b.j(layoutNodeDrawScope0, j0, h0.Z, 0.0f, null, 60);
                        }
                        else {
                            float f = e.d(layoutNodeDrawScope0.d());
                            float f1 = e.b(layoutNodeDrawScope0.d());
                            Q q1 = b0.Y;
                            long v3 = q1.A();
                            q1.o().n();
                            try {
                                ((g3.b)q1.Y).e(0.0f, 0.0f, f, f1, 1);
                                q2 = q1;
                            }
                            catch(Throwable throwable0) {
                                v4 = v3;
                                q2 = q1;
                                r.i(q2, v4);
                                throw throwable0;
                            }
                            try {
                                m5.b.j(layoutNodeDrawScope0, j0, h0.Z, 0.0f, null, 60);
                            }
                            catch(Throwable throwable0) {
                                v4 = v3;
                                r.i(q2, v4);
                                throw throwable0;
                            }
                            r.i(q2, v3);
                        }
                    }
                }
            }
        }
        t t0 = b0.Y.o();
        L l3 = this.z0(layoutNodeDrawScope0).n;
        if(l3 == null) {
            throw new IllegalStateException("You must call layoutWithConstraints first");
        }
        boolean z1 = l3.d() && this.p0 != 3;
        if(z1) {
            t0.n();
            t0.s(yc.l.g(0L, J2.w.m(((int)(l3.c >> 0x20)), ((int)(l3.c & 0xFFFFFFFFL)))), 1);
        }
        try {
            G g0 = this.m0.a;
            Z0.j j1 = g0.m == null ? Z0.j.b : g0.m;
            n0.Q q3 = g0.n == null ? n0.Q.d : g0.n;
            p0.e e0 = g0.p;
            if(e0 == null) {
                e0 = g.a;
            }
            n0.r r0 = g0.a.e();
            s s0 = l3.b;
            if(r0 == null) {
                long v6 = this.w0 == null ? v.i : this.w0.a();
                if(v6 == 16L) {
                    v6 = this.m0.b() == 16L ? v.b : this.m0.b();
                }
                s.g(s0, t0, v6, q3, j1, e0);
            }
            else {
                s.h(s0, t0, r0, this.m0.a.a.a(), q3, j1, e0);
            }
        }
        finally {
            if(z1) {
                t0.l();
            }
        }
        if((this.B0 == null || !this.B0.c ? Z6.b.q(this.l0) : false)) {
            layoutNodeDrawScope0.a();
        }
        else {
            if(this.t0 == null || this.t0.isEmpty()) {
                z = true;
            }
            if(!z) {
                layoutNodeDrawScope0.a();
            }
        }
    }

    @Override  // F0.n0
    public final boolean c0() {
        return false;
    }

    @Override  // F0.x
    public final D0.L e(M m0, J j0, long v) {
        boolean z;
        d d0 = this.z0(m0);
        LayoutDirection layoutDirection0 = m0.getLayoutDirection();
        if(d0.g > 1) {
            L.b b0 = d0.i;
            O o0 = d0.b;
            Density density0 = d0.k;
            j.c(density0);
            L.b b1 = W5.f.B(b0, layoutDirection0, o0, density0, d0.c);
            d0.i = b1;
            v = b1.a(d0.g, v);
        }
        L l0 = d0.n;
        if(l0 == null || (l0.b.a.b() || (layoutDirection0 != l0.a.h || !a.b(v, l0.a.j) && (a.h(v) != a.h(l0.a.j) || ((float)a.g(v)) < l0.b.e || l0.b.c)))) {
            d0.n = d0.e(layoutDirection0, v, d0.b(v, layoutDirection0));
            z = true;
        }
        else {
            L l1 = d0.n;
            j.c(l1);
            if(a.b(v, l1.a.j)) {
                z = false;
            }
            else {
                L l2 = d0.n;
                j.c(l2);
                d0.n = d0.e(layoutDirection0, v, l2.b);
                z = true;
            }
        }
        L l3 = d0.n;
        if(l3 == null) {
            throw new IllegalStateException("You must call layoutWithConstraints first");
        }
        l3.b.a.b();
        if(z) {
            F0.f.t(this, 2).M0();
            Function1 function10 = this.o0;
            if(function10 != null) {
                function10.n(l3);
            }
            h h0 = this.v0;
            if(h0 != null) {
                L l4 = h0.b0.b;
                if(l4 != null && !j.a(l4.a.a, l3.a.a)) {
                    M.z z1 = ((i0)h0.Y).i;
                    if(z1 != null) {
                        z1.n(((long)h0.X));
                    }
                }
                h0.b0 = L.j.a(h0.b0, null, l3, 1);
            }
            Map map0 = this.y0;
            if(map0 == null) {
                map0 = new LinkedHashMap(2);
            }
            map0.put(c.a, Math.round(l3.d));
            map0.put(c.b, Math.round(l3.e));
            this.y0 = map0;
        }
        Function1 function11 = this.u0;
        if(function11 != null) {
            function11.n(l3.f);
        }
        int v1 = (int)(l3.c >> 0x20);
        int v2 = (int)(l3.c & 0xFFFFFFFFL);
        int v3 = Math.min(v1, 0x3FFFE);
        int v4 = 0x7FFFFFFF;
        int v5 = v1 == 0x7FFFFFFF ? 0x7FFFFFFF : Math.min(v1, 0x3FFFE);
        int v6 = W5.f.j((v5 == 0x7FFFFFFF ? v3 : v5));
        if(v2 != 0x7FFFFFFF) {
            v4 = Math.min(v6, v2);
        }
        Map map1 = this.y0;
        j.c(map1);
        return m0.L(v1, v2, map1, new B.l(j0.a(W5.f.b(v3, v5, Math.min(v6, v2), v4)), 7));
    }

    @Override  // F0.x
    public final int f(F0.O o0, J j0, int v) {
        return this.z0(o0).a(v, o0.getLayoutDirection());
    }

    @Override  // F0.o
    public final void f0() {
    }

    @Override  // F0.x
    public final int g(F0.O o0, J j0, int v) {
        return f0.p(this.z0(o0).d(o0.getLayoutDirection()).a());
    }

    @Override  // F0.n0
    public final void o(M0.j j0) {
        l l0 = this.A0;
        if(l0 == null) {
            l0 = new l(this, 0);
            this.A0 = l0;
        }
        List list0 = Bb.q.K(this.l0);
        j0.c(M0.q.u, list0);
        k k0 = this.B0;
        if(k0 != null) {
            f f0 = k0.b;
            Tb.e e0 = M0.s.a[14];
            M0.q.v.a(j0, f0);
            boolean z = k0.c;
            Tb.e e1 = M0.s.a[15];
            M0.q.w.a(j0, Boolean.valueOf(z));
        }
        M0.a a0 = new M0.a(null, new l(this, 1));
        j0.c(i.j, a0);
        M0.a a1 = new M0.a(null, new l(this, 2));
        j0.c(i.k, a1);
        M0.a a2 = new M0.a(null, new a0(19, this));
        j0.c(i.l, a2);
        M0.s.c(j0, l0);
    }

    public final void x0(boolean z, boolean z1, boolean z2, boolean z3) {
        if(z1 || z2 || z3) {
            d d0 = this.y0();
            d0.a = this.l0;
            d0.b = this.m0;
            d0.c = this.n0;
            d0.d = this.p0;
            d0.e = this.q0;
            d0.f = this.r0;
            d0.g = this.s0;
            d0.h = this.t0;
            d0.l = null;
            d0.n = null;
            d0.p = -1;
            d0.o = -1;
        }
        if(!this.k0) {
            return;
        }
        if(z1 || z && this.A0 != null) {
            F0.f.p(this);
        }
        if(z1 || z2 || z3) {
            F0.f.o(this);
            F0.f.n(this);
        }
        if(z) {
            F0.f.n(this);
        }
    }

    public final d y0() {
        if(this.z0 == null) {
            this.z0 = new d(this.l0, this.m0, this.n0, this.p0, this.q0, this.r0, this.s0, this.t0);
        }
        d d0 = this.z0;
        j.c(d0);
        return d0;
    }

    public final d z0(Density density0) {
        k k0 = this.B0;
        if(k0 != null && k0.c) {
            d d0 = k0.d;
            if(d0 != null) {
                d0.c(density0);
                return d0;
            }
        }
        d d1 = this.y0();
        d1.c(density0);
        return d1;
    }
}

