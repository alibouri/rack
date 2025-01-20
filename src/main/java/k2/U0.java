package k2;

import Ab.t;
import Eb.a;
import Fb.j;
import N2.l;
import Qa.T;
import W5.f;
import Z2.k;
import ac.h;
import ac.w;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class u0 extends j implements Function2 {
    public int c0;
    public Object d0;
    public final w0 e0;

    public u0(w0 w00, g g0) {
        this.e0 = w00;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((u0)this.t(((I1)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new u0(this.e0, g0);
        g1.d0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                I1 i10 = (I1)this.d0;
                h h0 = H.f(new Na.f(5, new l(new E(new w(((T)this.e0.d.Z), new s0(2, null)), new N9.l(this.e0, null, 7), null))), new N9.l(null, this.e0, 8));  // initializer: LFb/j;-><init>(ILkotlin/coroutines/g;)V
                k k0 = new k(2, i10);
                this.c0 = 1;
                return h0.d(k0, this) == object1 ? object1 : t.a;
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

