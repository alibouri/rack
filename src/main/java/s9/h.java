package S9;

import Aa.t0;
import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import ac.o0;
import ha.S2;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class h extends j implements Function2 {
    public int c0;
    public final S2 d0;

    public h(S2 s20, g g0) {
        this.d0 = s20;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((h)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new h(this.d0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                ac.h h0 = o0.n(new t0(this.d0.s0, 22));
                S9.f f0 = new S9.f(this.d0, 0);
                this.c0 = 1;
                return h0.d(f0, this) == object1 ? object1 : t.a;
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

