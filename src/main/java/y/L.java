package y;

import Ab.t;
import Bb.F;
import Eb.a;
import Fb.j;
import W5.f;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class l extends j implements Function2 {
    public n c0;
    public int d0;
    public long e0;
    public final n f0;

    public l(n n0, g g0) {
        this.f0 = n0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        l l0 = new l(this.f0, ((g)object1));
        l0.e0 = ((a1.l)object0).a;
        return l0.v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new l(this.f0, g0);
        g1.e0 = ((a1.l)object0).a;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        long v1;
        n n1;
        Object object1 = a.X;
        q0 q00 = q0.X;
        n n0 = this.f0;
        switch(this.d0) {
            case 0: {
                f.b0(object0);
                long v = this.e0;
                this.c0 = n0;
                this.e0 = v;
                this.d0 = 1;
                object0 = n0.v0.o((n0.w0 == q00 ? a1.l.c(v) : a1.l.b(v)), this);
                if(object0 == object1) {
                    return object1;
                }
                n1 = n0;
                v1 = v;
                break;
            }
            case 1: {
                v1 = this.e0;
                n1 = this.c0;
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        float f = ((Number)object0).floatValue();
        float f1 = n1.w0 == q0.Y ? f : 0.0f;
        if(n1.w0 != q00) {
            f = 0.0f;
        }
        long v2 = F.f(f1, f);
        float f2 = n0.v0.l();
        float f3 = n0.v0.i().d();
        if(f2 < n0.v0.i().c() || f2 > f3) {
            v1 = v2;
        }
        return new a1.l(v1);
    }
}

