package da;

import Ab.o;
import Ab.t;
import Ea.b0;
import U.Z;
import U.l;
import U.p;
import Z6.b;
import androidx.lifecycle.compose.FlowExtKt;
import com.wave.customer.deviceapproval.DeviceApprovalRequiredActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final class g implements Function2 {
    public final DeviceApprovalRequiredActivity X;

    public g(DeviceApprovalRequiredActivity deviceApprovalRequiredActivity0) {
        this.X = deviceApprovalRequiredActivity0;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
            ((p)object0).K();
            return t.a;
        }
        j j0 = (j)FlowExtKt.c(((q)this.X.F0.getValue()).g0, ((p)object0)).getValue();
        o o0 = this.X.F0;
        Object object2 = o0.getValue();
        ((p)object0).Q(0xEFC5B1EF);
        boolean z = ((p)object0).h(((q)object2));
        Object object3 = ((p)object0).G();
        Z z1 = l.a;
        if(z || object3 == z1) {
            b0 b00 = new b0(0, ((q)object2), q.class, "handleCancelClick", "handleCancelClick()Lkotlinx/coroutines/Job;", 8, 17);
            ((p)object0).a0(b00);
            object3 = b00;
        }
        ((p)object0).p(false);
        q q0 = (q)o0.getValue();
        ((p)object0).Q(0xEFC5BAD4);
        boolean z2 = ((p)object0).h(q0);
        Object object4 = ((p)object0).G();
        if(z2 || object4 == z1) {
            object4 = new b0(0, q0, q.class, "handleCallSupportClick", "handleCallSupportClick()Lkotlinx/coroutines/Job;", 8, 18);
            ((p)object0).a0(object4);
        }
        ((p)object0).p(false);
        b.c(j0, ((Function0)object3), ((Function0)object4), ((p)object0), 0);
        return t.a;
    }
}

