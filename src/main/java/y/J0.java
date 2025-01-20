package y;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import a1.l;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class j0 extends j implements Function2 {
    public int c0;
    public Object d0;
    public final k0 e0;
    public final long f0;

    public j0(k0 k00, long v, g g0) {
        this.e0 = k00;
        this.f0 = v;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((j0)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new j0(this.e0, this.f0, g0);
        g1.d0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                long v = l.f((this.e0.A0 ? -1.0f : 1.0f), this.f0);
                this.c0 = 1;
                return this.e0.z0.h(((G)this.d0), new Float((this.e0.w0 == q0.X ? l.c(v) : l.b(v))), this) == object1 ? object1 : t.a;
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

