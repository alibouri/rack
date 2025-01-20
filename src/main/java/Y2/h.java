package Y2;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import Xb.J;
import Xb.N;
import dc.o;
import i3.i;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class h extends j implements Function2 {
    public int c0;
    public Object d0;
    public final i e0;
    public final m f0;

    public h(m m0, i i0, g g0) {
        this.e0 = i0;
        this.f0 = m0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((h)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new h(this.f0, this.e0, g0);
        g1.d0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                G g0 = (G)this.d0;
                Y2.g g1 = new Y2.g(this.f0, this.e0, null);
                N n0 = J.d(g0, o.a.d0, g1, 2);
                m3.g.c(((k3.a)this.e0.c).Y).a();
                this.c0 = 1;
                object0 = n0.A(this);
                return object0 == object1 ? object1 : object0;
            }
            case 1: {
                f.b0(object0);
                return object0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

