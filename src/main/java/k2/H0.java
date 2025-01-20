package k2;

import Ab.t;
import Fb.j;
import W5.f;
import ac.i;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class h0 extends j implements Function2 {
    public final i0 c0;

    public h0(i0 i00, g g0) {
        this.c0 = i00;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((h0)this.t(((i)object0), ((g)object1))).v(t.a);
        return t.a;
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new h0(this.c0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        f.b0(object0);
        this.c0.getClass();
        return t.a;
    }
}

