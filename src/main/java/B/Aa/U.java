package Aa;

import Ab.t;
import U.l;
import U.p;
import a.a;
import androidx.compose.runtime.MutableState;
import androidx.lifecycle.compose.FlowExtKt;
import c0.c;
import com.wave.customer.savings.SavingsActivity;
import hb.A;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class u implements Function2 {
    public final SavingsActivity X;

    public u(SavingsActivity savingsActivity0) {
        this.X = savingsActivity0;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
            ((p)object0).K();
            return t.a;
        }
        MutableState mutableState0 = FlowExtKt.c(SavingsActivity.I(this.X).k0, ((p)object0));
        a.g(c.c(0x69E9E598, new Aa.t(this.X, 0, mutableState0), ((p)object0)), ((p)object0), 6);
        c0 c00 = (c0)mutableState0.getValue();
        ((p)object0).Q(-1927801350);
        Object object2 = ((p)object0).G();
        if(object2 == l.a) {
            object2 = new Aa.p(0);
            ((p)object0).a0(object2);
        }
        ((p)object0).p(false);
        A.a(c00, ((Function1)object2), ((p)object0), 0x30);
        return t.a;
    }
}

