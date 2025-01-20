package Ea;

import Ab.t;
import Eb.a;
import Fa.C;
import Fb.j;
import W5.f;
import Xb.G;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class x0 extends j implements Function2 {
    public int c0;
    public final f0 d0;
    public final S e0;
    public final C f0;

    public x0(f0 f00, S s0, C c0, g g0) {
        this.d0 = f00;
        this.e0 = s0;
        this.f0 = c0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((x0)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new x0(this.d0, this.e0, this.f0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                this.d0.c.n(this.e0);
                this.c0 = 1;
                return this.f0.d(this) == object1 ? object1 : t.a;
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

