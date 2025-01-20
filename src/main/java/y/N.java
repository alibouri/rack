package y;

import Eb.a;
import F0.f;
import Ma.t;
import N.v;
import N9.l;
import Nb.j;
import Xb.H;
import Xb.J;
import androidx.compose.ui.unit.LayoutDirection;
import w.h0;
import w.j0;
import w.l0;
import w.p0;

public final class n extends f0 {
    public v v0;
    public q0 w0;
    public Boolean x0;
    public p0 y0;
    public boolean z0;

    @Override  // y.f0
    public final Object E0(d0 d00, e0 e00) {
        v v0 = this.v0;
        l l0 = new l(d00, this, null);
        v0.getClass();
        t t0 = new t(v0, l0, null, 11);
        ((l0)v0.n).getClass();
        Object object0 = H.c(new j0(h0.X, ((l0)v0.n), t0, null), e00);
        a a0 = a.X;
        Object object1 = Ab.t.a;
        if(object0 != a0) {
            object0 = object1;
        }
        return object0 == a0 ? object0 : object1;
    }

    @Override  // y.f0
    public final void F0(long v) {
    }

    @Override  // y.f0
    public final void G0(long v) {
        if(!this.k0) {
            return;
        }
        J.q(this.l0(), null, null, new m(this, v, null), 3);
    }

    @Override  // y.f0
    public final boolean H0() {
        return this.z0;
    }

    public final boolean J0() {
        Boolean boolean0 = this.x0;
        if(boolean0 == null) {
            return f.v(this).q0 == LayoutDirection.Y && this.w0 == q0.Y;
        }
        j.c(boolean0);
        return boolean0.booleanValue();
    }
}

