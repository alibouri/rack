package g0;

import A3.e;
import Bb.A;
import D0.J;
import D0.L;
import D0.M;
import D0.V;
import F0.O;
import F0.x;
import T0.G;
import m5.b;

public final class s extends n implements x {
    public float l0;

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
        V v1 = j0.a(v);
        int v2 = v1.X;
        int v3 = v1.Y;
        G g0 = new G(v1, 10, this);
        return m0.L(v2, v3, A.X, g0);
    }

    @Override  // F0.x
    public final int f(O o0, J j0, int v) {
        return e.i(this, o0, j0, v);
    }

    @Override  // F0.x
    public final int g(O o0, J j0, int v) {
        return e.l(this, o0, j0, v);
    }

    @Override
    public final String toString() {
        return b.x(new StringBuilder("ZIndexModifier(zIndex="), this.l0, ')');
    }
}

