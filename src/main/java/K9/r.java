package K9;

import Ab.t;
import Ha.f;
import N9.d;
import N9.n;
import Nb.h;
import U.Z;
import U.l;
import U.p;
import androidx.compose.runtime.MutableState;
import androidx.lifecycle.compose.FlowExtKt;
import com.wave.components.sendmoney.ScanToSendButton;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final class r implements Function2 {
    public final ScanToSendButton X;

    public r(ScanToSendButton scanToSendButton0) {
        this.X = scanToSendButton0;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
            ((p)object0).K();
            return t.a;
        }
        K9.p p0 = (K9.p)this.X.getItem().getValue();
        if(p0 != null) {
            ((p)object0).Q(-1362123400);
            n n0 = p0.f0;
            if(n0 != null) {
                MutableState mutableState0 = FlowExtKt.c(n0.f, ((p)object0));
                ((p)object0).Q(-1011608287);
                k k0 = p0.d0;
                boolean z = ((p)object0).h(k0);
                Object object2 = ((p)object0).G();
                Z z1 = l.a;
                if(z || object2 == z1) {
                    object2 = new f(0, k0, k.class, "onScanToSendClicked", "onScanToSendClicked()V", 0, 4);
                    ((p)object0).a0(object2);
                }
                ((p)object0).p(false);
                d d0 = (d)mutableState0.getValue();
                ((p)object0).Q(-1011604476);
                boolean z2 = ((p)object0).h(n0);
                Object object3 = ((p)object0).G();
                if(z2 || object3 == z1) {
                    object3 = new f(0, n0, n.class, "onTooltipClicked", "onTooltipClicked()V", 0, 5);
                    ((p)object0).a0(object3);
                }
                ((p)object0).p(false);
                ((p)object0).Q(-1011601882);
                boolean z3 = ((p)object0).h(n0);
                Object object4 = ((p)object0).G();
                if(z3 || object4 == z1) {
                    object4 = new f(0, n0, n.class, "onTooltipDismissed", "onTooltipDismissed()V", 0, 6);
                    ((p)object0).a0(object4);
                }
                ((p)object0).p(false);
                ((p)object0).Q(-1011599294);
                boolean z4 = ((p)object0).h(n0);
                Object object5 = ((p)object0).G();
                if(z4 || object5 == z1) {
                    f f0 = new f(0, n0, n.class, "onTooltipShown", "onTooltipShown()V", 0, 7);
                    ((p)object0).a0(f0);
                    object5 = f0;
                }
                ((p)object0).p(false);
                u.a(((Function0)(((h)object2))), d0, ((Function0)(((h)object3))), ((Function0)(((h)object4))), ((Function0)(((h)object5))), ((p)object0), 0x40);
            }
            ((p)object0).p(false);
        }
        return t.a;
    }
}

