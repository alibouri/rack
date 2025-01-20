package B;

import D0.J;
import F0.O;
import W5.f;
import a1.a;

public final class j0 extends i0 {
    public int m0;
    public boolean n0;

    @Override  // B.i0
    public final int a(O o0, J j0, int v) {
        return this.m0 == 1 ? j0.H(v) : j0.N(v);
    }

    @Override  // B.i0
    public final int g(O o0, J j0, int v) {
        return this.m0 == 1 ? j0.H(v) : j0.N(v);
    }

    @Override  // B.i0
    public final long x0(J j0, long v) {
        int v1 = this.m0 == 1 ? j0.H(a.g(v)) : j0.N(a.g(v));
        if(v1 < 0) {
            v1 = 0;
        }
        return f.u(v1, v1, 0, 0x7FFFFFFF);
    }

    @Override  // B.i0
    public final boolean y0() {
        return this.n0;
    }
}

