package v3;

import Nb.k;
import kotlin.jvm.functions.Function0;
import r3.a;

public final class m extends k implements Function0 {
    public final int X;
    public final n Y;

    public m(n n0, int v) {
        this.X = v;
        this.Y = n0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.X) {
            case 0: {
                return ((a)this.Y.Y.getValue()) != null || ((Throwable)this.Y.Z.getValue()) != null ? Boolean.valueOf(true) : Boolean.valueOf(false);
            }
            case 1: {
                return ((Throwable)this.Y.Z.getValue()) == null ? Boolean.valueOf(false) : Boolean.valueOf(true);
            }
            case 2: {
                return ((a)this.Y.Y.getValue()) != null || ((Throwable)this.Y.Z.getValue()) != null ? Boolean.valueOf(false) : Boolean.valueOf(true);
            }
            default: {
                return ((a)this.Y.Y.getValue()) == null ? Boolean.valueOf(false) : Boolean.valueOf(true);
            }
        }
    }
}

