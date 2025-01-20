package y;

import Ab.t;
import Eb.a;
import Fb.j;
import N.v;
import W5.f;
import Xb.G;
import a1.l;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import w.p0;

public final class m extends j implements Function2 {
    public n c0;
    public int d0;
    public final n e0;
    public final long f0;

    public m(n n0, long v, g g0) {
        this.e0 = n0;
        this.f0 = v;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((m)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new m(this.e0, this.f0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        q0 q00 = q0.X;
        switch(this.d0) {
            case 0: {
                f.b0(object0);
                n n0 = this.e0;
                p0 p00 = n0.y0;
                long v = this.f0;
                if(p00 == null) {
                    v v1 = n0.v0;
                    long v2 = n0.J0() ? l.f(-1.0f, v) : l.f(1.0f, v);
                    this.c0 = n0;
                    this.d0 = 1;
                    Object object2 = v1.o((n0.w0 == q00 ? l.c(v2) : l.b(v2)), this);
                    if(object2 == object1) {
                        return object1;
                    }
                    object0 = object2;
                    break;
                }
                long v3 = n0.J0() ? l.f(-1.0f, v) : l.f(1.0f, v);
                y.l l0 = new y.l(n0, null);
                this.d0 = 2;
                return p00.f(v3, l0, this) == object1 ? object1 : t.a;
            }
            case 1: {
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
        ((Number)object0).floatValue();
        return t.a;
    }
}

