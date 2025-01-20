package a1;

import b1.a;
import m5.b;

public final class i implements a {
    public final float a;

    public i(float f) {
        this.a = f;
    }

    @Override  // b1.a
    public final float a(float f) {
        return f / this.a;
    }

    @Override  // b1.a
    public final float b(float f) {
        return f * this.a;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof i ? Float.compare(this.a, ((i)object0).a) == 0 : false;
    }

    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    @Override
    public final String toString() {
        return b.x(new StringBuilder("LinearFontScaleConverter(fontScale="), this.a, ')');
    }
}

