package t0;

import m5.b;

public final class k extends A {
    public final float c;

    public k(float f) {
        super(3, false, false);
        this.c = f;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof k ? Float.compare(this.c, ((k)object0).c) == 0 : false;
    }

    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.c);
    }

    @Override
    public final String toString() {
        return b.x(new StringBuilder("HorizontalTo(x="), this.c, ')');
    }
}

