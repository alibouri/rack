package oa;

import Ab.t;
import U.p;
import a.a;
import androidx.compose.runtime.MutableState;
import androidx.lifecycle.compose.FlowExtKt;
import c0.c;
import com.wave.customer.linkedaccounts.typeselect.LinkedAccountTypeSelectActivity;
import kotlin.jvm.functions.Function2;

public final class e implements Function2 {
    public final LinkedAccountTypeSelectActivity X;

    public e(LinkedAccountTypeSelectActivity linkedAccountTypeSelectActivity0) {
        this.X = linkedAccountTypeSelectActivity0;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
            ((p)object0).K();
            return t.a;
        }
        MutableState mutableState0 = FlowExtKt.c(this.X.I().f0, ((p)object0));
        a.g(c.c(0x96C0DFC4, new Aa.t(this.X, 14, mutableState0), ((p)object0)), ((p)object0), 6);
        return t.a;
    }
}

