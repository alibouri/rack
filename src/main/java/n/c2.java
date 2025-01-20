package N;

import B.q0;
import B.r;
import D0.K;
import F0.h;
import F0.i;
import F0.j;
import F0.k;
import G0.f0;
import I2.J;
import U.d;
import U.g0;
import U.l0;
import U.l;
import U.p;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.LayoutDirection;
import c0.b;
import g0.a;
import g0.g;
import kotlin.jvm.functions.Function2;

public abstract class c2 {
    public static final float a;

    static {
        c2.a = 2.0f;
    }

    public static final void a(Modifier modifier0, Function2 function20, b b0, b b1, b b2, b b3, boolean z, float f, q0 q00, p p0, int v) {
        LayoutDirection layoutDirection1;
        p0.S(-2112507061);
        int v1 = (v & 6) == 0 ? (p0.f(modifier0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.h(function20) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p0.h(b0) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (p0.h(b1) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (p0.h(b2) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v) == 0) {
            v1 |= (p0.h(b3) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v) == 0) {
            v1 |= (p0.g(z) ? 0x100000 : 0x80000);
        }
        if((0xC00000 & v) == 0) {
            v1 |= (p0.c(f) ? 0x800000 : 0x400000);
        }
        if((0x6000000 & v) == 0) {
            v1 |= (p0.f(q00) ? 0x4000000 : 0x2000000);
        }
        if((0x2492493 & v1) != 0x2492492 || !p0.x()) {
            Object object0 = p0.G();
            if((((0x380000 & v1) == 0x100000 ? 1 : 0) | ((0x1C00000 & v1) == 0x800000 ? 1 : 0) | ((0xE000000 & v1) == 0x4000000 ? 1 : 0)) != 0 || object0 == l.a) {
                object0 = new e2(z, f, q00);
                p0.a0(object0);
            }
            LayoutDirection layoutDirection0 = (LayoutDirection)p0.k(f0.l);
            int v2 = p0.P;
            g0 g00 = p0.m();
            Modifier modifier1 = a.d(p0, modifier0);
            k.a.getClass();
            i i0 = j.b;
            p0.U();
            if(p0.O) {
                p0.l(i0);
            }
            else {
                p0.d0();
            }
            h h0 = j.f;
            d.K(p0, ((e2)object0), h0);
            h h1 = j.e;
            d.K(p0, g00, h1);
            h h2 = j.g;
            if(p0.O || !Nb.j.a(p0.G(), v2)) {
                m5.b.F(v2, p0, v2, h2);
            }
            h h3 = j.d;
            d.K(p0, modifier1, h3);
            g g0 = g0.b.e;
            g0.l l0 = g0.l.X;
            if(b2 == null) {
                layoutDirection1 = layoutDirection0;
                p0.Q(0x428CF52);
            }
            else {
                p0.Q(0x4252117);
                Modifier modifier2 = androidx.compose.ui.layout.a.c(l0, "Leading").d(Z1.d);
                K k0 = r.e(g0, false);
                int v3 = p0.P;
                g0 g01 = p0.m();
                Modifier modifier3 = a.d(p0, modifier2);
                p0.U();
                layoutDirection1 = layoutDirection0;
                if(p0.O) {
                    p0.l(i0);
                }
                else {
                    p0.d0();
                }
                d.K(p0, k0, h0);
                d.K(p0, g01, h1);
                if(p0.O || !Nb.j.a(p0.G(), v3)) {
                    m5.b.F(v3, p0, v3, h2);
                }
                d.K(p0, modifier3, h3);
                b2.j(p0, ((int)(v1 >> 12 & 14)));
                p0.p(true);
            }
            p0.p(false);
            if(b3 == null) {
                p0.Q(70069074);
            }
            else {
                p0.Q(0x4297595);
                Modifier modifier4 = androidx.compose.ui.layout.a.c(l0, "Trailing").d(Z1.d);
                K k1 = r.e(g0, false);
                int v4 = p0.P;
                g0 g02 = p0.m();
                Modifier modifier5 = a.d(p0, modifier4);
                p0.U();
                if(p0.O) {
                    p0.l(i0);
                }
                else {
                    p0.d0();
                }
                d.K(p0, k1, h0);
                d.K(p0, g02, h1);
                if(p0.O || !Nb.j.a(p0.G(), v4)) {
                    m5.b.F(v4, p0, v4, h2);
                }
                d.K(p0, modifier5, h3);
                b3.j(p0, ((int)(v1 >> 15 & 14)));
                p0.p(true);
            }
            p0.p(false);
            float f1 = androidx.compose.foundation.layout.a.e(q00, layoutDirection1);
            float f2 = androidx.compose.foundation.layout.a.d(q00, layoutDirection1);
            if(b2 != null) {
                f1 = J.m(f1 - Z1.c, 0.0f);
            }
            Modifier modifier6 = androidx.compose.foundation.layout.a.n(l0, f1, 0.0f, (b3 == null ? f2 : J.m(f2 - Z1.c, 0.0f)), 0.0f, 10);
            if(b1 == null) {
                p0.Q(0x43A10D2);
            }
            else {
                p0.Q(70826807);
                b1.h(androidx.compose.ui.layout.a.c(l0, "Hint").d(modifier6), p0, ((int)(v1 >> 6 & 0x70)));
            }
            p0.p(false);
            g g1 = g0.b.a;
            if(b0 == null) {
                p0.Q(71034290);
            }
            else {
                p0.Q(70948761);
                Modifier modifier7 = androidx.compose.ui.layout.a.c(l0, "Label").d(modifier6);
                K k2 = r.e(g1, false);
                int v5 = p0.P;
                g0 g03 = p0.m();
                Modifier modifier8 = a.d(p0, modifier7);
                p0.U();
                if(p0.O) {
                    p0.l(i0);
                }
                else {
                    p0.d0();
                }
                d.K(p0, k2, h0);
                d.K(p0, g03, h1);
                if(p0.O || !Nb.j.a(p0.G(), v5)) {
                    m5.b.F(v5, p0, v5, h2);
                }
                d.K(p0, modifier8, h3);
                b0.j(p0, ((int)(v1 >> 6 & 14)));
                p0.p(true);
            }
            p0.p(false);
            Modifier modifier9 = androidx.compose.ui.layout.a.c(l0, "TextField").d(modifier6);
            K k3 = r.e(g1, true);
            int v6 = p0.P;
            g0 g04 = p0.m();
            Modifier modifier10 = a.d(p0, modifier9);
            p0.U();
            if(p0.O) {
                p0.l(i0);
            }
            else {
                p0.d0();
            }
            d.K(p0, k3, h0);
            d.K(p0, g04, h1);
            if(p0.O || !Nb.j.a(p0.G(), v6)) {
                m5.b.F(v6, p0, v6, h2);
            }
            d.K(p0, modifier10, h3);
            function20.j(p0, ((int)(v1 >> 3 & 14)));
            p0.p(true);
            p0.p(true);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new a2(modifier0, function20, b0, b1, b2, b3, z, f, q00, v);
        }
    }

    public static final int b(int v, boolean z, int v1, int v2, int v3, int v4, long v5, float f, q0 q00) {
        float f1 = q00.c();
        float f2 = q00.a() * f;
        int v6 = Math.max(v, v4);
        return z ? Math.max(Pb.a.H(((float)v1) + c2.a * f + ((float)v6) + f2), Math.max(Math.max(v2, v3), a1.a.i(v5))) : Math.max(Pb.a.H(f1 * f + ((float)v6) + f2), Math.max(Math.max(v2, v3), a1.a.i(v5)));
    }
}

