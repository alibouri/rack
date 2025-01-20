package o9;

import Ab.t;
import Fb.j;
import W5.f;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class t0 extends j implements Function2 {
    public final Y0 c0;

    public t0(Y0 y00, g g0) {
        this.c0 = y00;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((t0)this.t(((Boolean)object0), ((g)object1))).v(t.a);
        return t.a;
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new t0(this.c0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        f.b0(object0);
        this.c0.H0.k(null);
        return t.a;
    }
}

