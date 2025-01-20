package pa;

import Ab.t;
import Nb.h;
import Nb.j;
import Pb.a;
import U.Z;
import U.l;
import U.p;
import androidx.lifecycle.compose.FlowExtKt;
import com.wave.customer.nearbyagents.NearbyAgentsActivity;
import ha.a0;
import ha.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class n implements Function2 {
    public final NearbyAgentsActivity X;

    public n(NearbyAgentsActivity nearbyAgentsActivity0) {
        this.X = nearbyAgentsActivity0;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
            ((p)object0).K();
            return t.a;
        }
        NearbyAgentsActivity nearbyAgentsActivity0 = this.X;
        D d0 = nearbyAgentsActivity0.L0;
        if(d0 != null) {
            z z0 = (z)FlowExtKt.c(d0.d0, ((p)object0)).getValue();
            D d1 = nearbyAgentsActivity0.L0;
            if(d1 != null) {
                ((p)object0).Q(0xF692FDFD);
                boolean z1 = ((p)object0).h(d1);
                Object object2 = ((p)object0).G();
                Z z2 = l.a;
                if(z1 || object2 == z2) {
                    object2 = new a0(0, d1, D.class, "onGrantLocationPermissionClicked", "onGrantLocationPermissionClicked()V", 0, 26);
                    ((p)object0).a0(object2);
                }
                ((p)object0).p(false);
                ((p)object0).Q(0xF6930963);
                NearbyAgentsActivity nearbyAgentsActivity1 = this.X;
                boolean z3 = ((p)object0).h(nearbyAgentsActivity1);
                Object object3 = ((p)object0).G();
                if(z3 || object3 == z2) {
                    a0 a00 = new a0(0, nearbyAgentsActivity1, NearbyAgentsActivity.class, "openAppSettings", "openAppSettings()V", 0, 27);
                    ((p)object0).a0(a00);
                    object3 = a00;
                }
                ((p)object0).p(false);
                D d2 = nearbyAgentsActivity0.L0;
                if(d2 != null) {
                    ((p)object0).Q(0xF6931194);
                    boolean z4 = ((p)object0).h(d2);
                    Object object4 = ((p)object0).G();
                    if(z4 || object4 == z2) {
                        a0 a01 = new a0(0, d2, D.class, "onEnableLocationClicked", "onEnableLocationClicked()V", 0, 28);
                        ((p)object0).a0(a01);
                        object4 = a01;
                    }
                    ((p)object0).p(false);
                    ((p)object0).Q(0xF6931AA9);
                    NearbyAgentsActivity nearbyAgentsActivity2 = this.X;
                    boolean z5 = ((p)object0).h(nearbyAgentsActivity2);
                    Object object5 = ((p)object0).G();
                    if(z5 || object5 == z2) {
                        m m0 = new m(1, nearbyAgentsActivity2, NearbyAgentsActivity.class, "openDirectionsToAgent", "openDirectionsToAgent(Lcom/wave/customer/nearbyagents/NearbyAgent;)V", 0, 17);
                        ((p)object0).a0(m0);
                        object5 = m0;
                    }
                    ((p)object0).p(false);
                    D d3 = nearbyAgentsActivity0.L0;
                    if(d3 != null) {
                        ((p)object0).Q(0xF693226B);
                        boolean z6 = ((p)object0).h(d3);
                        Object object6 = ((p)object0).G();
                        if(z6 || object6 == z2) {
                            object6 = new a0(0, d3, D.class, "onRetryClicked", "onRetryClicked()V", 0, 29);
                            ((p)object0).a0(object6);
                        }
                        ((p)object0).p(false);
                        ((p)object0).Q(0xF6932B01);
                        NearbyAgentsActivity nearbyAgentsActivity3 = this.X;
                        boolean z7 = ((p)object0).h(nearbyAgentsActivity3);
                        Object object7 = ((p)object0).G();
                        if(z7 || object7 == z2) {
                            object7 = new pa.m(0, nearbyAgentsActivity3, NearbyAgentsActivity.class, "onBackPressed", "onBackPressed()V", 0, 0);
                            ((p)object0).a0(object7);
                        }
                        ((p)object0).p(false);
                        a.j(z0, ((Function0)(((h)object2))), ((Function0)(((h)object3))), ((Function0)(((h)object4))), ((Function1)(((h)object5))), ((Function0)(((h)object6))), ((Function0)(((h)object7))), ((p)object0), 0);
                        return t.a;
                    }
                    j.p("viewModel");
                    throw null;
                }
                j.p("viewModel");
                throw null;
            }
            j.p("viewModel");
            throw null;
        }
        j.p("viewModel");
        throw null;
    }
}

