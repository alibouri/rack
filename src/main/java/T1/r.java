package T1;

import Ab.t;
import Fb.j;
import W5.f;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class r extends j implements Function2 {
    public Object c0;
    public final G d0;

    public r(G g0, g g1) {
        this.d0 = g0;
        super(2, g1);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((r)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new r(this.d0, g0);
        g1.c0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        f.b0(object0);
        return Boolean.valueOf(!(this.d0 instanceof c) && !(this.d0 instanceof i) && ((G)this.c0) == this.d0);
    }
}

