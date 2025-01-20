package q9;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import Xb.J;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class z2 extends j implements Function2 {
    public int c0;
    public Object d0;
    public final w2 e0;

    public z2(w2 w20, g g0) {
        this.e0 = w20;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((z2)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new z2(this.e0, g0);
        g1.d0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                J.q(((G)this.d0), null, null, new y2(2, null), 3);  // initializer: LFb/j;-><init>(ILkotlin/coroutines/g;)V
                this.c0 = 1;
                object0 = this.e0.n(this);
                return object0 == object1 ? object1 : object0;
            }
            case 1: {
                f.b0(object0);
                return object0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

