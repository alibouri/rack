package N;

import A.k;
import Aa.P;
import I2.J;
import U.N0;
import U.Z;
import U.d;
import U.l0;
import U.l;
import U.p;
import androidx.compose.foundation.layout.a;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;
import n0.M;
import n0.v;
import u.I;
import v.c;
import v.f;

public abstract class c1 {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;

    static {
        c1.a = 2.0f;
        c1.b = 20.0f;
        c1.c = 10.0f;
        c1.d = 12.0f;
        c1.e = 2.0f;
    }

    public static final void a(boolean z, Modifier modifier0, boolean z1, k k0, j0 j00, p p0, int v) {
        j0 j01;
        k k1;
        boolean z2;
        Modifier modifier1;
        N0 n01;
        long v7;
        j0 j02;
        k k2;
        boolean z4;
        Modifier modifier2;
        p0.S(0x4E58B201);
        int v1 = (v & 6) == 0 ? v | (p0.g(z) ? 4 : 2) : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.h(null) ? 0x20 : 16);
        }
        if((74899 & ((v & 0x30000) == 0 ? 0x16D80 | v1 : v1 | 0x6D80)) != 74898 || !p0.x()) {
            p0.M();
            Z z3 = l.a;
            g0.l l0 = g0.l.X;
            if((v & 1) == 0 || p0.w()) {
                long v2 = ((Q)p0.k(T.a)).f();
                long v3 = v.b(0.6f, ((Q)p0.k(T.a)).d());
                long v4 = ((Q)p0.k(T.a)).d();
                long v5 = ((v)p0.k(a0.a)).a;
                if(!((Q)p0.k(T.a)).h()) {
                }
                M.w(v5);
                long v6 = v.b(0.38f, v4);
                boolean z5 = p0.e(v2);
                boolean z6 = p0.e(v3);
                boolean z7 = p0.e(v6);
                Object object0 = p0.G();
                if((z5 | z6 | z7) != 0 || object0 == z3) {
                    object0 = new j0(v2, v3, v6);
                    p0.a0(object0);
                }
                j02 = (j0)object0;
                z4 = true;
                k2 = null;
                modifier2 = l0;
            }
            else {
                p0.K();
                modifier2 = modifier0;
                z4 = z1;
                k2 = k0;
                j02 = j00;
            }
            p0.q();
            N0 n00 = f.a((z ? c1.d / 2.0f : 0.0f), c.j(100, 0, null, 6), null, p0, 0x30, 12);
            j02.getClass();
            p0.Q(0x4A1D1C8A);
            if(z4) {
                v7 = z ? j02.a : j02.b;
            }
            else {
                v7 = j02.c;
            }
            if(z4) {
                p0.Q(1872507307);
                n01 = I.a(v7, c.j(100, 0, null, 6), p0, 0x30);
            }
            else {
                p0.Q(1872610010);
                n01 = d.G(new v(v7), p0);
            }
            p0.p(false);
            p0.p(false);
            p0.Q(0x70DAA03B);
            p0.p(false);
            Modifier modifier3 = androidx.compose.foundation.layout.c.h(a.j(androidx.compose.foundation.layout.c.r(modifier2.d(l0).d(l0)), c1.a), c1.b);
            boolean z8 = p0.f(n01);
            boolean z9 = p0.f(n00);
            Object object1 = p0.G();
            if((z8 | z9) != 0 || object1 == z3) {
                object1 = new P(n01, 25, n00);
                p0.a0(object1);
            }
            J.a(modifier3, ((Function1)object1), p0, 0);
            k1 = k2;
            modifier1 = modifier2;
            z2 = z4;
            j01 = j02;
        }
        else {
            p0.K();
            modifier1 = modifier0;
            z2 = z1;
            k1 = k0;
            j01 = j00;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new N.M(z, modifier1, z2, k1, j01, v, 1);
        }
    }
}

