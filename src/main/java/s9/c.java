package s9;

import Aa.r;
import Ab.t;
import Bb.z;
import Ea.b0;
import Nb.h;
import U.Z;
import U.l;
import U.p;
import androidx.compose.runtime.MutableState;
import androidx.lifecycle.compose.FlowExtKt;
import com.sendwave.util.supportChannels.SupportChannelsModalComposeView;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import pa.m;
import t9.a;

public final class c implements Function2 {
    public final SupportChannelsModalComposeView X;

    public c(SupportChannelsModalComposeView supportChannelsModalComposeView0) {
        this.X = supportChannelsModalComposeView0;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
            ((p)object0).K();
            return t.a;
        }
        f f0 = (f)this.X.getItem().getValue();
        if(f0 != null) {
            MutableState mutableState0 = FlowExtKt.a(f0.e(), z.X, ((p)object0));
            MutableState mutableState1 = FlowExtKt.a(f0.i(), null, ((p)object0));
            MutableState mutableState2 = FlowExtKt.a(f0.j(), Boolean.FALSE, ((p)object0));
            MutableState mutableState3 = FlowExtKt.c(f0.c(), ((p)object0));
            List list0 = (List)mutableState0.getValue();
            a a0 = (a)mutableState1.getValue();
            boolean z = ((Boolean)mutableState2.getValue()).booleanValue();
            boolean z1 = ((Boolean)mutableState3.getValue()).booleanValue();
            ((p)object0).Q(0x38947636);
            boolean z2 = ((p)object0).h(f0);
            Object object2 = ((p)object0).G();
            Z z3 = l.a;
            if(z2 || object2 == z3) {
                object2 = new r(1, f0, f.class, "onSendSupportMessageClicked", "onSendSupportMessageClicked(Lcom/sendwave/backend/fragment/SupportChannelsFragment$SupportChannel;)Lkotlinx/coroutines/Job;", 8, 13);
                ((p)object0).a0(object2);
            }
            ((p)object0).p(false);
            ((p)object0).Q(0x38947FB4);
            boolean z4 = ((p)object0).h(f0);
            Object object3 = ((p)object0).G();
            if(z4 || object3 == z3) {
                b0 b00 = new b0(0, f0, f.class, "onModalCallSupportClicked", "onModalCallSupportClicked()Lkotlinx/coroutines/Job;", 8, 28);
                ((p)object0).a0(b00);
                object3 = b00;
            }
            ((p)object0).p(false);
            ((p)object0).Q(0x3894886B);
            boolean z5 = ((p)object0).h(f0);
            Object object4 = ((p)object0).G();
            if(z5 || object4 == z3) {
                m m0 = new m(0, f0, f.class, "onModalDismissed", "onModalDismissed()V", 0, 28);
                ((p)object0).a0(m0);
                object4 = m0;
            }
            ((p)object0).p(false);
            android.support.v4.media.session.a.m(list0, a0, z, z1, ((Function1)object2), ((Function0)object3), ((Function0)(((h)object4))), ((p)object0), 0);
        }
        return t.a;
    }
}

