package com.wave.customer.scratchCardRewards.components;

import Aa.A;
import Aa.E;
import Ab.k;
import Ab.t;
import B.r;
import B.v0;
import B.x0;
import B.z;
import Bb.F;
import Bb.q;
import D0.K;
import Ea.B;
import Ea.e0;
import Ea.m0;
import F0.h;
import F0.i;
import F0.j;
import Fa.G;
import Fa.I;
import Fa.J;
import Fa.L;
import Fa.N;
import Fa.O;
import Fa.S;
import Fa.T;
import Fa.U;
import Fa.V;
import H.f;
import J2.w;
import N.M0;
import N.m2;
import N4.o;
import U.Z;
import U.g0;
import U.l0;
import U.p;
import a8.Q;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexElement;
import c0.c;
import da.e;
import g0.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import n0.M;
import t0.H;
import yc.d;

public abstract class g {
    public static final int a;

    static {
        new RewardsPathState(10, 35, F.K(new k[]{new k(8, new ScratchCard(1, null)), new k(10, new ScratchCard(10, null))}), F.K(new k[]{new k(12, new ScratchCard(12, null)), new k(16, new ScratchCard(16, null)), new k(21, new ScratchCard(21, null))}), new Instructions("Earned by paying at mamadou chicken", q.L(new String[]{"Earn a step when you spend 350F or more", "Unlock rewards when you reach milestones", "Each week you can earn 10 steps total. Maximum 1 step per merchant per week"})));
    }

    public static final void a(int v, Reward rewardsPathState$Reward0, p p0, int v1) {
        p0.S(0x9F895DB3);
        int v2 = (v1 & 6) == 0 ? (p0.d(v) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (((v1 & 0x40) == 0 ? p0.f(rewardsPathState$Reward0) : p0.h(rewardsPathState$Reward0)) ? 0x20 : 16);
        }
        if((v2 & 19) != 18 || !p0.x()) {
            g.m(v, null, c.c(0xA15757E7, new a(rewardsPathState$Reward0), p0), p0, v2 & 14 | 0x180, 2);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new B(v, rewardsPathState$Reward0, v1, 2);
        }
    }

    public static final void b(int v, p p0, int v1) {
        p0.S(0x4B922D5F);
        int v2 = (v1 & 6) == 0 ? (p0.d(v) ? 4 : 2) | v1 : v1;
        if((v2 & 3) != 2 || !p0.x()) {
            g.m(v, null, Fa.q.d, p0, v2 & 14 | 0x180, 2);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new J(v, v1, 0);
        }
    }

    public static final void c(int v, p p0, int v1) {
        p0.S(-2006381653);
        int v2 = (v1 & 6) == 0 ? (p0.d(v) ? 4 : 2) | v1 : v1;
        if((v2 & 3) != 2 || !p0.x()) {
            g.f(v, Fa.q.f, p0, v2 & 14 | 0x30);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new J(v, v1, 2);
        }
    }

    public static final void d(int v, Reward rewardsPathState$Reward0, p p0, int v1) {
        p0.S(0xE2B565E1);
        int v2 = (v1 & 6) == 0 ? (p0.d(v) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (((v1 & 0x40) == 0 ? p0.f(rewardsPathState$Reward0) : p0.h(rewardsPathState$Reward0)) ? 0x20 : 16);
        }
        if((v2 & 19) != 18 || !p0.x()) {
            g.f(v, c.c(0x14A18AFA, new b(rewardsPathState$Reward0), p0), p0, v2 & 14 | 0x30);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new B(v, rewardsPathState$Reward0, v1, 1);
        }
    }

    public static final void e(int v, p p0) {
        p0.S(0xE1C0ADCB);
        if(v != 0 || !p0.x()) {
            g.f(0, Fa.q.g, p0, 54);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new E(v, 5);
        }
    }

    public static final void f(int v, c0.b b0, p p0, int v1) {
        p0.S(0xACACAED2);
        int v2 = (v1 & 6) == 0 ? (p0.d(v) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (p0.h(b0) ? 0x20 : 16);
        }
        if((v2 & 19) != 18 || !p0.x()) {
            g.m(v, new ZIndexElement(1.0f), c.c(-1220086498, new U(b0, 0), p0), p0, v2 & 14 | 0x1B0, 0);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new e(v, b0, v1, 2);
        }
    }

