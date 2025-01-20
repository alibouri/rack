package D0;

import A3.e;
import F0.O;
import a1.a;
import g0.n;
import kotlin.jvm.functions.Function3;

public final class x extends n implements F0.x {
    public Function3 l0;

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
        return (L)this.l0.h(m0, j0, new a(v));
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
        return "LayoutModifierImpl(measureBlock=" + this.l0 + ')';
    }
}

