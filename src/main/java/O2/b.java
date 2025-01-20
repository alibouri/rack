package O2;

import Ab.t;
import Eb.a;
import Fb.j;
import I2.A;
import W5.f;
import Zb.v;
import Zb.x;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class b extends j implements Function2 {
    public int c0;
    public Object d0;
    public final c e0;

    public b(c c0, g g0) {
        this.e0 = c0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((b)this.t(((x)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new b(this.e0, g0);
        g1.d0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                x x0 = (x)this.d0;
                O2.a a0 = new O2.a(this.e0, x0);
                P2.f f0 = this.e0.a;
                f0.getClass();
                synchronized(f0.c) {
                    if(f0.d.add(a0)) {
                        if(f0.d.size() == 1) {
                            f0.e = f0.a();
                            A.e().a(P2.g.a, f0.getClass().getSimpleName() + ": initial state = " + f0.e);
                            f0.c();
                        }
                        a0.a(f0.e);
                    }
                }
                D.j j0 = new D.j(this.e0, 19, a0);
                this.c0 = 1;
                return v.a(x0, j0, this) == object1 ? object1 : t.a;
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

