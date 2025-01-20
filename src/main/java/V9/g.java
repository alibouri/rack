package v9;

import m5.b;

public final class g {
    public final float a;
    public final float b;
    public final int c;
    public final int d;

    public g(float f, float f1, int v, int v1) {
        this.a = f;
        this.b = f1;
        this.c = v;
        this.d = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof g)) {
            return false;
        }
        if(Float.compare(this.a, ((g)object0).a) != 0) {
            return false;
        }
        if(Float.compare(this.b, ((g)object0).b) != 0) {
            return false;
        }
        return this.c == ((g)object0).c ? this.d == ((g)object0).d : false;
    }

    @Override
    public final int hashCode() {
        return (b.p(Float.floatToIntBits(this.a) * 0x1F, this.b, 0x1F) + this.c) * 0x1F + this.d;
    }

    @Override
    public final String toString() {
        return "BalloonLayoutInfo(x=" + this.a + ", y=" + this.b + ", width=" + this.c + ", height=" + this.d + ")";
    }
}

