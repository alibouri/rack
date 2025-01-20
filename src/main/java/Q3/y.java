package Q3;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import ac.i;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class y extends j implements Function2 {
    public int c0;
    public Object d0;
    public final u e0;

    public y(u u0, g g0) {
        this.e0 = u0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((y)this.t(((i)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new y(this.e0, g0);
        g1.d0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                Na.j j0 = new Na.j(((i)this.d0), 2);
                this.c0 = 1;
                return this.e0.d(j0, this) == object1 ? object1 : t.a;
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

