package U;

import Ab.t;
import Fb.j;
import W5.f;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class n0 extends j implements Function2 {
    public Object c0;

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((n0)this.t(((m0)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new n0(2, g0);  // initializer: LFb/j;-><init>(ILkotlin/coroutines/g;)V
        g1.c0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        f.b0(object0);
        return ((m0)this.c0) == m0.X ? Boolean.valueOf(true) : Boolean.valueOf(false);
    }
}

