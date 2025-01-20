package y;

import Ab.t;
import Fb.j;
import W5.f;
import Xb.G;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class q1 extends j implements Function2 {
    public final t0 c0;

    public q1(t0 t00, g g0) {
        this.c0 = t00;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((q1)this.t(((G)object0), ((g)object1))).v(t.a);
        return t.a;
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new q1(this.c0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        f.b0(object0);
        this.c0.Z = true;
        this.c0.b0.f(null);
        return t.a;
    }
}

