package I;

import Ab.t;
import Fb.j;
import W5.f;
import Xb.G;
import Xb.I;
import Xb.J;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import z0.z;

public final class o0 extends j implements Function2 {
    public Object c0;
    public final z d0;
    public final v0 e0;

    public o0(z z0, v0 v00, g g0) {
        this.d0 = z0;
        this.e0 = v00;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((o0)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new o0(this.d0, this.e0, g0);
        g1.c0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        f.b0(object0);
        G g0 = (G)this.c0;
        m0 m00 = new m0(this.d0, this.e0, null);
        J.q(g0, null, I.b0, m00, 1);
        n0 n00 = new n0(this.d0, this.e0, null);
        return J.q(g0, null, I.b0, n00, 1);
    }
}

