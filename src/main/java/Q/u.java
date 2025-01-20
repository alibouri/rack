package Q;

import Ab.t;
import Eb.a;
import Fb.j;
import Ha.Q;
import W5.f;
import Xb.G;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class u extends j implements Function2 {
    public int c0;
    public Object d0;
    public final v e0;

    public u(v v0, g g0) {
        this.e0 = v0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((u)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new u(this.e0, g0);
        g1.d0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                Q q0 = new Q(this.e0, 10, ((G)this.d0));
                this.c0 = 1;
                this.e0.l0.a.d(q0, this);
                return object1;
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

