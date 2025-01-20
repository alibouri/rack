package Fa;

import Aa.D;
import B.B;
import B.k;
import B.r;
import B.z;
import Ea.K;
import Ea.L;
import Ea.M;
import Ea.N;
import Ea.O;
import Ea.Q;
import Ea.V;
import F0.h;
import F0.i;
import H.e;
import H.f;
import M.J;
import N.m2;
import N4.o;
import Nb.j;
import R2.w;
import U.H;
import U.Z;
import U.d;
import U.g0;
import U.l0;
import U.p;
import android.content.Context;
import androidx.compose.foundation.BorderModifierNodeElement;
import androidx.compose.foundation.layout.c;
import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sendwave.backend.type.Currency.CFA;
import com.sendwave.models.CurrencyAmount;
import com.wave.customer.scratchCardRewards.ScratchCard.Award.CashAward;
import com.wave.customer.scratchCardRewards.ScratchCard.Unlocked.KnownAward;
import com.wave.customer.scratchCardRewards.ScratchCard.Unlocked;
import com.wave.customer.scratchCardRewards.ServerDate;
import g0.a;
import g0.b;
import g0.l;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import n0.U;
import n0.v;

public abstract class m {
    public static final e a;

    static {
        m.a = f.a(6);
        Calendar calendar0 = Calendar.getInstance();
        calendar0.add(10, 50);
        Date date0 = calendar0.getTime();
        j.e(date0, "getTime(...)");
        ServerDate serverDate0 = new ServerDate(date0);
        new O("scp-claimed-active-custom", "https://some-url.com", "1.000F bonus", "Earned on March 3rd", new K(serverDate0), null);
        new M(serverDate0);
        new Q("id-1", "Complete this marvelous challenge", serverDate0, V.b0, null);
        BigDecimal bigDecimal0 = BigDecimal.valueOf(0L);
        ScratchCard.Award.CashAward scratchCard$Award$CashAward0 = new ScratchCard.Award.CashAward(new CurrencyAmount(CFA.X, bigDecimal0));
        new KnownAward("id-1", "Thanks for completing the challenge!", serverDate0, V.b0, null, scratchCard$Award$CashAward0);
    }

    public static final void a(Fa.e e0, String s, String s1, long v, p p0, int v1) {
        p p2;
        p p1;
        int v4;
        p0.S(1919702328);
        int v2 = (v1 & 6) == 0 ? (p0.f(e0) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (p0.f(s) ? 0x20 : 16);
        }
        if((v1 & 0x180) == 0) {
            v2 |= (p0.f(s1) ? 0x100 : 0x80);
        }
        if((v1 & 0xC00) == 0) {
            v2 |= (p0.e(v) ? 0x800 : 0x400);
        }
        if((v2 & 0x493) != 1170 || !p0.x()) {
            B b0 = z.a(k.c, b.m, p0, 0);
            int v3 = p0.P;
            g0 g00 = p0.m();
            Modifier modifier0 = a.d(p0, l.X);
            F0.k.a.getClass();
            i i0 = F0.j.b;
            p0.U();
            if(p0.O) {
                p0.l(i0);
            }
            else {
                p0.d0();
            }
            d.K(p0, b0, F0.j.f);
            d.K(p0, g00, F0.j.e);
            h h0 = F0.j.g;
            if(p0.O || !j.a(p0.G(), v3)) {
                m5.b.F(v3, p0, v3, h0);
            }
            d.K(p0, modifier0, F0.j.d);
            p0.Q(0xB56EF067);
            if(s == null) {
                v4 = v2;
            }
            else {
                O0.O o0 = db.b.a(e0.a(p0).a, p0);
                v4 = v2;
                m2.b(s, null, v, 0L, null, null, null, 0L, null, new Z0.i(5), 0L, 2, false, 1, 0, null, o0, p0, v2 >> 3 & 910, 0xC30, 0xD5FA);
            }
            p1 = p0;
            p1.p(false);
            p1.Q(-1251010007);
            if(s1 == null) {
                p2 = p1;
            }
            else {
                O0.O o1 = db.b.a(e0.a(p1).b, p1);
                m2.b(s1, null, v, 0L, null, null, null, 0L, null, new Z0.i(5), 0L, 2, false, 0, 0, null, o1, p0, v4 >> 6 & 14 | v4 >> 3 & 0x380, 0x30, 0xF5FA);
                p2 = p0;
            }
            p2.p(false);
            p2.p(true);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new Fa.i(e0, s, s1, v, v1);
        }
    }

