package q9;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.H;
import ac.i;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class h1 extends j implements Function2 {
    public int c0;
    public Object d0;
    public final c1 e0;
    public final c1 f0;

    public h1(c1 c10, c1 c11, g g0) {
        this.e0 = c10;
        this.f0 = c11;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((h1)this.t(((i)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new h1(this.e0, this.f0, g0);
        g1.d0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                g1 g10 = new g1(this.e0, this.f0, ((i)this.d0), null);
                this.c0 = 1;
                return H.c(g10, this) == object1 ? object1 : t.a;
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

