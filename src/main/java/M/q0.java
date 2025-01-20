package M;

import Ab.t;
import Eb.a;
import Fb.j;
import I.f0;
import I.v0;
import W5.f;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import z0.z;

public final class q0 extends j implements Function2 {
    public int c0;
    public Object d0;
    public final v0 e0;

    public q0(v0 v00, g g0) {
        this.e0 = v00;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((q0)this.t(((z)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new q0(this.e0, g0);
        g1.d0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                this.c0 = 1;
                return f0.q(((z)this.d0), this.e0, this) == object1 ? object1 : t.a;
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

