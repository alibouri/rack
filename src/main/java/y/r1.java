package y;

import Ab.t;
import Eb.a;
import Fb.i;
import Nb.w;
import W5.f;
import Xb.G;
import Xb.J;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m0.b;
import z0.n;
import z0.x;

public final class r1 extends i implements Function2 {
    public int Z;
    public Object b0;
    public final G c0;
    public final Function1 d0;
    public final Function1 e0;
    public final w f0;
    public final t0 g0;

    public r1(G g0, Function1 function10, Function1 function11, w w0, t0 t00, g g1) {
        this.c0 = g0;
        this.d0 = function10;
        this.e0 = function11;
        this.f0 = w0;
        this.g0 = t00;
        super(g1);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((r1)this.t(((x)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        r1 r10 = new r1(this.c0, this.d0, this.e0, this.f0, this.g0, g0);
        r10.b0 = object0;
        return r10;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.Z) {
            case 0: {
                f.b0(object0);
                this.Z = 1;
                object0 = v1.e(((x)this.b0), z0.g.Y, this);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Object object2 = t.a;
        t0 t00 = this.g0;
        G g0 = this.c0;
        if(((n)object0) != null) {
            ((n)object0).a();
            J.q(g0, null, null, new p1(t00, null), 3);
            b b0 = new b(((n)object0).c);
            this.d0.n(b0);
            return object2;
        }
        J.q(g0, null, null, new q1(t00, null), 3);
        Function1 function10 = this.e0;
        if(function10 != null) {
            function10.n(new b(((n)this.f0.X).c));
            return object2;
        }
        return null;
    }
}

