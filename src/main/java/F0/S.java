package F0;

import D0.K;
import D0.V;
import D0.n;
import Nb.j;
import R2.c;
import W.d;
import androidx.compose.ui.node.LayoutNode;

public final class s extends P {
    @Override  // D0.J
    public final int H(int v) {
        c c0 = this.j0.j0.r();
        K k0 = c0.e();
        LayoutNode layoutNode0 = (LayoutNode)c0.Y;
        return k0.d(((c0)layoutNode0.u0.d), layoutNode0.l(), v);
    }

    @Override  // D0.J
    public final int N(int v) {
        c c0 = this.j0.j0.r();
        K k0 = c0.e();
        LayoutNode layoutNode0 = (LayoutNode)c0.Y;
        return k0.a(((c0)layoutNode0.u0.d), layoutNode0.l(), v);
    }

    @Override  // D0.J
    public final int O(int v) {
        c c0 = this.j0.j0.r();
        K k0 = c0.e();
        LayoutNode layoutNode0 = (LayoutNode)c0.Y;
        return k0.c(((c0)layoutNode0.u0.d), layoutNode0.l(), v);
    }

    @Override  // D0.J
    public final V a(long v) {
        this.e0(v);
        c0 c00 = this.j0;
        d d0 = c00.j0.v();
        int v1 = d0.Z;
        if(v1 > 0) {
            Object[] arr_object = d0.X;
            int v2 = 0;
            while(true) {
                I i0 = ((LayoutNode)arr_object[v2]).v0.s;
                j.c(i0);
                i0.g0 = 3;
                ++v2;
                if(v2 >= v1) {
                    break;
                }
            }
        }
        P.u0(this, c00.j0.n0.b(this, c00.j0.l(), v));
        return this;
    }

    @Override  // D0.J
    public final int b(int v) {
        c c0 = this.j0.j0.r();
        K k0 = c0.e();
        LayoutNode layoutNode0 = (LayoutNode)c0.Y;
        return k0.e(((c0)layoutNode0.u0.d), layoutNode0.l(), v);
    }

    @Override  // F0.O
    public final int f0(n n0) {
        I i0 = this.j0.j0.v0.s;
        j.c(i0);
        F f0 = i0.p0;
        if(!i0.h0) {
            L l0 = i0.w0;
            if(l0.c == 2) {
                f0.f = true;
                if(f0.b) {
                    l0.h = true;
                    l0.i = true;
                }
            }
            else {
                f0.g = true;
            }
        }
        s s0 = i0.i().J0;
        if(s0 != null) {
            s0.f0 = true;
        }
        i0.l();
        s s1 = i0.i().J0;
        if(s1 != null) {
            s1.f0 = false;
        }
        Integer integer0 = (Integer)f0.i.get(n0);
        int v = integer0 == null ? 0x80000000 : ((int)integer0);
        this.o0.put(n0, v);
        return v;
    }

    @Override  // F0.P
    public final void v0() {
        I i0 = this.j0.j0.v0.s;
        j.c(i0);
        i0.n0();
    }
}

