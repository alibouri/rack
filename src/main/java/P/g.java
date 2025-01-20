package P;

import B.r;
import D0.K;
import F0.i;
import F0.j;
import F0.k;
import G.b;
import H.e;
import H.f;
import I2.J;
import N.F0;
import N.Q;
import N.T;
import N.h0;
import U.N0;
import U.Z;
import U.d;
import U.g0;
import U.l0;
import U.l;
import U.p;
import androidx.compose.foundation.a;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Path;
import kotlin.jvm.functions.Function1;
import n0.M;
import n0.v;
import v.c;
import v.n0;
import v.z;

public abstract class g {
    public static final float a;
    public static final e b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final float f;
    public static final float g;
    public static final n0 h;

    static {
        g.a = 40.0f;
        g.b = f.a;
        g.c = 7.5f;
        g.d = 2.5f;
        g.e = 10.0f;
        g.f = 5.0f;
        g.g = 6.0f;
        g.h = c.j(300, 0, z.c, 2);
    }

    public static final void a(boolean z, n n0, Modifier modifier0, long v, long v1, boolean z1, p p0, int v2, int v3) {
        boolean z3;
        long v5;
        int v10;
        boolean z4;
        int v7;
        long v6;
        boolean z2;
        p0.S(308716636);
        int v4 = (v2 & 6) == 0 ? (p0.g(z) ? 4 : 2) | v2 : v2;
        if((v2 & 0x30) == 0) {
            v4 |= (p0.h(n0) ? 0x20 : 16);
        }
        if((v2 & 0x180) == 0) {
            v4 |= (p0.f(modifier0) ? 0x100 : 0x80);
        }
        if((v2 & 0xC00) == 0) {
            v4 |= 0x400;
        }
        if((v2 & 0x6000) == 0) {
            v4 |= (p0.e(v1) ? 0x4000 : 0x2000);
        }
        if((v3 & 0x20) != 0) {
            v4 |= 0x30000;
            z2 = z1;
        }
        else if((0x30000 & v2) == 0) {
            z2 = z1;
            v4 |= (p0.g(z2) ? 0x20000 : 0x10000);
        }
        else {
            z2 = z1;
        }
        if((74899 & v4) != 74898 || !p0.x()) {
            p0.M();
            if((v2 & 1) == 0 || p0.w()) {
                long v8 = ((Q)p0.k(T.a)).g();
                if((v3 & 0x20) == 0) {
                    v7 = v4 & 0xFFFFE3FF;
                    z4 = z2;
                    v6 = v8;
                }
                else {
                    v7 = v4 & 0xFFFFE3FF;
                    v6 = v8;
                    z4 = false;
                }
            }
            else {
                p0.K();
                v6 = v;
                v7 = v4 & 0xFFFFE3FF;
                z4 = z2;
            }
            p0.q();
            boolean z5 = p0.f(n0);
            Object object0 = p0.G();
            if(((v7 & 14) == 4 | z5) != 0 || object0 == l.a) {
                object0 = d.w(new b(n0, z));
                p0.a0(object0);
            }
            h0 h00 = (h0)p0.k(F0.a);
            v v9 = null;
            if(h00 == null) {
                p0.Q(0xAFAD1155);
                p0.p(false);
                v10 = v7 & 14;
            }
            else {
                p0.Q(1619096620);
                v10 = v7 & 14;
                long v11 = h00.a(v6, g.g, p0, 0x30);
                p0.p(false);
                v9 = new v(v11);
            }
            Modifier modifier1 = a.b(Pb.a.M(androidx.compose.ui.graphics.a.a(androidx.compose.ui.draw.a.c(androidx.compose.foundation.layout.c.k(modifier0, g.a), P.c.Z), new h(n0, z4)), (((Boolean)((N0)object0).getValue()).booleanValue() ? g.g : 0.0f), g.b, true, 24), (v9 == null ? v6 : v9.a), g.b);
            K k0 = r.e(g0.b.a, false);
            int v12 = p0.P;
            g0 g00 = p0.m();
            Modifier modifier2 = g0.a.d(p0, modifier1);
            k.a.getClass();
            i i0 = j.b;
            p0.U();
            if(p0.O) {
                p0.l(i0);
            }
            else {
                p0.d0();
            }
            d.K(p0, k0, j.f);
            d.K(p0, g00, j.e);
            F0.h h0 = j.g;
            if(p0.O || !Nb.j.a(p0.G(), v12)) {
                m5.b.F(v12, p0, v12, h0);
            }
            d.K(p0, modifier2, j.d);
            N4.j.a(Boolean.valueOf(z), null, c.j(100, 0, null, 6), null, c0.c.c(0x6E7DB0F7, new P.e(v1, n0), p0), p0, v10 | 0x6180);
            p0.p(true);
            z3 = z4;
            v5 = v6;
        }
        else {
            p0.K();
            v5 = v;
            z3 = z2;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new P.f(z, n0, modifier0, v5, v1, z3, v2, v3);
        }
    }

