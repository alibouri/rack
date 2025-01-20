package R;

import Aa.P;
import B.L0;
import B.m0;
import C.n;
import E.o;
import I.L;
import I.O;
import I2.J;
import M0.k;
import U.H;
import U.N0;
import U.Z;
import U.l0;
import U.p;
import U.w;
import U5.a;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.unit.Density;
import c0.b;
import dc.e;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import n0.M;
import n0.S;
import n0.v;
import v.f;
import v.n0;
import y.g0;
import y.q0;

public abstract class h0 {
    public static final float a;
    public static final float b;
    public static final long c;

    static {
        h0.a = 48.0f;
        h0.b = 24.0f;
        h0.c = M.i(0.5f, 0.0f);
    }

    public static final void a(Function0 function00, Modifier modifier0, z0 z00, float f, S s0, long v, long v1, float f1, long v2, Function2 function20, Function2 function21, i0 i00, b b0, p p0, int v3, int v4) {
        i0 i01;
        long v12;
        float f3;
        float f2;
        Modifier modifier1;
        int v19;
        int v18;
        v.b b1;
        boolean z5;
        int v17;
        Function0 function01;
        int v14;
        i0 i02;
        long v13;
        float f5;
        float f4;
        Modifier modifier2;
        int v10;
        boolean z = true;
        p0.S(0x7F1EB8B9);
        int v5 = 2;
        int v6 = (v3 & 6) == 0 ? (p0.h(function00) ? 4 : 2) | v3 : v3;
        int v7 = (v3 & 0x180) == 0 ? v6 | 0x30 | (p0.f(z00) ? 0x100 : 0x80) : v6 | 0x30;
        int v8 = (v3 & 0x6000) == 0 ? v7 | 0xC00 | (p0.f(s0) ? 0x4000 : 0x2000) : v7 | 0xC00;
        if((0x30000 & v3) == 0) {
            v8 |= (p0.e(v) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v3) == 0) {
            v8 |= (p0.e(v1) ? 0x100000 : 0x80000);
        }
        int v9 = (v3 & 0x6000000) == 0 ? 0x2C00000 | v8 : 0xC00000 | v8;
        if((0x30000000 & v3) == 0) {
            v9 |= (p0.h(function20) ? 0x20000000 : 0x10000000);
        }
        if((v4 & 6) == 0) {
            if(p0.h(function21)) {
                v5 = 4;
            }
            v10 = v5 | v4;
        }
        else {
            v10 = v4;
        }
        int v11 = (v4 & 0x180) == 0 ? v10 | 0x30 | (p0.h(b0) ? 0x100 : 0x80) : v10 | 0x30;
        if((306783379 & v9) != 306783378 || (v11 & 0x93) != 0x92 || !p0.x()) {
            p0.M();
            if((v3 & 1) == 0 || p0.w()) {
                long v15 = v.b(0.32f, l.c(30, p0));
                modifier2 = g0.l.X;
                f5 = 0.0f;
                i02 = E.a;
                v13 = v15;
                f4 = c.c;
                v14 = 0xF1FFFFFF & v9;
            }
            else {
                p0.K();
                modifier2 = modifier0;
                f4 = f;
                f5 = f1;
                v13 = v2;
                i02 = i00;
                v14 = v9 & 0xF1FFFFFF;
            }
            p0.q();
            Object object0 = p0.G();
            Z z1 = U.l.a;
            if(object0 == z1) {
                w w0 = new w(H.h(p0));
                p0.a0(w0);
                object0 = w0;
            }
            e e0 = ((w)object0).X;
            int v16 = v14 & 0x380 ^ 0x180;
            boolean z2 = v16 <= 0x100 && p0.f(z00) || (v14 & 0x180) == 0x100;
            boolean z3 = p0.h(e0);
            Object object1 = p0.G();
            if((z2 | z3 | ((v14 & 14) == 4 ? 1 : 0)) != 0 || object1 == z1) {
                function01 = function00;
                object1 = new n(z00, e0, function01, 6);
                p0.a0(object1);
            }
            else {
                function01 = function00;
            }
            boolean z4 = p0.h(e0);
            if(v16 > 0x100 && p0.f(z00)) {
                v17 = v11;
                z5 = true;
            }
            else {
                v17 = v11;
                z5 = (v14 & 0x180) == 0x100;
            }
            Object object2 = p0.G();
            if((z4 | z5 | ((v14 & 14) == 4 ? 1 : 0)) != 0 || object2 == z1) {
                object2 = new m0(e0, z00, function01, 10);
                p0.a0(object2);
            }
            Object object3 = p0.G();
            if(object3 == z1) {
                object3 = v.c.a(0.0f);
                p0.a0(object3);
            }
            boolean z6 = v16 <= 0x100 && p0.f(z00) || (v14 & 0x180) == 0x100;
            boolean z7 = p0.h(e0);
            boolean z8 = p0.h(((v.b)object3));
            Object object4 = p0.G();
            if((z6 | z7 | z8 | ((v14 & 14) == 4 ? 1 : 0)) != 0 || object4 == z1) {
                b1 = (v.b)object3;
                v19 = v17;
                v18 = v16;
                O o0 = new O(z00, e0, ((v.b)object3), function00, 1);
                p0.a0(o0);
                object4 = o0;
            }
            else {
                b1 = (v.b)object3;
                v18 = v16;
                v19 = v17;
            }
            E.d(((Function0)object4), i02, b1, c0.c.c(-314673510, new T(v13, ((Function0)object1), z00, b1, e0, ((Function1)object2), modifier2, f4, s0, v, v1, f5, function20, function21, b0), p0), p0, v19 & 0x70 | 0xE00);
            if(((Map)z00.c.h().a).containsKey(A0.Y)) {
                if((v18 <= 0x100 || !p0.f(z00)) && (v14 & 0x180) != 0x100) {
                    z = false;
                }
                Object object5 = p0.G();
                if(z || object5 == z1) {
                    object5 = new U(z00, null);
                    p0.a0(object5);
                }
                H.d(p0, z00, ((Function2)object5));
            }
            modifier1 = modifier2;
            f2 = f4;
            f3 = f5;
            v12 = v13;
            i01 = i02;
        }
        else {
            p0.K();
            modifier1 = modifier0;
            f2 = f;
            f3 = f1;
            v12 = v2;
            i01 = i00;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new V(function00, modifier1, z00, f2, s0, v, v1, f3, v12, function20, function21, i01, b0, v3, v4);
        }
    }

