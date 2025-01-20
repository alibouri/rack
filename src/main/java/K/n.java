package K;

import Ab.t;
import Fb.j;
import W5.f;
import Xb.G;
import Xb.I0;
import Xb.J;
import Xb.r0;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class n extends j implements Function2 {
    public Object c0;
    public final o d0;

    public n(o o0, g g0) {
        this.d0 = o0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((n)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new n(this.d0, g0);
        g1.c0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        f.b0(object0);
        G g0 = (G)this.c0;
        r0 r00 = (r0)this.d0.a.getAndSet(null);
        AtomicReference atomicReference0 = this.d0.a;
        I0 i00 = J.q(g0, null, null, new m(r00, this.d0, null), 3);
        do {
            if(atomicReference0.compareAndSet(null, i00)) {
                return Boolean.valueOf(true);
            }
        }
        while(atomicReference0.get() == null);
        return Boolean.valueOf(false);
    }
}

