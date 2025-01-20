package y;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import z0.z;

public final class t1 extends j implements Function2 {
    public int c0;
    public Object d0;
    public final z e0;
    public final Function3 f0;
    public final Function1 g0;
    public final Function1 h0;
    public final Function1 i0;

    public t1(z z0, Function3 function30, Function1 function10, Function1 function11, Function1 function12, g g0) {
        this.e0 = z0;
        this.f0 = function30;
        this.g0 = function10;
        this.h0 = function11;
        this.i0 = function12;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((t1)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        t1 t10 = new t1(this.e0, this.f0, this.g0, this.h0, this.i0, g0);
        t10.d0 = object0;
        return t10;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                G g0 = (G)this.d0;
                t0 t00 = new t0(this.e0);
                s1 s10 = new s1(g0, this.f0, this.g0, this.h0, this.i0, t00, null);
                this.c0 = 1;
                return io.sentry.config.a.t(this.e0, s10, this) == object1 ? object1 : t.a;
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

