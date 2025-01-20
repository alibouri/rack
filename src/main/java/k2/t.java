package k2;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import Xb.J;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class T extends j implements Function2 {
    public int c0;
    public Object d0;
    public final U e0;
    public final t1 f0;
    public final g0 g0;

    public T(U u0, t1 t10, g0 g00, g g0) {
        this.e0 = u0;
        this.f0 = t10;
        this.g0 = g00;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((T)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new T(this.e0, this.f0, this.g0, g0);
        g1.d0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        G g1;
        Object object1 = a.X;
        U u0 = this.e0;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                G g0 = (G)this.d0;
                this.d0 = g0;
                this.c0 = 1;
                Object object2 = u0.c.d(this.f0, this);
                if(object2 == object1) {
                    return object1;
                }
                g1 = g0;
                object0 = object2;
                break;
            }
            case 1: {
                g1 = (G)this.d0;
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Object object3 = t.a;
        if(u0.c.a.b) {
            u0.h.set(true);
            return object3;
        }
        S s0 = new S(((x1)object0), u0, this.g0, null);
        J.q(g1, u0.d, null, s0, 2);
        return object3;
    }
}

