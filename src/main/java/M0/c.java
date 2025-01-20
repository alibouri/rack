package m0;

import Bb.F;
import m5.b;
import yc.d;

public final class c {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public static final c e;

    static {
        c.e = new c(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public c(float f, float f1, float f2, float f3) {
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = f3;
    }

    public static c a(c c0, float f, float f1, float f2, int v) {
        if((v & 1) != 0) {
            f = c0.a;
        }
        if((v & 4) != 0) {
            f1 = c0.c;
        }
        if((v & 8) != 0) {
            f2 = c0.d;
        }
        return new c(f, c0.b, f1, f2);
    }

    public final long b() {
        return d.d(this.d() / 2.0f + this.a, this.c() / 2.0f + this.b);
    }

    public final float c() {
        return this.d - this.b;
    }

    public final float d() {
        return this.c - this.a;
    }

    public final c e(c c0) {
        return new c(Math.max(this.a, c0.a), Math.max(this.b, c0.b), Math.min(this.c, c0.c), Math.min(this.d, c0.d));
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof c)) {
            return false;
        }
        if(Float.compare(this.a, ((c)object0).a) != 0) {
            return false;
        }
        if(Float.compare(this.b, ((c)object0).b) != 0) {
            return false;
        }
        return Float.compare(this.c, ((c)object0).c) == 0 ? Float.compare(this.d, ((c)object0).d) == 0 : false;
    }

    public final boolean f() {
        return this.a >= this.c || this.b >= this.d;
    }

    public final boolean g(c c0) {
        return Float.compare(this.c, c0.a) > 0 && c0.c > this.a && this.d > c0.b && c0.d > this.b;
    }

    public final c h(float f, float f1) {
        return new c(this.a + f, this.b + f1, this.c + f, this.d + f1);
    }

    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.d) + b.p(b.p(Float.floatToIntBits(this.a) * 0x1F, this.b, 0x1F), this.c, 0x1F);
    }

    public final c i(long v) {
        return new c(m0.b.d(v) + this.a, m0.b.e(v) + this.b, m0.b.d(v) + this.c, m0.b.e(v) + this.d);
    }

    @Override
    public final String toString() {
        return "Rect.fromLTRB(" + F.c0(this.a) + ", " + F.c0(this.b) + ", " + F.c0(this.c) + ", " + F.c0(this.d) + ')';
    }
}

