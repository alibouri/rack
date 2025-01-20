package ia;

import Aa.x;
import Ab.t;
import I2.J;
import N9.c;
import N9.d;
import U.l;
import U.p;
import c0.b;
import com.sendwave.backend.type.TooltipTarget.HOME_SETTINGS;
import ha.d0;
import ha.n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final class k implements Function2 {
    public final d X;
    public final n Y;

    public k(d d0, n n0) {
        this.X = d0;
        this.Y = n0;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        d d1;
        if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
            ((p)object0).K();
            return t.a;
        }
        d d0 = this.X;
        if(d0 == null) {
            d1 = null;
        }
        else {
            c c0 = J.A(HOME_SETTINGS.X);
            d1 = d0.b.equals(c0) ? d0 : null;
        }
        ((p)object0).Q(0x525B933B);
        n n0 = this.Y;
        boolean z = ((p)object0).h(n0);
        Object object2 = ((p)object0).G();
        if(z || object2 == l.a) {
            object2 = new d0(n0, 3);
            ((p)object0).a0(object2);
        }
        ((p)object0).p(false);
        b b0 = c0.c.c(355155030, new x(16, n0), ((p)object0));
        yc.l.i(d1, null, 0, ((Function0)object2), n0.g, n0.h, b0, ((p)object0), 0x180008, 6);
        return t.a;
    }
}

