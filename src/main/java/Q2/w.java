package q2;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import Xb.J;
import Xb.k;
import dc.A;
import kotlin.coroutines.CoroutineContext.Element.DefaultImpls;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.coroutines.h;
import kotlin.coroutines.i;
import kotlin.jvm.functions.Function2;

public final class w extends j implements Function2 {
    public int c0;
    public Object d0;
    public final v e0;
    public final k f0;
    public final y g0;

    public w(v v0, k k0, y y0, g g0) {
        this.e0 = v0;
        this.f0 = k0;
        this.g0 = y0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((w)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new w(this.e0, this.f0, this.g0, g0);
        g1.d0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        g g1;
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                Element coroutineContext$Element0 = ((G)this.d0).getCoroutineContext().l(h.X);
                Nb.j.c(coroutineContext$Element0);
                q2.G g0 = new q2.G(((i)coroutineContext$Element0));
                CoroutineContext coroutineContext0 = DefaultImpls.d(((kotlin.coroutines.a)(((i)coroutineContext$Element0))), g0).r(new A(System.identityHashCode(g0), this.e0.j));
                k k0 = this.f0;
                this.d0 = k0;
                this.c0 = 1;
                object0 = J.y(coroutineContext0, this.g0, this);
                if(object0 == object1) {
                    return object1;
                }
                g1 = k0;
                break;
            }
            case 1: {
                g1 = (g)this.d0;
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        g1.i(object0);
        return t.a;
    }
}

