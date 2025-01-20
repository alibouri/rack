package g0;

import m5.b;

public final class f {
    public final float a;

    public f(float f) {
        this.a = f;
    }

    public final int a(int v, int v1) {
        return Math.round((1.0f + this.a) * (((float)(v1 - v)) / 2.0f));
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof f ? Float.compare(this.a, ((f)object0).a) == 0 : false;
    }

    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    @Override
    public final String toString() {
        return b.x(new StringBuilder("Vertical(bias="), this.a, ')');
    }
}

