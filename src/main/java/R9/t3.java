package R9;

import Ab.k;
import Ab.t;
import Bb.F;
import Bb.q;
import Fb.j;
import W5.f;
import Y8.R9;
import Y8.V8;
import ac.B0;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import t9.a;

public final class t3 extends j implements Function2 {
    public final y3 c0;
    public final V8 d0;

    public t3(y3 y30, V8 v80, g g0) {
        this.c0 = y30;
        this.d0 = v80;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((t3)this.t(((R9)object0), ((g)object1))).v(t.a);
        return t.a;
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new t3(this.c0, this.d0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        V8 v81;
        f.b0(object0);
        y3 y30 = this.c0;
        B0 b00 = y30.m0;
        do {
            Object object1 = b00.getValue();
            V8 v80 = (V8)object1;
            v81 = this.d0;
        }
        while(!b00.j(object1, v81));
        do {
            Object object2 = y30.n0.getValue();
            List list0 = (List)object2;
        }
        while(!y30.n0.j(object2, v81.a.d.a));
        do {
            Object object3 = y30.o0.getValue();
            a a0 = (a)object3;
            a a1 = q.l(y30.c0.t0, v81.a.e.a, y30.f0);
        }
        while(!y30.o0.j(object3, a1));
        Boolean boolean0 = Boolean.TRUE;
        y30.r0.getClass();
        y30.r0.l(null, boolean0);
        Map map0 = F.K(new k[]{new k("flowName", "ACCOUNT_ACCESS"), new k("screenName", y30.l0)});
        y30.d0.d("support channels modal displayed", map0);
        return t.a;
    }
}

