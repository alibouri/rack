package za;

import Ab.t;
import Pb.a;
import U.Z;
import U.l;
import U.p;
import androidx.lifecycle.compose.FlowExtKt;
import com.wave.customer.risk.ussdsecuritychallenge.UssdSecurityChallengeActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import sa.g;

public final class h implements Function2 {
    public final UssdSecurityChallengeActivity X;

    public h(UssdSecurityChallengeActivity ussdSecurityChallengeActivity0) {
        this.X = ussdSecurityChallengeActivity0;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
            ((p)object0).K();
            return t.a;
        }
        UssdSecurityChallengeActivity ussdSecurityChallengeActivity0 = this.X;
        q q0 = (q)FlowExtKt.c(ussdSecurityChallengeActivity0.I().g0, ((p)object0)).getValue();
        ((p)object0).Q(0xB0F6E406);
        UssdSecurityChallengeActivity ussdSecurityChallengeActivity1 = this.X;
        boolean z = ((p)object0).h(ussdSecurityChallengeActivity1);
        Object object2 = ((p)object0).G();
        Z z1 = l.a;
        if(z || object2 == z1) {
            object2 = new g(0, ussdSecurityChallengeActivity1, UssdSecurityChallengeActivity.class, "executeUSSD", "executeUSSD()V", 0, 13);
            ((p)object0).a0(object2);
        }
        ((p)object0).p(false);
        z z2 = ussdSecurityChallengeActivity0.I();
        ((p)object0).Q(0xB0F6EAD1);
        boolean z3 = ((p)object0).h(z2);
        Object object3 = ((p)object0).G();
        if(z3 || object3 == z1) {
            ya.g g0 = new ya.g(0, z2, z.class, "launchDialSupport", "launchDialSupport()Lkotlinx/coroutines/Job;", 8, 1);
            ((p)object0).a0(g0);
            object3 = g0;
        }
        ((p)object0).p(false);
        ((p)object0).Q(0xB0F6F361);
        UssdSecurityChallengeActivity ussdSecurityChallengeActivity2 = this.X;
        boolean z4 = ((p)object0).h(ussdSecurityChallengeActivity2);
        Object object4 = ((p)object0).G();
        if(z4 || object4 == z1) {
            g g1 = new g(0, ussdSecurityChallengeActivity2, UssdSecurityChallengeActivity.class, "finish", "finish()V", 0, 14);
            ((p)object0).a0(g1);
            object4 = g1;
        }
        ((p)object0).p(false);
        z z5 = ussdSecurityChallengeActivity0.I();
        ((p)object0).Q(0xB0F6F9D7);
        boolean z6 = ((p)object0).h(z5);
        Object object5 = ((p)object0).G();
        if(z6 || object5 == z1) {
            ya.g g2 = new ya.g(0, z5, z.class, "copyUssdCodeToClipboard", "copyUssdCodeToClipboard()Lkotlinx/coroutines/Job;", 8, 2);
            ((p)object0).a0(g2);
            object5 = g2;
        }
        ((p)object0).p(false);
        a.o(q0, ((Function0)(((Nb.h)object2))), ((Function0)object3), ((Function0)(((Nb.h)object4))), ((Function0)object5), ((p)object0), 0);
        return t.a;
    }
}

