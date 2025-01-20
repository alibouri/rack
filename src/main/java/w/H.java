package w;

import A.i;
import A.k;
import Ab.t;
import Fb.j;
import W5.f;
import Xb.G;
import Xb.J;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class h extends j implements Function2 {
    public final w.j c0;

    public h(w.j j0, g g0) {
        this.c0 = j0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((h)this.t(((G)object0), ((g)object1))).v(t.a);
        return t.a;
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new h(this.c0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        f.b0(object0);
        w.j j0 = this.c0;
        A.h h0 = j0.y0;
        if(h0 != null) {
            i i0 = new i(h0);
            k k0 = j0.n0;
            if(k0 != null) {
                J.q(j0.l0(), null, null, new b(k0, i0, null), 3);
            }
            j0.y0 = null;
        }
        return t.a;
    }
}

