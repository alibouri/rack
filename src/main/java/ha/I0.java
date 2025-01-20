package ha;

import Ab.t;
import C.E;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import Xb.Q;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class i0 extends j implements Function2 {
    public int c0;
    public final E d0;

    public i0(E e0, g g0) {
        this.d0 = e0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((i0)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new i0(this.d0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                this.c0 = 1;
                if(Q.b(500L, this) == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                f.b0(object0);
                break;
            }
            case 2: {
                f.b0(object0);
                return t.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        this.c0 = 2;
        return E.i(this.d0, 0, this) == object1 ? object1 : t.a;
    }
}

