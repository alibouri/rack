package n0;

import Nb.k;
import java.util.function.DoubleUnaryOperator;
import o0.p;

public final class z implements DoubleUnaryOperator {
    public final int a;
    public final k b;

    public z(k k0, int v) {
        this.a = v;
        this.b = k0;
        super();
    }

    @Override
    public final double applyAsDouble(double f) {
        return ((Number)((p)this.b).n(f)).doubleValue();
    }
}

