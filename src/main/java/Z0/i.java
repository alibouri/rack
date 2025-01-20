package z0;

import Ab.t;
import B.P;
import F0.l;
import F0.m0;
import F0.q0;
import G0.f0;
import M.O;
import Nb.s;
import Nb.w;
import androidx.compose.ui.input.pointer.PointerIconService;
import g0.n;

public final class i extends n implements l, m0, q0 {
    public a l0;
    public boolean m0;
    public boolean n0;

    @Override  // F0.m0
    public final boolean N() {
        return false;
    }

    @Override  // F0.m0
    public final void R() {
        this.Y();
    }

    @Override  // F0.m0
    public final void Y() {
        this.z0();
    }

    @Override  // F0.m0
    public final void h0() {
    }

    @Override  // F0.m0
    public final void j() {
        this.Y();
    }

    @Override  // F0.m0
    public final void m(f f0, g g0, long v) {
        if(g0 == g.Y) {
            switch(f0.d) {
                case 4: {
                    this.n0 = true;
                    this.y0();
                    return;
                }
                case 5: {
                    this.z0();
                    break;
                }
            }
        }
    }

    @Override  // F0.q0
    public final Object p() {
        return "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }

    @Override  // g0.n
    public final void q0() {
        this.z0();
    }

    public final void x0() {
        w w0 = new w();  // initializer: Ljava/lang/Object;-><init>()V
        F0.f.y(this, new P(w0, 5));
        i i0 = (i)w0.X;
        a a0 = i0 == null ? this.l0 : i0.l0;
        PointerIconService pointerIconService0 = (PointerIconService)F0.f.i(this, f0.s);
        if(pointerIconService0 != null) {
            pointerIconService0.a(a0);
        }
    }

    public final void y0() {
        s s0 = new s();  // initializer: Ljava/lang/Object;-><init>()V
        s0.X = true;
        if(!this.m0) {
            F0.f.z(this, new O(s0, 3));
        }
        if(s0.X) {
            this.x0();
        }
    }

    public final void z0() {
        t t0;
        if(this.n0) {
            this.n0 = false;
            if(this.k0) {
                w w0 = new w();  // initializer: Ljava/lang/Object;-><init>()V
                F0.f.y(this, new P(w0, 3));
                i i0 = (i)w0.X;
                if(i0 == null) {
                    t0 = null;
                }
                else {
                    i0.x0();
                    t0 = t.a;
                }
                if(t0 == null) {
                    PointerIconService pointerIconService0 = (PointerIconService)F0.f.i(this, f0.s);
                    if(pointerIconService0 != null) {
                        pointerIconService0.a(null);
                    }
                }
            }
        }
    }
}

