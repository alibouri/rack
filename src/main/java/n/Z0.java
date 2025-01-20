package N;

import Nb.k;
import kotlin.jvm.functions.Function0;

public final class z0 extends k implements Function0 {
    public final int X;
    public final Function0 Y;

    public z0(Function0 function00, int v) {
        this.X = v;
        this.Y = function00;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.X) {
            case 0: {
                this.Y.invoke();
                return Boolean.TRUE;
            }
            case 1: {
                this.Y.invoke();
                return Boolean.TRUE;
            }
            default: {
                this.Y.invoke();
                return Boolean.TRUE;
            }
        }
    }
}

