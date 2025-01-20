package com.wave.customer.scratchCardRewards;

import Aa.E;
import B.B;
import B.e;
import B.k;
import B.r;
import B.z;
import Bb.q;
import D0.K;
import Ea.V;
import Ea.m;
import Ea.n;
import Ea.o;
import Ea.s;
import Ea.x;
import F0.h;
import J2.w;
import M.J;
import N.m2;
import Nb.j;
import O0.O;
import U.Z;
import U.g0;
import U.l0;
import U.p;
import Z0.i;
import Z2.t;
import androidx.compose.foundation.layout.c;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import com.sendwave.backend.type.Currency.CFA;
import com.sendwave.models.CurrencyAmount;
import db.a;
import db.b;
import g0.l;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import mc.f;
import n0.M;
import n0.v;
import q9.M0;

public abstract class d {
    public static final int a;

    static {
        ScratchCardTermsAndConditions scratchCardTermsAndConditions0 = new ScratchCardTermsAndConditions("1", "https://wave.com/something");
        BigDecimal bigDecimal0 = BigDecimal.valueOf(450L);
        ScratchCard.Award.CashAward scratchCard$Award$CashAward0 = new ScratchCard.Award.CashAward(new CurrencyAmount(CFA.X, bigDecimal0));
        KnownAward scratchCard$Unlocked$KnownAward0 = new KnownAward("test", null, null, V.b0, scratchCardTermsAndConditions0, scratchCard$Award$CashAward0);
        ScratchCard.Award.Known scratchCard$Award$Known0 = new ScratchCard.Award.CustomAward("Earn 1.000F cashback on your next grocery payment!", "https://storage.googleapis.com/wavemm-merchant-images/deals/scratch-card-icons/ic_grocery.svg");
        j.f(scratchCard$Unlocked$KnownAward0.X, "id");
        j.f(scratchCard$Unlocked$KnownAward0.b0, "background");
        new KnownAward(scratchCard$Unlocked$KnownAward0.X, scratchCard$Unlocked$KnownAward0.Y, scratchCard$Unlocked$KnownAward0.Z, scratchCard$Unlocked$KnownAward0.b0, scratchCard$Unlocked$KnownAward0.c0, scratchCard$Award$Known0);
    }

    public static final void a(CurrencyAmount currencyAmount0, p p0, int v) {
        p0.S(0x6F3E9659);
        if((((v & 6) == 0 ? (p0.f(currencyAmount0) ? 4 : 2) | v : v) & 3) != 2 || !p0.x()) {
            d.b(w.T(0x7F1203C6, new Object[]{M0.a(currencyAmount0)}, p0), p0, 0);  // string:scratch_card_you_won_amount "You won %s"
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new m(currencyAmount0, v, 0);
        }
    }

    public static final void b(String s, p p0, int v) {
        p0.S(1096927393);
        int v1 = (v & 6) == 0 ? (p0.f(s) ? 4 : 2) | v : v;
        if((v1 & 3) != 2 || !p0.x()) {
            O o0 = b.a(((a)p0.k(b.d)).n, p0);
            i i0 = new i(3);
            m2.b(s, null, v.b, 0L, null, null, null, 0L, null, i0, 0L, 0, false, 0, 0, null, o0, p0, v1 & 14 | 0x180, 0, 0xFDFA);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new n(s, v, 0);
        }
    }

