package oa;

import Fb.j;
import W5.f;
import ac.B0;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class k extends j implements Function2 {
    public boolean c0;
    public final t d0;

    public k(t t0, g g0) {
        this.d0 = t0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((k)this.t(((Boolean)object0), ((g)object1))).v(Ab.t.a);
        return Ab.t.a;
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new k(this.d0, g0);
        g1.c0 = ((Boolean)object0).booleanValue();
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        f.b0(object0);
        boolean z = this.c0;
        B0 b00 = this.d0.e0;
        do {
            Object object1 = b00.getValue();
        }
        while(!b00.j(object1, i.a(((i)object1), null, null, null, z, 7)));
        return Ab.t.a;
    }
}

