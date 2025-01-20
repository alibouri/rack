package B;

import D0.J;
import F0.O;
import W5.f;
import a1.a;

public final class h0 extends i0 {
    public int m0;
    public boolean n0;

    @Override  // B.i0
    public final int b(O o0, J j0, int v) {
        return this.m0 == 1 ? j0.O(v) : j0.b(v);
    }

    @Override  // B.i0
    public final int f(O o0, J j0, int v) {
        return this.m0 == 1 ? j0.O(v) : j0.b(v);
    }

    @Override  // B.i0
    public final long x0(J j0, long v) {
        int v1 = this.m0 == 1 ? j0.O(a.h(v)) : j0.b(a.h(v));
        if(v1 < 0) {
            v1 = 0;
        }
        return f.u(0, 0x7FFFFFFF, v1, v1);
    }

    @Override  // B.i0
    public final boolean y0() {
        return this.n0;
    }
}

