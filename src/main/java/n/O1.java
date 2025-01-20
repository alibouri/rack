package N;

import B.F0;
import B.I;
import B.O;
import D0.b0;
import H.e;
import U.O0;
import U.Z;
import U.l0;
import U.p;
import androidx.compose.ui.Modifier;
import c0.b;
import c0.c;
import g0.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import n0.v;

public abstract class o1 {
    public static final O0 a;
    public static final float b;

    static {
        o1.a = new O0(S.h0);  // initializer: LU/j0;-><init>(Lkotlin/jvm/functions/Function0;)V
        o1.b = 16.0f;
    }

    public static final void a(Modifier modifier0, q1 q10, Function2 function20, Function2 function21, Function3 function30, Function2 function22, int v, boolean z, Function3 function31, boolean z1, n0.S s0, float f, long v1, long v2, long v3, long v4, long v5, b b0, p p0, int v6, int v7, int v8) {
        Function2 function26;
        Function2 function25;
        Function2 function24;
        q1 q12;
        Modifier modifier2;
        long v18;
        long v17;
        long v16;
        long v15;
        float f1;
        n0.S s1;
        boolean z3;
        Function3 function33;
        boolean z2;
        int v14;
        Function3 function32;
        Function2 function29;
        q1 q13;
        Modifier modifier3;
        int v24;
        long v23;
        long v22;
        long v21;
        long v20;
        float f2;
        n0.S s2;
        boolean z5;
        Function3 function35;
        boolean z4;
        int v19;
        Function2 function28;
        Function3 function34;
        Function2 function27;
        q1 q14;
        Function2 function23;
        int v10;
        q1 q11;
        Modifier modifier1;
        int v9;
        p0.S(1037492569);
        if((v8 & 1) != 0) {
            v9 = v6 | 6;
            modifier1 = modifier0;
        }
        else if((v6 & 6) == 0) {
            modifier1 = modifier0;
            v9 = (p0.f(modifier1) ? 4 : 2) | v6;
        }
        else {
            modifier1 = modifier0;
            v9 = v6;
        }
        if((v6 & 0x30) == 0) {
            if((v8 & 2) == 0) {
                q11 = q10;
                v10 = p0.f(q11) ? 0x20 : 16;
            }
            else {
                q11 = q10;
                v10 = 16;
            }
            v9 |= v10;
        }
        else {
            q11 = q10;
        }
        if((v8 & 4) != 0) {
            v9 |= 0x180;
            function23 = function20;
        }
        else if((v6 & 0x180) == 0) {
            function23 = function20;
            v9 |= (p0.h(function23) ? 0x100 : 0x80);
        }
        else {
            function23 = function20;
        }
        int v11 = v9 | 0x36DB6C00;
        int v12 = (v7 & 6) == 0 ? v7 | 2 : v7;
        int v13 = (v7 & 0x180) == 0 ? v12 | 0xB0 : v12 | 0x30;
        if((v7 & 0xC00) == 0) {
            v13 |= 0x400;
        }
        if((v7 & 0x6000) == 0) {
            v13 |= 0x2000;
        }
        if((0x30000 & v7) == 0) {
            v13 |= (p0.e(v4) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v7) == 0) {
            v13 |= 0x80000;
        }
        if((0xC00000 & v7) == 0) {
            v13 |= (p0.h(b0) ? 0x800000 : 0x400000);
        }
        if((306783379 & v11) != 306783378 || (0x492493 & v13) != 4793490 || !p0.x()) {
            p0.M();
            if((v6 & 1) == 0 || p0.w()) {
                Modifier modifier4 = (v8 & 1) == 0 ? modifier1 : l.X;
                if((v8 & 2) == 0) {
                    q14 = q11;
                }
                else {
                    q14 = o1.d(p0);
                    v11 &= 0xFFFFFF8F;
                }
                if((v8 & 4) != 0) {
                    function23 = X.a;
                }
                e e0 = ((r1)p0.k(s1.a)).c;
                long v25 = ((Q)p0.k(T.a)).g();
                long v26 = T.b(v25, p0);
                long v27 = v.b(0.32f, ((Q)p0.k(T.a)).d());
                long v28 = T.b(v4, p0);
                v24 = v13 & 0xFFC70071;
                modifier3 = modifier4;
                v20 = v25;
                v22 = v27;
                q13 = q14;
                function27 = X.b;
                function34 = X.c;
                function29 = function23;
                function28 = X.d;
                z5 = true;
                function35 = null;
                f2 = p0.a;
                s2 = e0;
                v21 = v26;
                v23 = v28;
                v19 = 2;
                z4 = false;
            }
            else {
                p0.K();
                if((v8 & 2) != 0) {
                    v11 &= 0xFFFFFF8F;
                }
                function27 = function21;
                function34 = function30;
                function28 = function22;
                v19 = v;
                z4 = z;
                function35 = function31;
                z5 = z1;
                s2 = s0;
                f2 = f;
                v20 = v1;
                v21 = v2;
                v22 = v3;
                v23 = v5;
                v24 = v13 & 0xFFC70071;
                modifier3 = modifier1;
                q13 = q11;
                function29 = function23;
            }
            p0.q();
            o1.b(B.e.c(0.0f), modifier3, q13, function29, function27, function34, function28, v19, z4, function35, z5, s2, f2, v20, v21, v22, v4, v23, b0, p0, v11 << 3 & 0x7FFFFFF0, v11 >> 27 & 14 | v24 << 3 & 0x380 | 0x380000 & v24 << 3 | v24 << 3 & 0xE000000);
            modifier2 = modifier3;
            q12 = q13;
            function24 = function29;
            function25 = function27;
            function32 = function34;
            function26 = function28;
            v14 = v19;
            z2 = z4;
            function33 = function35;
            z3 = z5;
            s1 = s2;
            f1 = f2;
            v15 = v20;
            v16 = v21;
            v17 = v22;
            v18 = v23;
        }
        else {
            p0.K();
            function32 = function30;
            v14 = v;
            z2 = z;
            function33 = function31;
            z3 = z1;
            s1 = s0;
            f1 = f;
            v15 = v1;
            v16 = v2;
            v17 = v3;
            v18 = v5;
            modifier2 = modifier1;
            q12 = q11;
            function24 = function23;
            function25 = function21;
            function26 = function22;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new h1(modifier2, q12, function24, function25, function32, function26, v14, z2, function33, z3, s1, f1, v15, v16, v17, v4, v18, b0, v6, v7, v8);
        }
    }

