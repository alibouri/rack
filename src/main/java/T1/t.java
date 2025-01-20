package T1;

import Eb.a;
import Fb.j;
import Nb.s;
import W5.f;
import ac.i;
import ac.o0;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class t extends j implements Function2 {
    public int c0;
    public Object d0;
    public final F e0;

    public t(F f0, g g0) {
        this.e0 = f0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((t)this.t(((i)object0), ((g)object1))).v(Ab.t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new t(this.e0, g0);
        g1.d0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        Object object2 = Ab.t.a;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                i i0 = (i)this.d0;
                F f0 = this.e0;
                G g0 = (G)f0.f.getValue();
                if(!(g0 instanceof c)) {
                    l l0 = new l(g0);
                    f0.h.G(l0);
                }
                r r0 = new r(g0, null);
                this.c0 = 1;
                o0.r(i0);
                Na.j j0 = new Na.j(i0, 29);
                N3.F f1 = new N3.F(new s(), j0, r0);  // initializer: Ljava/lang/Object;-><init>()V
                f0.f.d(f1, this);
                return object1;
            }
            case 1: {
                f.b0(object0);
                return object2;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

