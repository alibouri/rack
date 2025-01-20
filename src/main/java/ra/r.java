package ra;

import Aa.A;
import Ab.t;
import C.E;
import Nb.j;
import Q4.i;
import U.N0;
import U.d;
import U.l;
import U.p;
import com.sendwave.backend.type.PaymentCardKind.PREPAID;
import io.sentry.g1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import v.f;

public final class r implements Function2 {
    public final N X;
    public final Function0 Y;
    public final g1 Z;
    public final E b0;

    public r(N n0, Function0 function00, g1 g10, E e0) {
        this.X = n0;
        this.Y = function00;
        this.Z = g10;
        this.b0 = e0;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
            ((p)object0).K();
            return t.a;
        }
        N n0 = this.X;
        if(!j.a((n0.b == null ? null : n0.b.h), PREPAID.X)) {
            ((p)object0).Q(0xDE81B4E7);
            ((p)object0).Q(0x17B19F83);
            Object object2 = ((p)object0).G();
            if(object2 == l.a) {
                object2 = d.w(new A(this.b0, 7));
                ((p)object0).a0(object2);
            }
            ((p)object0).p(false);
            float f = ((a1.d)f.a(((a1.d)((N0)object2).getValue()).X, null, "Toolbar elevation dp animation", ((p)object0), 0x180, 10).getValue()).X;
            T4.l.u(n0.s, this.Y, f, ((p)object0), 0);
            ((p)object0).p(false);
            return t.a;
        }
        ((p)object0).Q(0xDE8B034D);
        O0.f f1 = n0.v == null ? new O0.f(6, "--", null) : q9.N0.b(n0.v);
        i.e(n0.s, 0x7F0801E9, f1, this.Z, this.Y, 0L, 0L, true, ((p)object0), 0xC01000, 0x60);  // drawable:ic_button_card
        ((p)object0).p(false);
        return t.a;
    }
}

