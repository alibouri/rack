package ha;

import Ab.t;
import Fb.j;
import N9.d;
import S9.i;
import W5.f;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import q9.l1;

public final class x0 extends j implements Function2 {
    public Object c0;
    public final S2 d0;

    public x0(S2 s20, g g0) {
        this.d0 = s20;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((x0)this.t(((d)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new x0(this.d0, g0);
        g1.c0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        f.b0(object0);
        d d0 = (d)this.c0;
        String s = this.d0.p0.h();
        if(s != null && this.d0.p0.f().size() >= 2) {
            return d0 == null ? new i(Vb.j.y0(s), null) : new i(l1.b(s), d0);
        }
        return null;
    }
}

