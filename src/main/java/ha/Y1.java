package ha;

import Ab.t;
import Eb.a;
import Fb.j;
import N4.o;
import W5.f;
import Wb.c;
import Y8.R9;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import q9.Z2;
import q9.r1;

public final class y1 extends j implements Function2 {
    public int c0;
    public final S2 d0;

    public y1(S2 s20, g g0) {
        this.d0 = s20;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((y1)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new y1(this.d0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                long v = o.I(5, c.c0);
                u1 u10 = new u1(this.d0, null, 1);
                this.c0 = 1;
                return r1.e(Z2.X, v, u10, this, 4) == object1 ? object1 : t.a;
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

