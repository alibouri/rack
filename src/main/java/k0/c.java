package k0;

import Nb.k;
import Y8.o;
import androidx.compose.ui.unit.Density;
import i.J;
import kotlin.jvm.functions.Function1;

public final class c implements Density {
    public a X;
    public J Y;

    public c() {
        this.X = g.X;
    }

    @Override  // androidx.compose.ui.unit.Density
    public final int D(long v) {
        throw null;
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float E(long v) {
        return o.f(v, this);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final int I(float f) {
        return o.e(f, this);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final long P(long v) {
        return o.i(v, this);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float T(long v) {
        return o.h(v, this);
    }

    public final J a(Function1 function10) {
        J j0 = new J(11, false);
        j0.Y = (k)function10;
        this.Y = j0;
        return j0;
    }

    @Override  // androidx.compose.ui.unit.Density
    public final long d0(float f) {
        return this.u(this.j0(f));
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float getDensity() {
        return this.X.getDensity().getDensity();
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float i0(int v) {
        return ((float)v) / this.getDensity();
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float j0(float f) {
        return f / this.getDensity();
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float n() {
        return this.X.getDensity().n();
    }

    @Override  // androidx.compose.ui.unit.Density
    public final long u(float f) {
        return o.j(f, this);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final long v(long v) {
        return o.g(v, this);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float w(float f) {
        return this.getDensity() * f;
    }
}

