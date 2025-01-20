package la;

import Ab.t;
import Ea.b0;
import U.Z;
import U.l;
import U.p;
import android.support.v4.media.session.a;
import androidx.lifecycle.compose.FlowExtKt;
import com.wave.customer.limits.AccountLimitsParams;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final class b implements Function2 {
    public final j X;
    public final AccountLimitsParams Y;

    public b(j j0, AccountLimitsParams accountLimitsParams0) {
        this.X = j0;
        this.Y = accountLimitsParams0;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
            ((p)object0).K();
            return t.a;
        }
        j j0 = this.X;
        d d0 = (d)FlowExtKt.c(j0.g0, ((p)object0)).getValue();
        ((p)object0).Q(-660786627);
        boolean z = ((p)object0).h(j0);
        Object object2 = ((p)object0).G();
        Z z1 = l.a;
        if(z || object2 == z1) {
            object2 = new b0(0, j0, j.class, "handleCancelClick", "handleCancelClick()Lkotlinx/coroutines/Job;", 8, 24);
            ((p)object0).a0(object2);
        }
        ((p)object0).p(false);
        ((p)object0).Q(0xD89D3B81);
        boolean z2 = ((p)object0).h(j0);
        Object object3 = ((p)object0).G();
        if(z2 || object3 == z1) {
            b0 b00 = new b0(0, j0, j.class, "takeAndUploadIDPhotos", "takeAndUploadIDPhotos()Lkotlinx/coroutines/Job;", 8, 25);
            ((p)object0).a0(b00);
            object3 = b00;
        }
        ((p)object0).p(false);
        ((p)object0).Q(-660782157);
        boolean z3 = ((p)object0).h(j0);
        Object object4 = ((p)object0).G();
        if(z3 || object4 == z1) {
            b0 b01 = new b0(0, j0, j.class, "refetch", "refetch(Z)Lkotlinx/coroutines/Job;", 8, 26);
            ((p)object0).a0(b01);
            object4 = b01;
        }
        ((p)object0).p(false);
        a.a(d0, ((Function0)object2), ((Function0)object3), ((Function0)object4), this.Y.Z, ((p)object0), 0);
        return t.a;
    }
}

