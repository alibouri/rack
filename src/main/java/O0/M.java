package o0;

import I2.J;

public final class m implements i {
    public final int X;
    public final q Y;

    public m(q q0, int v) {
        this.X = v;
        this.Y = q0;
        super();
    }

    @Override  // o0.i
    public final double e(double f) {
        if(this.X != 0) {
            double f1 = J.p(f, this.Y.e, this.Y.f);
            return this.Y.n.e(f1);
        }
        return J.p(this.Y.k.e(f), this.Y.e, this.Y.f);
    }
}

