package y;

import Ab.t;
import Eb.a;
import Fb.j;
import N.u;
import W5.f;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import w.H;

public final class h0 extends j implements Function2 {
    public int c0;
    public Object d0;
    public final d0 e0;
    public final k0 f0;

    public h0(d0 d00, k0 k00, g g0) {
        this.e0 = d00;
        this.f0 = k00;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((h0)this.t(((u)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new h0(this.e0, this.f0, g0);
        g1.d0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                H h0 = new H(((u)this.d0), 3, this.f0);
                this.c0 = 1;
                return this.e0.j(h0, this) == object1 ? object1 : t.a;
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

