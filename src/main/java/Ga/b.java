package ga;

import Aa.r;
import Ab.t;
import Ea.b0;
import U.Z;
import U.l;
import U.p;
import androidx.lifecycle.compose.FlowExtKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class b implements Function2 {
    public final k X;

    public b(k k0) {
        this.X = k0;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
            ((p)object0).K();
            return t.a;
        }
        k k0 = this.X;
        Object object2 = FlowExtKt.c(k0.b0, ((p)object0)).getValue();
        ((p)object0).Q(1011147053);
        boolean z = ((p)object0).h(k0);
        Object object3 = ((p)object0).G();
        Z z1 = l.a;
        if(z || object3 == z1) {
            r r0 = new r(1, k0, k.class, "handleAction", "handleAction(Ljava/lang/String;)Lkotlinx/coroutines/Job;", 8, 10);
            ((p)object0).a0(r0);
            object3 = r0;
        }
        ((p)object0).p(false);
        ((p)object0).Q(1011148850);
        boolean z2 = ((p)object0).h(k0);
        Object object4 = ((p)object0).G();
        if(z2 || object4 == z1) {
            b0 b00 = new b0(0, k0, k.class, "handleCancelClick", "handleCancelClick()Lkotlinx/coroutines/Job;", 8, 20);
            ((p)object0).a0(b00);
            object4 = b00;
        }
        ((p)object0).p(false);
        c.a(((f)object2), ((Function0)object4), ((Function1)object3), ((p)object0), 0);
        return t.a;
    }
}

