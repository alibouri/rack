package Q;

import Ab.t;
import Eb.a;
import W5.f;
import Xb.G;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import v.b;
import v.c;
import v.n0;
import v.z;

public final class j extends Fb.j implements Function2 {
    public int c0;
    public final p d0;

    public j(p p0, g g0) {
        this.d0 = p0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((j)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new j(this.d0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                n0 n00 = c.j(75, 0, z.c, 2);
                this.c0 = 1;
                return b.c(this.d0.f, new Float(1.0f), n00, null, this, 12) == object1 ? object1 : t.a;
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

