package Aa;

import Ab.o;
import B.B;
import B.v0;
import B.x0;
import B.y0;
import B.z;
import Ba.k;
import Ea.O;
import Ea.P;
import Ea.Q;
import Ea.S;
import Ea.b0;
import F0.j;
import M.J;
import N.R1;
import N.k0;
import N.m2;
import O0.G;
import R2.f;
import U.Z;
import U.g0;
import U.l;
import U.p;
import a5.w;
import android.content.DialogInterface;
import android.support.v4.media.session.a;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import c.L;
import c0.c;
import com.wave.customer.limits.AccountLimitsParams;
import com.wave.customer.linkedaccounts.typeselect.LinkedAccountTypeSelectActivity;
import com.wave.customer.overdraft.OverdraftActivity;
import com.wave.customer.paymentcards.PaymentCardsActivity;
import com.wave.customer.savings.SavingsActivity;
import com.wave.customer.savings.deposit.DepositSavingsActivity;
import com.wave.customer.savings.withdraw.WithdrawSavingsActivity;
import com.wave.customer.scratchCardRewards.RedeemScratchCardActivity;
import com.wave.customer.scratchCardRewards.ScratchCard.Unlocked;
import com.wave.customer.scratchCardRewards.g;
import g0.b;
import g0.e;
import ha.a0;
import ha.m;
import java.util.List;
import jb.n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import n0.M;
import n0.v;
import oa.h;
import oa.i;
import q9.V0;
import q9.l1;
import u9.u;
import yc.d;

public final class t implements Function2 {
    public final int X;
    public final Object Y;
    public final Object Z;

    public t(Object object0, int v, Object object1) {
        this.X = v;
        this.Z = object0;
        this.Y = object1;
        super();
    }

