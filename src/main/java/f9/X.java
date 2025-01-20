package f9;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import Xb.J;
import Xb.r0;
import dc.o;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class x extends j implements Function2 {
    public int c0;
    public final r0 d0;
    public final A e0;

    public x(r0 r00, A a0, g g0) {
        this.d0 = r00;
        this.e0 = a0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((x)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new x(this.d0, this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                this.c0 = 1;
                if(this.d0.L(this) == object1) {
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
        w w0 = new w(this.e0, null);
        this.c0 = 2;
        return J.y(o.a, w0, this) == object1 ? object1 : t.a;
    }
}

