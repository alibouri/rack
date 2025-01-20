package E;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class q extends j implements Function2 {
    public int c0;
    public final u d0;

    public q(u u0, g g0) {
        this.d0 = u0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((q)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new q(this.d0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        u u0 = this.d0;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                a1.g g0 = new a1.g(0L);
                this.c0 = 1;
                if(u0.m.e(g0, this) == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        u0.e(0L);
        u0.d(false);
        return t.a;
    }
}