    public static final void b(v.b b0, e e0, Function0 function00, Function1 function10, Modifier modifier0, z0 z00, float f, S s0, long v, long v1, float f1, Function2 function20, Function2 function21, b b1, p p0, int v2, int v3) {
        int v8;
        androidx.compose.foundation.layout.b b3;
        androidx.compose.foundation.layout.b b2 = androidx.compose.foundation.layout.b.a;
        p0.S(0x9C0B9CED);
        int v4 = (v2 & 6) == 0 ? (p0.f(b2) ? 4 : 2) | v2 : v2;
        if((v2 & 0x30) == 0) {
            v4 |= (((v2 & 0x40) == 0 ? p0.f(b0) : p0.h(b0)) ? 0x20 : 16);
        }
        int v5 = 0x80;
        if((v2 & 0x180) == 0) {
            v4 |= (p0.h(e0) ? 0x100 : 0x80);
        }
        int v6 = 0x400;
        if((v2 & 0xC00) == 0) {
            v4 |= (p0.h(function00) ? 0x800 : 0x400);
        }
        int v7 = 0x2000;
        if((v2 & 0x6000) == 0) {
            v4 |= (p0.h(function10) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v2) == 0) {
            v4 |= (p0.f(modifier0) ? 0x20000 : 0x10000);
        }
        if((v2 & 0x180000) == 0) {
            v4 |= (p0.f(z00) ? 0x100000 : 0x80000);
        }
        if((v2 & 0xC00000) == 0) {
            v4 |= (p0.c(f) ? 0x800000 : 0x400000);
        }
        if((v2 & 0x6000000) == 0) {
            v4 |= (p0.f(s0) ? 0x4000000 : 0x2000000);
        }
        if((v2 & 0x30000000) == 0) {
            v4 |= (p0.e(v) ? 0x20000000 : 0x10000000);
        }
        if((v3 & 6) == 0) {
            b3 = b2;
            v8 = v3 | (p0.e(v1) ? 4 : 2);
        }
        else {
            b3 = b2;
            v8 = v3;
        }
        if((v3 & 0x30) == 0) {
            v8 |= (p0.c(f1) ? 0x20 : 16);
        }
        if((v3 & 0x180) == 0) {
            if(p0.h(function20)) {
                v5 = 0x100;
            }
            v8 |= v5;
        }
        if((v3 & 0xC00) == 0) {
            if(p0.h(function21)) {
                v6 = 0x800;
            }
            v8 |= v6;
        }
        if((v3 & 0x6000) == 0) {
            if(p0.h(b1)) {
                v7 = 0x4000;
            }
            v8 |= v7;
        }
        if((v4 & 306783379) != 306783378 || (v8 & 9363) != 9362 || !p0.x()) {
            p0.M();
            if((v2 & 1) != 0 && !p0.w()) {
                p0.K();
            }
            p0.q();
            String s1 = a.C(0x7F12021E, p0);  // string:m3c_bottom_sheet_pane_title "Bottom Sheet"
            Modifier modifier1 = androidx.compose.foundation.layout.c.d(androidx.compose.foundation.layout.c.p(b3.a(modifier0, g0.b.b), 0.0f, f, 1), 1.0f);
            int v9 = v4 & 0x380000 ^ 0x180000;
            boolean z = v9 <= 0x100000 && p0.f(z00) || (v4 & 0x180000) == 0x100000;
            Object object0 = p0.G();
            Z z1 = U.l.a;
            if(z || object0 == z1) {
                object0 = new w0(z00, function10);
                p0.a0(object0);
            }
            Modifier modifier2 = androidx.compose.ui.input.nestedscroll.a.a(modifier1, ((y0.a)object0), null);
            N.v v10 = z00.c;
            q0 q00 = q0.X;
            boolean z2 = v9 <= 0x100000 && p0.f(z00) || (v4 & 0x180000) == 0x100000;
            Object object1 = p0.G();
            if(z2 || object1 == z1) {
                object1 = new L0(12, z00);
                p0.a0(object1);
            }
            Modifier modifier3 = androidx.compose.material3.internal.a.c(modifier2, v10, ((Function2)object1));
            io.sentry.internal.debugmeta.c c0 = (io.sentry.internal.debugmeta.c)z00.c.n;
            boolean z3 = z00.c();
            boolean z4 = z00.c.i.getValue() != null;
            Object object2 = p0.G();
            if((v4 & 0xE000) == 0x4000 || object2 == z1) {
                object2 = new a0(function10, null);
                p0.a0(object2);
            }
            Modifier modifier4 = g0.a(modifier3, c0, q00, z3, null, z4, ((Function3)object2), false, 0xA8);
            boolean z5 = p0.f(s1);
            Object object3 = p0.G();
            if(z5 || object3 == z1) {
                object3 = new M0.l(s1, 4);
                p0.a0(object3);
            }
            int v11 = 0;
            Modifier modifier5 = k.a(modifier4, false, ((Function1)object3));
            int v12 = (v9 <= 0x100000 || !p0.f(z00)) && (v4 & 0x180000) != 0x100000 ? 0 : 1;
            if((v4 & 0x70) == 0x20 || (v4 & 0x40) != 0 && p0.h(b0)) {
                v11 = 1;
            }
            Object object4 = p0.G();
            if((v11 | v12) != 0 || object4 == z1) {
                object4 = new P(z00, 27, b0);
                p0.a0(object4);
            }
            V0.a(androidx.compose.ui.graphics.a.a(modifier5, ((Function1)object4)), s0, v, v1, f1, 0.0f, c0.c.c(0xD6B6B608, new d0(function21, b0, function20, z00, function00, e0, b1), p0), p0, v4 >> 21 & 0x380 | (v4 >> 21 & 0x70 | 0xC00000) | v8 << 9 & 0x1C00 | v8 << 9 & 0xE000, 0x60);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new e0(b0, e0, function00, function10, modifier0, z00, f, s0, v, v1, f1, function20, function21, b1, v2, v3);
        }
    }

