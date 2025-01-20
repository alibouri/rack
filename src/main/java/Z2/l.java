package Z2;

import Ab.t;
import Eb.a;
import Fb.j;
import R9.F2;
import U.d;
import W5.f;
import Xb.G;
import ac.o0;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class l extends j implements Function2 {
    public int c0;
    public final n d0;

    public l(n n0, g g0) {
        this.d0 = n0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((l)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new l(this.d0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                bc.n n0 = o0.z(d.L(new F2(11, this.d0)), new Z2.j(this.d0, null));
                k k0 = new k(0, this.d0);
                this.c0 = 1;
                return n0.d(k0, this) == object1 ? object1 : t.a;
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

