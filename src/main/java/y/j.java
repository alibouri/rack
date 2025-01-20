package y;

import Ab.t;
import Eb.a;
import N.m;
import N2.l;
import Nb.k;
import Nb.w;
import U.d;
import W5.f;
import Xb.G;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final class j extends Fb.j implements Function2 {
    public int c0;
    public Object d0;
    public final k e0;
    public final Fb.j f0;

    public j(Function0 function00, Function2 function20, g g0) {
        this.e0 = (k)function00;
        this.f0 = (Fb.j)function20;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((j)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new j(((Function0)this.e0), ((Function2)this.f0), g0);
        g1.d0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                G g0 = (G)this.d0;
                w w0 = new w();  // initializer: Ljava/lang/Object;-><init>()V
                l l0 = d.L(((Function0)this.e0));
                m m0 = new m(w0, g0, ((Function2)this.f0), 3);
                this.c0 = 1;
                return l0.d(m0, this) == object1 ? object1 : t.a;
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

