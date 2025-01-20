package t0;

import m5.b;

public final class m extends A {
    public final float c;
    public final float d;

    public m(float f, float f1) {
        super(3, false, false);
        this.c = f;
        this.d = f1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof m)) {
            return false;
        }
        return Float.compare(this.c, ((m)object0).c) == 0 ? Float.compare(this.d, ((m)object0).d) == 0 : false;
    }

    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.d) + Float.floatToIntBits(this.c) * 0x1F;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("MoveTo(x=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", y=");
        return b.x(stringBuilder0, this.d, ')');
    }
}