    private final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
            ((p)object0).K();
            return Ab.t.a;
        }
        i i0 = (i)((MutableState)this.Y).getValue();
        LinkedAccountTypeSelectActivity linkedAccountTypeSelectActivity0 = (LinkedAccountTypeSelectActivity)this.Z;
        oa.t t0 = linkedAccountTypeSelectActivity0.I();
        ((p)object0).Q(0x5695AEFB);
        boolean z = ((p)object0).h(t0);
        Object object2 = ((p)object0).G();
        Z z1 = l.a;
        if(z || object2 == z1) {
            object2 = new b0(0, t0, oa.t.class, "handleCancelClick", "handleCancelClick()Lkotlinx/coroutines/Job;", 8, 27);
            ((p)object0).a0(object2);
        }
        ((p)object0).p(false);
        oa.t t1 = linkedAccountTypeSelectActivity0.I();
        ((p)object0).Q(0x5695B706);
        boolean z2 = ((p)object0).h(t1);
        Object object3 = ((p)object0).G();
        if(z2 || object3 == z1) {
            r r0 = new r(1, t1, oa.t.class, "handleLinkedAccountTypeClick", "handleLinkedAccountTypeClick(Lcom/wave/customer/linkedaccounts/typeselect/LinkedAccountType;)Lkotlinx/coroutines/Job;", 8, 12);
            ((p)object0).a0(r0);
            object3 = r0;
        }
        ((p)object0).p(false);
        oa.t t2 = linkedAccountTypeSelectActivity0.I();
        ((p)object0).Q(0x5695C15D);
        boolean z3 = ((p)object0).h(t2);
        Object object4 = ((p)object0).G();
        if(z3 || object4 == z1) {
            m m0 = new m(1, t2, oa.t.class, "onSearchQueryChange", "onSearchQueryChange(Ljava/lang/String;)V", 0, 15);
            ((p)object0).a0(m0);
            object4 = m0;
        }
        ((p)object0).p(false);
        oa.t t3 = linkedAccountTypeSelectActivity0.I();
        ((p)object0).Q(0x5695CA7C);
        boolean z4 = ((p)object0).h(t3);
        Object object5 = ((p)object0).G();
        if(z4 || object5 == z1) {
            a0 a00 = new a0(0, t3, oa.t.class, "onSearchQueryClear", "onSearchQueryClear()V", 0, 24);
            ((p)object0).a0(a00);
            object5 = a00;
        }
        ((p)object0).p(false);
        oa.t t4 = linkedAccountTypeSelectActivity0.I();
        ((p)object0).Q(0x5695D3DF);
        boolean z5 = ((p)object0).h(t4);
        Object object6 = ((p)object0).G();
        if(z5 || object6 == z1) {
            m m1 = new m(1, t4, oa.t.class, "onSearchFilterClicked", "onSearchFilterClicked(Lcom/wave/customer/linkedaccounts/typeselect/LiatFilter;)V", 0, 16);
            ((p)object0).a0(m1);
            object6 = m1;
        }
        ((p)object0).p(false);
        h.b(i0, ((Function0)object2), ((Function1)object3), ((Function1)(((Nb.h)object4))), ((Function0)(((Nb.h)object5))), ((Function1)(((Nb.h)object6))), ((p)object0), 0);
        return Ab.t.a;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        e e0 = b.m;
        float f = 1.0f;
        g0.l l0 = g0.l.X;
        Z z0 = l.a;
        Object object2 = Ab.t.a;
        Object object3 = this.Z;
        Object object4 = this.Y;
        switch(this.X) {
            case 0: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                Object object5 = ((MutableState)object4).getValue();
                L l1 = ((SavingsActivity)object3).c();
                ((p)object0).Q(0xCD79D6C2);
                boolean z1 = ((p)object0).h(l1);
                Object object6 = ((p)object0).G();
                if(z1 || object6 == z0) {
                    object6 = new q(0, l1, L.class, "onBackPressed", "onBackPressed()V", 0, 0);
                    ((p)object0).a0(object6);
                }
                ((p)object0).p(false);
                o o0 = ((SavingsActivity)object3).F0;
                u0 u00 = (u0)o0.getValue();
                ((p)object0).Q(0xCD79E04E);
                boolean z2 = ((p)object0).h(u00);
                Object object7 = ((p)object0).G();
                if(z2 || object7 == z0) {
                    object7 = new q(0, u00, u0.class, "onDepositClick", "onDepositClick()V", 0, 5);
                    ((p)object0).a0(object7);
                }
                ((p)object0).p(false);
                u0 u01 = (u0)o0.getValue();
                ((p)object0).Q(0xCD79E78F);
                boolean z3 = ((p)object0).h(u01);
                Object object8 = ((p)object0).G();
                if(z3 || object8 == z0) {
                    object8 = new q(0, u01, u0.class, "onWithdrawClick", "onWithdrawClick()V", 0, 6);
                    ((p)object0).a0(object8);
                }
                ((p)object0).p(false);
                u0 u02 = (u0)o0.getValue();
                ((p)object0).Q(0xCD79EF52);
                boolean z4 = ((p)object0).h(u02);
                Object object9 = ((p)object0).G();
                if(z4 || object9 == z0) {
                    object9 = new s(1, u02, u0.class, "onTransactionClick", "onTransactionClick-ly-mAIY(Ljava/lang/String;)V", 0, 0);
                    ((p)object0).a0(object9);
                }
                ((p)object0).p(false);
                u0 u03 = (u0)o0.getValue();
                ((p)object0).Q(0xCD79F647);
                boolean z5 = ((p)object0).h(u03);
                Object object10 = ((p)object0).G();
                if(z5 || object10 == z0) {
                    object10 = new q(0, u03, u0.class, "refresh", "refresh()V", 0, 7);
                    ((p)object0).a0(object10);
                }
                ((p)object0).p(false);
                u0 u04 = (u0)o0.getValue();
                ((p)object0).Q(0xCD79FCAF);
                boolean z6 = ((p)object0).h(u04);
                Object object11 = ((p)object0).G();
                if(z6 || object11 == z0) {
                    object11 = new q(0, u04, u0.class, "onSnackbarShown", "onSnackbarShown()V", 0, 8);
                    ((p)object0).a0(object11);
                }
                ((p)object0).p(false);
                u0 u05 = (u0)o0.getValue();
                ((p)object0).Q(0xCD7A040F);
                boolean z7 = ((p)object0).h(u05);
                Object object12 = ((p)object0).G();
                if(z7 || object12 == z0) {
                    object12 = new q(0, u05, u0.class, "onShowMoreClick", "onShowMoreClick()V", 0, 9);
                    ((p)object0).a0(object12);
                }
                ((p)object0).p(false);
                u0 u06 = (u0)o0.getValue();
                ((p)object0).Q(0xCD7A0B90);
                boolean z8 = ((p)object0).h(u06);
                Object object13 = ((p)object0).G();
                if(z8 || object13 == z0) {
                    object13 = new q(0, u06, u0.class, "onLockVaultClick", "onLockVaultClick()V", 0, 10);
                    ((p)object0).a0(object13);
                }
                ((p)object0).p(false);
                u0 u07 = (u0)o0.getValue();
                ((p)object0).Q(0xCD7A12EE);
                boolean z9 = ((p)object0).h(u07);
                Object object14 = ((p)object0).G();
                if(z9 || object14 == z0) {
                    object14 = new q(0, u07, u0.class, "onTooltipClick", "onTooltipClick()V", 0, 11);
                    ((p)object0).a0(object14);
                }
                ((p)object0).p(false);
                u0 u08 = (u0)o0.getValue();
                ((p)object0).Q(0xCD7A1A50);
                boolean z10 = ((p)object0).h(u08);
                Object object15 = ((p)object0).G();
                if(z10 || object15 == z0) {
                    object15 = new q(0, u08, u0.class, "onTooltipDismiss", "onTooltipDismiss()V", 0, 1);
                    ((p)object0).a0(object15);
                }
                ((p)object0).p(false);
                u0 u09 = (u0)o0.getValue();
                ((p)object0).Q(-847634002);
                boolean z11 = ((p)object0).h(u09);
                Object object16 = ((p)object0).G();
                if(z11 || object16 == z0) {
                    object16 = new q(0, u09, u0.class, "onTooltipShown", "onTooltipShown()V", 0, 2);
                    ((p)object0).a0(object16);
                }
                ((p)object0).p(false);
                u0 u010 = (u0)o0.getValue();
                ((p)object0).Q(0xCD7A2910);
                boolean z12 = ((p)object0).h(u010);
                Object object17 = ((p)object0).G();
                if(z12 || object17 == z0) {
                    object17 = new r(1, u010, u0.class, "onSheetDismissed", "onSheetDismissed(Lcom/wave/customer/savings/SavingsUiState$VisibleSheet;Ljava/lang/Boolean;)V", 0, 0);
                    ((p)object0).a0(object17);
                }
                ((p)object0).p(false);
                u0 u011 = (u0)o0.getValue();
                ((p)object0).Q(0xCD7A321B);
                boolean z13 = ((p)object0).h(u011);
                Object object18 = ((p)object0).G();
                if(z13 || object18 == z0) {
                    object18 = new r(1, u011, u0.class, "onSendSupportMessageClicked", "onSendSupportMessageClicked(Lcom/sendwave/backend/fragment/SupportChannelsFragment$SupportChannel;)Lkotlinx/coroutines/Job;", 8, 1);
                    ((p)object0).a0(object18);
                }
                ((p)object0).p(false);
                u0 u012 = (u0)o0.getValue();
                ((p)object0).Q(0xCD7A3D20);
                boolean z14 = ((p)object0).h(u012);
                Object object19 = ((p)object0).G();
                if(z14 || object19 == z0) {
                    object19 = new q(0, u012, u0.class, "onLockAbuserBottomSheetDismissed", "onLockAbuserBottomSheetDismissed()V", 0, 3);
                    ((p)object0).a0(object19);
                }
                ((p)object0).p(false);
                u0 u013 = (u0)o0.getValue();
                ((p)object0).Q(0xCD7A47D9);
                boolean z15 = ((p)object0).h(u013);
                Object object20 = ((p)object0).G();
                if(z15 || object20 == z0) {
                    object20 = new q(0, u013, u0.class, "onUnlockVaultEarlyClicked", "onUnlockVaultEarlyClicked()V", 0, 4);
                    ((p)object0).a0(object20);
                }
                ((p)object0).p(false);
                W.b(((c0)object5), ((Function0)(((Nb.h)object6))), ((Function0)(((Nb.h)object7))), ((Function0)(((Nb.h)object8))), ((Function1)(((Nb.h)object9))), ((Function0)(((Nb.h)object10))), ((Function0)(((Nb.h)object11))), ((Function0)(((Nb.h)object12))), ((Function0)(((Nb.h)object13))), ((Function0)(((Nb.h)object14))), ((Function0)(((Nb.h)object15))), ((Function0)(((Nb.h)object16))), ((Function1)object17), ((Function0)(((Nb.h)object20))), ((Function1)object18), ((Function0)(((Nb.h)object19))), null, ((p)object0), 0, 0);
                return object2;
            }
            case 1: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                Object object21 = ((MutableState)object4).getValue();
                L l2 = ((DepositSavingsActivity)object3).c();
                ((p)object0).Q(-1147437770);
                boolean z16 = ((p)object0).h(l2);
                Object object22 = ((p)object0).G();
                if(z16 || object22 == z0) {
                    object22 = new q(0, l2, L.class, "onBackPressed", "onBackPressed()V", 0, 13);
                    ((p)object0).a0(object22);
                }
                ((p)object0).p(false);
                o o1 = ((DepositSavingsActivity)object3).F0;
                Ba.q q0 = (Ba.q)o1.getValue();
                ((p)object0).Q(0xBB9B86C2);
                boolean z17 = ((p)object0).h(q0);
                Object object23 = ((p)object0).G();
                if(z17 || object23 == z0) {
                    object23 = new s(1, q0, Ba.q.class, "onAmountChange", "onAmountChange(Lcom/sendwave/models/CurrencyAmount;)V", 0, 1);
                    ((p)object0).a0(object23);
                }
                ((p)object0).p(false);
                Object object24 = o1.getValue();
                ((p)object0).Q(-1147433502);
                boolean z18 = ((p)object0).h(((Ba.q)object24));
                Object object25 = ((p)object0).G();
                if(z18 || object25 == z0) {
                    q q1 = new q(0, ((Ba.q)object24), Ba.q.class, "onDepositClick", "onDepositClick()V", 0, 14);
                    ((p)object0).a0(q1);
                    object25 = q1;
                }
                ((p)object0).p(false);
                a.h(((k)object21), ((Function0)(((Nb.h)object22))), ((Function1)(((Nb.h)object23))), ((Function0)(((Nb.h)object25))), ((p)object0), 0);
                return object2;
            }
            case 2: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                Object object26 = ((MutableState)object4).getValue();
                L l3 = ((WithdrawSavingsActivity)object3).c();
                ((p)object0).Q(0x586C13B6);
                boolean z19 = ((p)object0).h(l3);
                Object object27 = ((p)object0).G();
                if(z19 || object27 == z0) {
                    object27 = new q(0, l3, L.class, "onBackPressed", "onBackPressed()V", 0, 18);
                    ((p)object0).a0(object27);
                }
                ((p)object0).p(false);
                o o2 = ((WithdrawSavingsActivity)object3).F0;
                Da.m m0 = (Da.m)o2.getValue();
                ((p)object0).Q(1483480386);
                boolean z20 = ((p)object0).h(m0);
                Object object28 = ((p)object0).G();
                if(z20 || object28 == z0) {
                    object28 = new s(1, m0, Da.m.class, "onAmountChange", "onAmountChange(Lcom/sendwave/models/CurrencyAmount;)V", 0, 4);
                    ((p)object0).a0(object28);
                }
                ((p)object0).p(false);
                Da.m m1 = (Da.m)o2.getValue();
                ((p)object0).Q(0x586C2483);
                boolean z21 = ((p)object0).h(m1);
                Object object29 = ((p)object0).G();
                if(z21 || object29 == z0) {
                    object29 = new q(0, m1, Da.m.class, "onWithdrawClick", "onWithdrawClick()V", 0, 19);
                    ((p)object0).a0(object29);
                }
                ((p)object0).p(false);
                Z6.b.f(((Da.i)object26), ((Function0)(((Nb.h)object27))), ((Function1)(((Nb.h)object28))), ((Function0)(((Nb.h)object29))), ((p)object0), 0);
                return object2;
            }
            case 3: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                a.a.g(c.c(725403315, new Ea.l(((g)object3), ((RedeemScratchCardActivity)object4)), ((p)object0)), ((p)object0), 6);
                return object2;
            }
            case 4: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                long v = d.h(0x7F06004C, ((p)object0));  // color:WaveBlue900
                long v1 = d.h(0x7F060047, ((p)object0));  // color:WaveBlue50
                Fa.m.g(((Fa.e)object3), ((Q)object4).Y, v, v1, ((p)object0), 0);
                return object2;
            }
            case 5: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                if(((S)object3) instanceof O) {
                    ((p)object0).Q(0xC22F0C92);
                    Fa.m.c(((O)(((S)object3))), Fa.e.Y, null, ((C3.i)object4), ((p)object0), 0x30, 4);
                    ((p)object0).p(false);
                    return object2;
                }
                if(((S)object3) instanceof Q) {
                    ((p)object0).Q(0xC22F29F1);
                    Fa.m.h(((Q)(((S)object3))), Fa.e.Y, null, ((C3.i)object4), ((p)object0), 0x30, 4);
                    ((p)object0).p(false);
                    return object2;
                }
                if(!(((S)object3) instanceof ScratchCard.Unlocked)) {
                    throw J.c(0xC22F059D, ((p)object0), false);
                }
                ((p)object0).Q(-1037088909);
                Fa.m.i(((ScratchCard.Unlocked)(((S)object3))), Fa.e.Y, false, null, ((C3.i)object4), ((p)object0), 0x30, 12);
                ((p)object0).p(false);
                return object2;
            }
            case 6: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                Modifier modifier0 = androidx.compose.foundation.layout.a.l(androidx.compose.foundation.layout.a.n(androidx.compose.foundation.a.b(w.r(l0), d.h(0x7F06018F, ((p)object0)), M.a), 0.0f, 0.0f, 0.0f, 32.0f, 7), 20.0f, 0.0f, 2);  // color:white
                B b0 = z.a(B.k.c, b.n, ((p)object0), 0x30);
                int v2 = ((p)object0).P;
                g0 g00 = ((p)object0).m();
                Modifier modifier1 = g0.a.d(((p)object0), modifier0);
                F0.k.a.getClass();
                F0.i i0 = j.b;
                ((p)object0).U();
                if(((p)object0).O) {
                    ((p)object0).l(i0);
                }
                else {
                    ((p)object0).d0();
                }
                U.d.K(((p)object0), b0, j.f);
                U.d.K(((p)object0), g00, j.e);
                F0.h h0 = j.g;
                if(((p)object0).O || !Nb.j.a(((p)object0).G(), v2)) {
                    m5.b.F(v2, ((p)object0), v2, h0);
                }
                U.d.K(((p)object0), modifier1, j.d);
                N4.h.b(((Function0)object3), ((p)object0), 0);
                Fa.c c0 = ((P)object4).a;
                ((p)object0).Q(438169058);
                if(c0 != null) {
                    f.c(c0, androidx.compose.foundation.layout.c.k(l0, 48.0f), ((p)object0), 0x1B0);
                }
                ((p)object0).p(false);
                String s = T4.l.y(((P)object4).b, ((p)object0));
                ((p)object0).Q(0x1A1E0F33);
                if(s != null) {
                    Modifier modifier2 = androidx.compose.foundation.layout.a.l(l0, 0.0f, 8.0f, 1);
                    O0.O o3 = db.b.a(((db.a)((p)object0).k(db.b.d)).n, ((p)object0));
                    m2.b(s, modifier2, d.h(0x7F06001C, ((p)object0)), 0L, null, null, null, 0L, null, new Z0.i(3), 0L, 0, false, 0, 0, null, o3, ((p)object0), 0x30, 0, 0xFDF8);  // color:Gray900
                }
                ((p)object0).p(false);
                String s1 = T4.l.y(((P)object4).c, ((p)object0));
                ((p)object0).Q(0x1A1E3DCF);
                if(s1 != null) {
                    O0.O o4 = db.b.a(((db.a)((p)object0).k(db.b.d)).m, ((p)object0));
                    m2.b(s1, null, d.h(0x7F06001C, ((p)object0)), 0L, null, null, null, 0L, null, new Z0.i(3), 0L, 0, false, 0, 0, null, o4, ((p)object0), 0, 0, 0xFDFA);  // color:Gray900
                }
                ((p)object0).p(false);
                ((p)object0).p(true);
                return object2;
            }
            case 7: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                String s2 = l1.d(((String)object3), null);
                ((p)object0).Q(2120720828);
                O0.c c1 = new O0.c();
                c1.d(J2.w.S(0x7F120217, ((p)object0)));  // string:log_out "Log out"
                int v3 = c1.f(new G(v.d, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 0xFFFE));
                try {
                    c1.d(" (" + s2 + ")");
                }
                catch(Throwable throwable0) {
                    c1.e(v3);
                    throw throwable0;
                }
                c1.e(v3);
                O0.f f1 = c1.g();
                ((p)object0).p(false);
                f.j(0x7F08028F, f1, null, androidx.compose.foundation.layout.a.l(androidx.compose.foundation.a.d(l0, false, null, ((Function0)object4), 7), 0.0f, 8.0f, 1), ((p)object0), 0, 4);  // drawable:ic_settings_logout
                return object2;
            }
            case 8: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                Modifier modifier3 = androidx.compose.foundation.layout.c.d(l0, 1.0f);
                B b1 = z.a(B.k.c, e0, ((p)object0), 0);
                int v4 = ((p)object0).P;
                g0 g01 = ((p)object0).m();
                Modifier modifier4 = g0.a.d(((p)object0), modifier3);
                F0.k.a.getClass();
                F0.i i1 = j.b;
                ((p)object0).U();
                if(((p)object0).O) {
                    ((p)object0).l(i1);
                }
                else {
                    ((p)object0).d0();
                }
                U.d.K(((p)object0), b1, j.f);
                U.d.K(((p)object0), g01, j.e);
                F0.h h1 = j.g;
                if(((p)object0).O || !Nb.j.a(((p)object0).G(), v4)) {
                    m5.b.F(v4, ((p)object0), v4, h1);
                }
                U.d.K(((p)object0), modifier4, j.d);
                f.j(0x7F080291, J2.w.S(0x7F1203F0, ((p)object0)), null, androidx.compose.foundation.layout.a.n(androidx.compose.foundation.a.d(l0, false, null, ((Function0)object3), 7), 0.0f, 8.0f, 0.0f, 0.0f, 13), ((p)object0), 0, 4);  // drawable:ic_settings_share
                f.j(0x7F080292, J2.w.S(0x7F120376, ((p)object0)), null, androidx.compose.foundation.layout.a.n(androidx.compose.foundation.a.d(l0, false, null, ((Function0)object4), 7), 0.0f, 0.0f, 0.0f, 8.0f, 7), ((p)object0), 0, 4);  // drawable:ic_settings_shine
                ((p)object0).p(true);
                return object2;
            }
            case 9: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                Modifier modifier5 = androidx.compose.foundation.layout.a.l(androidx.compose.foundation.layout.c.d(l0, 1.0f), 24.0f, 0.0f, 2);
                x0 x00 = v0.b(B.k.b, b.j, ((p)object0), 6);
                int v5 = ((p)object0).P;
                g0 g02 = ((p)object0).m();
                Modifier modifier6 = g0.a.d(((p)object0), modifier5);
                F0.k.a.getClass();
                F0.i i2 = j.b;
                ((p)object0).U();
                if(((p)object0).O) {
                    ((p)object0).l(i2);
                }
                else {
                    ((p)object0).d0();
                }
                U.d.K(((p)object0), x00, j.f);
                U.d.K(((p)object0), g02, j.e);
                F0.h h2 = j.g;
                if(((p)object0).O || !Nb.j.a(((p)object0).G(), v5)) {
                    m5.b.F(v5, ((p)object0), v5, h2);
                }
                U.d.K(((p)object0), modifier6, j.d);
                ((p)object0).Q(-160277879);
                for(Object object30: ((List)object3)) {
                    Va.d d0 = (Va.d)object30;
                    ((p)object0).Q(0xA8638BA3);
                    boolean z22 = ((p)object0).f(((Function1)object4));
                    boolean z23 = ((p)object0).h(d0);
                    Object object31 = ((p)object0).G();
                    if((z22 | z23) != 0 || object31 == z0) {
                        object31 = new Ca.j(((Function1)object4), 7, d0);
                        ((p)object0).a0(object31);
                    }
                    ((p)object0).p(false);
                    M6.b.n(((Function0)object31), null, false, null, c.c(0xD80467CC, new x(9, d0), ((p)object0)), ((p)object0), 0x6000, 14);
                }
                ((p)object0).p(false);
                ((p)object0).p(true);
                return object2;
            }
            case 10: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                ((Function3)object3).h(((y0)object4), ((p)object0), 0);
                return object2;
            }
            case 11: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                O0.O o5 = ((db.a)((p)object0).k(db.b.d)).f;
                long v6 = ((O0.O)((p)object0).k(m2.a)).b();
                if(((Boolean)((MutableState)object4).getValue()).booleanValue()) {
                    f = 0.5f;
                }
                m2.b(((String)object3), null, v.b(f, v6), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o5, ((p)object0), 0, 0, 0xFFFA);
                return object2;
            }
            case 12: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                a.a.g(c.c(-1003249789, new la.b(((la.j)object3), ((AccountLimitsParams)object4)), ((p)object0)), ((p)object0), 6);
                return object2;
            }
            case 13: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                B b2 = z.a(new B.h(20.0f), e0, ((p)object0), 6);
                int v7 = ((p)object0).P;
                g0 g03 = ((p)object0).m();
                Modifier modifier7 = g0.a.d(((p)object0), l0);
                F0.k.a.getClass();
                F0.i i3 = j.b;
                ((p)object0).U();
                if(((p)object0).O) {
                    ((p)object0).l(i3);
                }
                else {
                    ((p)object0).d0();
                }
                U.d.K(((p)object0), b2, j.f);
                U.d.K(((p)object0), g03, j.e);
                F0.h h3 = j.g;
                if(((p)object0).O || !Nb.j.a(((p)object0).G(), v7)) {
                    m5.b.F(v7, ((p)object0), v7, h3);
                }
                U.d.K(((p)object0), modifier7, j.d);
                m2.b(J2.w.S(0x7F12030D, ((p)object0)), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, n.e(((p)object0)), ((p)object0), 0, 0, 0xFFFE);  // string:pay_custom_amount "Pay custom amount"
                Modifier modifier8 = androidx.compose.foundation.layout.c.d(l0, 1.0f);
                k0 k00 = R1.b(0L, 0L, 0L, d.h(0x7F060018, ((p)object0)), ((p)object0), 0x17FFFF);  // color:Gray500
                n.d(((lb.r)object3).c, ((lb.r)object3).e, ((Function1)object4), modifier8, false, false, null, null, lb.b.a, null, null, false, null, null, false, 0, null, null, k00, ((p)object0), 0x6000C00, 0, 0x3FEF0);
                ((p)object0).p(true);
                return object2;
            }
            case 14: {
                return this.a(object0, object1);
            }
            case 15: {
                int v8 = ((Number)object1).intValue();
                Nb.j.f(((DialogInterface)object0), "<unused var>");
                Object object32 = ((Nb.w)object4).X;
                if(object32 != null) {
                    ((V0)object3).i(new Ab.k(((i.g)object32), v8));
                    return object2;
                }
                Nb.j.p("dialog");
                throw null;
            }
            case 16: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                qa.i i4 = (qa.i)((MutableState)object4).getValue();
                L l4 = ((OverdraftActivity)object3).c();
                ((p)object0).Q(-1528585510);
                boolean z24 = ((p)object0).h(l4);
                Object object33 = ((p)object0).G();
                if(z24 || object33 == z0) {
                    object33 = new pa.m(0, l4, L.class, "onBackPressed", "onBackPressed()V", 0, 10);
                    ((p)object0).a0(object33);
                }
                ((p)object0).p(false);
                qa.f.a(i4, ((Function0)(((Nb.h)object33))), ((p)object0), 0);
                return object2;
            }
            default: {
                Nb.j.f(((ac.h)object0), "tooltipsFlow");
                Nb.j.f(((Xb.G)object1), "scope");
                u u0 = u.a.b(((PaymentCardsActivity)object3));
                return new N9.n(N9.a.b0, ((ac.h)object0), u0, ((E9.b)object4), ((Xb.G)object1));
            }
        }
    }
}

