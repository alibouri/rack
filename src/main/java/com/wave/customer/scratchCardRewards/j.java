package com.wave.customer.scratchCardRewards;

import Aa.E;
import Aa.H;
import B.H0;
import B.K0;
import B.k;
import B.r;
import B.v0;
import B.x0;
import D.A;
import D.B;
import D0.K;
import Ea.P0;
import Ea.W;
import Ea.X;
import Ea.Y;
import Ea.d0;
import Ea.f0;
import Ea.i0;
import Ea.j0;
import Ea.k0;
import Ea.m0;
import Ea.p0;
import F0.h;
import F0.i;
import Fa.C;
import Fa.c;
import Fa.u;
import H.f;
import M.J;
import N.m2;
import N4.o;
import P.n;
import U.O0;
import U.Z;
import U.d;
import U.g0;
import U.l0;
import U.p;
import androidx.compose.foundation.layout.a;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Density;
import bb.e;
import c0.b;
import com.sendwave.models.CurrencyAmount;
import g0.l;
import io.sentry.g1;
import java.util.Calendar;
import java.util.Date;
import kotlin.jvm.functions.Function0;
import n0.M;
import n0.v;
import s.x;
import v.w;

public abstract class j {
    public static final int a;

    static {
        Calendar calendar0 = Calendar.getInstance();
        calendar0.add(10, 50);
        Date date0 = calendar0.getTime();
        Nb.j.e(date0, "getTime(...)");
        new ServerDate(date0);
    }

    public static final void a(c c0, long v, b b0, p p0, int v1) {
        p0.S(0x693EB8DB);
        int v2 = (v1 & 6) == 0 ? (((v1 & 8) == 0 ? p0.f(c0) : p0.h(c0)) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (p0.e(v) ? 0x20 : 16);
        }
        if((v1 & 0x180) == 0) {
            v2 |= (p0.h(b0) ? 0x100 : 0x80);
        }
        if((v2 & 0x93) != 0x92 || !p0.x()) {
            p0.M();
            if((v1 & 1) != 0 && !p0.w()) {
                p0.K();
            }
            p0.q();
            l l0 = l.X;
            Modifier modifier0 = a.j(androidx.compose.foundation.a.b(o.j(androidx.compose.foundation.layout.c.q(androidx.compose.foundation.layout.c.d(l0, 1.0f), g0.b.k, 2), f.b(8.0f)), v, M.a), 16.0f);
            x0 x00 = v0.b(k.a, g0.b.k, p0, 0x30);
            int v3 = p0.P;
            g0 g00 = p0.m();
            Modifier modifier1 = g0.a.d(p0, modifier0);
            F0.k.a.getClass();
            i i0 = F0.j.b;
            p0.U();
            if(p0.O) {
                p0.l(i0);
            }
            else {
                p0.d0();
            }
            d.K(p0, x00, F0.j.f);
            d.K(p0, g00, F0.j.e);
            h h0 = F0.j.g;
            if(p0.O || !Nb.j.a(p0.G(), v3)) {
                m5.b.F(v3, p0, v3, h0);
            }
            d.K(p0, modifier1, F0.j.d);
            R2.f.c(c0, androidx.compose.foundation.layout.c.k(a.n(l0, 0.0f, 0.0f, 16.0f, 0.0f, 11), 40.0f), p0, v2 & 14 | 0x1B0);
            m2.a(db.b.a(((db.a)p0.k(db.b.d)).h, p0), c0.c.c(0x9987A670, new p0(b0, 0), p0), p0, 0x30);
            p0.p(true);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new i0(c0, v, b0, v1);
        }
    }

    public static final void b(g1 g10, Function0 function00, CurrencyAmount currencyAmount0, boolean z, p p0, int v) {
        long v4;
        p0.S(0x7A83F948);
        int v1 = (v & 6) == 0 ? (((v & 8) == 0 ? p0.f(g10) : p0.h(g10)) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.h(function00) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p0.f(currencyAmount0) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (p0.g(z) ? 0x800 : 0x400);
        }
        if((v1 & 0x493) != 1170 || !p0.x()) {
            if(z) {
                p0.Q(-1965801197);
                long v2 = yc.d.h(0x7F060047, p0);  // color:WaveBlue50
                long v3 = v.b(1.0f - ((e)g10.Y).a(), v2);
                p0.p(false);
                v4 = v3;
            }
            else {
                v4 = J.b(p0, 0x8AE165AA, 0x7F060047, p0, false);  // color:WaveBlue50
            }
            b b0 = c0.c.c(2017753625, new H(function00, g10, currencyAmount0), p0);
            W4.f.d(d0.b, d0.a, ((e)g10.Y), v4, 0.0f, b0, p0, 0x30036, 16);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new j0(g10, function00, currencyAmount0, z, v);
        }
    }

