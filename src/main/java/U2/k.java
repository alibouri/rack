package U2;

import Ab.t;
import Fb.j;
import I2.A;
import N2.c;
import R2.p;
import W5.f;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class k extends j implements Function2 {
    public final p c0;

    public k(p p0, g g0) {
        this.c0 = p0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((k)this.t(((c)object0), ((g)object1))).v(t.a);
        return t.a;
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new k(this.c0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        f.b0(object0);
        A.e().a(l.a, "Constraints changed for " + this.c0);
        return t.a;
    }
}

