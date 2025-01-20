package L;

import Nb.k;
import kotlin.jvm.functions.Function0;

public final class g extends k implements Function0 {
    public final int X;
    public final h Y;

    public g(h h0, int v) {
        this.X = v;
        this.Y = h0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.X) {
            case 0: {
                return this.Y.b0.a;
            }
            case 1: {
                return this.Y.b0.a;
            }
            default: {
                return this.Y.b0.b;
            }
        }
    }
}

