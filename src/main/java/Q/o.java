package Q;

import Ab.t;
import Fb.j;
import W5.f;
import Xb.G;
import Xb.J;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class o extends j implements Function2 {
    public Object c0;
    public final p d0;

    public o(p p0, g g0) {
        this.d0 = p0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((o)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new o(this.d0, g0);
        g1.c0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        f.b0(object0);
        return J.q(((G)this.c0), null, null, new n(this.d0, null), 3);
    }
}

