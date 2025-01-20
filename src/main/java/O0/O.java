package o0;

public final class o implements i {
    public final int X;
    public final r Y;

    public o(r r0, int v) {
        this.X = v;
        this.Y = r0;
        super();
    }

    @Override  // o0.i
    public final double e(double f) {
        switch(this.X) {
            case 0: {
                double f1 = this.Y.d;
                return f >= this.Y.e * f1 ? (Math.pow(f, 1.0 / this.Y.a) - this.Y.c) / this.Y.b : f / f1;
            }
            case 1: {
                double f2 = this.Y.d;
                return f >= this.Y.e * f2 ? (Math.pow(f - this.Y.f, 1.0 / this.Y.a) - this.Y.c) / this.Y.b : (f - this.Y.g) / f2;
            }
            case 2: {
                return f >= this.Y.e ? Math.pow(this.Y.b * f + this.Y.c, this.Y.a) : f * this.Y.d;
            }
            default: {
                return f >= this.Y.e ? Math.pow(this.Y.b * f + this.Y.c, this.Y.a) + this.Y.f : this.Y.g + this.Y.d * f;
            }
        }
    }
}

