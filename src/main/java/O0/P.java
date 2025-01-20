package o0;

import I2.J;
import Nb.k;
import kotlin.jvm.functions.Function1;

public final class p extends k implements Function1 {
    public final int X;
    public final q Y;

    public p(q q0, int v) {
        this.X = v;
        this.Y = q0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        if(this.X != 0) {
            double f = ((Number)object0).doubleValue();
            return J.p(this.Y.k.e(f), this.Y.e, this.Y.f);
        }
        double f1 = J.p(((Number)object0).doubleValue(), this.Y.e, this.Y.f);
        return this.Y.n.e(f1);
    }
}

