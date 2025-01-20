package oa;

import W5.f;
import ac.B0;
import java.util.List;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class j extends Fb.j implements Function2 {
    public Object c0;
    public final t d0;

    public j(t t0, g g0) {
        this.d0 = t0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((j)this.t(((List)object0), ((g)object1))).v(Ab.t.a);
        return Ab.t.a;
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new j(this.d0, g0);
        g1.c0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        f.b0(object0);
        List list0 = (List)this.c0;
        B0 b00 = this.d0.e0;
        do {
            Object object1 = b00.getValue();
        }
        while(!b00.j(object1, i.a(((i)object1), null, null, list0, false, 11)));
        return Ab.t.a;
    }
}

