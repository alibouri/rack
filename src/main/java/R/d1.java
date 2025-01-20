package R;

import Ab.t;
import Eb.a;
import Fb.j;
import Ha.Q;
import Nb.u;
import W5.f;
import Xb.G;
import ac.n0;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class d1 extends j implements Function2 {
    public int c0;
    public final e1 d0;

    public d1(e1 e10, g g0) {
        this.d0 = e10;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((d1)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new d1(this.d0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                u u0 = new u();  // initializer: Ljava/lang/Object;-><init>()V
                n0 n00 = this.d0.l0.a;
                Q q0 = new Q(u0, 11, this.d0);
                this.c0 = 1;
                n00.d(q0, this);
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

