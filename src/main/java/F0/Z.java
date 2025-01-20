package F0;

import D0.V;
import Nb.j;
import androidx.compose.ui.node.LayoutNode;
import g0.n;
import kotlin.jvm.functions.Function1;
import n0.M;
import n0.h;
import n0.t;
import n0.v;
import q0.b;

public final class z extends c0 {
    public x I0;
    public y J0;
    public static final h K0;

    static {
        h h0 = M.g();
        h0.w(v.g);
        h0.D(1.0f);
        h0.E(1);
        z.K0 = h0;
    }

    public z(LayoutNode layoutNode0, x x0) {
        super(layoutNode0);
        this.I0 = x0;
        this.J0 = layoutNode0.Z == null ? null : new y(this);
        if((((n)x0).X.Z & 0x200) != 0) {
            throw new ClassCastException();
        }
    }

    @Override  // F0.c0
    public final void B0() {
        if(this.J0 == null) {
            this.J0 = new y(this);
        }
    }

    @Override  // F0.c0
    public final P E0() {
        return this.J0;
    }

    @Override  // F0.c0
    public final n G0() {
        return ((n)this.I0).X;
    }

    @Override  // D0.J
    public final int H(int v) {
        x x0 = this.I0;
        c0 c00 = this.k0;
        j.c(c00);
        return x0.g(this, c00, v);
    }

    @Override  // D0.J
    public final int N(int v) {
        x x0 = this.I0;
        c0 c00 = this.k0;
        j.c(c00);
        return x0.a(this, c00, v);
    }

    @Override  // D0.J
    public final int O(int v) {
        x x0 = this.I0;
        c0 c00 = this.k0;
        j.c(c00);
        return x0.f(this, c00, v);
    }

    @Override  // F0.c0
    public final void S0(t t0, b b0) {
        c0 c00 = this.k0;
        j.c(c00);
        c00.y0(t0, b0);
        if(G.a(this.j0).getShowLayoutBounds()) {
            this.z0(t0, z.K0);
        }
    }

    @Override  // D0.V
    public final void Z(long v, float f, Function1 function10) {
        this.T0(v, f, function10, null);
        this.d1();
    }

    @Override  // D0.J
    public final V a(long v) {
        this.e0(v);
        x x0 = this.I0;
        c0 c00 = this.k0;
        j.c(c00);
        this.V0(x0.e(this, c00, v));
        this.Q0();
        return this;
    }

    @Override  // D0.J
    public final int b(int v) {
        x x0 = this.I0;
        c0 c00 = this.k0;
        j.c(c00);
        return x0.b(this, c00, v);
    }

    @Override  // F0.c0
    public final void b0(long v, float f, b b0) {
        this.T0(v, f, null, b0);
        this.d1();
    }

    public final void d1() {
        if(this.e0) {
            return;
        }
        this.R0();
        this.p0().n();
        j.c(this.k0);
    }

    public final void e1(x x0) {
        if(!x0.equals(this.I0) && (((n)x0).X.Z & 0x200) != 0) {
            throw new ClassCastException();
        }
        this.I0 = x0;
    }

    @Override  // F0.O
    public final int f0(D0.n n0) {
        y y0 = this.J0;
        if(y0 != null) {
            Integer integer0 = (Integer)y0.o0.get(n0);
            return integer0 == null ? 0x80000000 : ((int)integer0);
        }
        return f.c(this, n0);
    }
}

