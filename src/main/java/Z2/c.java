package Z2;

import F0.i;
import Nb.k;
import kotlin.jvm.functions.Function0;

public final class c extends k implements Function0 {
    public final int X;
    public final i Y;

    public c(i i0, int v) {
        this.X = v;
        this.Y = i0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.Y.invoke();
    }
}

