package y;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import Xb.H;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class h extends j implements Function2 {
    public int c0;
    public final j d0;
    public final Object e0;
    public final G f0;

    public h(Function2 function20, Object object0, G g0, g g1) {
        this.d0 = (j)function20;
        this.e0 = object0;
        this.f0 = g0;
        super(2, g1);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((h)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new h(((Function2)this.d0), this.e0, this.f0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                this.c0 = 1;
                if(((Function2)this.d0).j(this.e0, this) == object1) {
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
        y.a a0 = new y.a();
        H.b(this.f0, a0);
        return t.a;
    }
}