    public static final void b(Fa.e e0, Modifier modifier0, Function0 function00, w w0, Function3 function30, p p0, int v, int v1) {
        Modifier modifier2;
        Modifier modifier1;
        p0.S(-2087532158);
        int v2 = (v & 6) == 0 ? (p0.f(e0) ? 4 : 2) | v : v;
        if((v1 & 2) != 0) {
            v2 |= 0x30;
            modifier1 = modifier0;
        }
        else if((v & 0x30) == 0) {
            modifier1 = modifier0;
            v2 |= (p0.f(modifier1) ? 0x20 : 16);
        }
        else {
            modifier1 = modifier0;
        }
        if((v & 0x180) == 0) {
            v2 |= (p0.h(function00) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v2 |= (p0.h(w0) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v2 |= (p0.h(function30) ? 0x4000 : 0x2000);
        }
        if((v2 & 9363) != 9362 || !p0.x()) {
            Modifier modifier3 = l.X;
            Modifier modifier4 = (v1 & 2) == 0 ? modifier1 : modifier3;
            Modifier modifier5 = androidx.compose.foundation.a.b(o.j(androidx.compose.foundation.layout.a.c(c.c(modifier4, 1.0f), 1.0f, false), m.a), yc.d.h(0x7F06018F, p0), n0.M.a).d(new BorderModifierNodeElement(1.0f, new U(yc.d.h(0x7F060015, p0)), m.a));  // color:white
            if(function00 != null) {
                modifier3 = androidx.compose.foundation.a.d(modifier3, false, null, function00, 7);
            }
            Modifier modifier6 = modifier5.d(modifier3);
            c0.b b0 = c0.c.c(1718303192, new Aa.l(function30, w0, e0, 4), p0);
            B.e.a(modifier6, b.e, false, b0, p0, 0xC30, 4);
            modifier2 = modifier4;
        }
        else {
            p0.K();
            modifier2 = modifier1;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new Ea.g0(e0, modifier2, function00, w0, function30, v, v1, 1);
        }
    }

    public static final void c(O o0, Fa.e e0, Function0 function00, C3.i i0, p p0, int v, int v1) {
        Function0 function02;
        Fa.e e2;
        int v3;
        Function0 function01;
        Fa.e e1;
        j.f(o0, "card");
        p0.S(0x8F9C85E9);
        int v2 = (v & 6) == 0 ? (((v & 8) == 0 ? p0.f(o0) : p0.h(o0)) ? 4 : 2) | v : v;
        if((v1 & 2) != 0) {
            v2 |= 0x30;
            e1 = e0;
        }
        else if((v & 0x30) == 0) {
            e1 = e0;
            v2 |= (p0.f(e1) ? 0x20 : 16);
        }
        else {
            e1 = e0;
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            function01 = function00;
        }
        else if((v & 0x180) == 0) {
            function01 = function00;
            v2 |= (p0.h(function01) ? 0x100 : 0x80);
        }
        else {
            function01 = function00;
        }
        if((v & 0xC00) == 0) {
            v2 |= (p0.h(i0) ? 0x800 : 0x400);
        }
        if((v2 & 0x493) != 1170 || !p0.x()) {
            Fa.e e3 = (v1 & 2) == 0 ? e1 : Fa.e.X;
            w w0 = null;
            Function0 function03 = (v1 & 4) == 0 ? function01 : null;
            N n0 = o0.c0;
            if(n0.b()) {
                v3 = 0x7F080095;  // drawable:bg_scratch_card_claimed_active_generic
            }
            else {
                v3 = o0.Y == null ? 0x7F080096 : 0x7F080097;  // drawable:bg_scratch_card_claimed_inactive_cash_reward
            }
            K k0 = n0 instanceof K ? ((K)n0) : null;
            if(k0 != null) {
                ServerDate serverDate0 = k0.a;
                if(serverDate0 != null) {
                    w0 = new w(t.c0, serverDate0, i0, 8);
                }
            }
            m.b(e3, null, function03, w0, c0.c.c(0xE5F820C7, new Fa.k(o0, e3, v3), p0), p0, v2 >> 3 & 14 | 0x6000 | v2 & 0x380, 2);
            e2 = e3;
            function02 = function03;
        }
        else {
            p0.K();
            e2 = e1;
            function02 = function01;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new Fa.f(o0, e2, function02, i0, v, v1, 1);
        }
    }

    public static final void d(N n0, Fa.e e0, p p0, int v) {
        Ab.p p1;
        p0.S(0xE3854051);
        int v1 = (v & 6) == 0 ? (((v & 8) == 0 ? p0.f(n0) : p0.h(n0)) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.f(e0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && p0.x()) {
            p0.K();
            goto label_41;
        }
        boolean z = false;
        if(n0 instanceof M) {
            z = true;
            p0.Q(0x189D61D2);
            p1 = new Ab.p(new v(yc.d.h(0x7F06018F, p0)), new v(yc.d.h(0x7F060018, p0)), J2.w.S(0x7F1203B1, p0));  // color:white
            p0.p(false);
        }
        else if(n0 instanceof L) {
            z = true;
            p0.Q(0x189D7393);
            p1 = new Ab.p(new v(yc.d.h(0x7F060036, p0)), new v(yc.d.h(0x7F060030, p0)), J2.w.S(0x7F1203A8, p0));  // color:SuccessGreen700
            p0.p(false);
        }
        if(z) {
            long v2 = ((v)p1.X).a;
            String s = (String)p1.Z;
            l l0 = l.X;
            Modifier modifier0 = androidx.compose.foundation.a.b(c.b(c.d(l0, 1.0f), 0.25f), ((v)p1.Y).a, n0.M.a);
            D0.K k0 = r.e(b.a, false);
            int v3 = p0.P;
            g0 g00 = p0.m();
            Modifier modifier1 = a.d(p0, modifier0);
            F0.k.a.getClass();
            i i0 = F0.j.b;
            p0.U();
            if(p0.O) {
                p0.l(i0);
            }
            else {
                p0.d0();
            }
            d.K(p0, k0, F0.j.f);
            d.K(p0, g00, F0.j.e);
            h h0 = F0.j.g;
            if(p0.O || !j.a(p0.G(), v3)) {
                m5.b.F(v3, p0, v3, h0);
            }
            d.K(p0, modifier1, F0.j.d);
            Modifier modifier2 = androidx.compose.foundation.layout.b.a.a(l0, b.e);
            O0.O o0 = db.b.a(e0.a(p0).a, p0);
            m2.b(s, modifier2, v2, 0L, null, null, null, 0L, null, new Z0.i(3), 0L, 0, false, 0, 0, null, o0, p0, 0, 0, 0xFDF8);
            p0.p(true);
        label_41:
            l0 l00 = p0.r();
            if(l00 != null) {
                l00.d = new Fa.j(n0, e0, v, 1);
            }
            return;
        }
        if(!(n0 instanceof K)) {
            throw J.c(412965048, p0, false);
        }
        p0.Q(0xFB143C0F);
        p0.p(false);
        l0 l01 = p0.r();
        if(l01 != null) {
            l01.d = new Fa.j(n0, e0, v, 0);
        }
    }

    public static final void e(w w0, Fa.e e0, Modifier modifier0, p p0, int v) {
        String s;
        p0.S(881502273);
        int v1 = (v & 6) == 0 ? (p0.h(w0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.f(e0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p0.f(modifier0) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) != 0x92 || !p0.x()) {
            ServerDate serverDate0 = (ServerDate)w0.Z;
            C3.i i0 = (C3.i)w0.b0;
            serverDate0.getClass();
            Date date0 = new Date(serverDate0.X.getTime() - i0.r(true) + 100L);
            p0.Q(0x638C0FF1);
            p0.Q(2005432763);
            Object object0 = p0.G();
            Z z0 = U.l.a;
            if(object0 == z0) {
                object0 = new ParcelableSnapshotMutableLongState(date0.getTime() - System.currentTimeMillis());
                p0.a0(object0);
            }
            p0.p(false);
            p0.Q(2005436138);
            boolean z1 = p0.h(date0);
            Object object1 = p0.G();
            if(z1 || object1 == z0) {
                object1 = new Ea.i(date0, ((ParcelableSnapshotMutableLongState)object0), null);
                p0.a0(object1);
            }
            p0.p(false);
            H.d(p0, date0, ((Function2)object1));
            long v2 = ((ParcelableSnapshotMutableLongState)object0).k();
            int v3 = (int)(v2 / Ea.j.a);
            int v4 = (int)(v2 % Ea.j.a / Ea.j.b);
            int v5 = (int)(v2 % Ea.j.b / Ea.j.c);
            int v6 = (int)(v2 % Ea.j.c / Ea.j.d);
            p0.Q(0x917C6AFF);
            if(v3 > 0) {
                p0.Q(0xB66CB429);
                s = ((Context)p0.k(AndroidCompositionLocals_androidKt.b)).getResources().getQuantityString(0x7F100005, v3, new Object[]{v3});  // plurals:scratch_card_expires_in_x_days
                p0.p(false);
            }
            else if(v4 > 0) {
                p0.Q(-1234383300);
                s = J2.w.T(0x7F1203B3, new Object[]{v4, v5, v6}, p0);  // string:scratch_card_expires_in_x_hours_minutes_seconds "%d:%02d:%02d remaining"
                p0.p(false);
            }
            else if(v5 > 0) {
                p0.Q(-1234375018);
                s = J2.w.T(0x7F1203B4, new Object[]{v5, v6}, p0);  // string:scratch_card_expires_in_x_minutes_seconds "%d:%02d remaining"
                p0.p(false);
            }
            else if(v6 >= 0) {
                p0.Q(0xB66D0A11);
                s = J2.w.T(0x7F1203B5, new Object[]{v6}, p0);  // string:scratch_card_expires_in_x_seconds "%d remaining"
                p0.p(false);
            }
            else {
                p0.Q(389388340);
                p0.p(false);
                s = null;
            }
            p0.p(false);
            p0.p(false);
            if(s != null) {
                Modifier modifier1 = o.j(modifier0, f.b(32.0f));
                long v7 = yc.d.h(0x7F06018F, p0);  // color:white
                e e1 = f.b(32.0f);
                Modifier modifier2 = modifier1.d(new BorderModifierNodeElement(1.0f, new U(v7), e1));
                t t0 = (t)w0.Y;
                Modifier modifier3 = androidx.compose.foundation.layout.a.i(androidx.compose.foundation.a.b(modifier2, yc.d.h(t0.X, p0), n0.M.a), e0.a(p0).d);
                B b0 = z.a(k.c, b.m, p0, 0);
                int v8 = p0.P;
                g0 g00 = p0.m();
                Modifier modifier4 = a.d(p0, modifier3);
                F0.k.a.getClass();
                i i1 = F0.j.b;
                p0.U();
                if(p0.O) {
                    p0.l(i1);
                }
                else {
                    p0.d0();
                }
                d.K(p0, b0, F0.j.f);
                d.K(p0, g00, F0.j.e);
                h h0 = F0.j.g;
                if(p0.O || !j.a(p0.G(), v8)) {
                    m5.b.F(v8, p0, v8, h0);
                }
                d.K(p0, modifier4, F0.j.d);
                O0.O o0 = db.b.a(e0.a(p0).c, p0);
                m2.b(s, null, yc.d.h(t0.Y, p0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o0, p0, 0, 0, 0xFFFA);
                p0.p(true);
            }
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new D(w0, e0, modifier0, v, 5);
        }
    }

    public static final void f(int v, Fa.e e0, Modifier modifier0, w w0, Function0 function00, Function2 function20, p p0, int v1, int v2) {
        Modifier modifier2;
        Function2 function21;
        Modifier modifier1;
        p0.S(0xDA27E609);
        int v3 = (v1 & 6) == 0 ? (p0.d(v) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v3 |= (p0.f(e0) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
            modifier1 = modifier0;
        }
        else if((v1 & 0x180) == 0) {
            modifier1 = modifier0;
            v3 |= (p0.f(modifier1) ? 0x100 : 0x80);
        }
        else {
            modifier1 = modifier0;
        }
        if((v1 & 0xC00) == 0) {
            v3 |= (p0.h(w0) ? 0x800 : 0x400);
        }
        if((v1 & 0x6000) == 0) {
            v3 |= (p0.h(function00) ? 0x4000 : 0x2000);
        }
        if((v2 & 0x20) != 0) {
            v3 |= 0x30000;
            function21 = function20;
        }
        else if((0x30000 & v1) == 0) {
            function21 = function20;
            v3 |= (p0.h(function21) ? 0x20000 : 0x10000);
        }
        else {
            function21 = function20;
        }
        if((74899 & v3) != 74898 || !p0.x()) {
            Modifier modifier3 = (v2 & 4) == 0 ? modifier1 : l.X;
            Function2 function22 = (v2 & 0x20) == 0 ? function21 : Fa.p.a;
            m.b(e0, modifier3, function00, w0, c0.c.c(0xEC9E0367, new Fa.l(v, 0, function22), p0), p0, v3 >> 3 & 0x70 | (v3 >> 3 & 14 | 0x6000) | v3 >> 6 & 0x380 | v3 & 0x1C00, 0);
            modifier2 = modifier3;
            function21 = function22;
        }
        else {
            p0.K();
            modifier2 = modifier1;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new Fa.h(v, e0, modifier2, w0, function00, function21, v1, v2);
        }
    }

    public static final void g(Fa.e e0, String s, long v, long v1, p p0, int v2) {
        p0.S(0xA56FD76);
        int v3 = (v2 & 6) == 0 ? (p0.f(e0) ? 4 : 2) | v2 : v2;
        if((v2 & 0x30) == 0) {
            v3 |= (p0.f(s) ? 0x20 : 16);
        }
        if((v2 & 0x180) == 0) {
            v3 |= (p0.e(v) ? 0x100 : 0x80);
        }
        if((v2 & 0xC00) == 0) {
            v3 |= (p0.e(v1) ? 0x800 : 0x400);
        }
        if((v3 & 0x493) == 1170 && p0.x()) {
            p0.K();
        }
        else if(s != null) {
            Modifier modifier0 = androidx.compose.foundation.a.b(o.j(androidx.compose.foundation.layout.a.l(c.d(l.X, 1.0f), 16.0f, 0.0f, 2), f.b(8.0f)), v1, n0.M.a);
            B b0 = z.a(k.c, b.n, p0, 0x30);
            int v4 = p0.P;
            g0 g00 = p0.m();
            Modifier modifier1 = a.d(p0, modifier0);
            F0.k.a.getClass();
            i i0 = F0.j.b;
            p0.U();
            if(p0.O) {
                p0.l(i0);
            }
            else {
                p0.d0();
            }
            d.K(p0, b0, F0.j.f);
            d.K(p0, g00, F0.j.e);
            h h0 = F0.j.g;
            if(p0.O || !j.a(p0.G(), v4)) {
                m5.b.F(v4, p0, v4, h0);
            }
            d.K(p0, modifier1, F0.j.d);
            O0.O o0 = db.b.a(e0.a(p0).a, p0);
            m2.b(s, null, v, 0L, null, null, null, 0L, null, new Z0.i(3), 0L, 2, false, 2, 0, null, o0, p0, v3 >> 3 & 14 | v3 & 0x380, 0xC30, 0xD5FA);
            p0.p(true);
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new g(e0, s, v, v1, v2);
        }
    }

    public static final void h(Q q0, Fa.e e0, Function0 function00, C3.i i0, p p0, int v, int v1) {
        Function0 function02;
        Fa.e e2;
        Function0 function01;
        Fa.e e1;
        j.f(q0, "card");
        p0.S(0x3B047D19);
        int v2 = (v & 6) == 0 ? (p0.h(q0) ? 4 : 2) | v : v;
        if((v1 & 2) != 0) {
            v2 |= 0x30;
            e1 = e0;
        }
        else if((v & 0x30) == 0) {
            e1 = e0;
            v2 |= (p0.f(e1) ? 0x20 : 16);
        }
        else {
            e1 = e0;
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            function01 = function00;
        }
        else if((v & 0x180) == 0) {
            function01 = function00;
            v2 |= (p0.h(function01) ? 0x100 : 0x80);
        }
        else {
            function01 = function00;
        }
        if((v & 0xC00) == 0) {
            v2 |= (p0.h(i0) ? 0x800 : 0x400);
        }
        if((v2 & 0x493) != 1170 || !p0.x()) {
            Fa.e e3 = (v1 & 2) == 0 ? e1 : Fa.e.X;
            w w0 = null;
            Function0 function03 = (v1 & 4) == 0 ? function01 : null;
            V v3 = q0.b0;
            ServerDate serverDate0 = q0.Z;
            if(serverDate0 != null) {
                w0 = new w(t.b0, serverDate0, i0, 8);
            }
            c0.b b0 = c0.c.c(-1034039810, new Aa.t(e3, 4, q0), p0);
            m.f(v3.Y, e3, null, w0, function03, b0, p0, v2 & 0x70 | 0x30000 | v2 << 6 & 0xE000, 4);
            e2 = e3;
            function02 = function03;
        }
        else {
            p0.K();
            e2 = e1;
            function02 = function01;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new Fa.f(q0, e2, function02, i0, v, v1, 0);
        }
    }

    public static final void i(ScratchCard.Unlocked scratchCard$Unlocked0, Fa.e e0, boolean z, Function0 function00, C3.i i0, p p0, int v, int v1) {
        boolean z2;
        Fa.e e2;
        Modifier modifier0;
        int v6;
        int v4;
        Function0 function01;
        boolean z1;
        Fa.e e1;
        j.f(scratchCard$Unlocked0, "card");
        p0.S(207694631);
        int v2 = (v & 6) == 0 ? (((v & 8) == 0 ? p0.f(scratchCard$Unlocked0) : p0.h(scratchCard$Unlocked0)) ? 4 : 2) | v : v;
        if((v1 & 2) != 0) {
            v2 |= 0x30;
            e1 = e0;
        }
        else if((v & 0x30) == 0) {
            e1 = e0;
            v2 |= (p0.f(e1) ? 0x20 : 16);
        }
        else {
            e1 = e0;
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            z1 = z;
        }
        else if((v & 0x180) == 0) {
            z1 = z;
            v2 |= (p0.g(z1) ? 0x100 : 0x80);
        }
        else {
            z1 = z;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            function01 = function00;
        }
        else if((v & 0xC00) == 0) {
            function01 = function00;
            v2 |= (p0.h(function01) ? 0x800 : 0x400);
        }
        else {
            function01 = function00;
        }
        if((v & 0x6000) == 0) {
            v2 |= (p0.h(i0) ? 0x4000 : 0x2000);
        }
        if((v2 & 9363) != 9362 || !p0.x()) {
            Fa.e e3 = (v1 & 2) == 0 ? e1 : Fa.e.X;
            boolean z3 = (v1 & 4) == 0 ? z1 : false;
            Function0 function02 = (v1 & 8) == 0 ? function01 : null;
            int v3 = scratchCard$Unlocked0.d().X;
            p0.Q(0xEA3DE0B8);
            l l0 = l.X;
            if(z3) {
                p0.Q(0x4EAB1C54);
                Sb.d d0 = new Sb.d(500, 3000, 1);  // initializer: LSb/b;-><init>(III)V
                p0.Q(0x2F44B5ED);
                Object object0 = p0.G();
                Z z4 = U.l.a;
                if(object0 == z4) {
                    j.f(Qb.e.X, "random");
                    try {
                        v4 = yc.d.t(Qb.e.X, d0);
                    }
                    catch(IllegalArgumentException illegalArgumentException0) {
                        throw new NoSuchElementException(illegalArgumentException0.getMessage());
                    }
                    object0 = v4;
                    p0.a0(object0);
                }
                int v5 = ((Number)object0).intValue();
                p0.p(false);
                v.K k0 = v.c.h(null, p0, 1);
                p0.Q(0x2F44EAAF);
                boolean z5 = p0.d(3500);
                Object object1 = p0.G();
                if(z5 || object1 == z4) {
                    object1 = new Fa.D(v5, 3500);
                    p0.a0(object1);
                }
                p0.p(false);
                v.M m0 = new v.M();
                ((Function1)object1).n(m0);
                v6 = v3;
                E e4 = new E(2.0f, v.c.c(k0, 3.141593f, v.c.g(new v.N(m0), 1, 4), "Infinite jiggle", p0, 0x7038, 0));
                p0.p(false);
                modifier0 = androidx.compose.foundation.layout.a.g(l0, new Ba.l(3, e4));
            }
            else {
                v6 = v3;
                modifier0 = l0;
            }
            p0.p(false);
            ServerDate serverDate0 = scratchCard$Unlocked0.i();
            m.f(v6, e3, modifier0, (serverDate0 == null ? null : new w(t.Z, serverDate0, i0, 8)), function02, null, p0, v2 & 0x70 | v2 << 3 & 0xE000, 0x20);
            e2 = e3;
            z2 = z3;
            function01 = function02;
        }
        else {
            p0.K();
            e2 = e1;
            z2 = z1;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new Wa.g(scratchCard$Unlocked0, e2, z2, function01, i0, v, v1);
        }
    }
}

