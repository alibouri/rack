package D0;

import Ab.t;
import F0.c0;
import F0.i;
import F0.j;
import F0.k;
import J2.w;
import U.H;
import U.d;
import U.g0;
import U.h;
import U.l0;
import U.l;
import U.n;
import U.p;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.LayoutNode;
import c0.b;
import g0.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import m0.c;
import m0.e;

public abstract class b0 {
    public static final P a;

    static {
        b0.a = new P(5);
    }

    public static final void a(Modifier modifier0, b b0, K k0, p p0, int v) {
        p0.S(1949933075);
        int v1 = (v & 6) == 0 ? (p0.f(modifier0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.h(b0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p0.f(k0) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) != 0x92 || !p0.x()) {
            int v2 = p0.P;
            Modifier modifier1 = a.d(p0, modifier0);
            g0 g00 = p0.m();
            i i0 = i.b0;
            p0.U();
            if(p0.O) {
                p0.l(i0);
            }
            else {
                p0.d0();
            }
            k.a.getClass();
            d.K(p0, k0, j.f);
            d.K(p0, g00, j.e);
            if(p0.O) {
                h h0 = new h(2, 2);
                p0.b(t.a, h0);
            }
            d.K(p0, modifier1, j.d);
            F0.h h1 = j.g;
            if(p0.O || !Nb.j.a(p0.G(), v2)) {
                m5.b.F(v2, p0, v2, h1);
            }
            b0.j(p0, ((int)((v1 << 3 & 0x380 | 6) >> 6 & 14)));
            p0.p(true);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new u(modifier0, b0, k0, v, 0);
        }
    }

    public static final long b(float f, float f1) {
        return ((long)Float.floatToRawIntBits(f1)) & 0xFFFFFFFFL | ((long)Float.floatToRawIntBits(f)) << 0x20;
    }

    public static final void c(e0 e00, Modifier modifier0, Function2 function20, p p0, int v) {
        p0.S(0xE17BA7B9);
        int v1 = (v & 6) == 0 ? (p0.h(e00) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.f(modifier0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p0.h(function20) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) != 0x92 || !p0.x()) {
            int v2 = p0.P;
            n n0 = d.F(p0);
            Modifier modifier1 = a.d(p0, modifier0);
            g0 g00 = p0.m();
            i i0 = i.b0;
            p0.U();
            if(p0.O) {
                p0.l(i0);
            }
            else {
                p0.d0();
            }
            d.K(p0, e00, e00.c);
            d.K(p0, n0, e00.d);
            d.K(p0, function20, e00.e);
            k.a.getClass();
            d.K(p0, g00, j.e);
            d.K(p0, modifier1, j.d);
            F0.h h0 = j.g;
            if(p0.O || !Nb.j.a(p0.G(), v2)) {
                m5.b.F(v2, p0, v2, h0);
            }
            p0.p(true);
            if(p0.x()) {
                p0.Q(-26502501);
            }
            else {
                p0.Q(-26580342);
                boolean z = p0.h(e00);
                Object object0 = p0.G();
                if(z || object0 == l.a) {
                    object0 = new a0(0, e00);
                    p0.a0(object0);
                }
                H.g(((Function0)object0), p0);
            }
            p0.p(false);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new u(e00, modifier0, function20, v, 1, false);
        }
    }

    public static final void d(Modifier modifier0, Function2 function20, p p0, int v, int v1) {
        int v2;
        p0.S(0xB29CB430);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (p0.f(modifier0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v & 0x30) == 0) {
            v2 |= (p0.h(function20) ? 0x20 : 16);
        }
        if((v2 & 19) != 18 || !p0.x()) {
            if((v1 & 1) != 0) {
                modifier0 = g0.l.X;
            }
            Object object0 = p0.G();
            if(object0 == l.a) {
                object0 = new e0(P.Y);
                p0.a0(object0);
            }
            b0.c(((e0)object0), modifier0, function20, p0, v2 << 3 & 0x3F0);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new C.j(modifier0, function20, v, v1);
        }
    }

    public static final c e(LayoutCoordinates layoutCoordinates0) {
        LayoutCoordinates layoutCoordinates1 = layoutCoordinates0.h();
        return layoutCoordinates1 == null ? new c(0.0f, 0.0f, ((float)(((int)(layoutCoordinates0.C() >> 0x20)))), ((float)(((int)(layoutCoordinates0.C() & 0xFFFFFFFFL))))) : layoutCoordinates1.x(layoutCoordinates0, true);
    }

    public static final c f(LayoutCoordinates layoutCoordinates0) {
        LayoutCoordinates layoutCoordinates1 = b0.h(layoutCoordinates0);
        float f = (float)(((int)(layoutCoordinates1.C() >> 0x20)));
        float f1 = (float)(((int)(layoutCoordinates1.C() & 0xFFFFFFFFL)));
        c c0 = b0.h(layoutCoordinates0).x(layoutCoordinates0, true);
        float f2 = c0.a;
        float f3 = 0.0f;
        if(f2 < 0.0f) {
            f2 = 0.0f;
        }
        if(f2 > f) {
            f2 = f;
        }
        float f4 = c0.b < 0.0f ? 0.0f : c0.b;
        if(f4 > f1) {
            f4 = f1;
        }
        float f5 = c0.c < 0.0f ? 0.0f : c0.c;
        if(f5 <= f) {
            f = f5;
        }
        float f6 = c0.d;
        if(f6 >= 0.0f) {
            f3 = f6;
        }
        if(f3 <= f1) {
            f1 = f3;
        }
        if(f2 == f || f4 == f1) {
            return c.e;
        }
        long v = layoutCoordinates1.f(yc.d.d(f2, f4));
        long v1 = layoutCoordinates1.f(yc.d.d(f, f4));
        long v2 = layoutCoordinates1.f(yc.d.d(f, f1));
        long v3 = layoutCoordinates1.f(yc.d.d(f2, f1));
        float f7 = m0.b.d(v);
        float f8 = m0.b.d(v1);
        float f9 = m0.b.d(v3);
        float f10 = m0.b.d(v2);
        float f11 = m0.b.e(v);
        float f12 = m0.b.e(v1);
        float f13 = m0.b.e(v3);
        float f14 = m0.b.e(v2);
        return new c(Math.min(f7, Math.min(f8, Math.min(f9, f10))), Math.min(f11, Math.min(f12, Math.min(f13, f14))), Math.max(f7, Math.max(f8, Math.max(f9, f10))), Math.max(f11, Math.max(f12, Math.max(f13, f14))));
    }

    public static final boolean g(int v, int v1) [...] // Inlined contents

    public static final LayoutCoordinates h(LayoutCoordinates layoutCoordinates0) {
        LayoutCoordinates layoutCoordinates3;
        LayoutCoordinates layoutCoordinates2;
        for(LayoutCoordinates layoutCoordinates1 = layoutCoordinates0.h(); true; layoutCoordinates1 = layoutCoordinates0.h()) {
            layoutCoordinates2 = layoutCoordinates0;
            layoutCoordinates0 = layoutCoordinates1;
            if(layoutCoordinates0 == null) {
                break;
            }
        }
        c0 c00 = layoutCoordinates2 instanceof c0 ? ((c0)layoutCoordinates2) : null;
        if(c00 == null) {
            return layoutCoordinates2;
        }
        for(c0 c01 = c00.l0; true; c01 = c00.l0) {
            layoutCoordinates3 = c00;
            c00 = c01;
            if(c00 == null) {
                break;
            }
        }
        return layoutCoordinates3;
    }

    public static final F0.P i(F0.P p0) {
        LayoutNode layoutNode0 = p0.j0.j0;
        while(true) {
            LayoutNode layoutNode1 = layoutNode0.s();
            LayoutNode layoutNode2 = null;
            if((layoutNode1 == null ? null : layoutNode1.Z) == null) {
                break;
            }
            LayoutNode layoutNode3 = layoutNode0.s();
            if(layoutNode3 != null) {
                layoutNode2 = layoutNode3.Z;
            }
            Nb.j.c(layoutNode2);
            LayoutNode layoutNode4 = layoutNode0.s();
            Nb.j.c(layoutNode4);
            layoutNode0 = layoutNode4.Z;
            Nb.j.c(layoutNode0);
        }
        F0.P p1 = ((c0)layoutNode0.u0.d).E0();
        Nb.j.c(p1);
        return p1;
    }

    public static final long j(long v, long v1) {
        float f = e.d(v);
        float f1 = Z.a(v1);
        float f2 = e.b(v);
        return w.m(f1 * f, Z.b(v1) * f2);
    }
}

