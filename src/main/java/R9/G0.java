package R9;

import Ab.t;
import Eb.a;
import Fb.j;
import Na.p;
import W5.f;
import Xb.G;
import Xb.J;
import Xb.V;
import com.wave.customer.CustomerApp;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class g0 extends j implements Function2 {
    public int c0;
    public final CustomerApp d0;
    public final String e0;

    public g0(CustomerApp customerApp0, String s, g g0) {
        this.d0 = customerApp0;
        this.e0 = s;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((g0)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new g0(this.d0, this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                Nb.j.f(this.d0, "context");
                new p(this.d0).b();
                f0 f00 = new f0(this.d0, this.e0, null);
                this.c0 = 1;
                return J.y(V.c, f00, this) == object1 ? object1 : t.a;
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