    public static final void c(Y y0, p p0, int v) {
        p0.S(203626548);
        if((((v & 6) == 0 ? (((v & 8) == 0 ? p0.f(y0) : p0.h(y0)) ? 4 : 2) | v : v) & 3) == 2 && p0.x()) {
            p0.K();
        }
        else {
            if(y0 instanceof X) {
                p0.Q(0xE5829331);
                j.f(((X)y0), p0, 0);
                p0.p(false);
                goto label_17;
            }
            if(y0 instanceof W) {
                p0.Q(0xE5829DE4);
                j.d(0, p0);
                p0.p(false);
            }
            else if(y0 == null) {
                p0.Q(-892222890);
                p0.p(false);
            }
            else {
                throw J.c(-444429202, p0, false);
            }
        }
    label_17:
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new Aa.d(v, 2, y0);
        }
    }

    public static final void d(int v, p p0) {
        p0.S(0xAA5C4615);
        if(v != 0 || !p0.x()) {
            j.a(new Fa.a(0x7F0802B5), yc.d.h(0x7F06001A, p0), Ea.h.e, p0, 0x180);  // drawable:ic_wifi_off_32dp
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new E(v, 3);
        }
    }

    public static final void e(P0 p00, f0 f00, A a0, C3.i i0, u u0, p p0, int v, int v1) {
        u u2;
        A a1;
        n n1;
        A a4;
        O0 o01;
        Z z1;
        u u3;
        int v3;
        A a2;
        u u1;
        Nb.j.f(p00, "uiState");
        Nb.j.f(f00, "callbacks");
        p0.S(0xAC8B04F4);
        int v2 = (v & 6) == 0 ? (p0.h(p00) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v2 |= (p0.f(f00) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v2 |= 0x80;
        }
        if((v & 0xC00) == 0) {
            v2 |= (p0.h(i0) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
            u1 = u0;
        }
        else if((v & 0x6000) == 0) {
            u1 = u0;
            v2 |= (p0.f(u1) ? 0x4000 : 0x2000);
        }
        else {
            u1 = u0;
        }
        if((v2 & 9363) != 9362 || !p0.x()) {
            p0.M();
            if((v & 1) == 0 || p0.w()) {
                A a3 = B.a(p0);
                if((v1 & 16) == 0) {
                    v3 = v2 & -897;
                    u3 = u1;
                }
                else {
                    u3 = u.Y;
                    v3 = v2 & -897;
                }
                a2 = a3;
            }
            else {
                p0.K();
                a2 = a0;
                v3 = v2 & -897;
                u3 = u1;
            }
            p0.q();
            g1 g10 = W4.f.m(p0);
            n n0 = W4.f.K(p00.d, f00.f, p0, 0);
            Function0 function00 = f00.d;
            Nb.j.f(function00, "onClosed");
            p0.Q(0xCAACE1CB);
            O0 o00 = G0.f0.f;
            Density density0 = (Density)p0.k(o00);
            p0.Q(0x22AE6491);
            Object object0 = p0.G();
            Z z0 = U.l.a;
            if(object0 == z0) {
                x x0 = new x();
                x0.e(u.Y, 0.0f);
                x0.e(u.X, 1.0f);
                z1 = z0;
                o01 = o00;
                a4 = a2;
                n1 = n0;
                C c0 = new C(new N.v(u3, new y.p0(x0), new Aa.p(15), new Aa.n(5, density0), v.c.j(0, 0, null, 7), new w(new P.a(1.0f, 0.1f))), function00);
                p0.a0(c0);
                object0 = c0;
            }
            else {
                z1 = z0;
                o01 = o00;
                a4 = a2;
                n1 = n0;
            }
            p0.p(false);
            p0.p(false);
            Object object1 = p0.G();
            if(object1 == z1) {
                U.w w0 = new U.w(U.H.h(p0));
                p0.a0(w0);
                object1 = w0;
            }
            dc.e e0 = ((U.w)object1).X;
            l l0 = l.X;
            Modifier modifier0 = androidx.compose.foundation.layout.c.c(l0, 1.0f);
            K k0 = r.e(g0.b.a, false);
            int v4 = p0.P;
            g0 g00 = p0.m();
            Modifier modifier1 = g0.a.d(p0, modifier0);
            F0.k.a.getClass();
            i i1 = F0.j.b;
            p0.U();
            if(p0.O) {
                p0.l(i1);
            }
            else {
                p0.d0();
            }
            d.K(p0, k0, F0.j.f);
            d.K(p0, g00, F0.j.e);
            h h0 = F0.j.g;
            if(p0.O || !Nb.j.a(p0.G(), v4)) {
                m5.b.F(v4, p0, v4, h0);
            }
            d.K(p0, modifier1, F0.j.d);
            Modifier modifier2 = androidx.compose.ui.input.nestedscroll.a.a(U5.a.J(K0.a(androidx.compose.foundation.a.b(K0.a(l0, B.d.f(p0).e), yc.d.h(0x7F060047, p0), M.a), B.d.f(p0).f), n1, true), ((bb.d)g10.Z), null);  // color:WaveBlue50
            long v5 = yc.d.h(0x7F06018F, p0);  // color:white
            N4.j.e(c0.c.c(0x42907DD5, new H(g10, f00, p00, 3), p0), modifier2, null, v5, c0.c.c(0x38E26B6E, new Aa.M(p00, a4, f00, i0, e0, ((C)object0), n1, 1), p0), p0, 0x6006, 4);
            Modifier modifier3 = K0.a(l0, B.d.f(p0).e);
            T4.l.l(p00.b, i0, modifier3, ((C)object0), p0, v3 >> 6 & 0x70);
            Modifier modifier4 = androidx.compose.foundation.layout.c.d(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.b.a.a(l0, g0.b.h), yc.d.h(0x7F06007B, p0), M.a), 1.0f);  // color:black
            H0 h00 = B.d.f(p0);
            r.a(androidx.compose.foundation.layout.c.e(modifier4, ((Density)p0.k(o01)).i0(h00.e.e().d)), p0, 0);
            p0.p(true);
            a1 = a4;
            u2 = u3;
        }
        else {
            p0.K();
            a1 = a0;
            u2 = u1;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new Ea.g0(p00, f00, a1, i0, u2, v, v1, 0);
        }
    }

    public static final void f(X x0, p p0, int v) {
        p0.S(0xB55387D9);
        if((((v & 6) == 0 ? (p0.f(x0) ? 4 : 2) | v : v) & 3) != 2 || !p0.x()) {
            s0.b b0 = yc.l.y(0x7F080215, p0, 0);  // drawable:ic_circle_white
            s0.b b1 = yc.l.y(0x7F080215, p0, 0);  // drawable:ic_circle_white
            Fa.b b2 = new Fa.b(x0.b, b0, b1);
            b b3 = c0.c.c(0x1ECD84AB, new Aa.x(3, x0), p0);
            j.a(b2, x0.c, b3, p0, 0x180);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new Aa.d(v, 3, x0);
        }
    }

    public static final void g(Modifier modifier0, p p0, int v) {
        p0.S(-1825216610);
        if((((v & 6) == 0 ? (p0.f(modifier0) ? 4 : 2) | v : v) & 3) != 2 || !p0.x()) {
            B.e.b(p0, androidx.compose.foundation.a.b(o.j(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.c.e(androidx.compose.foundation.layout.c.d(modifier0, 1.0f), 16.0f), yc.d.h(0x7F060047, p0), M.a), f.c(16.0f, 16.0f, 0.0f, 0.0f)), yc.d.h(0x7F06018F, p0), M.a));  // color:WaveBlue50
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new m0(v, 0, modifier0);
        }
    }

    public static final void h(float f, CurrencyAmount currencyAmount0, p p0, int v) {
        p0.S(-595809033);
        int v1 = (v & 6) == 0 ? (p0.c(f) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.f(currencyAmount0) ? 0x20 : 16);
        }
        if((v1 & 19) != 18 || !p0.x()) {
            Modifier modifier0 = a.l(androidx.compose.foundation.layout.c.c(l.X, 1.0f), 0.0f, 10.0f, 1);
            b b0 = c0.c.c(0xA84E53F9, new Aa.x(4, currencyAmount0), p0);
            W4.f.b(f, modifier0, Ea.h.d, b0, p0, v1 & 14 | 0xDB0);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new k0(f, currencyAmount0, v);
        }
    }

    public static final void i(int v, p p0) {
        p0.S(0xA75A65F2);
        if(v != 0 || !p0.x()) {
            m2.b(J2.w.S(0x7F1203C7, p0), a.n(l.X, 0.0f, 8.0f, 0.0f, 0.0f, 13), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((db.a)p0.k(db.b.d)).i, p0, 0x30, 0, 0xFFFC);  // string:scratch_card_your_rewards "Your Rewards"
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new E(v, 4);
        }
    }
}

