package Z2;

import Aa.l;
import B.J0;
import B.e;
import D0.P;
import D0.j;
import F0.h;
import G0.r0;
import M.J;
import M0.k;
import U.O0;
import U.g0;
import U.l0;
import U.p;
import U.x0;
import Y2.m;
import android.content.Context;
import android.os.Trace;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import coil.compose.ContentPainterElement;
import g0.c;
import g0.g;
import i3.i;
import kotlin.jvm.functions.Function1;
import n0.n;
import s0.b;

public abstract class t {
    public static final s a;

    static {
        t.a = new s();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public static final void a(o o0, String s, Modifier modifier0, Function1 function10, Function1 function11, c c0, j j0, float f, n n0, int v, boolean z, p p0, int v1, int v2) {
        int v5;
        p0.S(0xE6DF013B);
        int v3 = 4;
        int v4 = (v1 & 14) == 0 ? (p0.f(o0) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v4 |= (p0.f(s) ? 0x20 : 16);
        }
        if((v1 & 0x380) == 0) {
            v4 |= (p0.f(modifier0) ? 0x100 : 0x80);
        }
        if((v1 & 0x1C00) == 0) {
            v4 |= (p0.h(function10) ? 0x800 : 0x400);
        }
        if((v1 & 0xE000) == 0) {
            v4 |= (p0.h(function11) ? 0x4000 : 0x2000);
        }
        if((v1 & 0x70000) == 0) {
            v4 |= (p0.f(c0) ? 0x20000 : 0x10000);
        }
        if((v1 & 0x380000) == 0) {
            v4 |= (p0.f(j0) ? 0x100000 : 0x80000);
        }
        if((v1 & 0x1C00000) == 0) {
            v4 |= (p0.c(f) ? 0x800000 : 0x400000);
        }
        if((0xE000000 & v1) == 0) {
            v4 |= (p0.f(n0) ? 0x4000000 : 0x2000000);
        }
        if((0x70000000 & v1) == 0) {
            v4 |= (p0.d(v) ? 0x20000000 : 0x10000000);
        }
        if((v2 & 14) == 0) {
            if(!p0.g(z)) {
                v3 = 2;
            }
            v5 = v2 | v3;
        }
        else {
            v5 = v2;
        }
        if((0x5B6DB6DB & v4) != 306783378 || (v5 & 11) != 2 || !p0.x()) {
            i i0 = A.b(o0.a, j0, p0);
            Z2.n n1 = t.i(i0, o0.c, function10, function11, j0, v, p0, 0);
            t.d((i0.x instanceof q ? modifier0.d(((Modifier)i0.x)) : modifier0), n1, s, c0, j0, f, n0, z, p0, v4 << 3 & 0x380 | v4 >> 6 & 0x1C00 | v4 >> 6 & 0xE000 | v4 >> 6 & 0x70000 | v4 >> 6 & 0x380000 | v5 << 21 & 0x1C00000);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new a(o0, s, modifier0, function10, function11, c0, j0, f, n0, v, z, v1, v2);
        }
    }

    public static final void b(Object object0, String s, Modifier modifier0, b b0, b b1, b b2, p p0, int v, int v1) {
        p0.R(0x64F5E82F);
        b b3 = null;
        b b4 = (v1 & 8) == 0 ? b0 : null;
        if((v1 & 16) == 0) {
            b3 = b1;
        }
        b b5 = (v1 & 0x20) == 0 ? b2 : b3;
        g g0 = g0.b.e;
        P p1 = D0.i.a;
        m m0 = t.h(u.a, p0);
        int v2 = v & 0x70 | 0x248208 | v << 3 & 0x1C00 | 0x1C00000 & v << 3 | 0xE000000 & v << 3 | v << 3 & 0x70000000;
        p0.R(0xA7B15BB8);
        o o0 = new o(object0, t.a, m0);
        Ha.n n0 = b4 != null || b3 != null || b5 != null ? new Ha.n(b4, b5, b3, 4) : Z2.n.s0;
        t.a(o0, s, modifier0, n0, null, g0, p1, 1.0f, null, 1, true, p0, v2 & 0x70 | v2 >> 3 & 0x380 | (v >> 27 & 14) << 15 & 0x70000, 0);
        p0.p(false);
        p0.p(false);
    }

    public static final void c(Object object0, String s, Modifier modifier0, g g0, P p0, p p1, int v, int v1) {
        p1.R(1451072229);
        m m0 = t.h(u.a, p1);
        int v2 = v & 0x70 | 520 | v << 3 & 0x1C00 | v << 3 & 0xE000 | v << 3 & 0x70000 | v << 3 & 0x380000 | v << 3 & 0x1C00000 | v << 3 & 0xE000000 | v << 3 & 0x70000000;
        p1.R(2032051394);
        t.a(new o(object0, t.a, m0), s, modifier0, Z2.n.s0, null, ((v1 & 0x20) == 0 ? g0 : g0.b.e), ((v1 & 0x40) == 0 ? p0 : D0.i.a), 1.0f, null, 1, true, p1, v2 & 0x70 | v2 >> 3 & 0x380 | v2 >> 3 & 0x1C00 | v2 >> 3 & 0xE000 | v2 >> 3 & 0x70000 | v2 >> 3 & 0x380000 | v2 >> 3 & 0x1C00000 | v2 >> 3 & 0xE000000 | (v >> 27 & 14) << 27 & 0x70000000, 0);
        p1.p(false);
        p1.p(false);
    }

    public static final void d(Modifier modifier0, Z2.n n0, String s, c c0, j j0, float f, n n1, boolean z, p p0, int v) {
        p0.S(0x2E5BE4E8);
        int v1 = (v & 14) == 0 ? (p0.f(modifier0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (p0.f(n0) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (p0.f(s) ? 0x100 : 0x80);
        }
        if((v & 0x1C00) == 0) {
            v1 |= (p0.f(c0) ? 0x800 : 0x400);
        }
        if((0xE000 & v) == 0) {
            v1 |= (p0.f(j0) ? 0x4000 : 0x2000);
        }
        if((0x70000 & v) == 0) {
            v1 |= (p0.c(f) ? 0x20000 : 0x10000);
        }
        if((0x380000 & v) == 0) {
            v1 |= (p0.f(n1) ? 0x100000 : 0x80000);
        }
        if((0x1C00000 & v) == 0) {
            v1 |= (p0.g(z) ? 0x800000 : 0x400000);
        }
        if((v1 & 0x16DB6DB) != 4793490 || !p0.x()) {
            Modifier modifier1 = s == null ? modifier0 : k.a(modifier0, false, new T3.c(s, 1));
            if(z) {
                modifier1 = N4.o.k(modifier1);
            }
            Modifier modifier2 = modifier1.d(new ContentPainterElement(n0, c0, j0, f, n1));
            d d0 = d.b;
            p0.R(0x207BAF9A);
            int v2 = p0.P;
            Modifier modifier3 = g0.a.d(p0, modifier2);
            g0 g00 = p0.m();
            F0.k.a.getClass();
            F0.i i0 = F0.j.b;
            p0.R(1405779621);
            p0.U();
            if(p0.O) {
                p0.l(new Z2.c(i0, 0));
            }
            else {
                p0.d0();
            }
            U.d.K(p0, d0, F0.j.f);
            U.d.K(p0, g00, F0.j.e);
            U.d.K(p0, modifier3, F0.j.d);
            h h0 = F0.j.g;
            if(p0.O || !Nb.j.a(p0.G(), v2)) {
                m5.b.F(v2, p0, v2, h0);
            }
            p0.p(true);
            p0.p(false);
            p0.p(false);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new Z2.b(modifier0, n0, s, c0, j0, f, n1, z, v);
        }
    }

    public static final void e(Object object0, Modifier modifier0, c0.b b0, g g0, j j0, p p0, int v, int v1) {
        p0.R(0xA347D002);
        T3.d d0 = Z2.n.s0;
        g g1 = (v1 & 0x400) == 0 ? g0 : g0.b.e;
        j j1 = (v1 & 0x800) == 0 ? j0 : D0.i.a;
        m m0 = t.h(u.a, p0);
        p0.R(0xA3E6C4A1);
        int v2 = (v << 3 & 0x3F0) << 12;
        t.f(new o(object0, t.a, m0), modifier0, d0, null, g1, j1, 1.0f, null, 1, true, new c0.b(0x2CBFDCE0, new l(b0, null, null, 6), true), p0, 0x70000 & v2 | 0x1B0 | v2 & 0x380000, 0);
        p0.p(false);
        p0.p(false);
    }

    public static final void f(o o0, Modifier modifier0, Function1 function10, z z0, c c0, j j0, float f, n n0, int v, boolean z1, c0.b b0, p p0, int v1, int v2) {
        p0.S(0xDBE6AFBB);
        int v3 = (v1 & 14) == 0 ? (p0.f(o0) ? 4 : 2) | v1 : v1;
        int v4 = 16;
        if((v1 & 0x70) == 0) {
            v3 |= (p0.f(null) ? 0x20 : 16);
        }
        if((v1 & 0x380) == 0) {
            v3 |= (p0.f(modifier0) ? 0x100 : 0x80);
        }
        if((v1 & 0x1C00) == 0) {
            v3 |= (p0.h(function10) ? 0x800 : 0x400);
        }
        if((0xE000 & v1) == 0) {
            v3 |= (p0.h(z0) ? 0x4000 : 0x2000);
        }
        if((0x70000 & v1) == 0) {
            v3 |= (p0.f(c0) ? 0x20000 : 0x10000);
        }
        if((0x380000 & v1) == 0) {
            v3 |= (p0.f(j0) ? 0x100000 : 0x80000);
        }
        if((0x1C00000 & v1) == 0) {
            v3 |= (p0.c(f) ? 0x800000 : 0x400000);
        }
        if((0xE000000 & v1) == 0) {
            v3 |= (p0.f(n0) ? 0x4000000 : 0x2000000);
        }
        if((v1 & 0x70000000) == 0) {
            v3 |= (p0.d(v) ? 0x20000000 : 0x10000000);
        }
        int v5 = (v2 & 14) == 0 ? v2 | (p0.g(z1) ? 4 : 2) : v2;
        if((v2 & 0x70) == 0) {
            if(p0.h(b0)) {
                v4 = 0x20;
            }
            v5 |= v4;
        }
        if((0x5B6DB6DB & v3) != 306783378 || (v5 & 91) != 18 || !p0.x()) {
            i i0 = A.b(o0.a, j0, p0);
            Z2.n n1 = t.i(i0, o0.c, function10, z0, j0, v, p0, 0x40);
            j3.i i1 = i0.x;
            if(i1 instanceof q) {
                p0.R(0x840FF3E8);
                e.a(modifier0, c0, true, c0.c.b(0xCB0F4901, new y(i1, b0, n1, c0, j0, f, n0, z1), p0), p0, v3 >> 6 & 14 | 0xD80 | v3 >> 12 & 0x70, 0);
            }
            else {
                p0.R(-2080018031);
                p0.R(0x2BB5B5D7);
                int v6 = (v3 >> 6 & 14 | 0x180 | v3 >> 12 & 0x70) >> 3 & 14 | 0x30;
                Nb.j.a(c0, g0.b.a);
                p0.Q(-1710100211);
                boolean z2 = (v6 & 14 ^ 6) <= 4 && p0.f(c0) || (v6 & 6) == 4;
                Object object0 = p0.G();
                if(z2 || object0 == U.l.a) {
                    object0 = new B.u(c0, true);
                    p0.a0(object0);
                }
                p0.p(false);
                p0.R(-1323940314);
                int v7 = p0.P;
                g0 g00 = p0.m();
                F0.k.a.getClass();
                F0.i i2 = F0.j.b;
                c0.b b1 = new c0.b(0xA173A20C, new J0(2, modifier0), true);
                p0.U();
                if(p0.O) {
                    p0.l(i2);
                }
                else {
                    p0.d0();
                }
                U.d.K(p0, ((B.u)object0), F0.j.f);
                U.d.K(p0, g00, F0.j.e);
                h h0 = F0.j.g;
                if(p0.O || !Nb.j.a(p0.G(), v7)) {
                    m5.b.F(v7, p0, v7, h0);
                }
                b1.h(new x0(p0), p0, 0);
                p0.R(2058660585);
                b0.h(new v(androidx.compose.foundation.layout.b.a, n1, c0, j0, f, n0, z1), p0, ((int)(v5 & 0x70)));
                p0.p(false);
                p0.p(true);
                p0.p(false);
                p0.p(false);
            }
            p0.p(false);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new x(o0, modifier0, function10, z0, c0, j0, f, n0, v, z1, b0, v1, v2);
        }
    }

    public static final void g(v v0, Modifier modifier0, b b0, String s, c c0, j j0, float f, n n0, boolean z, p p0, int v1) {
        boolean z1;
        n n1;
        float f1;
        j j1;
        c c1;
        String s1;
        b b1;
        Modifier modifier1;
        Modifier modifier6;
        String s2;
        b b2;
        Modifier modifier2;
        p0.S(880638523);
        int v2 = (v1 & 14) == 0 ? (p0.f(v0) ? 4 : 2) | v1 : v1;
        int v3 = (v1 & 0x1C00) == 0 ? v2 | 1200 : v2 | 0xB0;
        if((0xE000 & v1) == 0) {
            v3 |= 0x2000;
        }
        if((0x70000 & v1) == 0) {
            v3 |= 0x10000;
        }
        if((0x380000 & v1) == 0) {
            v3 |= 0x80000;
        }
        if((0x1C00000 & v1) == 0) {
            v3 |= 0x400000;
        }
        if((0xE000000 & v1) == 0) {
            v3 |= 0x2000000;
        }
        if((0xB6DB6DB & v3) != 0x2492492 || !p0.x()) {
            p0.M();
            if((v1 & 1) == 0 || p0.w()) {
                modifier2 = g0.l.X;
                b2 = v0.b;
                v0.getClass();
                c1 = v0.c;
                j1 = v0.d;
                f1 = v0.e;
                n1 = v0.f;
                z1 = v0.g;
                s2 = null;
            }
            else {
                p0.K();
                modifier2 = modifier0;
                b2 = b0;
                s2 = s;
                c1 = c0;
                j1 = j0;
                f1 = f;
                n1 = n0;
                z1 = z;
            }
            p0.q();
            Modifier modifier3 = s2 == null ? modifier2 : k.a(modifier2, false, new T3.c(s2, 1));
            if(z1) {
                modifier3 = N4.o.k(modifier3);
            }
            Modifier modifier4 = modifier3.d(new ContentPainterElement(b2, c1, j1, f1, n1));
            d d0 = d.c;
            p0.R(0x207BAF9A);
            int v4 = p0.P;
            Modifier modifier5 = g0.a.d(p0, modifier4);
            g0 g00 = p0.m();
            F0.k.a.getClass();
            F0.i i0 = F0.j.b;
            p0.R(1405779621);
            p0.U();
            if(p0.O) {
                modifier6 = modifier2;
                p0.l(new Z2.c(i0, 1));
            }
            else {
                modifier6 = modifier2;
                p0.d0();
            }
            U.d.K(p0, d0, F0.j.f);
            U.d.K(p0, g00, F0.j.e);
            U.d.K(p0, modifier5, F0.j.d);
            h h0 = F0.j.g;
            if(p0.O || !Nb.j.a(p0.G(), v4)) {
                m5.b.F(v4, p0, v4, h0);
            }
            p0.p(true);
            p0.p(false);
            p0.p(false);
            modifier1 = modifier6;
            b1 = b2;
            s1 = s2;
        }
        else {
            p0.K();
            modifier1 = modifier0;
            b1 = b0;
            s1 = s;
            c1 = c0;
            j1 = j0;
            f1 = f;
            n1 = n0;
            z1 = z;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new w(v0, modifier1, b1, s1, c1, j1, f1, n1, z1, v1);
        }
    }

    public static final m h(O0 o00, p p0) {
        m m0 = (m)p0.k(o00);
        return m0 == null ? Y2.a.a(((Context)p0.k(AndroidCompositionLocals_androidKt.b))) : m0;
    }

    public static final Z2.n i(i i0, m m0, Function1 function10, Function1 function11, j j0, int v, p p0, int v1) {
        Object object0;
        p0.R(0x62169369);
        p0.R(952940650);
        Trace.beginSection("rememberAsyncImagePainter");
        try {
            i i1 = A.a(i0, p0);
            t.k(i1);
            p0.R(0x413FABBD);
            object0 = p0.G();
            if(object0 == U.l.a) {
                object0 = new Z2.n(i1, m0);
                p0.a0(object0);
            }
            p0.p(false);
            ((Z2.n)object0).k0 = function10;
            ((Z2.n)object0).l0 = function11;
            ((Z2.n)object0).m0 = j0;
            ((Z2.n)object0).n0 = v;
            ((Z2.n)object0).o0 = ((Boolean)p0.k(r0.a)).booleanValue();
            ((Z2.n)object0).r0.setValue(m0);
            ((Z2.n)object0).q0.setValue(i1);
            ((Z2.n)object0).a();
            p0.p(false);
        }
        finally {
            Trace.endSection();
        }
        p0.p(false);
        return (Z2.n)object0;
    }

    public static void j(String s) {
        throw new IllegalArgumentException("Unsupported type: " + s + ". " + J.e("If you wish to display this ", s, ", use androidx.compose.foundation.Image."));
    }

    public static final void k(i i0) {
        Object object0 = i0.b;
        if(object0 instanceof i3.h) {
            throw new IllegalArgumentException("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
        }
        if(!(object0 instanceof n0.g)) {
            if(!(object0 instanceof t0.e)) {
                if(!(object0 instanceof b)) {
                    if(i0.c != null) {
                        throw new IllegalArgumentException("request.target must be null.");
                    }
                    return;
                }
                t.j("Painter");
                throw null;
            }
            t.j("ImageVector");
            throw null;
        }
        t.j("ImageBitmap");
        throw null;
    }
}

