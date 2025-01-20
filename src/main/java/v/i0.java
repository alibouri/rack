package v;

import Ab.t;
import Eb.a;
import Fb.j;
import N.b2;
import U.V;
import W5.f;
import Xb.G;
import Xb.H;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class i0 extends j implements Function2 {
    public float c0;
    public int d0;
    public Object e0;
    public final k0 f0;

    public i0(k0 k00, g g0) {
        this.f0 = k00;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((i0)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new i0(this.f0, g0);
        g1.e0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        G g1;
        float f;
        Object object1 = a.X;
        switch(this.d0) {
            case 0: {
                f.b0(object0);
                G g0 = (G)this.e0;
                f = b0.g(g0.getCoroutineContext());
                g1 = g0;
                break;
            }
            case 1: {
                f = this.c0;
                g1 = (G)this.e0;
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(H.d(g1)) {
            b2 b20 = new b2(this.f0, f);
            this.e0 = g1;
            this.c0 = f;
            this.d0 = 1;
            Nb.j.c(this.Y);
            if(V.a(this.Y).v(b20, this) == object1) {
                return object1;
            }
            if(false) {
                break;
            }
        }
        return t.a;
    }
}

