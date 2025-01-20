package N;

import Ab.t;
import Nb.k;
import kotlin.jvm.functions.Function0;

public final class u1 extends k implements Function0 {
    public final int X;
    public final z1 Y;

    public u1(z1 z10, int v) {
        this.X = v;
        this.Y = z10;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(this.X != 0) {
            Xb.k k0 = this.Y.d;
            if(k0.b()) {
                k0.i(K1.Y);
            }
            return t.a;
        }
        Xb.k k1 = this.Y.d;
        if(k1.b()) {
            k1.i(K1.X);
        }
        return Boolean.TRUE;
    }
}

