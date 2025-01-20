package P;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import Xb.H;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import w.h0;
import w.j0;

public final class m extends j implements Function2 {
    public int c0;
    public final n d0;
    public final float e0;

    public m(n n0, float f, g g0) {
        this.d0 = n0;
        this.e0 = f;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((m)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new m(this.d0, this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                l l0 = new l(this.d0, this.e0, null);
                this.c0 = 1;
                this.d0.i.getClass();
                return H.c(new j0(h0.X, this.d0.i, l0, null), this) == object1 ? object1 : t.a;
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

