package t0;

import m5.b;

public final class n extends A {
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public n(float f, float f1, float f2, float f3) {
        super(1, false, true);
        this.c = f;
        this.d = f1;
        this.e = f2;
        this.f = f3;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof n)) {
            return false;
        }
        if(Float.compare(this.c, ((n)object0).c) != 0) {
            return false;
        }
        if(Float.compare(this.d, ((n)object0).d) != 0) {
            return false;
        }
        return Float.compare(this.e, ((n)object0).e) == 0 ? Float.compare(this.f, ((n)object0).f) == 0 : false;
    }

    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.f) + b.p(b.p(Float.floatToIntBits(this.c) * 0x1F, this.d, 0x1F), this.e, 0x1F);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("QuadTo(x1=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", y1=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", x2=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(", y2=");
        return b.x(stringBuilder0, this.f, ')');
    }
}

