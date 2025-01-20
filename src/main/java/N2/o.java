package N2;

import I2.A;
import Nb.j;
import R2.p;
import Xb.H;
import Xb.J;
import Xb.u0;
import kotlin.coroutines.CoroutineContext.Element.DefaultImpls;

public abstract class o {
    public static final String a;
    public static final long b;

    static {
        String s = A.g("WorkConstraintsTracker");
        j.e(s, "tagWithPrefix(\"WorkConstraintsTracker\")");
        o.a = s;
        o.b = 1000L;
    }

    public static final u0 a(m m0, p p0, Xb.A a0, i i0) {
        j.f(m0, "<this>");
        j.f(a0, "dispatcher");
        j.f(i0, "listener");
        u0 u00 = J.b();
        J.q(H.a(DefaultImpls.d(a0, u00)), null, null, new n(m0, p0, i0, null), 3);
        return u00;
    }
}

