package Ba;

import Ab.t;
import U.p;
import a.a;
import androidx.compose.runtime.MutableState;
import androidx.lifecycle.compose.FlowExtKt;
import c0.c;
import com.wave.customer.savings.deposit.DepositSavingsActivity;
import kotlin.jvm.functions.Function2;

public final class f implements Function2 {
    public final DepositSavingsActivity X;

    public f(DepositSavingsActivity depositSavingsActivity0) {
        this.X = depositSavingsActivity0;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
            ((p)object0).K();
            return t.a;
        }
        MutableState mutableState0 = FlowExtKt.c(((q)this.X.F0.getValue()).c0, ((p)object0));
        a.g(c.c(414614190, new Aa.t(this.X, 1, mutableState0), ((p)object0)), ((p)object0), 6);
        return t.a;
    }
}

