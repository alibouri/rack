package k2;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.u0;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class p extends j implements Function2 {
    public int c0;
    public Object d0;
    public final u0 e0;
    public final j f0;

    public p(u0 u00, Function2 function20, g g0) {
        this.e0 = u00;
        this.f0 = (j)function20;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((p)this.t(((I1)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new p(this.e0, ((Function2)this.f0), g0);
        g1.d0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                I1 i10 = (I1)this.d0;
                V2.a a0 = new V2.a(15, i10);
                this.e0.q(a0);
                this.c0 = 1;
                return ((Function2)this.f0).j(i10, this) == object1 ? object1 : t.a;
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

