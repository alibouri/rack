package ha;

import Ab.t;
import Eb.a;
import Fb.j;
import Ma.v;
import W5.f;
import Y8.R9;
import ac.i;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import q9.Z2;
import q9.r1;

public final class o1 extends j implements Function2 {
    public int c0;
    public final i d0;
    public final S2 e0;

    public o1(i i0, S2 s20, g g0) {
        this.d0 = i0;
        this.e0 = s20;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((o1)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new o1(this.d0, this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                v v0 = new v(this.d0, this.e0, null, 4);
                this.c0 = 1;
                return r1.e(Z2.d0, 0L, v0, this, 6) == object1 ? object1 : t.a;
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

