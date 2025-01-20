package H;

import a1.d;
import androidx.compose.ui.unit.Density;

public final class c implements a {
    public final float X;

    public c(float f) {
        this.X = f;
    }

    @Override  // H.a
    public final float b(long v, Density density0) {
        return density0.w(this.X);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof c ? d.a(this.X, ((c)object0).X) : false;
    }

    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.X);
    }

    @Override
    public final String toString() {
        return "CornerSize(size = " + this.X + ".dp)";
    }
}

