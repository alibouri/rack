package e1;

import Ab.t;
import E.B;
import Nb.k;
import U.F;
import c.D;
import kotlin.jvm.functions.Function1;

public final class b extends k implements Function1 {
    public final int X;
    public final s Y;

    public b(s s0, int v) {
        this.X = v;
        this.Y = s0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        if(this.X != 0) {
            D d0 = (D)object0;
            s s0 = this.Y;
            if(s0.c0.a) {
                s0.b0.invoke();
            }
            return t.a;
        }
        F f0 = (F)object0;
        this.Y.show();
        return new B(9, this.Y);
    }
}

