package Q;

import A.k;
import Ab.t;
import Fb.j;
import Ha.Q;
import W5.f;
import Xb.G;
import kotlin.jvm.functions.Function2;

public final class g extends j implements Function2 {
    public int c0;
    public Object d0;
    public final k e0;
    public final a f0;

    public g(k k0, a a0, kotlin.coroutines.g g0) {
        this.e0 = k0;
        this.f0 = a0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((g)this.t(((G)object0), ((kotlin.coroutines.g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final kotlin.coroutines.g t(Object object0, kotlin.coroutines.g g0) {
        kotlin.coroutines.g g1 = new g(this.e0, this.f0, g0);
        g1.d0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = Eb.a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                Q q0 = new Q(this.f0, 9, ((G)this.d0));
                this.c0 = 1;
                this.e0.a.d(q0, this);
                return object1;
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

