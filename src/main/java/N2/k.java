package N2;

import ac.h;
import kotlin.jvm.functions.Function0;

public final class k extends Nb.k implements Function0 {
    public final int X;
    public final h[] Y;

    public k(h[] arr_h, int v) {
        this.X = v;
        this.Y = arr_h;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.X) {
            case 0: {
                return new c[this.Y.length];
            }
            case 1: {
                return new Object[this.Y.length];
            }
            case 2: {
                return new Object[this.Y.length];
            }
            case 3: {
                return new Object[this.Y.length];
            }
            default: {
                return new Object[this.Y.length];
            }
        }
    }
}

