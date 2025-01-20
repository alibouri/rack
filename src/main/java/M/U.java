package M;

import Nb.k;
import kotlin.jvm.functions.Function0;

public final class u extends k implements Function0 {
    public final o X;
    public final int Y;

    public u(o o0, int v) {
        this.X = o0;
        this.Y = v;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.X.f.f(this.Y);
    }
}

