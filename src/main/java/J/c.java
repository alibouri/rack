package J;

import A3.e;
import B.d0;
import Bb.A;
import D0.J;
import D0.L;
import D0.M;
import D0.V;
import F0.O;
import F0.m0;
import F0.n;
import F0.x;
import W5.f;
import androidx.compose.foundation.text.handwriting.a;
import kotlin.jvm.functions.Function0;
import l0.p;
import z0.g;
import z0.z;

public final class c extends n implements m0, x, l0.c {
    public Function0 n0;
    public boolean o0;
    public final z p0;

    public c(Function0 function00) {
        this.n0 = function00;
        z z0 = new z(null, null, null, new b(this, null));
        this.x0(z0);
        this.p0 = z0;
    }

    @Override  // F0.m0
    public final boolean N() {
        return true;
    }

    @Override  // F0.m0
    public final void R() {
        this.Y();
    }

    @Override  // F0.m0
    public final void Y() {
        this.p0.Y();
    }

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
        int v1 = m0.I(a.a);
        int v2 = m0.I(a.b);
        V v3 = j0.a(f.K(v2 * 2, v, v1 * 2));
        int v4 = v3.Y - v1 * 2;
        int v5 = v3.X - v2 * 2;
        d0 d00 = new d0(v3, v2, v1, 1);
        return m0.L(v5, v4, A.X, d00);
    }

    @Override  // F0.x
    public final int f(O o0, J j0, int v) {
        return e.i(this, o0, j0, v);
    }

    @Override  // F0.x
    public final int g(O o0, J j0, int v) {
        return e.l(this, o0, j0, v);
    }

    @Override  // F0.m0
    public final void h0() {
    }

    @Override  // F0.m0
    public final void j() {
        this.Y();
    }

    @Override  // F0.m0
    public final void m(z0.f f0, g g0, long v) {
        this.p0.m(f0, g0, v);
    }

    @Override  // l0.c
    public final void z(p p0) {
        this.o0 = p0.a();
    }
}

