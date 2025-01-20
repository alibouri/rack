package ra;

import Ab.t;
import Nb.h;
import Nb.j;
import U.Z;
import U.l;
import U.p;
import androidx.lifecycle.compose.FlowExtKt;
import c.L;
import com.wave.customer.paymentcards.PaymentCardsActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import pa.m;

public final class g0 implements Function2 {
    public final PaymentCardsActivity X;

    public g0(PaymentCardsActivity paymentCardsActivity0) {
        this.X = paymentCardsActivity0;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
            ((p)object0).K();
            return t.a;
        }
        PaymentCardsActivity paymentCardsActivity0 = this.X;
        L0 l00 = paymentCardsActivity0.F0;
        if(l00 != null) {
            N n0 = (N)FlowExtKt.c(l00.i0, ((p)object0)).getValue();
            L0 l01 = paymentCardsActivity0.F0;
            if(l01 != null) {
                ((p)object0).Q(0x7F8685EB);
                boolean z = ((p)object0).h(l01);
                Object object2 = ((p)object0).G();
                Z z1 = l.a;
                if(z || object2 == z1) {
                    m m0 = new m(0, l01, L0.class, "onActivateCardClicked", "onActivateCardClicked()V", 0, 11);
                    ((p)object0).a0(m0);
                    object2 = m0;
                }
                ((p)object0).p(false);
                L0 l02 = paymentCardsActivity0.F0;
                if(l02 != null) {
                    ((p)object0).Q(0x7F868F2E);
                    boolean z2 = ((p)object0).h(l02);
                    Object object3 = ((p)object0).G();
                    if(z2 || object3 == z1) {
                        object3 = new m(0, l02, L0.class, "onActivationFeeConfirmed", "onActivationFeeConfirmed()V", 0, 20);
                        ((p)object0).a0(object3);
                    }
                    ((p)object0).p(false);
                    L0 l03 = paymentCardsActivity0.F0;
                    if(l03 != null) {
                        ((p)object0).Q(0x7F8698CE);
                        boolean z3 = ((p)object0).h(l03);
                        Object object4 = ((p)object0).G();
                        if(z3 || object4 == z1) {
                            object4 = new m(0, l03, L0.class, "onActivationFeeDismissed", "onActivationFeeDismissed()V", 0, 21);
                            ((p)object0).a0(object4);
                        }
                        ((p)object0).p(false);
                        L0 l04 = paymentCardsActivity0.F0;
                        if(l04 != null) {
                            ((p)object0).Q(0x7F86A147);
                            boolean z4 = ((p)object0).h(l04);
                            Object object5 = ((p)object0).G();
                            if(z4 || object5 == z1) {
                                object5 = new m(0, l04, L0.class, "onShowHideClicked", "onShowHideClicked()V", 0, 22);
                                ((p)object0).a0(object5);
                            }
                            ((p)object0).p(false);
                            L0 l05 = paymentCardsActivity0.F0;
                            if(l05 != null) {
                                ((p)object0).Q(0x7F86A8ED);
                                boolean z5 = ((p)object0).h(l05);
                                Object object6 = ((p)object0).G();
                                if(z5 || object6 == z1) {
                                    object6 = new m(0, l05, L0.class, "onCopyCardNumberClicked", "onCopyCardNumberClicked()V", 0, 23);
                                    ((p)object0).a0(object6);
                                }
                                ((p)object0).p(false);
                                L0 l06 = paymentCardsActivity0.F0;
                                if(l06 != null) {
                                    ((p)object0).Q(0x7F86B145);
                                    boolean z6 = ((p)object0).h(l06);
                                    Object object7 = ((p)object0).G();
                                    if(z6 || object7 == z1) {
                                        object7 = new ha.m(1, l06, L0.class, "onActionClicked", "onActionClicked(Lcom/wave/customer/paymentcards/PaymentCardScreenState$Action;)V", 0, 22);
                                        ((p)object0).a0(object7);
                                    }
                                    ((p)object0).p(false);
                                    L0 l07 = paymentCardsActivity0.F0;
                                    if(l07 != null) {
                                        ((p)object0).Q(0x7F86B8E7);
                                        boolean z7 = ((p)object0).h(l07);
                                        Object object8 = ((p)object0).G();
                                        if(z7 || object8 == z1) {
                                            object8 = new m(0, l07, L0.class, "onVerifyIdClicked", "onVerifyIdClicked()V", 0, 24);
                                            ((p)object0).a0(object8);
                                        }
                                        ((p)object0).p(false);
                                        L0 l08 = paymentCardsActivity0.F0;
                                        if(l08 != null) {
                                            ((p)object0).Q(0x7F86C028);
                                            boolean z8 = ((p)object0).h(l08);
                                            Object object9 = ((p)object0).G();
                                            if(z8 || object9 == z1) {
                                                object9 = new m(0, l08, L0.class, "onMessageDisplayed", "onMessageDisplayed()V", 0, 25);
                                                ((p)object0).a0(object9);
                                            }
                                            ((p)object0).p(false);
                                            L0 l09 = paymentCardsActivity0.F0;
                                            if(l09 != null) {
                                                ((p)object0).Q(0x7F86C827);
                                                boolean z9 = ((p)object0).h(l09);
                                                Object object10 = ((p)object0).G();
                                                if(z9 || object10 == z1) {
                                                    object10 = new m(0, l09, L0.class, "onCelebrationOver", "onCelebrationOver()V", 0, 26);
                                                    ((p)object0).a0(object10);
                                                }
                                                ((p)object0).p(false);
                                                L l0 = paymentCardsActivity0.c();
                                                ((p)object0).Q(0x7F86CF98);
                                                boolean z10 = ((p)object0).h(l0);
                                                Object object11 = ((p)object0).G();
                                                if(z10 || object11 == z1) {
                                                    object11 = new m(0, l0, L.class, "onBackPressed", "onBackPressed()V", 0, 12);
                                                    ((p)object0).a0(object11);
                                                }
                                                ((p)object0).p(false);
                                                L0 l010 = paymentCardsActivity0.F0;
                                                if(l010 != null) {
                                                    ((p)object0).Q(0x7F86D966);
                                                    boolean z11 = ((p)object0).h(l010);
                                                    Object object12 = ((p)object0).G();
                                                    if(z11 || object12 == z1) {
                                                        object12 = new m(0, l010, L0.class, "onDepositClicked", "onDepositClicked()V", 0, 13);
                                                        ((p)object0).a0(object12);
                                                    }
                                                    ((p)object0).p(false);
                                                    L0 l011 = paymentCardsActivity0.F0;
                                                    if(l011 != null) {
                                                        ((p)object0).Q(0x7F86E18A);
                                                        boolean z12 = ((p)object0).h(l011);
                                                        Object object13 = ((p)object0).G();
                                                        if(z12 || object13 == z1) {
                                                            object13 = new m(0, l011, L0.class, "onTransferOutClicked", "onTransferOutClicked()V", 0, 14);
                                                            ((p)object0).a0(object13);
                                                        }
                                                        ((p)object0).p(false);
                                                        L0 l012 = paymentCardsActivity0.F0;
                                                        if(l012 != null) {
                                                            ((p)object0).Q(0x7F86E8BF);
                                                            boolean z13 = ((p)object0).h(l012);
                                                            Object object14 = ((p)object0).G();
                                                            if(z13 || object14 == z1) {
                                                                object14 = new m(0, l012, L0.class, "onRefresh", "onRefresh()V", 0, 15);
                                                                ((p)object0).a0(object14);
                                                            }
                                                            ((p)object0).p(false);
                                                            L0 l013 = paymentCardsActivity0.F0;
                                                            if(l013 != null) {
                                                                ((p)object0).Q(0x7F86F00A);
                                                                boolean z14 = ((p)object0).h(l013);
                                                                Object object15 = ((p)object0).G();
                                                                if(z14 || object15 == z1) {
                                                                    object15 = new ha.m(1, l013, L0.class, "onTransactionClicked", "onTransactionClicked-ly-mAIY(Ljava/lang/String;)V", 0, 20);
                                                                    ((p)object0).a0(object15);
                                                                }
                                                                ((p)object0).p(false);
                                                                L0 l014 = paymentCardsActivity0.F0;
                                                                if(l014 != null) {
                                                                    ((p)object0).Q(0x7F86F889);
                                                                    boolean z15 = ((p)object0).h(l014);
                                                                    Object object16 = ((p)object0).G();
                                                                    if(z15 || object16 == z1) {
                                                                        object16 = new ha.m(1, l014, L0.class, "onTransactionSwiped", "onTransactionSwiped-ly-mAIY(Ljava/lang/String;)Z", 0, 21);
                                                                        ((p)object0).a0(object16);
                                                                    }
                                                                    ((p)object0).p(false);
                                                                    L0 l015 = paymentCardsActivity0.F0;
                                                                    if(l015 != null) {
                                                                        ((p)object0).Q(0x7F870086);
                                                                        boolean z16 = ((p)object0).h(l015);
                                                                        Object object17 = ((p)object0).G();
                                                                        if(z16 || object17 == z1) {
                                                                            object17 = new m(0, l015, L0.class, "onSeeMoreClicked", "onSeeMoreClicked()V", 0, 16);
                                                                            ((p)object0).a0(object17);
                                                                        }
                                                                        ((p)object0).p(false);
                                                                        L0 l016 = paymentCardsActivity0.F0;
                                                                        if(l016 != null) {
                                                                            ((p)object0).Q(0x7F8707E4);
                                                                            boolean z17 = ((p)object0).h(l016);
                                                                            Object object18 = ((p)object0).G();
                                                                            if(z17 || object18 == z1) {
                                                                                object18 = new m(0, l016, L0.class, "onTooltipClick", "onTooltipClick()V", 0, 17);
                                                                                ((p)object0).a0(object18);
                                                                            }
                                                                            ((p)object0).p(false);
                                                                            L0 l017 = paymentCardsActivity0.F0;
                                                                            if(l017 != null) {
                                                                                ((p)object0).Q(0x7F870F46);
                                                                                boolean z18 = ((p)object0).h(l017);
                                                                                Object object19 = ((p)object0).G();
                                                                                if(z18 || object19 == z1) {
                                                                                    object19 = new m(0, l017, L0.class, "onTooltipDismiss", "onTooltipDismiss()V", 0, 18);
                                                                                    ((p)object0).a0(object19);
                                                                                }
                                                                                ((p)object0).p(false);
                                                                                L0 l018 = paymentCardsActivity0.F0;
                                                                                if(l018 != null) {
                                                                                    ((p)object0).Q(0x7F8716A4);
                                                                                    boolean z19 = ((p)object0).h(l018);
                                                                                    Object object20 = ((p)object0).G();
                                                                                    if(z19 || object20 == z1) {
                                                                                        object20 = new m(0, l018, L0.class, "onTooltipShown", "onTooltipShown()V", 0, 19);
                                                                                        ((p)object0).a0(object20);
                                                                                    }
                                                                                    ((p)object0).p(false);
                                                                                    T4.l.o(n0, ((Function0)(((h)object2))), ((Function0)(((h)object3))), ((Function0)(((h)object4))), ((Function0)(((h)object5))), ((Function0)(((h)object6))), ((Function1)(((h)object7))), ((Function0)(((h)object8))), ((Function0)(((h)object9))), ((Function0)(((h)object10))), ((Function0)(((h)object11))), ((Function0)(((h)object12))), ((Function0)(((h)object13))), ((Function0)(((h)object14))), ((Function1)(((h)object15))), ((Function1)(((h)object16))), ((Function0)(((h)object17))), ((Function0)(((h)object18))), ((Function0)(((h)object19))), ((Function0)(((h)object20))), null, ((p)object0), 0, 0, 0, 0x100000);
                                                                                    return t.a;
                                                                                }
                                                                                j.p("vm");
                                                                                throw null;
                                                                            }
                                                                            j.p("vm");
                                                                            throw null;
                                                                        }
                                                                        j.p("vm");
                                                                        throw null;
                                                                    }
                                                                    j.p("vm");
                                                                    throw null;
                                                                }
                                                                j.p("vm");
                                                                throw null;
                                                            }
                                                            j.p("vm");
                                                            throw null;
                                                        }
                                                        j.p("vm");
                                                        throw null;
                                                    }
                                                    j.p("vm");
                                                    throw null;
                                                }
                                                j.p("vm");
                                                throw null;
                                            }
                                            j.p("vm");
                                            throw null;
                                        }
                                        j.p("vm");
                                        throw null;
                                    }
                                    j.p("vm");
                                    throw null;
                                }
                                j.p("vm");
                                throw null;
                            }
                            j.p("vm");
                            throw null;
                        }
                        j.p("vm");
                        throw null;
                    }
                    j.p("vm");
                    throw null;
                }
                j.p("vm");
                throw null;
            }
            j.p("vm");
            throw null;
        }
        j.p("vm");
        throw null;
    }
}

