package k0;

import F0.e0;
import F0.f;
import F0.o;
import Nb.j;
import Nb.k;
import U0.D;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import g0.n;
import i.J;
import jc.p;
import kotlin.jvm.functions.Function1;

public final class b extends n implements e0, o, a {
    public final c l0;
    public boolean m0;
    public i n0;
    public Function1 o0;

    public b(c c0, Function1 function10) {
        this.l0 = c0;
        this.o0 = function10;
        c0.X = this;
        new D(9, this);
    }

    @Override  // F0.e0
    public final void F() {
        this.x0();
    }

    @Override  // F0.o
    public final void c(LayoutNodeDrawScope layoutNodeDrawScope0) {
        c c0 = this.l0;
        if(!this.m0) {
            c0.Y = null;
            f.s(this, new p(this, 1, c0));
            if(c0.Y != null) {
                this.m0 = true;
                goto label_9;
            }
            M6.b.U("DrawResult not defined, did you forget to call onDraw?");
            throw null;
        }
    label_9:
        J j0 = c0.Y;
        j.c(j0);
        ((Function1)(((k)j0.Y))).n(layoutNodeDrawScope0);
    }

    @Override  // k0.a
    public final long d() {
        return io.sentry.config.a.a0(f.t(this, 0x80).Z);
    }

    @Override  // F0.o
    public final void f0() {
        this.x0();
    }

    @Override  // k0.a
    public final Density getDensity() {
        return f.v(this).p0;
    }

    @Override  // k0.a
    public final LayoutDirection getLayoutDirection() {
        return f.v(this).q0;
    }

    @Override  // g0.n
    public final void q0() {
        i i0 = this.n0;
        if(i0 != null) {
            i0.c();
        }
    }

    public final void x0() {
        i i0 = this.n0;
        if(i0 != null) {
            i0.c();
        }
        this.m0 = false;
        this.l0.Y = null;
        f.n(this);
    }
}

