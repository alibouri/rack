package k2;

import Ab.t;
import Eb.a;
import Fb.j;
import N2.l;
import W5.f;
import a8.Q;
import ac.B;
import ac.i;
import ac.n0;
import ac.o0;
import hc.d;
import jeb.synthetic.FIN;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function3;

public final class y0 extends j implements Function3 {
    public int c0;
    public i d0;
    public Object e0;
    public final Q0 f0;
    public final g0 g0;
    public d h0;
    public int i0;

    public y0(g g0, Q0 q00, g0 g00) {
        this.f0 = q00;
        this.g0 = g00;
        super(3, g0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        y0 y00 = new y0(((g)object2), this.f0, this.g0);
        y00.d0 = (i)object0;
        y00.e0 = object1;
        return y00.v(t.a);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        l l0;
        d d0;
        R0 r00;
        int v1;
        i i0;
        g0 g00 = this.g0;
        Object object1 = a.X;
        Q0 q00 = this.f0;
        int v = 1;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                i0 = this.d0;
                v1 = ((Number)this.e0).intValue();
                r00 = q00.i;
                d0 = r00.a;
                this.d0 = i0;
                this.e0 = r00;
                this.h0 = d0;
                this.i0 = v1;
                this.c0 = 1;
                if(d0.d(null, this) == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                v1 = this.i0;
                d0 = this.h0;
                r00 = (R0)this.e0;
                i0 = this.d0;
                f.b0(object0);
                break;
            }
            case 2: {
                f.b0(object0);
                return t.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        int v2 = FIN.finallyOpen$NT();
        Q q0 = r00.b.l;
        if(Nb.j.a(q0.n(g00), d0.b)) {
            l0 = new l(3, new I[0]);
            FIN.finallyExec$NT(v2);
        }
        else {
            if(!(q0.n(g00) instanceof b0)) {
                q0.N(g00, d0.c);
            }
            FIN.finallyCodeBegin$NT(v2);
            d0.f(null);
            FIN.finallyCodeEnd$NT(v2);
            n0 n00 = q00.f.D(g00);
            if(v1 == 0) {
                v = 0;
            }
            l0 = new B(o0.o(v, n00), v1, 1);
        }
        this.d0 = null;
        this.e0 = null;
        this.h0 = null;
        this.c0 = 2;
        return o0.p(l0, i0, this) == object1 ? object1 : t.a;
    }
}

