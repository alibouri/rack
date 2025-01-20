package Z2;

import Bb.A;
import D0.J;
import D0.L;
import D0.M;
import D0.V;
import D0.Z;
import D0.b0;
import D0.j;
import Ea.h0;
import F0.O;
import F0.o;
import F0.x;
import J2.w;
import W5.f;
import a1.a;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import g0.c;
import g0.n;
import m0.e;
import s0.b;

public final class r extends n implements o, x {
    public b l0;
    public c m0;
    public j n0;
    public float o0;
    public n0.n p0;

    @Override  // F0.x
    public final int a(O o0, J j0, int v) {
        if(this.l0.h() != 0x7FC000007FC00000L) {
            int v1 = j0.N(a.g(this.y0(f.c(0, v, 7))));
            return Math.max(Pb.a.H(e.d(this.x0(w.m(v1, v)))), v1);
        }
        return j0.N(v);
    }

    @Override  // F0.x
    public final int b(O o0, J j0, int v) {
        if(this.l0.h() != 0x7FC000007FC00000L) {
            int v1 = j0.b(a.h(this.y0(f.c(v, 0, 13))));
            return Math.max(Pb.a.H(e.b(this.x0(w.m(v, v1)))), v1);
        }
        return j0.b(v);
    }

    @Override  // F0.o
    public final void c(LayoutNodeDrawScope layoutNodeDrawScope0) {
        long v = this.x0(layoutNodeDrawScope0.X.Y.A());
        c c0 = this.m0;
        long v1 = io.sentry.config.a.d(Pb.a.H(e.d(v)), Pb.a.H(e.b(v)));
        long v2 = layoutNodeDrawScope0.X.Y.A();
        long v3 = c0.a(v1, io.sentry.config.a.d(Pb.a.H(e.d(v2)), Pb.a.H(e.b(v2))), layoutNodeDrawScope0.getLayoutDirection());
        float f = (float)(((int)(v3 >> 0x20)));
        float f1 = (float)(((int)(v3 & 0xFFFFFFFFL)));
        ((g3.b)layoutNodeDrawScope0.X.Y.Y).t(f, f1);
        this.l0.g(layoutNodeDrawScope0, v, this.o0, this.p0);
        ((g3.b)layoutNodeDrawScope0.X.Y.Y).t(-f, -f1);
        layoutNodeDrawScope0.a();
    }

    @Override  // F0.x
    public final L e(M m0, J j0, long v) {
        V v1 = j0.a(this.y0(v));
        int v2 = v1.X;
        int v3 = v1.Y;
        h0 h00 = new h0(v1, 2);
        return m0.L(v2, v3, A.X, h00);
    }

    @Override  // F0.x
    public final int f(O o0, J j0, int v) {
        if(this.l0.h() != 0x7FC000007FC00000L) {
            int v1 = j0.O(a.h(this.y0(f.c(v, 0, 13))));
            return Math.max(Pb.a.H(e.b(this.x0(w.m(v, v1)))), v1);
        }
        return j0.O(v);
    }

    @Override  // F0.o
    public final void f0() {
    }

    @Override  // F0.x
    public final int g(O o0, J j0, int v) {
        if(this.l0.h() != 0x7FC000007FC00000L) {
            int v1 = j0.H(a.g(this.y0(f.c(0, v, 7))));
            return Math.max(Pb.a.H(e.d(this.x0(w.m(v1, v)))), v1);
        }
        return j0.H(v);
    }

    @Override  // g0.n
    public final boolean m0() {
        return false;
    }

    public final long x0(long v) {
        if(e.e(v)) {
            return 0L;
        }
        long v1 = this.l0.h();
        if(v1 == 0x7FC000007FC00000L) {
            return v;
        }
        float f = e.d(v1);
        if(Float.isInfinite(f) || Float.isNaN(f)) {
            f = e.d(v);
        }
        float f1 = e.b(v1);
        if(Float.isInfinite(f1) || Float.isNaN(f1)) {
            f1 = e.b(v);
        }
        long v2 = w.m(f, f1);
        long v3 = this.n0.a(v2, v);
        float f2 = Z.a(v3);
        if(!Float.isInfinite(f2) && !Float.isNaN(f2)) {
            float f3 = Z.b(v3);
            return Float.isInfinite(f3) || Float.isNaN(f3) ? v : b0.j(v2, v3);
        }
        return v;
    }

    public final long y0(long v) {
        float f1;
        float f;
        boolean z = a.f(v);
        boolean z1 = a.e(v);
        if(z && z1) {
            return v;
        }
        boolean z2 = a.d(v) && a.c(v);
        long v1 = this.l0.h();
        if(v1 == 0x7FC000007FC00000L) {
            return z2 ? a.a(v, a.h(v), 0, a.g(v), 0, 10) : v;
        }
        if(!z2 || !z && !z1) {
            float f2 = e.d(v1);
            float f3 = e.b(v1);
            f = Float.isInfinite(f2) || Float.isNaN(f2) ? ((float)a.j(v)) : I2.J.q(f2, a.j(v), a.h(v));
            f1 = Float.isInfinite(f3) || Float.isNaN(f3) ? ((float)a.i(v)) : I2.J.q(f3, a.i(v), a.g(v));
        }
        else {
            f = (float)a.h(v);
            f1 = (float)a.g(v);
        }
        long v2 = this.x0(w.m(f, f1));
        float f4 = e.d(v2);
        float f5 = e.b(v2);
        return a.a(v, f.t(Pb.a.H(f4), v), 0, f.s(Pb.a.H(f5), v), 0, 10);
    }
}

