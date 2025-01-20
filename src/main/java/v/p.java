package v;

import m5.b;

public final class p extends q {
    public float a;
    public float b;
    public float c;
    public float d;

    public p(float f, float f1, float f2, float f3) {
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = f3;
    }

    @Override  // v.q
    public final float a(int v) {
        switch(v) {
            case 0: {
                return this.a;
            }
            case 1: {
                return this.b;
            }
            case 2: {
                return this.c;
            }
            case 3: {
                return this.d;
            }
            default: {
                return 0.0f;
            }
        }
    }

    @Override  // v.q
    public final int b() {
        return 4;
    }

    @Override  // v.q
    public final q c() {
        return new p(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override  // v.q
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
    }

    @Override  // v.q
    public final void e(int v, float f) {
        switch(v) {
            case 0: {
                this.a = f;
                return;
            }
            case 1: {
                this.b = f;
                return;
            }
            case 2: {
                this.c = f;
                return;
            }
            case 3: {
                this.d = f;
            }
        }
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof p && ((p)object0).a == this.a && ((p)object0).b == this.b && ((p)object0).c == this.c && ((p)object0).d == this.d;
    }

    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.d) + b.p(b.p(Float.floatToIntBits(this.a) * 0x1F, this.b, 0x1F), this.c, 0x1F);
    }

    @Override
    public final String toString() {
        return "AnimationVector4D: v1 = " + this.a + ", v2 = " + this.b + ", v3 = " + this.c + ", v4 = " + this.d;
    }
}

