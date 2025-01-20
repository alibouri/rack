package x;

import B.B;
import B.C;
import B.k;
import B.r;
import B.v0;
import B.x0;
import B.z;
import D0.K;
import D0.u;
import F0.i;
import G0.J;
import H.e;
import H.f;
import I.f0;
import N4.h;
import O0.O;
import U.d;
import U.g0;
import U.l0;
import U.p;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.a;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c0.b;
import e1.x;
import g0.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import n0.M;
import n0.v;

public abstract class o {
    public static final x a;
    public static final c b;

    static {
        o.a = new x(14, true);
        long v = v.b(0.38f, v.b);
        long v1 = v.b(0.38f, v.b);
        o.b = new c(v.e, v.b, v.b, v, v1);
    }

    public static final void a(c c0, Modifier modifier0, b b0, p p0, int v) {
        p0.S(0xC916B2E3);
        int v1 = (v & 6) == 0 ? (p0.f(c0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.f(modifier0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p0.h(b0) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) != 0x92 || !p0.x()) {
            e e0 = f.b(j.e);
            Modifier modifier1 = h.P(a.l(a.p(androidx.compose.foundation.a.b(Pb.a.M(modifier0, j.d, e0, false, 28), c0.a, M.a), 2), 0.0f, j.i, 1), h.H(p0));
            B b1 = z.a(k.c, g0.b.m, p0, 0);
            int v2 = p0.P;
            g0 g00 = p0.m();
            Modifier modifier2 = g0.a.d(p0, modifier1);
            F0.k.a.getClass();
            i i0 = F0.j.b;
            p0.U();
            if(p0.O) {
                p0.l(i0);
            }
            else {
                p0.d0();
            }
            d.K(p0, b1, F0.j.f);
            d.K(p0, g00, F0.j.e);
            F0.h h0 = F0.j.g;
            if(p0.O || !Nb.j.a(p0.G(), v2)) {
                m5.b.F(v2, p0, v2, h0);
            }
            d.K(p0, modifier2, F0.j.d);
            b0.h(C.a, p0, ((int)((v1 << 3 & 0x1C00) >> 6 & 0x70 | 6)));
            p0.p(true);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new u(c0, modifier0, b0, v);
        }
    }

    public static final void b(String s, boolean z, c c0, Modifier modifier0, Function3 function30, Function0 function00, p p0, int v) {
        p0.S(0x2F25FB7F);
        int v1 = (v & 6) == 0 ? (p0.f(s) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.g(z) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p0.f(c0) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (p0.f(modifier0) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (p0.h(function30) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v) == 0) {
            v1 |= (p0.h(function00) ? 0x20000 : 0x10000);
        }
        if((74899 & v1) != 74898 || !p0.x()) {
            l l0 = l.X;
            g0.f f0 = j.f;
            float f1 = j.h;
            B.h h0 = new B.h(f1);
            Object object0 = p0.G();
            if((((v1 & 0x70) == 0x20 ? 1 : 0) | ((0x70000 & v1) == 0x20000 ? 1 : 0)) != 0 || object0 == U.l.a) {
                object0 = new G.b(function00, z);
                p0.a0(object0);
            }
            Modifier modifier1 = a.l(androidx.compose.foundation.layout.c.m(androidx.compose.foundation.layout.c.d(androidx.compose.foundation.a.d(modifier0, z, s, ((Function0)object0), 4), 1.0f), j.a, j.c, j.b, j.c), f1, 0.0f, 2);
            x0 x00 = v0.b(h0, f0, p0, 54);
            int v2 = p0.P;
            g0 g00 = p0.m();
            Modifier modifier2 = g0.a.d(p0, modifier1);
            F0.k.a.getClass();
            i i0 = F0.j.b;
            p0.U();
            if(p0.O) {
                p0.l(i0);
            }
            else {
                p0.d0();
            }
            F0.h h1 = F0.j.f;
            d.K(p0, x00, h1);
            F0.h h2 = F0.j.e;
            d.K(p0, g00, h2);
            F0.h h3 = F0.j.g;
            if(p0.O || !Nb.j.a(p0.G(), v2)) {
                m5.b.F(v2, p0, v2, h3);
            }
            F0.h h4 = F0.j.d;
            d.K(p0, modifier2, h4);
            if(function30 == null) {
                p0.Q(0x210E0CCD);
            }
            else {
                p0.Q(0x210E0CCE);
                Modifier modifier3 = androidx.compose.foundation.layout.c.j(l0, j.j, 0.0f, j.j, j.j, 2);
                K k0 = r.e(g0.b.a, false);
                int v3 = p0.P;
                g0 g01 = p0.m();
                Modifier modifier4 = g0.a.d(p0, modifier3);
                p0.U();
                if(p0.O) {
                    p0.l(i0);
                }
                else {
                    p0.d0();
                }
                d.K(p0, k0, h1);
                d.K(p0, g01, h2);
                if(p0.O || !Nb.j.a(p0.G(), v3)) {
                    m5.b.F(v3, p0, v3, h3);
                }
                d.K(p0, modifier4, h4);
                function30.h(new v((z ? c0.c : c0.e)), p0, 0);
                p0.p(true);
            }
            p0.p(false);
            O o0 = new O((z ? c0.b : c0.d), j.k, j.l, null, j.n, j.g, j.m, null, 0xFD7F78);
            f0.b(s, new LayoutWeightElement(1.0f, true), o0, null, 0, false, 1, 0, null, p0, v1 & 14 | 0x180000, 440);
            p0.p(true);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new N.O(s, z, c0, modifier0, function30, function00, v);
        }
    }

    public static final void c(x.h h0, Function0 function00, Modifier modifier0, Function1 function10, p p0, int v) {
        p0.S(712057293);
        int v1 = (v & 6) == 0 ? (p0.f(h0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.h(function00) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p0.f(modifier0) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (p0.h(function10) ? 0x800 : 0x400);
        }
        if((v1 & 0x493) != 1170 || !p0.x()) {
            Context context0 = (Context)p0.k(AndroidCompositionLocals_androidKt.b);
            Configuration configuration0 = (Configuration)p0.k(AndroidCompositionLocals_androidKt.a);
            boolean z = p0.f(context0);
            boolean z1 = p0.f(configuration0);
            Object object0 = p0.G();
            if((z1 | z) != 0 || object0 == U.l.a) {
                c c0 = o.b;
                long v2 = c0.a;
                TypedArray typedArray0 = context0.obtainStyledAttributes(0x1030086, new int[]{0x1010031});
                int v3 = M.G(v2);
                int v4 = typedArray0.getColor(0, v3);
                typedArray0.recycle();
                if(v4 != v3) {
                    v2 = M.c(v4);
                }
                TypedArray typedArray1 = context0.obtainStyledAttributes(0x1030080, new int[]{0x1010036});
                ColorStateList colorStateList0 = typedArray1.getColorStateList(0);
                typedArray1.recycle();
                long v5 = c0.b;
                int v6 = M.G(v5);
                Integer integer0 = null;
                Integer integer1 = colorStateList0 == null ? null : colorStateList0.getColorForState(new int[]{0x101009E}, v6);
                if(integer1 != null && ((int)integer1) != v6) {
                    v5 = M.c(((int)integer1));
                }
                long v7 = c0.d;
                int v8 = M.G(v7);
                if(colorStateList0 != null) {
                    integer0 = colorStateList0.getColorForState(new int[]{0xFEFEFF62}, v8);
                }
                if(integer0 != null && ((int)integer0) != v8) {
                    v7 = M.c(((int)integer0));
                }
                object0 = new c(v2, v5, v5, v7, v7);
                p0.a0(object0);
            }
            o.d(h0, function00, modifier0, ((c)object0), function10, p0, v1 & 0x3FE | v1 << 3 & 0xE000);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new E.K(h0, function00, modifier0, function10, v);
        }
    }

    public static final void d(x.h h0, Function0 function00, Modifier modifier0, c c0, Function1 function10, p p0, int v) {
        p0.S(0x56425B5B);
        int v1 = (v & 6) == 0 ? (p0.f(h0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.h(function00) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p0.f(modifier0) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (p0.f(c0) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (p0.h(function10) ? 0x4000 : 0x2000);
        }
        if((v1 & 9363) != 9362 || !p0.x()) {
            b b0 = c0.c.c(0x2F709E7D, new J(c0, modifier0, function10), p0);
            e1.k.a(h0, function00, o.a, b0, p0, v1 & 14 | 0xD80 | v1 & 0x70, 0);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new c0.a(h0, function00, modifier0, c0, function10, v);
        }
    }
}

