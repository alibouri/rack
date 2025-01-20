package ha;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class p0 extends j implements Function2 {
    public int c0;
    public final S2 d0;

    public p0(S2 s20, g g0) {
        this.d0 = s20;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((p0)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new p0(this.d0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                n0 n00 = new n0(this.d0, 1);
                this.c0 = 1;
                return this.d0.E0.d(n00, this) == object1 ? object1 : t.a;
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

