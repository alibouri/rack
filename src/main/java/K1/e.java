package k1;

public final class e extends c {
    public float c0;

    public e(float f) {
        super(null);
        this.c0 = f;
    }

    @Override  // k1.c
    public final float e() {
        if(Float.isNaN(this.c0) && (this.X != null && this.X.length >= 1)) {
            this.c0 = Float.parseFloat(this.d());
        }
        return this.c0;
    }

    @Override  // k1.c
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 instanceof e) {
            float f = this.e();
            float f1 = ((e)object0).e();
            return !Float.isNaN(f) || !Float.isNaN(f1) ? f == f1 : true;
        }
        return false;
    }

    @Override  // k1.c
    public final int g() {
        if(Float.isNaN(this.c0) && (this.X != null && this.X.length >= 1)) {
            this.c0 = (float)Integer.parseInt(this.d());
        }
        return (int)this.c0;
    }

    @Override  // k1.c
    public final int hashCode() {
        int v = super.hashCode();
        return this.c0 == 0.0f ? v * 0x1F : v * 0x1F + Float.floatToIntBits(this.c0);
    }
}

