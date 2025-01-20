package B;

import A3.e;
import Bb.A;
import D0.J;
import D0.L;
import D0.M;
import D0.V;
import F0.O;
import F0.x;
import W5.f;
import g0.n;

public final class p0 extends n implements x {
    public float l0;
    public float m0;
    public float n0;
    public float o0;
    public boolean p0;

    @Override  // F0.x
    public final int a(O o0, J j0, int v) {
        return e.f(this, o0, j0, v);
    }

    @Override  // F0.x
    public final int b(O o0, J j0, int v) {
        return e.c(this, o0, j0, v);
    }

    @Override  // F0.x
    public final L e(M m0, J j0, long v) {
        int v1 = m0.I(this.l0);
        int v2 = m0.I(this.n0) + v1;
        int v3 = m0.I(this.m0);
        int v4 = m0.I(this.o0) + v3;
        V v5 = j0.a(f.K(-v2, v, -v4));
        int v6 = f.t(v5.X + v2, v);
        int v7 = f.s(v5.Y + v4, v);
        m0 m00 = new m0(this, v5, m0, 2);
        return m0.L(v6, v7, A.X, m00);
    }

    @Override  // F0.x
    public final int f(O o0, J j0, int v) {
        return e.i(this, o0, j0, v);
    }

    @Override  // F0.x
    public final int g(O o0, J j0, int v) {
        return e.l(this, o0, j0, v);
    }
}

