package Ea;

import Aa.q;
import Aa.r;
import Aa.s;
import Ab.t;
import C3.i;
import Nb.h;
import U.Z;
import U.l;
import U.p;
import androidx.lifecycle.compose.FlowExtKt;
import com.wave.customer.scratchCardRewards.ScratchCardRewardsActivity;
import com.wave.customer.scratchCardRewards.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class c0 implements Function2 {
    public final O0 X;
    public final ScratchCardRewardsActivity Y;
    public final i Z;

    public c0(O0 o00, ScratchCardRewardsActivity scratchCardRewardsActivity0, i i0) {
        this.X = o00;
        this.Y = scratchCardRewardsActivity0;
        this.Z = i0;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        P0 p01;
        if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
            ((p)object0).K();
            return t.a;
        }
        O0 o00 = this.X;
        P0 p00 = (P0)FlowExtKt.c(o00.g0, ((p)object0)).getValue();
        ((p)object0).Q(0x9B0FE361);
        ScratchCardRewardsActivity scratchCardRewardsActivity0 = this.Y;
        boolean z = ((p)object0).f(scratchCardRewardsActivity0);
        Object object2 = ((p)object0).G();
        Z z1 = l.a;
        if(z || object2 == z1) {
            object2 = new q(0, scratchCardRewardsActivity0, ScratchCardRewardsActivity.class, "onBackPressed", "onBackPressed()V", 0, 23);
            ((p)object0).a0(object2);
        }
        ((p)object0).p(false);
        ((p)object0).Q(0x9B0FEB8C);
        boolean z2 = ((p)object0).h(o00);
        Object object3 = ((p)object0).G();
        if(z2 || object3 == z1) {
            r r0 = new r(1, o00, O0.class, "onRewardClicked", "onRewardClicked(Lcom/wave/customer/scratchCardRewards/ScratchCard$Unlocked;)Lkotlinx/coroutines/Job;", 8, 3);
            ((p)object0).a0(r0);
            object3 = r0;
        }
        ((p)object0).p(false);
        ((p)object0).Q(0x9B0FF526);
        boolean z3 = ((p)object0).h(o00);
        Object object4 = ((p)object0).G();
        if(z3 || object4 == z1) {
            s s0 = new s(1, o00, O0.class, "focusCard", "focusCard(Lcom/wave/customer/scratchCardRewards/ScratchCard$WithDetails;)V", 0, 5);
            ((p)object0).a0(s0);
            object4 = s0;
        }
        ((p)object0).p(false);
        ((p)object0).Q(0x9B0FFE4D);
        boolean z4 = ((p)object0).h(o00);
        Object object5 = ((p)object0).G();
        if(z4 || object5 == z1) {
            p01 = p00;
            q q0 = new q(0, o00, O0.class, "dismissFocusCard", "dismissFocusCard()V", 0, 24);
            ((p)object0).a0(q0);
            object5 = q0;
        }
        else {
            p01 = p00;
        }
        ((p)object0).p(false);
        ((p)object0).Q(0x9B1007D1);
        boolean z5 = ((p)object0).h(o00);
        Object object6 = ((p)object0).G();
        if(z5 || object6 == z1) {
            r r1 = new r(1, o00, O0.class, "onRewardsPathClicked", "onRewardsPathClicked(Lcom/wave/customer/scratchCardRewards/components/RewardsPathState;)Lkotlinx/coroutines/Job;", 8, 4);
            ((p)object0).a0(r1);
            object6 = r1;
        }
        ((p)object0).p(false);
        ((p)object0).Q(0x9B101124);
        boolean z6 = ((p)object0).h(o00);
        Object object7 = ((p)object0).G();
        if(z6 || object7 == z1) {
            b0 b00 = new b0(0, o00, O0.class, "refresh", "refresh()Lkotlinx/coroutines/Job;", 8, 0);
            ((p)object0).a0(b00);
            object7 = b00;
        }
        ((p)object0).p(false);
        j.e(p01, new f0(((Function0)(((h)object2))), ((Function1)object3), ((Function1)(((h)object4))), ((Function0)(((h)object5))), ((Function1)object6), ((Function0)object7)), null, this.Z, null, ((p)object0), 0x1000, 20);
        return t.a;
    }
}

