package w;

import Nb.k;
import kotlin.jvm.functions.Function0;

public final class y0 extends k implements Function0 {
    public final int X;
    public final z0 Y;

    public y0(z0 z00, int v) {
        this.X = v;
        this.Y = z00;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.X == 0 ? ((float)this.Y.l0.a.k()) : ((float)this.Y.l0.d.k());
    }
}

