package t0;

import m5.b;

public final class h extends A {
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final float h;
    public final float i;

    public h(float f, float f1, float f2, boolean z, boolean z1, float f3, float f4) {
        super(3, false, false);
        this.c = f;
        this.d = f1;
        this.e = f2;
        this.f = z;
        this.g = z1;
        this.h = f3;
        this.i = f4;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof h)) {
            return false;
        }
        if(Float.compare(this.c, ((h)object0).c) != 0) {
            return false;
        }
        if(Float.compare(this.d, ((h)object0).d) != 0) {
            return false;
        }
        if(Float.compare(this.e, ((h)object0).e) != 0) {
            return false;
        }
        if(this.f != ((h)object0).f) {
            return false;
        }
        if(this.g != ((h)object0).g) {
            return false;
        }
        return Float.compare(this.h, ((h)object0).h) == 0 ? Float.compare(this.i, ((h)object0).i) == 0 : false;
    }

    @Override
    public final int hashCode() {
        int v = b.p(b.p(Float.floatToIntBits(this.c) * 0x1F, this.d, 0x1F), this.e, 0x1F);
        int v1 = 0x4D5;
        int v2 = this.f ? 0x4CF : 0x4D5;
        if(this.g) {
            v1 = 0x4CF;
        }
        return Float.floatToIntBits(this.i) + b.p(((v + v2) * 0x1F + v1) * 0x1F, this.h, 0x1F);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("ArcTo(horizontalEllipseRadius=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", verticalEllipseRadius=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", theta=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(", isMoreThanHalf=");
        stringBuilder0.append(this.f);
        stringBuilder0.append(", isPositiveArc=");
        stringBuilder0.append(this.g);
        stringBuilder0.append(", arcStartX=");
        stringBuilder0.append(this.h);
        stringBuilder0.append(", arcStartY=");
        return b.x(stringBuilder0, this.i, ')');
    }
}

