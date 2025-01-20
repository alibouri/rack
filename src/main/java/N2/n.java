package N2;

import Ab.t;
import Eb.a;
import Fb.j;
import Ha.Q;
import R2.p;
import W5.f;
import Xb.G;
import ac.h;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class n extends j implements Function2 {
    public int c0;
    public final m d0;
    public final p e0;
    public final i f0;

    public n(m m0, p p0, i i0, g g0) {
        this.d0 = m0;
        this.e0 = p0;
        this.f0 = i0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((n)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new n(this.d0, this.e0, this.f0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                h h0 = this.d0.e(this.e0);
                Q q0 = new Q(this.f0, 7, this.e0);
                this.c0 = 1;
                return h0.d(q0, this) == object1 ? object1 : t.a;
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

