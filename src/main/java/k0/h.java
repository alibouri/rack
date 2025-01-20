package k0;

import B.l;
import Bb.A;
import D0.J;
import D0.L;
import D0.M;
import D0.V;
import D0.b0;
import D0.j;
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

public final class h extends n implements o, x {
    public b l0;
    public boolean m0;
    public c n0;
    public j o0;
    public float p0;
    public n0.n q0;

    public final long A0(long v) {
        boolean z = false;
        boolean z1 = a.d(v) && a.c(v);
        if(a.f(v) && a.e(v)) {
            z = true;
        }
        if(!this.x0() && z1 || z) {
            return a.a(v, a.h(v), 0, a.g(v), 0, 10);
        }
        long v1 = this.l0.h();
        int v2 = h.z0(v1) ? Math.round(e.d(v1)) : a.j(v);
        int v3 = h.y0(v1) ? Math.round(e.b(v1)) : a.i(v);
        long v4 = w.m(f.t(v2, v), f.s(v3, v));
        if(this.x0()) {
            long v5 = w.m((h.z0(this.l0.h()) ? e.d(this.l0.h()) : e.d(v4)), (h.y0(this.l0.h()) ? e.b(this.l0.h()) : e.b(v4)));
            if(e.d(v4) == 0.0f || e.b(v4) == 0.0f) {
                return a.a(v, f.t(Math.round(e.d(0L)), v), 0, f.s(Math.round(e.b(0L)), v), 0, 10);
            }
            v4 = b0.j(v5, this.o0.a(v5, v4));
        }
        return a.a(v, f.t(Math.round(e.d(v4)), v), 0, f.s(Math.round(e.b(v4)), v), 0, 10);
    }

    // Deobfuscation rating: LOW(20)
    @Override  // F0.x
    public final int a(O o0, J j0, int v) {
        return this.x0() ? Math.max(a.j(this.A0(f.c(0, v, 7))), j0.N(v)) : j0.N(v);
    }

    // Deobfuscation rating: LOW(20)
    @Override  // F0.x
    public final int b(O o0, J j0, int v) {
        return this.x0() ? Math.max(a.i(this.A0(f.c(v, 0, 13))), j0.b(v)) : j0.b(v);
    }

    @Override  // F0.o
    public final void c(LayoutNodeDrawScope layoutNodeDrawScope0) {
        long v2;
        long v = this.l0.h();
        boolean z = h.z0(v);
        p0.b b0 = layoutNodeDrawScope0.X;
        long v1 = w.m((z ? e.d(v) : e.d(b0.Y.A())), (h.y0(v) ? e.b(v) : e.b(b0.Y.A())));
        if(e.d(b0.Y.A()) != 0.0f && e.b(b0.Y.A()) != 0.0f) {
            long v3 = b0.Y.A();
            v2 = b0.j(v1, this.o0.a(v1, v3));
        }
        else {
            v2 = 0L;
        }
        long v4 = this.n0.a(io.sentry.config.a.d(Math.round(e.d(v2)), Math.round(e.b(v2))), io.sentry.config.a.d(Math.round(e.d(b0.Y.A())), Math.round(e.b(b0.Y.A()))), layoutNodeDrawScope0.getLayoutDirection());
        float f = (float)(((int)(v4 >> 0x20)));
        float f1 = (float)(((int)(v4 & 0xFFFFFFFFL)));
        ((g3.b)b0.Y.Y).t(f, f1);
        try {
            this.l0.g(layoutNodeDrawScope0, v2, this.p0, this.q0);
        }
        finally {
            ((g3.b)b0.Y.Y).t(-f, -f1);
        }
        layoutNodeDrawScope0.a();
    }

    @Override  // F0.x
    public final L e(M m0, J j0, long v) {
        V v1 = j0.a(this.A0(v));
        int v2 = v1.X;
        int v3 = v1.Y;
        l l0 = new l(v1, 10);
        return m0.L(v2, v3, A.X, l0);
    }

    // Deobfuscation rating: LOW(20)
    @Override  // F0.x
    public final int f(O o0, J j0, int v) {
        return this.x0() ? Math.max(a.i(this.A0(f.c(v, 0, 13))), j0.O(v)) : j0.O(v);
    }

    @Override  // F0.o
    public final void f0() {
    }

    // Deobfuscation rating: LOW(20)
    @Override  // F0.x
    public final int g(O o0, J j0, int v) {
        return this.x0() ? Math.max(a.j(this.A0(f.c(0, v, 7))), j0.H(v)) : j0.H(v);
    }

    @Override  // g0.n
    public final boolean m0() {
        return false;
    }

    @Override
    public final String toString() {
        return "PainterModifier(painter=" + this.l0 + ", sizeToIntrinsics=" + this.m0 + ", alignment=" + this.n0 + ", alpha=" + this.p0 + ", colorFilter=" + this.q0 + ')';
    }

    public final boolean x0() {
        return this.m0 && this.l0.h() != 0x7FC000007FC00000L;
    }

    public static boolean y0(long v) {
        if(!e.a(v, 0x7FC000007FC00000L)) {
            float f = e.b(v);
            return !Float.isInfinite(f) && !Float.isNaN(f);
        }
        return false;
    }

    public static boolean z0(long v) {
        if(!e.a(v, 0x7FC000007FC00000L)) {
            float f = e.d(v);
            return !Float.isInfinite(f) && !Float.isNaN(f);
        }
        return false;
    }
}

