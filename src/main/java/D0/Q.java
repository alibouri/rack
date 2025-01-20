package D0;

import M6.b;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Map;
import kotlin.jvm.functions.Function1;

public final class q implements M, o {
    public final LayoutDirection X;
    public final o Y;

    public q(o o0, LayoutDirection layoutDirection0) {
        this.X = layoutDirection0;
        this.Y = o0;
    }

    @Override  // androidx.compose.ui.unit.Density
    public final int D(long v) {
        return this.Y.D(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float E(long v) {
        return this.Y.E(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final int I(float f) {
        return this.Y.I(f);
    }

    @Override  // D0.M
    public final L L(int v, int v1, Map map0, Function1 function10) {
        if(v < 0) {
            v = 0;
        }
        if(v1 < 0) {
            v1 = 0;
        }
        if((v & 0xFF000000) == 0 && (0xFF000000 & v1) == 0) {
            return new p(v, v1, map0);
        }
        b.T(("Size(" + v + " x " + v1 + ") is out of range. Each dimension must be between 0 and 16777215."));
        throw null;
    }

    @Override  // androidx.compose.ui.unit.Density
    public final long P(long v) {
        return this.Y.P(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float T(long v) {
        return this.Y.T(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final long d0(float f) {
        return this.Y.d0(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float getDensity() {
        return this.Y.getDensity();
    }

    @Override  // D0.o
    public final LayoutDirection getLayoutDirection() {
        return this.X;
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float i0(int v) {
        return this.Y.i0(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float j0(float f) {
        return this.Y.j0(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float n() {
        return this.Y.n();
    }

    @Override  // D0.o
    public final boolean s() {
        return this.Y.s();
    }

    @Override  // androidx.compose.ui.unit.Density
    public final long u(float f) {
        return this.Y.u(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final long v(long v) {
        return this.Y.v(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float w(float f) {
        return this.Y.w(f);
    }
}

