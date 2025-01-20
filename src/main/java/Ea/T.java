package Ea;

import Nb.j;
import g1.a;
import g1.b;
import k1.e;
import kotlin.jvm.functions.Function1;

public final class t implements Function1 {
    public final int X;
    public final b Y;

    public t(b b0, int v) {
        this.X = v;
        this.Y = b0;
        super();
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        if(this.X != 0) {
            j.f(((a)object0), "$this$constrainAs");
            com.apollographql.apollo.api.b.i(((a)object0).e, this.Y.f);
            return Ab.t.a;
        }
        j.f(((a)object0), "$this$constrainAs");
        com.apollographql.apollo.api.b.i(((a)object0).e, ((a)object0).c.d);
        ((a)object0).e.k(this.Y.f, 0.0f, 0.0f);
        ((a)object0).g.k(((a)object0).c.f, 0.0f, 0.0f);
        ((a)object0).b.getClass();
        e e0 = new e(0.33f);
        ((a)object0).b.G("vBias", e0);
        com.apollographql.apollo.api.b.j(((a)object0).d, ((a)object0).c.c);
        com.apollographql.apollo.api.b.j(((a)object0).f, ((a)object0).c.e);
        return Ab.t.a;
    }
}

