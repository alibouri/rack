package o9;

import Ab.k;
import Ab.t;
import Bb.q;
import Fb.j;
import W5.f;
import Y8.R9;
import Y8.V8;
import Y8.W8;
import java.util.List;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import t9.a;

public final class a2 extends j implements Function2 {
    public final s2 c0;
    public final V8 d0;

    public a2(s2 s20, V8 v80, g g0) {
        this.c0 = s20;
        this.d0 = v80;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((a2)this.t(((R9)object0), ((g)object1))).v(t.a);
        return t.a;
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new a2(this.c0, this.d0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        W8 w80;
        f.b0(object0);
        V8 v80 = this.d0;
        s2 s20 = this.c0;
        s20.H0 = v80.a;
        do {
            Object object1 = s20.I0.getValue();
            List list0 = (List)object1;
            w80 = v80.a;
        }
        while(!s20.I0.j(object1, w80.d.a));
        do {
            Object object2 = s20.J0.getValue();
            a a0 = (a)object2;
            a a1 = q.l(s20.p().t0, w80.e.a, s20.f0);
        }
        while(!s20.J0.j(object2, a1));
        do {
            Object object3 = s20.M0.getValue();
            ((Boolean)object3).getClass();
        }
        while(!s20.M0.j(object3, Boolean.TRUE));
        k[] arr_k = {new k("flowName", "SMS_CODE_HELP"), new k("screenName", s20.G0)};
        s20.b0.a("support channels modal displayed", arr_k);
        return t.a;
    }
}