    public static final void b(I i0, Modifier modifier0, q1 q10, Function2 function20, Function2 function21, Function3 function30, Function2 function22, int v, boolean z, Function3 function31, boolean z1, n0.S s0, float f, long v1, long v2, long v3, long v4, long v5, b b0, p p0, int v6, int v7) {
        p0.S(0xB3310EDB);
        int v8 = (v6 & 6) == 0 ? (p0.f(i0) ? 4 : 2) | v6 : v6;
        int v9 = 16;
        if((v6 & 0x30) == 0) {
            v8 |= (p0.f(modifier0) ? 0x20 : 16);
        }
        int v10 = 0x80;
        if((v6 & 0x180) == 0) {
            v8 |= (p0.f(q10) ? 0x100 : 0x80);
        }
        int v11 = 0x400;
        if((v6 & 0xC00) == 0) {
            v8 |= (p0.h(function20) ? 0x800 : 0x400);
        }
        int v12 = 0x2000;
        if((v6 & 0x6000) == 0) {
            v8 |= (p0.h(function21) ? 0x4000 : 0x2000);
        }
        int v13 = 0x10000;
        if((v6 & 0x30000) == 0) {
            v8 |= (p0.h(function30) ? 0x20000 : 0x10000);
        }
        int v14 = 0x80000;
        if((v6 & 0x180000) == 0) {
            v8 |= (p0.h(function22) ? 0x100000 : 0x80000);
        }
        int v15 = 0x400000;
        if((v6 & 0xC00000) == 0) {
            v8 |= (p0.d(v) ? 0x800000 : 0x400000);
        }
        int v16 = 0x2000000;
        if((v6 & 0x6000000) == 0) {
            v8 |= (p0.g(z) ? 0x4000000 : 0x2000000);
        }
        if((v6 & 0x30000000) == 0) {
            v8 |= (p0.h(function31) ? 0x20000000 : 0x10000000);
        }
        int v17 = (v7 & 6) == 0 ? v7 | (p0.g(z1) ? 4 : 2) : v7;
        if((v7 & 0x30) == 0) {
            if(p0.f(s0)) {
                v9 = 0x20;
            }
            v17 |= v9;
        }
        if((v7 & 0x180) == 0) {
            if(p0.c(f)) {
                v10 = 0x100;
            }
            v17 |= v10;
        }
        if((v7 & 0xC00) == 0) {
            if(p0.e(v1)) {
                v11 = 0x800;
            }
            v17 |= v11;
        }
        if((v7 & 0x6000) == 0) {
            if(p0.e(v2)) {
                v12 = 0x4000;
            }
            v17 |= v12;
        }
        if((v7 & 0x30000) == 0) {
            if(p0.e(v3)) {
                v13 = 0x20000;
            }
            v17 |= v13;
        }
        if((v7 & 0x180000) == 0) {
            if(p0.e(v4)) {
                v14 = 0x100000;
            }
            v17 |= v14;
        }
        if((v7 & 0xC00000) == 0) {
            if(p0.e(v5)) {
                v15 = 0x800000;
            }
            v17 |= v15;
        }
        if((v7 & 0x6000000) == 0) {
            if(p0.h(b0)) {
                v16 = 0x4000000;
            }
            v17 |= v16;
        }
        if((v8 & 306783379) != 306783378 || (v17 & 0x2492493) != 0x2492492 || !p0.x()) {
            p0.M();
            if((v6 & 1) != 0 && !p0.w()) {
                p0.K();
            }
            p0.q();
            Object object0 = p0.G();
            if((v8 & 14) == 4 || object0 == U.l.a) {
                object0 = new V0(i0);
                p0.a0(object0);
            }
            new j1(((V0)object0), i0, v4, v5, z, v, function20, b0, function22, function21, function30, q10);
            b b1 = c.c(0xF2E59CA8, null, p0);
            if(function31 == null) {
                p0.Q(652000071);
                b1.h(modifier0, p0, ((int)(v8 >> 3 & 14 | 0x30)));
            }
            else {
                p0.Q(0x26D5400F);
                b b2 = c.c(0xAC015E60, new O(b1, 3), p0);
                B0.a(function31, modifier0, q10.a, z1, s0, f, v1, v2, v3, b2, p0, v8 >> 27 & 14 | 0x30000000 | v8 & 0x70 | v17 << 9 & 0x1C00 | 0xE000 & v17 << 9 | 0x70000 & v17 << 9 | 0x380000 & v17 << 9 | 0x1C00000 & v17 << 9 | v17 << 9 & 0xE000000);
            }
            p0.p(false);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new g1(i0, modifier0, q10, function20, function21, function30, function22, v, z, function31, z1, s0, f, v1, v2, v3, v4, v5, b0, v6, v7);
        }
    }

