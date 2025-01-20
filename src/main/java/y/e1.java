package y;

import Ab.t;
import Eb.a;
import Fb.i;
import Fb.j;
import Nb.k;
import W5.f;
import Xb.G;
import Xb.J;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import m0.b;
import z0.n;
import z0.x;

public final class e1 extends i implements Function2 {
    public int Z;
    public Object b0;
    public final G c0;
    public final j d0;
    public final k e0;
    public final t0 f0;

    public e1(G g0, Function3 function30, Function1 function10, t0 t00, g g1) {
        this.c0 = g0;
        this.d0 = (j)function30;
        this.e0 = (k)function10;
        this.f0 = t00;
        super(g1);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((e1)this.t(((x)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        e1 e10 = new e1(this.c0, ((Function3)this.d0), ((Function1)this.e0), this.f0, g0);
        e10.b0 = object0;
        return e10;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        x x0;
        Object object1 = a.X;
        t0 t00 = this.f0;
        G g0 = this.c0;
        switch(this.Z) {
            case 0: {
                f.b0(object0);
                x0 = (x)this.b0;
                J.q(g0, null, null, new a1(t00, null), 3);
                this.b0 = x0;
                this.Z = 1;
                object0 = v1.c(x0, this, 3);
                if(object0 == object1) {
                    return object1;
                }
                goto label_15;
            }
            case 1: {
                x0 = (x)this.b0;
                f.b0(object0);
            label_15:
                ((n)object0).a();
                j j0 = this.d0;
                if(j0 != v1.a) {
                    J.q(g0, null, null, new b1(((Function3)j0), t00, ((n)object0), null), 3);
                }
                this.b0 = null;
                this.Z = 2;
                object0 = v1.e(x0, z0.g.Y, this);
                if(object0 == object1) {
                    return object1;
                }
                goto label_25;
            }
            case 2: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        f.b0(object0);
    label_25:
        if(((n)object0) == null) {
            J.q(g0, null, null, new c1(t00, null), 3);
            return t.a;
        }
        ((n)object0).a();
        J.q(g0, null, null, new d1(t00, null), 3);
        b b0 = new b(((n)object0).c);
        ((Function1)this.e0).n(b0);
        return t.a;
    }
}