    public static final void b(n n0, long v, Modifier modifier0, p p0, int v1) {
        p0.S(0xE307F82B);
        int v2 = (v1 & 6) == 0 ? (p0.h(n0) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (p0.e(v) ? 0x20 : 16);
        }
        if((v1 & 0x180) == 0) {
            v2 |= (p0.f(modifier0) ? 0x100 : 0x80);
        }
        if((v2 & 0x93) != 0x92 || !p0.x()) {
            Object object0 = p0.G();
            Z z0 = l.a;
            int v3 = 1;
            if(object0 == z0) {
                object0 = M.h();
                ((n0.j)object0).l(1);
                p0.a0(object0);
            }
            boolean z1 = p0.f(n0);
            Object object1 = p0.G();
            if(z1 || object1 == z0) {
                object1 = d.w(new P.d(n0, 0));
                p0.a0(object1);
            }
            N0 n00 = v.f.b(((Number)((N0)object1).getValue()).floatValue(), g.h, p0);
            Modifier modifier1 = M0.k.a(modifier0, false, P.c.Y);
            boolean z2 = p0.h(n0);
            boolean z3 = p0.f(n00);
            if((v2 & 0x70) != 0x20) {
                v3 = 0;
            }
            boolean z4 = p0.h(((Path)object0));
            Object object2 = p0.G();
            if((z2 | z3 | v3 | z4) != 0 || object2 == z0) {
                O0.r r0 = new O0.r(n0, n00, v, ((Path)object0), 1);
                p0.a0(r0);
                object2 = r0;
            }
            J.a(modifier1, ((Function1)object2), p0, 0);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new I.a(n0, v, modifier0, v1);
        }
    }

    public static final void c(p0.d d0, Path path0, m0.c c0, long v, float f, P.a a0) {
        path0.reset();
        path0.a(0.0f, 0.0f);
        path0.c(d0.w(g.e) * a0.Y, 0.0f);
        float f1 = d0.w(g.e);
        float f2 = d0.w(g.f);
        path0.c(f1 * a0.Y / 2.0f, f2 * a0.Y);
        float f3 = d0.w(g.e);
        float f4 = m0.b.d(c0.b());
        float f5 = m0.b.e(c0.b());
        float f6 = d0.w(g.d);
        path0.j(yc.d.d(f4 + Math.min(c0.d(), c0.c()) / 2.0f - f3 * a0.Y / 2.0f, f6 / 2.0f + f5));
        path0.close();
        long v1 = d0.M();
        a8.Q q0 = d0.A();
        long v2 = q0.A();
        q0.o().n();
        try {
            ((g3.b)q0.Y).r(a0.X, v1);
            m5.b.j(d0, path0, v, f, null, 56);
        }
        finally {
            v1.r.i(q0, v2);
        }
    }
}