    public static final void c(boolean z, int v, Function2 function20, b b0, b b1, Function2 function21, F0 f00, Function2 function22, p p0, int v1) {
        p0.S(0xE4146755);
        int v2 = (v1 & 6) == 0 ? (p0.g(z) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (p0.d(v) ? 0x20 : 16);
        }
        if((v1 & 0x180) == 0) {
            v2 |= (p0.h(function20) ? 0x100 : 0x80);
        }
        if((v1 & 0xC00) == 0) {
            v2 |= (p0.h(b0) ? 0x800 : 0x400);
        }
        if((v1 & 0x6000) == 0) {
            v2 |= (p0.h(b1) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v1) == 0) {
            v2 |= (p0.h(function21) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v1) == 0) {
            v2 |= (p0.f(f00) ? 0x100000 : 0x80000);
        }
        if((v1 & 0xC00000) == 0) {
            v2 |= (p0.h(function22) ? 0x800000 : 0x400000);
        }
        if((v2 & 0x492493) != 4793490 || !p0.x()) {
            Object object0 = p0.G();
            if((((v2 & 0x1C00) == 0x800 ? 1 : 0) | (((v2 & 0x380) == 0x100 ? 1 : 0) | ((0xE000 & v2) == 0x4000 ? 1 : 0) | ((0x380000 & v2) == 0x100000 ? 1 : 0) | ((0x70000 & v2) == 0x20000 ? 1 : 0) | ((v2 & 0x70) == 0x20 ? 1 : 0) | ((v2 & 14) == 4 ? 1 : 0) | ((0x1C00000 & v2) == 0x800000 ? 1 : 0))) != 0 || object0 == U.l.a) {
                object0 = new m1(function20, b1, function21, v, z, f00, function22, b0);
                p0.a0(object0);
            }
            b0.d(null, ((Function2)object0), p0, 0, 1);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new n1(z, v, function20, b0, b1, function21, f00, function22, v1);
        }
    }

    public static final q1 d(p p0) {
        C0 c00 = B0.c(p0);
        Z z0 = U.l.a;
        Object object0 = p0.G();
        if(object0 == z0) {
            object0 = new B1();
            p0.a0(object0);
        }
        Object object1 = p0.G();
        if(object1 == z0) {
            object1 = new q1(c00, ((B1)object0));
            p0.a0(object1);
        }
        return (q1)object1;
    }
}

