package Aa;

import Ab.t;
import Fb.j;
import W5.f;
import Y8.m2;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class h0 extends j implements Function2 {
    public Object c0;

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((h0)this.t(((m2)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new h0(2, g0);  // initializer: LFb/j;-><init>(ILkotlin/coroutines/g;)V
        g1.c0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        f.b0(object0);
        return ((m2)this.c0).a;
    }
}

