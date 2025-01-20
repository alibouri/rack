package ea;

import Aa.r;
import Ab.t;
import Ea.b0;
import U.Z;
import U.l;
import U.p;
import androidx.lifecycle.compose.FlowExtKt;
import hb.h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class d implements Function2 {
    public final k X;

    public d(k k0) {
        this.X = k0;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
            ((p)object0).K();
            return t.a;
        }
        k k0 = this.X;
        f f0 = (f)FlowExtKt.c(k0.e0, ((p)object0)).getValue();
        ((p)object0).Q(-607631538);
        boolean z = ((p)object0).h(k0);
        Object object2 = ((p)object0).G();
        Z z1 = l.a;
        if(z || object2 == z1) {
            object2 = new b0(0, k0, k.class, "handleCancelClick", "handleCancelClick()Lkotlinx/coroutines/Job;", 8, 19);
            ((p)object0).a0(object2);
        }
        ((p)object0).p(false);
        ((p)object0).Q(0xDBC84FCF);
        boolean z2 = ((p)object0).h(k0);
        Object object3 = ((p)object0).G();
        if(z2 || object3 == z1) {
            object3 = new r(1, k0, k.class, "handleSwitchToggle", "handleSwitchToggle(Z)Lkotlinx/coroutines/Job;", 8, 9);
            ((p)object0).a0(object3);
        }
        ((p)object0).p(false);
        ((p)object0).Q(-607627356);
        boolean z3 = ((p)object0).h(k0);
        Object object4 = ((p)object0).G();
        if(z3 || object4 == z1) {
            Ha.f f1 = new Ha.f(0, k0, k.class, "refetch", "refetch()V", 0, 22);
            ((p)object0).a0(f1);
            object4 = f1;
        }
        ((p)object0).p(false);
        ((p)object0).Q(0xDBC85F0D);
        boolean z4 = ((p)object0).h(k0);
        Object object5 = ((p)object0).G();
        if(z4 || object5 == z1) {
            Ha.f f2 = new Ha.f(0, k0, k.class, "onSnackDismissed", "onSnackDismissed()V", 0, 23);
            ((p)object0).a0(f2);
            object5 = f2;
        }
        ((p)object0).p(false);
        h.m(f0, ((Function0)object2), ((Function1)object3), ((Function0)(((Nb.h)object4))), ((Function0)(((Nb.h)object5))), ((p)object0), 0, 0);
        return t.a;
    }
}

