package g0;

import androidx.compose.ui.unit.LayoutDirection;
import m5.b;

public final class e {
    public final float a;

    public e(float f) {
        this.a = f;
    }

    public final int a(int v, int v1, LayoutDirection layoutDirection0) {
        return Math.round((1.0f + (layoutDirection0 == LayoutDirection.X ? this.a : this.a * -1.0f)) * (((float)(v1 - v)) / 2.0f));
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof e ? Float.compare(this.a, ((e)object0).a) == 0 : false;
    }

    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    @Override
    public final String toString() {
        return b.x(new StringBuilder("Horizontal(bias="), this.a, ')');
    }
}

