package y;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import m0.b;
import z0.n;

public final class b1 extends j implements Function2 {
    public int c0;
    public final j d0;
    public final t0 e0;
    public final n f0;

    public b1(Function3 function30, t0 t00, n n0, g g0) {
        this.d0 = (j)function30;
        this.e0 = t00;
        this.f0 = n0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((b1)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new b1(((Function3)this.d0), this.e0, this.f0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                b b0 = new b(this.f0.c);
                this.c0 = 1;
                return ((Function3)this.d0).h(this.e0, b0, this) == object1 ? object1 : t.a;
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