    public static final void c(long v, Function0 function00, boolean z, p p0, int v1) {
        Modifier modifier0;
        boolean z3;
        p0.S(0x38BC6405);
        int v2 = (v1 & 6) == 0 ? (p0.e(v) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (p0.h(function00) ? 0x20 : 16);
        }
        if((v1 & 0x180) == 0) {
            v2 |= (p0.g(z) ? 0x100 : 0x80);
        }
        if((v2 & 0x93) == 0x92 && p0.x()) {
            p0.K();
        }
        else if(v != 16L) {
            N0 n00 = f.b((z ? 1.0f : 0.0f), new n0(0, null, 7), p0);
            String s = a.C(0x7F1200C2, p0);  // string:close_sheet "Close sheet"
            p0.Q(0x959115B2);
            g0.l l0 = g0.l.X;
            Z z1 = U.l.a;
            if(z) {
                Object object0 = p0.G();
                if((v2 & 0x70) == 0x20 || object0 == z1) {
                    object0 = new R.g0(function00, null);
                    p0.a0(object0);
                }
                SuspendPointerInputElement suspendPointerInputElement0 = new SuspendPointerInputElement(function00, null, ((Function2)object0), 6);
                boolean z2 = p0.f(s);
                Object object1 = p0.G();
                if(((v2 & 0x70) == 0x20 | z2) != 0 || object1 == z1) {
                    object1 = new N.A0(s, function00, 1);
                    p0.a0(object1);
                }
                z3 = true;
                modifier0 = k.a(suspendPointerInputElement0, true, ((Function1)object1));
            }
            else {
                z3 = true;
                modifier0 = l0;
            }
            p0.p(false);
            Modifier modifier1 = androidx.compose.foundation.layout.c.c(l0, 1.0f).d(modifier0);
            if((v2 & 14) != 4) {
                z3 = false;
            }
            boolean z4 = p0.f(n00);
            Object object2 = p0.G();
            if((z4 | z3) != 0 || object2 == z1) {
                object2 = new o(2, v, n00);
                p0.a0(object2);
            }
            J.a(modifier1, ((Function1)object2), p0, 0);
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new f0(v, function00, z, v1);
        }
    }

