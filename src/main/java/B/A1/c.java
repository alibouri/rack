package a1;

import Bb.q;
import Y8.o;
import androidx.compose.ui.unit.Density;
import b1.a;
import m5.b;

public final class c implements Density {
    public final float X;
    public final float Y;
    public final a Z;

    public c(float f, float f1, a a0) {
        this.X = f;
        this.Y = f1;
        this.Z = a0;
    }

    @Override  // androidx.compose.ui.unit.Density
    public final int D(long v) {
        throw null;
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float E(long v) {
        if(!k.a(j.b(v), 0x100000000L)) {
            throw new IllegalStateException("Only Sp can convert to Px");
        }
        return this.Z.b(j.c(v));
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
        if(!(object0 instanceof c)) {
            return false;
        }
        if(Float.compare(this.X, ((c)object0).X) != 0) {
            return false;
        }
        return Float.compare(this.Y, ((c)object0).Y) == 0 ? Nb.j.a(this.Z, ((c)object0).Z) : false;
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float getDensity() {
        return this.X;
    }

    @Override
    public final int hashCode() {
        return this.Z.hashCode() + b.p(Float.floatToIntBits(this.X) * 0x1F, this.Y, 0x1F);
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
        return "DensityWithConverter(density=" + this.X + ", fontScale=" + this.Y + ", converter=" + this.Z + ')';
    }

    @Override  // androidx.compose.ui.unit.Density
    public final long u(float f) {
        return q.P(this.Z.a(f), 0x100000000L);
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

