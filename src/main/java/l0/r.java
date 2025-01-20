package l0;

import Ab.t;
import Nb.k;
import kotlin.jvm.functions.Function0;

public final class r extends k implements Function0 {
    public final int X;
    public final q Y;

    public r(q q0, int v) {
        this.X = v;
        this.Y = q0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(this.X != 0) {
            q q0 = this.Y;
            if(q0.X.k0) {
                d.z(q0);
            }
            return t.a;
        }
        this.Y.x0();
        return t.a;
    }
}

