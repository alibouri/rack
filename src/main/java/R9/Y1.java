package R9;

import Ab.t;
import Fb.j;
import W5.f;
import Y8.R9;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class y1 extends j implements Function2 {
    public final X1 c0;

    public y1(X1 x10, g g0) {
        this.c0 = x10;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((y1)this.t(((R9)object0), ((g)object1))).v(t.a);
        return t.a;
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new y1(this.c0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        f.b0(object0);
        this.c0.i0.getClass();
        this.c0.i0.l(null, Q0.d);
        return t.a;
    }
}

