package v;

public final class n extends q {
    public float a;
    public float b;

    public n(float f, float f1) {
        this.a = f;
        this.b = f1;
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
            default: {
                return 0.0f;
            }
        }
    }

    @Override  // v.q
    public final int b() {
        return 2;
    }

    @Override  // v.q
    public final q c() {
        return new n(0.0f, 0.0f);
    }

    @Override  // v.q
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
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
            }
        }
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof n && ((n)object0).a == this.a && ((n)object0).b == this.b;
    }

    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.b) + Float.floatToIntBits(this.a) * 0x1F;
    }

    @Override
    public final String toString() {
        return "AnimationVector2D: v1 = " + this.a + ", v2 = " + this.b;
    }
}

