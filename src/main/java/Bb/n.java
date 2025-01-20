package bb;

import Ab.t;
import N.K0;
import U.p;
import c0.b;
import c0.c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final class n implements Function2 {
    public final Function0 X;
    public final int Y;

    public n(Function0 function00, int v) {
        this.X = function00;
        this.Y = v;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
            ((p)object0).K();
            return t.a;
        }
        b b0 = c.c(-1415031383, new m(this.Y, 0), ((p)object0));
        K0.a(this.X, null, false, null, b0, ((p)object0), 0x6000, 14);
        return t.a;
    }
}

