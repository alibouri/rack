package q9;

import Ab.t;
import U.p;
import c0.b;
import hb.A;
import kotlin.jvm.functions.Function2;

public final class r0 implements Function2 {
    public final b X;

    public r0(b b0) {
        this.X = b0;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
            ((p)object0).K();
            return t.a;
        }
        this.X.j(((p)object0), 0);
        A.b(0, ((p)object0));
        return t.a;
    }
}