    public static final float d(n0.O o0, float f) {
        float f1 = m0.e.d(o0.p0);
        return Float.isNaN(f1) || f1 == 0.0f ? 1.0f : 1.0f - io.sentry.config.a.V(0.0f, Math.min(o0.q0.getDensity() * h0.a, f1), f) / f1;
    }

    public static final float e(n0.O o0, float f) {
        float f1 = m0.e.b(o0.p0);
        return Float.isNaN(f1) || f1 == 0.0f ? 1.0f : 1.0f - io.sentry.config.a.V(0.0f, Math.min(o0.q0.getDensity() * h0.b, f1), f) / f1;
    }

    public static final z0 f(int v, int v1, p p0, boolean z) {
        A0 a00 = A0.X;
        boolean z1 = true;
        if((v1 & 1) != 0) {
            z = false;
        }
        h h0 = h.b0;
        int v2 = v & 14 | 0x180;
        Object object0 = p0.k(G0.f0.f);
        Object[] arr_object = {Boolean.valueOf(z), h0, Boolean.FALSE};
        L l0 = new L(z, ((Density)object0), h0, false);
        K.v v3 = new K.v(R.n.f0, 11, l0);
        if(((v2 & 14 ^ 6) <= 4 || !p0.g(z)) && (v2 & 6) != 4) {
            z1 = false;
        }
        boolean z2 = p0.f(((Density)object0));
        boolean z3 = p0.f(h0);
        boolean z4 = p0.g(false);
        Object object1 = p0.G();
        if((z2 | z1 | z3 | z4) != 0 || object1 == U.l.a) {
            object1 = new x0(z, ((Density)object0), a00, h0, false);
            p0.a0(object1);
        }
        return (z0)R2.f.y(arr_object, v3, ((Function0)object1), p0, 0, 4);
    }
}

