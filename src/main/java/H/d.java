package H;

import androidx.compose.ui.unit.Density;
import m0.e;

public final class d implements a {
    public final float X;

    public d(float f) {
        this.X = f;
        if(f < 0.0f || f > 100.0f) {
            throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    @Override  // H.a
    public final float b(long v, Density density0) {
        float f = e.c(v);
        return this.X / 100.0f * f;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof d ? Float.compare(this.X, ((d)object0).X) == 0 : false;
    }

    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.X);
    }

    @Override
    public final String toString() {
        return "CornerSize(size = " + this.X + "%)";
    }
}

