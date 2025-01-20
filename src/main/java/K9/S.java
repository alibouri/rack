package K9;

import Ab.t;
import kotlin.jvm.functions.Function0;

public final class s implements Function0 {
    public final int X;
    public final Function0 Y;
    public final Function0 Z;

    public s(Function0 function00, Function0 function01, int v) {
        this.X = v;
        this.Y = function00;
        this.Z = function01;
        super();
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.X) {
            case 0: {
                this.Y.invoke();
                this.Z.invoke();
                return t.a;
            }
            case 1: {
                this.Y.invoke();
                this.Z.invoke();
                return t.a;
            }
            default: {
                this.Y.invoke();
                this.Z.invoke();
                return t.a;
            }
        }
    }
}

