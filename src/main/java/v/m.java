package v;

public final class m extends q {
    public float a;

    public m(float f) {
        this.a = f;
    }

    @Override  // v.q
    public final float a(int v) {
        return v == 0 ? this.a : 0.0f;
    }

    @Override  // v.q
    public final int b() {
        return 1;
    }

    @Override  // v.q
    public final q c() {
        return new m(0.0f);
    }

    @Override  // v.q
    public final void d() {
        this.a = 0.0f;
    }

    @Override  // v.q
    public final void e(int v, float f) {
        if(v == 0) {
            this.a = f;
        }
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof m && ((m)object0).a == this.a;
    }

    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    @Override
    public final String toString() {
        return "AnimationVector1D: value = " + this.a;
    }
}

