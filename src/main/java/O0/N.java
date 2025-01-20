package o0;

public final class n implements i {
    public final int X;
    public final double Y;

    public n(int v, double f) {
        this.X = v;
        this.Y = f;
        super();
    }

    @Override  // o0.i
    public final double e(double f) {
        if(this.X != 0) {
            if(f < 0.0) {
                f = 0.0;
            }
            return Math.pow(f, this.Y);
        }
        if(f < 0.0) {
            f = 0.0;
        }
        return Math.pow(f, 1.0 / this.Y);
    }
}

