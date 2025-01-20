package o9;

import Ab.t;
import Ea.r;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import c.o;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import q9.o0;

public final class n1 extends j implements Function2 {
    public int c0;
    public final o d0;
    public final i1 e0;

    public n1(o o0, i1 i10, g g0) {
        this.d0 = o0;
        this.e0 = i10;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((n1)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new n1(this.d0, this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                r r0 = new r(this.d0, 11, this.e0);
                this.c0 = 1;
                return o0.Z(this.d0, r0, this) == object1 ? object1 : t.a;
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

