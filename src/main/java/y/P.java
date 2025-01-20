package y;

import Ab.t;
import Eb.a;
import Fb.j;
import N.v;
import N9.l;
import W5.f;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class p extends j implements Function2 {
    public int c0;
    public Object d0;
    public final l e0;
    public final v f0;

    public p(l l0, v v0, g g0) {
        this.e0 = l0;
        this.f0 = v0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((p)this.t(((p0)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new p(this.e0, this.f0, g0);
        g1.d0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                this.c0 = 1;
                return this.e0.h(((s)this.f0.o), ((p0)this.d0), this) == object1 ? object1 : t.a;
            }
            case 1: {
                f.b0(object0);
                return t.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

