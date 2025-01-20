package ea;

import Ab.t;
import Ba.l;
import Fb.j;
import W5.f;
import Y8.z6;
import kotlin.jvm.functions.Function2;

public final class g extends j implements Function2 {
    public Object c0;
    public final k d0;

    public g(k k0, kotlin.coroutines.g g0) {
        this.d0 = k0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((g)this.t(((z6)object0), ((kotlin.coroutines.g)object1))).v(t.a);
        return t.a;
    }

    @Override  // Fb.a
    public final kotlin.coroutines.g t(Object object0, kotlin.coroutines.g g0) {
        kotlin.coroutines.g g1 = new g(this.d0, g0);
        g1.c0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        f.b0(object0);
        l l0 = new l(25, ((z6)this.c0));
        this.d0.o(l0);
        return t.a;
    }
}

