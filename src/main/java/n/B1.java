package N;

import G0.f0;
import I2.J;
import J2.w;
import M0.k;
import Sb.a;
import U.l0;
import U.l;
import U.p;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function1;
import m0.e;
import m5.b;
import n0.v;
import p0.d;
import p0.h;
import v.G;
import v.H;
import v.K;
import v.M;
import v.N;
import v.p0;
import v.u;
import v.z;
import w.r;
import w.w0;

public abstract class b1 {
    public static final float a;
    public static final u b;

    static {
        b1.a = 40.0f;
        new u(0.2f, 0.0f, 0.8f);
        new u(0.4f, 0.0f, 1.0f);
        new u(0.0f, 0.0f, 0.65f);
        new u(0.1f, 0.0f, 0.45f);
        b1.b = new u(0.4f, 0.0f, 0.2f);
    }

    public static final void a(Modifier modifier0, long v, float f, long v1, int v2, p p0, int v3) {
        int v8;
        long v7;
        float f1;
        long v6;
        Modifier modifier2;
        float f2;
        int v12;
        int v11;
        long v10;
        long v9;
        p0.S(0x681B4850);
        int v4 = (v3 & 6) == 0 ? (p0.c(0.57f) ? 4 : 2) | v3 : v3;
        if((v3 & 0x30) == 0) {
            v4 |= (p0.f(modifier0) ? 0x20 : 16);
        }
        if((v3 & 0x180) == 0) {
            v4 |= 0x80;
        }
        int v5 = (0x30000 & v3) == 0 ? 0x16C00 | v4 : v4 | 0x6C00;
        if((74899 & v5) != 74898 || !p0.x()) {
            p0.M();
            if((v3 & 1) == 0 || p0.w()) {
                v9 = ((Q)p0.k(T.a)).e();
                f2 = W0.a;
                v10 = v.h;
                v12 = v5 & 0xFFF8FC7F;
                v11 = 0;
            }
            else {
                p0.K();
                v9 = v;
                v10 = v1;
                v11 = v2;
                v12 = v5 & 0xFFF8FC7F;
                f2 = f;
            }
            p0.q();
            h h0 = new h(((Density)p0.k(f0.f)).w(f2), 0.0f, v11, 0, 26);
            Modifier modifier1 = c.k(k.a(modifier0, true, new w0(0.57f, new a(0.0f, 1.0f), 0)), b1.a);
            boolean z = p0.c(0.57f);
            boolean z1 = p0.h(h0);
            boolean z2 = p0.e(v9);
            Object object0 = p0.G();
            if((z | (v12 & 0xE000) == 0x4000 | z1 | z2) != 0 || object0 == l.a) {
                modifier2 = modifier1;
                object0 = new X0(0.57f, v10, h0, v9);
                p0.a0(object0);
            }
            else {
                modifier2 = modifier1;
            }
            J.a(modifier2, ((Function1)object0), p0, 0);
            f1 = f2;
            v8 = v11;
            v6 = v9;
            v7 = v10;
        }
        else {
            p0.K();
            v6 = v;
            f1 = f;
            v7 = v1;
            v8 = v2;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new Y0(modifier0, v6, f1, v7, v8, v3);
        }
    }