    public static final void g(long v, p p0, int v1) {
        p0.S(0xC97E6959);
        if((((v1 & 6) == 0 ? (p0.e(v) ? 4 : 2) | v1 : v1) & 3) != 2 || !p0.x()) {
            r.a(androidx.compose.foundation.a.b(o.j(androidx.compose.foundation.layout.c.k(l.X, 16.0f), f.a), v, M.a), p0, 0);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new L(v, v1);
        }
    }

    public static final void h(long v, long v1, p p0, int v2) {
        p0.S(0x21F7AFB6);
        int v3 = (v2 & 6) == 0 ? (p0.e(v) ? 4 : 2) | v2 : v2;
        if((v2 & 0x30) == 0) {
            v3 |= 16;
        }
        if((v3 & 19) != 18 || !p0.x()) {
            p0.M();
            if((v2 & 1) == 0 || p0.w()) {
                v1 = d.h(0x7F06018F, p0);  // color:white
            }
            else {
                p0.K();
            }
            p0.q();
            l l0 = l.X;
            Modifier modifier0 = androidx.compose.foundation.a.b(o.j(androidx.compose.foundation.layout.c.k(l0, 16.0f), f.a), v, M.a);
            K k0 = r.e(g0.b.e, false);
            int v4 = p0.P;
            g0 g00 = p0.m();
            Modifier modifier1 = g0.a.d(p0, modifier0);
            F0.k.a.getClass();
            i i0 = j.b;
            p0.U();
            if(p0.O) {
                p0.l(i0);
            }
            else {
                p0.d0();
            }
            U.d.K(p0, k0, j.f);
            U.d.K(p0, g00, j.e);
            h h0 = j.g;
            if(p0.O || !Nb.j.a(p0.G(), v4)) {
                m5.b.F(v4, p0, v4, h0);
            }
            U.d.K(p0, modifier1, j.d);
            M0.a(yc.l.y(0x7F08020A, p0, 0), "", androidx.compose.foundation.layout.c.k(l0, 9.0f), v1, p0, 0x1B0, 0);  // drawable:ic_check_blue_19
            p0.p(true);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new O(v, v1, v2);
        }
    }

    public static final void i(int v, p p0, int v1) {
        p0.S(0x7E2FFD26);
        int v2 = (v1 & 6) == 0 ? (p0.d(v) ? 4 : 2) | v1 : v1;
        if((v2 & 3) != 2 || !p0.x()) {
            x0 x00 = v0.b(B.k.a, g0.b.l, p0, 0x30);
            int v3 = p0.P;
            g0 g00 = p0.m();
            Modifier modifier0 = g0.a.d(p0, l.X);
            F0.k.a.getClass();
            i i0 = j.b;
            p0.U();
            if(p0.O) {
                p0.l(i0);
            }
            else {
                p0.d0();
            }
            U.d.K(p0, x00, j.f);
            U.d.K(p0, g00, j.e);
            h h0 = j.g;
            if(p0.O || !Nb.j.a(p0.G(), v3)) {
                m5.b.F(v3, p0, v3, h0);
            }
            U.d.K(p0, modifier0, j.d);
            g.m(v, null, Fa.q.b, p0, v2 & 14 | 0x180, 2);
            g.m(v + 1, null, Fa.q.c, p0, 0x180, 2);
            g.m(v + 2, null, null, p0, 0, 6);
            p0.p(true);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new J(v, v1, 1);
        }
    }

    public static final void j(int v, p p0, int v1) {
        p0.S(0x2A0DF7EE);
        int v2 = (v1 & 6) == 0 ? (p0.d(v) ? 4 : 2) | v1 : v1;
        if((v2 & 3) != 2 || !p0.x()) {
            g.m(v, null, Fa.q.h, p0, v2 & 14 | 0x180, 2);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new J(v, v1, 4);
        }
    }

