package e1;

import Ab.t;
import Eb.a;
import Fb.j;
import G0.p0;
import U.V;
import W5.f;
import Xb.G;
import Xb.H;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class i extends j implements Function2 {
    public int c0;
    public Object d0;
    public final u e0;

    public i(u u0, g g0) {
        this.e0 = u0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((i)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new i(this.e0, g0);
        g1.d0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        G g0;
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                g0 = (G)this.d0;
                goto label_14;
            }
            case 1: {
                g0 = (G)this.d0;
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        do {
            u u0 = this.e0;
            int v = u0.B0[0];
            int v1 = u0.B0[1];
            u0.m0.getLocationOnScreen(u0.B0);
            if(v != u0.B0[0] || v1 != u0.B0[1]) {
                u0.m();
            }
        label_14:
            if(!H.d(g0)) {
                return t.a;
            }
            c c0 = c.Z;
            this.d0 = g0;
            this.c0 = 1;
            CoroutineContext coroutineContext0 = this.Y;
            Nb.j.c(coroutineContext0);
            if(coroutineContext0.l(p0.X) != null) {
                throw new ClassCastException();
            }
            Nb.j.c(coroutineContext0);
        }
        while(V.a(coroutineContext0).v(c0, this) != object1);
        return object1;
    }
}

