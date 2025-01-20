package M;

import Ab.t;
import Nb.k;
import kotlin.jvm.functions.Function0;
import m0.b;

public final class x extends k implements Function0 {
    public final int X;
    public final a0 Y;

    public x(a0 a00, int v) {
        this.X = v;
        this.Y = a00;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.X) {
            case 0: {
                b b0 = (b)this.Y.n.getValue();
                return b0 == null ? new b(0x7FC000007FC00000L) : new b(b0.a);
            }
            case 1: {
                b b1 = (b)this.Y.o.getValue();
                return b1 == null ? new b(0x7FC000007FC00000L) : new b(b1.a);
            }
            case 2: {
                this.Y.n(true);
                this.Y.p.setValue(null);
                this.Y.q.setValue(null);
                return t.a;
            }
            default: {
                this.Y.i();
                return t.a;
            }
        }
    }
}

