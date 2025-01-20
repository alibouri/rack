package t0;

import m5.b;

public final class r extends A {
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public r(float f, float f1, float f2, float f3, float f4, float f5) {
        super(2, true, false);
        this.c = f;
        this.d = f1;
        this.e = f2;
        this.f = f3;
        this.g = f4;
        this.h = f5;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof r)) {
            return false;
        }
        if(Float.compare(this.c, ((r)object0).c) != 0) {
            return false;
        }
        if(Float.compare(this.d, ((r)object0).d) != 0) {
            return false;
        }
        if(Float.compare(this.e, ((r)object0).e) != 0) {
            return false;
        }
        if(Float.compare(this.f, ((r)object0).f) != 0) {
            return false;
        }
        return Float.compare(this.g, ((r)object0).g) == 0 ? Float.compare(this.h, ((r)object0).h) == 0 : false;
    }

    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.h) + b.p(b.p(b.p(b.p(Float.floatToIntBits(this.c) * 0x1F, this.d, 0x1F), this.e, 0x1F), this.f, 0x1F), this.g, 0x1F);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("RelativeCurveTo(dx1=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", dy1=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", dx2=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(", dy2=");
        stringBuilder0.append(this.f);
        stringBuilder0.append(", dx3=");
        stringBuilder0.append(this.g);
        stringBuilder0.append(", dy3=");
        return b.x(stringBuilder0, this.h, ')');
    }
}

