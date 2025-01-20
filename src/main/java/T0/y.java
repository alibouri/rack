package t0;

import m5.b;

public final class y extends A {
    public final float c;

    public y(float f) {
        super(3, false, false);
        this.c = f;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof y ? Float.compare(this.c, ((y)object0).c) == 0 : false;
    }

    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.c);
    }

    @Override
    public final String toString() {
        return b.x(new StringBuilder("RelativeVerticalTo(dy="), this.c, ')');
    }
}

