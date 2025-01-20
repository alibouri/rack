package a1;

import Y8.o;
import androidx.compose.ui.unit.Density;

public final class b implements Density {
    public final float X;
    public final float Y;

    public b(float f, float f1) {
        this.X = f;
        this.Y = f1;
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

    @Override  // androidx.compose.ui.unit.Density
    public final long d0(float f) {
        return this.u(this.j0(f));
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof b)) {
            return false;
        }
        return Float.compare(this.X, ((b)object0).X) == 0 ? Float.compare(this.Y, ((b)object0).Y) == 0 : false;
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float getDensity() {
        return this.X;
    }

    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.Y) + Float.floatToIntBits(this.X) * 0x1F;
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
        return this.Y;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("DensityImpl(density=");
        stringBuilder0.append(this.X);
        stringBuilder0.append(", fontScale=");
        return m5.b.x(stringBuilder0, this.Y, ')');
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