    public static final void c(int v, p p0) {
        p0.S(0xDF1A49D);
        if(v != 0 || !p0.x()) {
            Modifier modifier0 = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.a.b(c.c(l.X, 1.0f), v.e, M.a), 10.0f);
            B b0 = z.a(k.e, g0.b.n, p0, 54);
            int v1 = p0.P;
            g0 g00 = p0.m();
            Modifier modifier1 = g0.a.d(p0, modifier0);
            F0.k.a.getClass();
            F0.i i0 = F0.j.b;
            p0.U();
            if(p0.O) {
                p0.l(i0);
            }
            else {
                p0.d0();
            }
            U.d.K(p0, b0, F0.j.f);
            U.d.K(p0, g00, F0.j.e);
            h h0 = F0.j.g;
            if(p0.O || !j.a(p0.G(), v1)) {
                m5.b.F(v1, p0, v1, h0);
            }
            U.d.K(p0, modifier1, F0.j.d);
            String s = w.S(0x7F1203A9, p0);  // string:scratch_card_better_luck_next_time "Better luck next time!"
            O o0 = ((a)p0.k(b.d)).r;
            long v2 = android.support.v4.media.session.a.O(28.0f, p0);
            i i1 = new i(3);
            m2.b(s, null, v.b, v2, null, null, null, 0L, null, i1, 0L, 0, false, 0, 0, null, o0, p0, 0x180, 0, 0xFDF2);
            p0.p(true);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new E(v, 1);
        }
    }

    public static final void d(CurrencyAmount currencyAmount0, p p0, int v) {
        p0.S(0x5C028077);
        int v1 = (v & 6) == 0 ? (p0.f(currencyAmount0) ? 4 : 2) | v : v;
        if((v1 & 3) != 2 || !p0.x()) {
            l l0 = l.X;
            Modifier modifier0 = androidx.compose.foundation.a.b(c.c(l0, 1.0f), v.e, M.a);
            K k0 = r.e(g0.b.e, false);
            int v2 = p0.P;
            g0 g00 = p0.m();
            Modifier modifier1 = g0.a.d(p0, modifier0);
            F0.k.a.getClass();
            F0.i i0 = F0.j.b;
            p0.U();
            if(p0.O) {
                p0.l(i0);
            }
            else {
                p0.d0();
            }
            U.d.K(p0, k0, F0.j.f);
            U.d.K(p0, g00, F0.j.e);
            h h0 = F0.j.g;
            if(p0.O || !j.a(p0.G(), v2)) {
                m5.b.F(v2, p0, v2, h0);
            }
            U.d.K(p0, modifier1, F0.j.d);
            Modifier modifier2 = c.c(l0, 1.0f);
            M6.b.d(yc.l.y(0x7F08008A, p0, 0), null, modifier2, null, null, 0.0f, null, p0, 0x1B0, 120);  // drawable:bg_redeemed_scratch_card_coins
            d.a(currencyAmount0, p0, v1 & 14);
            p0.p(true);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new m(currencyAmount0, v, 1);
        }
    }

    public static final void e(int v, p p0, boolean z) {
        p0.S(0xF02E925A);
        if((((v & 6) == 0 ? (p0.g(z) ? 4 : 2) | v : v) & 3) == 2 && p0.x()) {
            p0.K();
        }
        else if(z) {
            Modifier modifier0 = c.c(l.X, 1.0f);
            f f0 = new f(0.5, 0.4);
            nc.c c0 = new nc.c(new nc.b(100L, TimeUnit.MILLISECONDS));
            c0.b = ((float)(c0.a / 100L)) / 1000.0f;
            io.sentry.config.a.e(modifier0, q.K(new mc.b(0, 0, 0.0f, 0.0f, null, 0L, false, f0, c0, 0x1BFF)), null, p0, 6, 4);
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new o(v, 0, z);
        }
    }

    public static final void f(ScratchCard.Award.CustomAward scratchCard$Award$CustomAward0, p p0, int v) {
        p0.S(410364006);
        if((((v & 6) == 0 ? (p0.f(scratchCard$Award$CustomAward0) ? 4 : 2) | v : v) & 3) != 2 || !p0.x()) {
            l l0 = l.X;
            Modifier modifier0 = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.a.b(c.c(l0, 1.0f), v.e, M.a), 20.0f);
            B b0 = z.a(k.e, g0.b.n, p0, 54);
            int v1 = p0.P;
            g0 g00 = p0.m();
            Modifier modifier1 = g0.a.d(p0, modifier0);
            F0.k.a.getClass();
            F0.i i0 = F0.j.b;
            p0.U();
            if(p0.O) {
                p0.l(i0);
            }
            else {
                p0.d0();
            }
            U.d.K(p0, b0, F0.j.f);
            U.d.K(p0, g00, F0.j.e);
            h h0 = F0.j.g;
            if(p0.O || !j.a(p0.G(), v1)) {
                m5.b.F(v1, p0, v1, h0);
            }
            U.d.K(p0, modifier1, F0.j.d);
            O o0 = b.a(((a)p0.k(b.d)).l, p0);
            i i1 = new i(3);
            m2.b(scratchCard$Award$CustomAward0.X, null, v.b, 0L, null, null, null, 0L, null, i1, 0L, 0, false, 0, 0, null, o0, p0, 0x180, 0, 0xFDFA);
            e.b(p0, c.k(l0, 12.0f));
            Modifier modifier2 = androidx.compose.foundation.layout.a.c(c.d(l0, 0.65f), 1.0f, false);
            t.e(scratchCard$Award$CustomAward0.Y, modifier2, Ea.e.b, null, D0.i.b, p0, 0x30, 129000);
            p0.p(true);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new Aa.d(v, 1, scratchCard$Award$CustomAward0);
        }
    }

    public static final void g(CurrencyAmount currencyAmount0, p p0, int v) {
        p0.S(0x25F3B6C5);
        int v1 = (v & 6) == 0 ? (p0.f(currencyAmount0) ? 4 : 2) | v : v;
        if((v1 & 3) != 2 || !p0.x()) {
            l l0 = l.X;
            Modifier modifier0 = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.a.b(c.c(l0, 1.0f), v.e, M.a), 20.0f);
            B b0 = z.a(k.e, g0.b.n, p0, 54);
            int v2 = p0.P;
            g0 g00 = p0.m();
            Modifier modifier1 = g0.a.d(p0, modifier0);
            F0.k.a.getClass();
            F0.i i0 = F0.j.b;
            p0.U();
            if(p0.O) {
                p0.l(i0);
            }
            else {
                p0.d0();
            }
            U.d.K(p0, b0, F0.j.f);
            U.d.K(p0, g00, F0.j.e);
            h h0 = F0.j.g;
            if(p0.O || !j.a(p0.G(), v2)) {
                m5.b.F(v2, p0, v2, h0);
            }
            U.d.K(p0, modifier1, F0.j.d);
            d.a(currencyAmount0, p0, v1 & 14);
            e.b(p0, c.k(l0, 12.0f));
            M6.b.d(yc.l.y(0x7F080235, p0, 0), null, c.d(l0, 0.65f), null, D0.i.b, 0.0f, null, p0, 25008, 104);  // drawable:ic_gift_opened
            p0.p(true);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new m(currencyAmount0, v, 2);
        }
    }

    public static final void h(com.wave.customer.scratchCardRewards.e e0, Function0 function00, Function0 function01, Function1 function10, p p0, int v) {
        j.f(e0, "state");
        j.f(function00, "onNavigationUpClick");
        j.f(function01, "onRevealed");
        j.f(function10, "onTermsClicked");
        p0.S(0x63BED714);
        int v1 = (v & 6) == 0 ? (p0.h(e0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.h(function00) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p0.h(function01) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (p0.h(function10) ? 0x800 : 0x400);
        }
        if((v1 & 0x493) != 1170 || !p0.x()) {
            ScratchCard.Award.Known scratchCard$Award$Known0 = e0.b.d0;
            p0.Q(0x11B68F67);
            Object object0 = p0.G();
            if(object0 == U.l.a) {
                if(scratchCard$Award$Known0 instanceof ScratchCard.Award.CashAward) {
                    Collection collection0 = q.L(new Function2[]{new c0.b(0xF451F86D, new x(scratchCard$Award$Known0, 1), true), new c0.b(0x6122F62E, new x(scratchCard$Award$Known0, 2), true)});
                    j.f(Qb.e.X, "random");
                    if(collection0.isEmpty()) {
                        throw new NoSuchElementException("Collection is empty.");
                    }
                    int v2 = Qb.e.Y.e(collection0.size());
                    if(collection0 instanceof List) {
                        object0 = U.d.D(((Function2)((List)collection0).get(v2)), Z.e);
                        p0.a0(object0);
                    }
                    else {
                        Bb.x x0 = new Bb.x(v2, 0);
                        if(collection0 instanceof List) {
                            if(v2 >= 0 && v2 < ((List)collection0).size()) {
                                object0 = U.d.D(((Function2)((List)collection0).get(v2)), Z.e);
                                p0.a0(object0);
                                goto label_61;
                            }
                        }
                        else if(v2 >= 0) {
                            int v3 = 0;
                            for(Object object1: collection0) {
                                if(v2 == v3) {
                                    object0 = U.d.D(((Function2)object1), Z.e);
                                    p0.a0(object0);
                                    goto label_61;
                                }
                                ++v3;
                            }
                            x0.n(v2);
                            throw null;
                        }
                        x0.n(v2);
                        throw null;
                    }
                }
                else if(scratchCard$Award$Known0 instanceof ScratchCard.Award.CustomAward) {
                    object0 = U.d.D(new c0.b(-1890893500, new x(scratchCard$Award$Known0, 0), true), Z.e);
                    p0.a0(object0);
                }
                else {
                    if(scratchCard$Award$Known0 != null) {
                        throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                    }
                    object0 = U.d.D(Ea.e.a, Z.e);
                    p0.a0(object0);
                }
            }
        label_61:
            p0.p(false);
            N4.j.d("", null, 0L, function00, null, 0L, 0L, null, c0.c.c(0xC434F050, new com.wave.customer.scratchCardRewards.c(e0, scratchCard$Award$Known0, function01, ((MutableState)object0), function10), p0), p0, v1 << 6 & 0x1C00 | 0x6000006, 0xF6);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new Aa.c(e0, function00, function01, function10, v, 3);
        }
    }

    public static final void i(KnownAward scratchCard$Unlocked$KnownAward0, Function0 function00, p p0, int v) {
        p0.S(0xB88B6036);
        int v1 = (v & 6) == 0 ? (p0.h(scratchCard$Unlocked$KnownAward0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.h(function00) ? 0x20 : 16);
        }
        if((v1 & 19) != 18 || !p0.x()) {
            Modifier modifier0 = c.c(l.X, 1.0f);
            p0.Q(0x510C48C0);
            boolean z = p0.h(scratchCard$Unlocked$KnownAward0);
            Object object0 = p0.G();
            if(((v1 & 0x70) == 0x20 | z) != 0 || object0 == U.l.a) {
                object0 = new Ea.r(scratchCard$Unlocked$KnownAward0, 0, function00);
                p0.a0(object0);
            }
            p0.p(false);
            androidx.compose.ui.viewinterop.a.a(((Function1)object0), modifier0, null, p0, 0x30, 4);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new s(v, 0, scratchCard$Unlocked$KnownAward0, function00);
        }
    }

    public static final void j(boolean z, ScratchCard.Award.Known scratchCard$Award$Known0, Modifier modifier0, p p0, int v) {
        String s;
        p0.S(0x206E5E3D);
        int v1 = (v & 6) == 0 ? (p0.g(z) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (((v & 0x40) == 0 ? p0.f(scratchCard$Award$Known0) : p0.h(scratchCard$Award$Known0)) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p0.f(modifier0) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) != 0x92 || !p0.x()) {
            Modifier modifier1 = c.d(modifier0, 1.0f);
            B b0 = z.a(k.c, g0.b.n, p0, 0x30);
            int v2 = p0.P;
            g0 g00 = p0.m();
            Modifier modifier2 = g0.a.d(p0, modifier1);
            F0.k.a.getClass();
            F0.i i0 = F0.j.b;
            p0.U();
            if(p0.O) {
                p0.l(i0);
            }
            else {
                p0.d0();
            }
            U.d.K(p0, b0, F0.j.f);
            U.d.K(p0, g00, F0.j.e);
            h h0 = F0.j.g;
            if(p0.O || !j.a(p0.G(), v2)) {
                m5.b.F(v2, p0, v2, h0);
            }
            U.d.K(p0, modifier2, F0.j.d);
            if(z) {
                p0.Q(0x833332D);
                if(scratchCard$Award$Known0 instanceof ScratchCard.Award.CashAward) {
                    p0.Q(0x425447F9);
                    s = w.S(0x7F1203AD, p0);  // string:scratch_card_congratulations_we_have_credited_your_account "Congratulations! 
                                              // We\'ve credited your account"
                }
                else if(scratchCard$Award$Known0 instanceof ScratchCard.Award.CustomAward) {
                    p0.Q(0x425462E5);
                    s = w.S(0x7F1203AC, p0);  // string:scratch_card_congratulations "Congratulations!"
                }
                else {
                    if(scratchCard$Award$Known0 != null) {
                        throw J.c(1112817045, p0, false);
                    }
                    p0.Q(1112829210);
                    s = w.S(0x7F1203B9, p0);  // string:scratch_card_oops "Oops!"
                }
                p0.p(false);
            }
            else {
                p0.Q(138048116);
                s = w.S(0x7F1203C1, p0);  // string:scratch_card_scratch_to_reveal_reward "Scratch to reveal your reward"
            }
            p0.p(false);
            O o0 = ((a)p0.k(b.d)).m;
            i i1 = new i(3);
            m2.b(s, null, v.b, 0L, null, null, null, 0L, null, i1, 0L, 0, false, 0, 0, null, o0, p0, 0x180, 0, 0xFDFA);
            p0.p(true);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new Ea.p(z, scratchCard$Award$Known0, modifier0, v, 0);
        }
    }

    public static final void k(Function0 function00, p p0, int v) {
        p0.S(0x69AA71AA);
        if((((v & 6) == 0 ? (p0.h(function00) ? 4 : 2) | v : v) & 3) != 2 || !p0.x()) {
            O0.f f0 = Pb.a.S(w.S(0x7F1203C3, p0));  // string:scratch_card_terms "By scratching this card, I agree to Wave\'s <u>\'Virtual 
                                                    // Scratch Card\' Promotion Terms</u>"
            Modifier modifier0 = androidx.compose.foundation.a.d(N4.o.j(androidx.compose.foundation.layout.a.k(c.d(l.X, 1.0f), 5.0f, 10.0f), H.f.b(5.0f)), false, null, function00, 7);
            long v1 = yc.d.h(0x7F060016, p0);  // color:Gray400
            O o0 = ((a)p0.k(b.d)).d;
            m2.c(f0, modifier0, v1, 0L, null, null, null, 0L, null, new i(3), 0L, 0, false, 0, 0, null, null, o0, p0, 0, 0, 0x1FDF8);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new Ea.q(v, 0, function00);
        }
    }
}

