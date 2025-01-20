package ra;

import Ab.t;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

public final class p implements Function0 {
    public final int X;
    public final Function1 Y;
    public final A Z;

    public p(Function1 function10, A a0, int v) {
        this.X = v;
        this.Y = function10;
        this.Z = a0;
        super();
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(this.X != 0) {
            this.Y.n(this.Z);
            return t.a;
        }
        this.Y.n(this.Z);
        return t.a;
    }
}

