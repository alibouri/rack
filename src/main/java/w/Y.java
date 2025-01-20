package w;

import Ab.t;
import Nb.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import m0.b;

public final class y extends k implements Function1 {
    public final int X;
    public final z Y;

    public y(z z0, int v) {
        this.X = v;
        this.Y = z0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        switch(this.X) {
            case 0: {
                b b1 = (b)object0;
                Function0 function00 = this.Y.H0;
                if(function00 != null) {
                    function00.invoke();
                }
                return t.a;
            }
            case 1: {
                b b2 = (b)object0;
                Function0 function01 = this.Y.G0;
                if(function01 != null) {
                    function01.invoke();
                }
                return t.a;
            }
            default: {
                b b0 = (b)object0;
                z z0 = this.Y;
                if(z0.r0) {
                    z0.s0.invoke();
                }
                return t.a;
            }
        }
    }
}

