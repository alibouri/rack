package I;

import Ab.t;
import Nb.k;
import kotlin.jvm.functions.Function0;

public final class q0 extends k implements Function0 {
    public final int X;
    public final v0 Y;

    public q0(v0 v00, int v) {
        this.X = v;
        this.Y = v00;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(this.X != 0) {
            this.Y.onCancel();
            return t.a;
        }
        this.Y.a();
        return t.a;
    }
}

