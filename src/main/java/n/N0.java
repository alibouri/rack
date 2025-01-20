package N;

import A.k;
import F0.e0;
import F0.f;
import F0.l;
import F0.n;
import Q.v;
import R.u;
import n0.w;

public final class n0 extends n implements e0, l {
    public final int n0;
    public final k o0;
    public final boolean p0;
    public final float q0;
    public v r0;
    public final w s0;

    public n0(k k0, boolean z, float f, w w0, int v) {
        this.n0 = v;
        super();
        this.o0 = k0;
        this.p0 = z;
        this.q0 = f;
        this.s0 = w0;
    }

    @Override  // F0.e0
    public final void F() {
        if(this.n0 != 0) {
            f.s(this, new u(this, 1));
            return;
        }
        f.s(this, new m0(this, 1));
    }

    @Override  // g0.n
    public final void p0() {
        if(this.n0 != 0) {
            f.s(this, new u(this, 1));
            return;
        }
        f.s(this, new m0(this, 1));
    }
}

