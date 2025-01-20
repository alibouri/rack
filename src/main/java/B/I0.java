package B;

import Bb.A;
import D0.J;
import D0.L;
import D0.M;
import D0.V;
import F0.O;
import F0.x;
import W5.f;
import g0.n;

public abstract class i0 extends n implements x {
    public final int l0;

    public i0(int v) {
        this.l0 = v;
        super();
    }

    @Override  // F0.x
    public int a(O o0, J j0, int v) {
        return j0.N(v);
    }

    @Override  // F0.x
    public int b(O o0, J j0, int v) {
        return j0.b(v);
    }

    @Override  // F0.x
    public L e(M m0, J j0, long v) {
        long v1 = this.x0(j0, v);
        if(this.y0()) {
            v1 = f.r(v, v1);
        }
        V v2 = j0.a(v1);
        int v3 = v2.X;
        int v4 = v2.Y;
        l l0 = new l(v2, 2);
        return m0.L(v3, v4, A.X, l0);
    }

    @Override  // F0.x
    public int f(O o0, J j0, int v) {
        return j0.O(v);
    }

    @Override  // F0.x
    public int g(O o0, J j0, int v) {
        return j0.H(v);
    }

    public abstract long x0(J arg1, long arg2);

    public abstract boolean y0();
}

