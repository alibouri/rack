package sa;

import Ab.t;
import Nb.j;
import U.Z;
import U.l;
import U.p;
import androidx.lifecycle.compose.FlowExtKt;
import c.L;
import com.wave.customer.paymentcards.recharge.RechargeCardActivity;
import io.sentry.config.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class h implements Function2 {
    public final RechargeCardActivity X;

    public h(RechargeCardActivity rechargeCardActivity0) {
        this.X = rechargeCardActivity0;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
            ((p)object0).K();
            return t.a;
        }
        RechargeCardActivity rechargeCardActivity0 = this.X;
        m m0 = rechargeCardActivity0.F0;
        if(m0 != null) {
            i i0 = (i)FlowExtKt.c(m0.c0, ((p)object0)).getValue();
            L l0 = rechargeCardActivity0.c();
            ((p)object0).Q(0x4EDAA0E9);
            boolean z = ((p)object0).h(l0);
            Object object2 = ((p)object0).G();
            Z z1 = l.a;
            if(z || object2 == z1) {
                pa.m m1 = new pa.m(0, l0, L.class, "onBackPressed", "onBackPressed()V", 0, 29);
                ((p)object0).a0(m1);
                object2 = m1;
            }
            ((p)object0).p(false);
            m m2 = rechargeCardActivity0.F0;
            if(m2 != null) {
                ((p)object0).Q(0x4EDAAA96);
                boolean z2 = ((p)object0).h(m2);
                Object object3 = ((p)object0).G();
                if(z2 || object3 == z1) {
                    object3 = new ha.m(1, m2, m.class, "onAmountChanged", "onAmountChanged(Lcom/sendwave/models/CurrencyAmount;)V", 0, 25);
                    ((p)object0).a0(object3);
                }
                ((p)object0).p(false);
                m m3 = rechargeCardActivity0.F0;
                if(m3 != null) {
                    ((p)object0).Q(1322955320);
                    boolean z3 = ((p)object0).h(m3);
                    Object object4 = ((p)object0).G();
                    if(z3 || object4 == z1) {
                        object4 = new g(0, m3, m.class, "onRechargeClicked", "onRechargeClicked()V", 0, 0);
                        ((p)object0).a0(object4);
                    }
                    ((p)object0).p(false);
                    a.h(i0, ((Function0)(((Nb.h)object2))), ((Function1)(((Nb.h)object3))), ((Function0)(((Nb.h)object4))), ((p)object0), 0);
                    return t.a;
                }
                j.p("vm");
                throw null;
            }
            j.p("vm");
            throw null;
        }
        j.p("vm");
        throw null;
    }
}