    public static final void k(Function0 function00, Modifier modifier0, p p0, int v, int v1) {
        Nb.j.f(function00, "progressFn");
        p0.S(0x906A386F);
        int v2 = (v & 6) == 0 ? (p0.h(function00) ? 4 : 2) | v : v;
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (p0.f(modifier0) ? 0x20 : 16);
        }
        if((v2 & 19) != 18 || !p0.x()) {
            if((v1 & 2) != 0) {
                modifier0 = l.X;
            }
            long v3 = d.h(0x7F060047, p0);  // color:WaveBlue50
            H h0 = t0.a.c(M6.b.W(0x7F080087, p0), p0);  // drawable:bg_parallax_gift
            H h1 = t0.a.c(M6.b.W(0x7F080083, p0), p0);  // drawable:bg_cloud
            Modifier modifier1 = androidx.compose.foundation.layout.c.b(androidx.compose.foundation.layout.c.d(modifier0, 1.0f), 1.0f);
            p0.Q(0xE099886F);
            boolean z = p0.e(v3);
            boolean z1 = p0.h(h1);
            boolean z2 = p0.h(h0);
            Object object0 = p0.G();
            if(((v2 & 14) == 4 | z | z1 | z2) != 0 || object0 == U.l.a) {
                object0 = new S(function00, v3, h1, h0);
                p0.a0(object0);
            }
            p0.p(false);
            I2.J.a(modifier1, ((Function1)object0), p0, 0);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new T(function00, modifier0, v, v1);
        }
    }

    public static final void l(s0.b b0, p0.d d0, float f, float f1, float f2, float f3, float f4, float f5, Function1 function10) {
        float f6 = (f5 * 2.0f + 1.0f) * m0.e.d(d0.d());
        float f7 = ((f3 * f6 - f * f2) % f6 + f6) % f6 - m0.e.d(d0.d()) * f5;
        float f8 = m0.e.b(d0.d()) * f4;
        ((g3.b)d0.A().Y).t(f7, f8);
        float f9 = 1.0f / f1;
        try {
            long v1 = d.d(m0.e.d(b0.h()) / 2.0f, m0.e.b(b0.h()) / 2.0f);
            Q q0 = d0.A();
            long v2 = q0.A();
            q0.o().n();
            try {
                ((g3.b)q0.Y).s(f9, f9, v1);
                function10.n(d0);
            }
            catch(Throwable throwable0) {
                q0.o().l();
                q0.T(v2);
                throw throwable0;
            }
            q0.o().l();
            q0.T(v2);
        }
        finally {
            ((g3.b)d0.A().Y).t(-f7, -f8);
        }
    }

    public static final void m(int v, Modifier modifier0, Function3 function30, p p0, int v1, int v2) {
        Function3 function32;
        Modifier modifier2;
        Function3 function31;
        Modifier modifier1;
        p0.S(0x2AD0B45D);
        int v3 = (v1 & 6) == 0 ? (p0.d(v) ? 4 : 2) | v1 : v1;
        if((v2 & 2) != 0) {
            v3 |= 0x30;
            modifier1 = modifier0;
        }
        else if((v1 & 0x30) == 0) {
            modifier1 = modifier0;
            v3 |= (p0.f(modifier1) ? 0x20 : 16);
        }
        else {
            modifier1 = modifier0;
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
            function31 = function30;
        }
        else if((v1 & 0x180) == 0) {
            function31 = function30;
            v3 |= (p0.h(function31) ? 0x100 : 0x80);
        }
        else {
            function31 = function30;
        }
        if((v3 & 0x93) != 0x92 || !p0.x()) {
            l l0 = l.X;
            if((v2 & 2) != 0) {
                modifier1 = l0;
            }
            Function3 function33 = (v2 & 4) == 0 ? function31 : Fa.q.i;
            float f = ((a1.d)g.w(v * 2, G.b)).X;
            Function2 function20 = (Function2)g.w(v, G.c);
            Modifier modifier3 = androidx.compose.foundation.layout.a.p(modifier1, 2);
            float f1 = G.a;
            Modifier modifier4 = androidx.compose.foundation.layout.c.p(modifier3, 8.0f + f1, 0.0f, 2);
            B.B b0 = z.a(B.k.c, g0.b.m, p0, 0);
            int v4 = p0.P;
            g0 g00 = p0.m();
            Modifier modifier5 = g0.a.d(p0, modifier4);
            F0.k.a.getClass();
            i i0 = j.b;
            p0.U();
            if(p0.O) {
                p0.l(i0);
            }
            else {
                p0.d0();
            }
            h h0 = j.f;
            U.d.K(p0, b0, h0);
            h h1 = j.e;
            U.d.K(p0, g00, h1);
            h h2 = j.g;
            if(p0.O || !Nb.j.a(p0.G(), v4)) {
                m5.b.F(v4, p0, v4, h2);
            }
            h h3 = j.d;
            U.d.K(p0, modifier5, h3);
            function20.j(p0, 0);
            Modifier modifier6 = androidx.compose.foundation.layout.c.e(androidx.compose.foundation.layout.a.n(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.c.d(l0, 1.0f), d.h(0x7F06018F, p0), M.a), 0.0f, 5.0f, 0.0f, f + 5.0f, 5), f1);  // color:white
            K k0 = r.e(g0.b.e, false);
            int v5 = p0.P;
            g0 g01 = p0.m();
            Modifier modifier7 = g0.a.d(p0, modifier6);
            p0.U();
            if(p0.O) {
                p0.l(i0);
            }
            else {
                p0.d0();
            }
            U.d.K(p0, k0, h0);
            U.d.K(p0, g01, h1);
            if(p0.O || !Nb.j.a(p0.G(), v5)) {
                m5.b.F(v5, p0, v5, h2);
            }
            U.d.K(p0, modifier7, h3);
            function33.h(androidx.compose.foundation.layout.b.a, p0, ((int)((v3 << 3 & 0x1C00 | 0x30) >> 6 & 0x70 | 6)));
            p0.p(true);
            p0.p(true);
            function32 = function33;
            modifier2 = modifier1;
        }
        else {
            p0.K();
            modifier2 = modifier1;
            function32 = function31;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new Fa.K(v, modifier2, function32, v1, v2);
        }
    }

    public static final void n(RewardsPathState rewardsPathState0, Function1 function10, Modifier modifier0, float f, int v, p p0, int v1, int v2) {
        Modifier modifier1;
        int v7;
        float f2;
        Modifier modifier4;
        int v9;
        int v8;
        float f3;
        Modifier modifier2;
        int v6;
        int v5;
        float f1;
        Nb.j.f(rewardsPathState0, "state");
        Nb.j.f(function10, "onClick");
        p0.S(1835734901);
        int v3 = (v1 & 6) == 0 ? (p0.h(rewardsPathState0) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v3 |= (p0.h(function10) ? 0x20 : 16);
        }
        int v4 = v3 | 0x180;
        if((v2 & 8) != 0) {
            v4 = v3 | 0xD80;
            f1 = f;
        }
        else if((v1 & 0xC00) == 0) {
            f1 = f;
            v4 |= (p0.c(f1) ? 0x800 : 0x400);
        }
        else {
            f1 = f;
        }
        if((v1 & 0x6000) == 0) {
            if((v2 & 16) == 0) {
                v5 = v;
                v6 = p0.d(v5) ? 0x4000 : 0x2000;
            }
            else {
                v5 = v;
                v6 = 0x2000;
            }
            v4 |= v6;
        }
        else {
            v5 = v;
        }
        if((v4 & 9363) != 9362 || !p0.x()) {
            p0.M();
            l l0 = l.X;
            if((v1 & 1) == 0 || p0.w()) {
                if((v2 & 8) != 0) {
                    f1 = 160.0f;
                }
                if((v2 & 16) == 0) {
                    f3 = f1;
                    v8 = v4;
                    v9 = v5;
                }
                else {
                    f3 = f1;
                    v8 = v4 & 0xFFFF1FFF;
                    v9 = rewardsPathState0.X - 2;
                }
                modifier2 = l0;
            }
            else {
                p0.K();
                if((v2 & 16) != 0) {
                    v4 &= 0xFFFF1FFF;
                }
                modifier2 = modifier0;
                f3 = f1;
                v8 = v4;
                v9 = v5;
            }
            p0.q();
            C.E e0 = C.H.a(I2.J.r(v9, 0, rewardsPathState0.Y), p0, 0, 2);
            p0.Q(0x9D1E0FD5);
            Object object0 = p0.G();
            Z z0 = U.l.a;
            if(object0 == z0) {
                object0 = new e0(1);
                p0.a0(object0);
            }
            p0.p(false);
            MutableState mutableState0 = (MutableState)R2.f.y(new Object[0], null, ((Function0)object0), p0, 0xC00, 6);
            t t0 = t.a;
            p0.Q(0x9D1E1706);
            boolean z1 = p0.f(mutableState0);
            boolean z2 = p0.f(e0);
            Object object1 = p0.G();
            if((z1 | z2) != 0 || object1 == z0) {
                object1 = new V(e0, mutableState0, null);
                p0.a0(object1);
            }
            p0.p(false);
            U.H.d(p0, t0, ((Function2)object1));
            p0.Q(-1658960747);
            Modifier modifier3 = androidx.compose.foundation.layout.c.e(androidx.compose.foundation.layout.c.d(modifier2, 1.0f), f3);
            if(rewardsPathState0.d0) {
                p0.Q(0xDB2F9BA3);
                Object object2 = p0.G();
                if(object2 == z0) {
                    object2 = v1.r.d(p0);
                }
                p0.p(false);
                p0.Q(0xDB2F938E);
                boolean z3 = p0.h(rewardsPathState0);
                Object object3 = p0.G();
                if(((v8 & 0x70) == 0x20 | z3) != 0 || object3 == z0) {
                    object3 = new Ca.j(function10, 2, rewardsPathState0);
                    p0.a0(object3);
                }
                p0.p(false);
                modifier4 = androidx.compose.foundation.a.c(l0, ((A.k)object2), null, false, null, ((Function0)object3), 28);
            }
            else {
                modifier4 = l0;
            }
            Modifier modifier5 = modifier3.d(modifier4);
            p0.p(false);
            K k0 = r.e(g0.b.a, false);
            int v10 = p0.P;
            g0 g00 = p0.m();
            Modifier modifier6 = g0.a.d(p0, modifier5);
            F0.k.a.getClass();
            i i0 = j.b;
            p0.U();
            if(p0.O) {
                p0.l(i0);
            }
            else {
                p0.d0();
            }
            U.d.K(p0, k0, j.f);
            U.d.K(p0, g00, j.e);
            h h0 = j.g;
            if(p0.O || !Nb.j.a(p0.G(), v10)) {
                m5.b.F(v10, p0, v10, h0);
            }
            U.d.K(p0, modifier6, j.d);
            androidx.compose.foundation.layout.b b0 = androidx.compose.foundation.layout.b.a;
            p0.Q(0xDB2FB6E3);
            boolean z4 = p0.f(e0);
            Object object4 = p0.G();
            if(z4 || object4 == z0) {
                object4 = new A(e0, 2);
                p0.a0(object4);
            }
            p0.p(false);
            g.k(((Function0)object4), androidx.compose.foundation.layout.a.n(l0, 0.0f, 0.0f, 0.0f, 20.0f, 7), p0, 0x30, 0);
            Modifier modifier7 = b0.a(androidx.compose.foundation.layout.c.d(l0, 1.0f), g0.b.h);
            g0.f f4 = g0.b.l;
            p0.Q(0xDB302395);
            boolean z5 = p0.h(rewardsPathState0);
            Object object5 = p0.G();
            if(z5 || object5 == z0) {
                object5 = new Ba.l(4, rewardsPathState0);
                p0.a0(object5);
            }
            p0.p(false);
            I2.J.d(modifier7, e0, null, false, null, f4, null, false, ((Function1)object5), p0, 0x30000, 220);
            p0.p(true);
            modifier1 = modifier2;
            v7 = v9;
            f2 = f3;
        }
        else {
            p0.K();
            f2 = f1;
            v7 = v5;
            modifier1 = modifier0;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new Fa.Q(rewardsPathState0, function10, modifier1, f2, v7, v1, v2);
        }
    }

    public static final void o(Modifier modifier0, p p0, int v) {
        p0.S(-506078550);
        int v1 = (v & 6) == 0 ? (p0.f(modifier0) ? 4 : 2) | v : v;
        if((v1 & 3) != 2 || !p0.x()) {
            M6.b.d(yc.l.y(0x7F080281, p0, 0), "", modifier0, null, null, 0.0f, null, p0, v1 << 6 & 0x380 | 0x30, 120);  // drawable:ic_rewards_pin
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new m0(v, 2, modifier0);
        }
    }

    public static final void p(Reward rewardsPathState$Reward0, Modifier modifier0, float f, boolean z, p p0, int v, int v1) {
        boolean z3;
        float f3;
        Modifier modifier3;
        boolean z2;
        float f2;
        Modifier modifier2;
        boolean z1;
        int v3;
        float f1;
        Modifier modifier1;
        Nb.j.f(rewardsPathState$Reward0, "reward");
        p0.S(0x51986431);
        int v2 = (v & 6) == 0 ? (((v & 8) == 0 ? p0.f(rewardsPathState$Reward0) : p0.h(rewardsPathState$Reward0)) ? 4 : 2) | v : v;
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
            if((v1 & 4) == 0) {
                f1 = f;
                v3 = p0.c(f1) ? 0x100 : 0x80;
            }
            else {
                f1 = f;
                v3 = 0x80;
            }
            v2 |= v3;
        }
        else {
            f1 = f;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            z1 = z;
        }
        else if((v & 0xC00) == 0) {
            z1 = z;
            v2 |= (p0.g(z1) ? 0x800 : 0x400);
        }
        else {
            z1 = z;
        }
        if((v2 & 0x493) == 1170 && p0.x()) {
            p0.K();
            modifier2 = modifier1;
            f2 = f1;
            z2 = z1;
        }
        else {
            p0.M();
            if((v & 1) == 0 || p0.w()) {
                Modifier modifier4 = (v1 & 2) == 0 ? modifier1 : l.X;
                modifier3 = modifier4;
                f3 = (v1 & 4) == 0 ? f1 : G.a;
                z3 = (v1 & 8) == 0 ? z1 : false;
            }
            else {
                p0.K();
                modifier3 = modifier1;
                f3 = f1;
                z3 = z1;
            }
            p0.q();
            if(rewardsPathState$Reward0 instanceof ScratchCard) {
                p0.Q(1021001335);
                Ea.V v4 = ((ScratchCard)rewardsPathState$Reward0).Y;
                if(v4 == null) {
                    v4 = Ea.V.f0;
                }
                M6.b.d(yc.l.y(v4.X, p0, 0), "", o.j(androidx.compose.foundation.layout.c.k(modifier3, f3), f.a(10)), null, null, 0.0f, null, p0, 0x30, 120);
                if(z3) {
                    g.q(((ScratchCard)rewardsPathState$Reward0).X, p0, 0);
                }
                p0.p(false);
            }
            else if(rewardsPathState$Reward0 instanceof Unknown) {
                p0.Q(0xA38D4F0);
                g.u(androidx.compose.foundation.layout.c.k(modifier3, G.a), p0, 0);
                p0.p(false);
            }
            else {
                throw M.J.c(171480946, p0, false);
            }
            modifier2 = modifier3;
            f2 = f3;
            z2 = z3;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new I(rewardsPathState$Reward0, modifier2, f2, z2, v, v1);
        }
    }

    public static final void q(int v, p p0, int v1) {
        p0.S(0x34F51920);
        if((((v1 & 6) == 0 ? (p0.d(v) ? 4 : 2) | v1 : v1) & 3) != 2 || !p0.x()) {
            O0.O o0 = db.b.a(((db.a)p0.k(db.b.d)).k, p0);
            m2.b(String.valueOf(v), null, d.h(0x7F06018F, p0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o0, p0, 0, 0, 0xFFFA);  // color:white
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new J(v, v1, 3);
        }
    }

    public static final void r(int v, p p0) {
        p0.S(-1226646302);
        if(v != 0 || !p0.x()) {
            String s = w.S(0x7F12038F, p0);  // string:rewards_path_start "Start"
            O0.O o0 = db.b.a(((db.a)p0.k(db.b.d)).i, p0);
            long v1 = d.h(0x7F060048, p0);  // color:WaveBlue500
            m2.b(s, androidx.compose.foundation.layout.a.l(l.X, 12.0f, 0.0f, 2), v1, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o0, p0, 0x30, 0, 0xFFF8);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new E(v, 7);
        }
    }

    public static final void s(int v, p p0) {
        p0.S(0xADDB954E);
        if(v != 0 || !p0.x()) {
            g.m(0, null, Fa.q.a, p0, 390, 2);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new E(v, 6);
        }
    }

    public static final void t(float f, float f1, float f2, p p0, int v) {
        p0.S(-1759660766);
        int v1 = (v & 6) == 0 ? (p0.c(f) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.c(f1) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p0.c(f2) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) != 0x92 || !p0.x()) {
            long v2 = d.h(0x7F06018F, p0);  // color:white
            Modifier modifier0 = androidx.compose.foundation.layout.c.e(androidx.compose.foundation.layout.c.d(l.X, 1.0f), Math.max(f, Math.max(f1, f2)));
            p0.Q(0xD7479F19);
            boolean z = p0.e(v2);
            Object object0 = p0.G();
            if((((v1 & 14) == 4 ? 1 : 0) | ((v1 & 0x70) == 0x20 ? 1 : 0) | ((v1 & 0x380) == 0x100 ? 1 : 0) | z) != 0 || object0 == U.l.a) {
                Fa.M m0 = new Fa.M(f, f1, f2, v2);
                p0.a0(m0);
                object0 = m0;
            }
            p0.p(false);
            B.e.b(p0, androidx.compose.ui.draw.a.b(modifier0, ((Function1)object0)));
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new N(f, f1, f2, v);
        }
    }

    public static final void u(Modifier modifier0, p p0, int v) {
        p0.S(0x8170567B);
        if((((v & 6) == 0 ? (p0.f(modifier0) ? 4 : 2) | v : v) & 3) != 2 || !p0.x()) {
            Modifier modifier1 = androidx.compose.foundation.a.b(o.j(modifier0, f.a(10)), d.h(0x7F060015, p0), M.a);  // color:Gray300
            K k0 = r.e(g0.b.e, false);
            int v1 = p0.P;
            g0 g00 = p0.m();
            Modifier modifier2 = g0.a.d(p0, modifier1);
            F0.k.a.getClass();
            i i0 = j.b;
            p0.U();
            if(p0.O) {
                p0.l(i0);
            }
            else {
                p0.d0();
            }
            U.d.K(p0, k0, j.f);
            U.d.K(p0, g00, j.e);
            h h0 = j.g;
            if(p0.O || !Nb.j.a(p0.G(), v1)) {
                m5.b.F(v1, p0, v1, h0);
            }
            U.d.K(p0, modifier2, j.d);
            O0.O o0 = db.b.a(((db.a)p0.k(db.b.d)).s, p0);
            m2.b("?", null, d.h(0x7F06001A, p0), 0L, null, null, null, 0L, null, new Z0.i(3), 0L, 0, false, 0, 0, null, o0, p0, 6, 0, 0xFDFA);  // color:Gray700
            p0.p(true);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new m0(v, 1, modifier0);
        }
    }

    public static final void v(Reward rewardsPathState$Reward0, p p0, int v) {
        p0.S(0x56525CBD);
        if((((v & 6) == 0 ? (((v & 8) == 0 ? p0.f(rewardsPathState$Reward0) : p0.h(rewardsPathState$Reward0)) ? 4 : 2) | v : v) & 3) != 2 || !p0.x()) {
            g.m(rewardsPathState$Reward0.e(), null, c.c(0x7F15D209, new com.wave.customer.scratchCardRewards.components.f(rewardsPathState$Reward0), p0), p0, 0x180, 2);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new Aa.d(v, 4, rewardsPathState$Reward0);
        }
    }

    public static final Object w(int v, Object[] arr_object) {
        if(v < 0) {
            v = v % arr_object.length + arr_object.length;
        }
        return arr_object[v % arr_object.length];
    }
}