    public static final void b(Modifier modifier0, long v, float f, long v1, int v2, p p0, int v3, int v4) {
        long v11;
        float f2;
        long v10;
        int v9;
        int v15;
        float f3;
        Modifier modifier2;
        long v14;
        long v13;
        int v12;
        long v8;
        float f1;
        int v7;
        long v6;
        Modifier modifier1;
        int v5;
        p0.S(0xBD4B9920);
        if((v4 & 1) != 0) {
            v5 = v3 | 6;
            modifier1 = modifier0;
        }
        else if((v3 & 6) == 0) {
            modifier1 = modifier0;
            v5 = (p0.f(modifier1) ? 4 : 2) | v3;
        }
        else {
            modifier1 = modifier0;
            v5 = v3;
        }
        if((v3 & 0x30) == 0) {
            if((v4 & 2) == 0) {
                v6 = v;
                v7 = p0.e(v6) ? 0x20 : 16;
            }
            else {
                v6 = v;
                v7 = 16;
            }
            v5 |= v7;
        }
        else {
            v6 = v;
        }
        if((v4 & 4) != 0) {
            v5 |= 0x180;
            f1 = f;
        }
        else if((v3 & 0x180) == 0) {
            f1 = f;
            v5 |= (p0.c(f1) ? 0x100 : 0x80);
        }
        else {
            f1 = f;
        }
        if((v4 & 8) == 0) {
            v8 = v1;
            if((v3 & 0xC00) == 0) {
                v5 |= (p0.e(v8) ? 0x800 : 0x400);
            }
        }
        else {
            v5 |= 0xC00;
            v8 = v1;
        }
        if((v3 & 0x6000) == 0) {
            v5 |= 0x2000;
        }
        if((v5 & 9363) != 9362 || !p0.x()) {
            p0.M();
            if((v3 & 1) == 0 || p0.w()) {
                Modifier modifier3 = (v4 & 1) == 0 ? modifier1 : g0.l.X;
                if((v4 & 2) != 0) {
                    v6 = ((Q)p0.k(T.a)).e();
                    v5 &= 0xFFFFFF8F;
                }
                if((v4 & 4) != 0) {
                    f1 = W0.a;
                }
                modifier2 = modifier3;
                f3 = f1;
                v14 = (v4 & 8) == 0 ? v8 : v.h;
                v12 = 2;
                v15 = v5 & 0xFFFF1FFF;
                v13 = v6;
            }
            else {
                p0.K();
                if((v4 & 2) != 0) {
                    v5 &= 0xFFFFFF8F;
                }
                v12 = v2;
                v13 = v6;
                v14 = v8;
                modifier2 = modifier1;
                f3 = f1;
                v15 = v5 & 0xFFFF1FFF;
            }
            p0.q();
            h h0 = new h(((Density)p0.k(f0.f)).w(f3), 0.0f, v12, 0, 26);
            K k0 = v.c.h(null, p0, 1);
            G g0 = v.c.g(v.c.j(6660, 0, z.c, 2), 0, 6);
            H h1 = v.c.d(k0, 0, 5, p0.b, g0, null, p0, 33208, 16);
            H h2 = v.c.c(k0, 286.0f, v.c.g(v.c.j(0x534, 0, z.c, 2), 0, 6), null, p0, 4536, 8);
            M m0 = new M();
            m0.a = 0x534;
            m0.a(0.0f, 0).b = b1.b;
            m0.a(290.0f, 666);
            H h3 = v.c.c(k0, 290.0f, v.c.g(new N(m0), 0, 6), null, p0, 4536, 8);
            M m1 = new M();
            m1.a = 0x534;
            m1.a(0.0f, 666).b = b1.b;
            m1.a(290.0f, m1.a);
            H h4 = v.c.c(k0, 290.0f, v.c.g(new N(m1), 0, 6), null, p0, 4536, 8);
            Modifier modifier4 = c.k(k.a(modifier2, true, r.c0), b1.a);
            boolean z = p0.h(h0);
            boolean z1 = p0.f(h1);
            boolean z2 = p0.f(h3);
            boolean z3 = p0.f(h4);
            boolean z4 = p0.f(h2);
            v10 = v13;
            int v16 = ((v15 & 0x70 ^ 0x30) <= 0x20 || !p0.e(v10)) && (v15 & 0x30) != 0x20 ? 0 : 1;
            Object object0 = p0.G();
            if((((v15 & 0x380) == 0x100 ? 1 : 0) | ((v15 & 0x1C00) == 0x800 | z | z1 | z2 | z3 | z4) | v16) != 0 || object0 == l.a) {
                object0 = new Z0(v14, h0, f3, v10, h1, h3, h4, h2);
                p0.a0(object0);
            }
            J.a(modifier4, ((Function1)object0), p0, 0);
            modifier1 = modifier2;
            f2 = f3;
            v9 = v12;
            v11 = v14;
        }
        else {
            p0.K();
            v9 = v2;
            v10 = v6;
            f2 = f1;
            v11 = v8;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new a1(modifier1, v10, f2, v11, v9, v3, v4);
        }
    }

    public static final void c(d d0, float f, float f1, long v, h h0) {
        float f2 = h0.a / 2.0f;
        float f3 = e.d(d0.d()) - 2.0f * f2;
        b.c(d0, v, f, f1, yc.d.d(f2, f2), w.m(f3, f3), 0.0f, h0, 0x340);
    }
}

