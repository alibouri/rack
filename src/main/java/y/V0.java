package y;

import B.w;
import Eb.a;
import Fb.j;
import Nb.t;
import W5.f;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import v.b0;
import v.n0;

public final class v0 extends j implements Function2 {
    public int c0;
    public Object d0;
    public final float e0;
    public final n0 f0;
    public final t g0;

    public v0(float f, n0 n00, t t0, g g0) {
        this.e0 = f;
        this.f0 = n00;
        this.g0 = t0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((v0)this.t(((w0)object0), ((g)object1))).v(Ab.t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new v0(this.e0, this.f0, this.g0, g0);
        g1.d0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                w w0 = new w(this.g0, 21, ((w0)this.d0));
                this.c0 = 1;
                return b0.c(0.0f, this.e0, this.f0, w0, this, 4) == object1 ? object1 : Ab.t.a;
            }
            case 1: {
                f.b0(object0);
                return Ab.t.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

