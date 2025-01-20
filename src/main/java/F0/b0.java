package F0;

import Ab.t;
import N.C0;
import N.D0;
import Nb.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

public final class b0 extends k implements Function0 {
    public final int X;
    public final Function1 Y;

    public b0(int v, Function1 function10) {
        this.X = v;
        this.Y = function10;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(this.X != 0) {
            return new C0(D0.X, this.Y);
        }
        this.Y.n(c0.D0);
        c0.D0.s0 = c0.D0.m0.d(c0.D0.p0, c0.D0.r0, c0.D0.q0);
        return t.a;
    }
}

