package R;

import Aa.P;
import B.F0;
import B.H0;
import B.J0;
import B.d;
import D0.b0;
import S.t;
import U.Z;
import U.l0;
import U.p;
import androidx.compose.ui.Modifier;
import c0.b;
import c0.c;
import g0.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public abstract class r0 {
    public static final float a;

    static {
        r0.a = 16.0f;
    }

    public static final void a(Modifier modifier0, Function2 function20, Function2 function21, Function2 function22, Function2 function23, int v, long v1, long v2, F0 f00, b b0, p p0, int v3) {
        F0 f01;
        long v8;
        long v7;
        int v6;
        Function2 function26;
        Function2 function25;
        Function2 function24;
        Modifier modifier1;
        F0 f02;
        long v11;
        long v10;
        int v9;
        Function2 function29;
        Function2 function28;
        Function2 function27;
        Modifier modifier2;
        p0.S(0xB74F930F);
        int v4 = (v3 & 0xC00) == 0 ? v3 | 438 | (p0.h(function22) ? 0x800 : 0x400) : v3 | 438;
        int v5 = (0x180000 & v3) == 0 ? 0xB6000 | v4 : 0x36000 | v4;
        if((0xC00000 & v3) == 0) {
            v5 |= 0x400000;
        }
        if((0x6000000 & v3) == 0) {
            v5 |= 0x2000000;
        }
        if((0x30000000 & v3) == 0) {
            v5 |= (p0.h(b0) ? 0x20000000 : 0x10000000);
        }
        if((306783379 & v5) != 306783378 || !p0.x()) {
            p0.M();
            if((v3 & 1) == 0 || p0.w()) {
                long v12 = ((j)p0.k(l.a)).n;
                long v13 = l.a(v12, p0);
                H0 h00 = d.f(p0);
                modifier2 = g0.l.X;
                function27 = R.p.a;
                function28 = R.p.b;
                function29 = R.p.c;
                v10 = v12;
                v11 = v13;
                f02 = h00.g;
                v9 = 2;
            }
            else {
                p0.K();
                modifier2 = modifier0;
                function27 = function20;
                function28 = function21;
                function29 = function23;
                v9 = v;
                v10 = v1;
                v11 = v2;
                f02 = f00;
            }
            p0.q();
            boolean z = p0.f(f02);
            Object object0 = p0.G();
            Z z1 = U.l.a;
            if(z || object0 == z1) {
                object0 = new t(f02);
                p0.a0(object0);
            }
            boolean z2 = p0.f(((t)object0));
            boolean z3 = p0.f(f02);
            Object object1 = p0.G();
            if((z2 | z3) != 0 || object1 == z1) {
                object1 = new P(((t)object0), 28, f02);
                p0.a0(object1);
            }
            J0 j00 = new J0(0, ((Function1)object1));
            V0.a(a.b(modifier2, G0.j.e0, j00), null, v10, v11, 0.0f, 0.0f, c.c(0x8A07B92A, new n0(v9, function27, b0, function22, function29, ((t)object0), function28), p0), p0, 0xC00000, 0x72);
            function24 = function27;
            function25 = function28;
            function26 = function29;
            v6 = v9;
            v7 = v10;
            v8 = v11;
            modifier1 = modifier2;
            f01 = f02;
        }
        else {
            p0.K();
            modifier1 = modifier0;
            function24 = function20;
            function25 = function21;
            function26 = function23;
            v6 = v;
            v7 = v1;
            v8 = v2;
            f01 = f00;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new o0(modifier1, function24, function25, function22, function26, v6, v7, v8, f01, b0, v3);
        }
    }

    public static final void b(int v, Function2 function20, b b0, Function2 function21, Function2 function22, F0 f00, Function2 function23, p p0, int v1) {
        p0.S(0xC5DADE7A);
        int v2 = (v1 & 6) == 0 ? (p0.d(v) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (p0.h(function20) ? 0x20 : 16);
        }
        if((v1 & 0x180) == 0) {
            v2 |= (p0.h(b0) ? 0x100 : 0x80);
        }
        if((v1 & 0xC00) == 0) {
            v2 |= (p0.h(function21) ? 0x800 : 0x400);
        }
        if((v1 & 0x6000) == 0) {
            v2 |= (p0.h(function22) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v1) == 0) {
            v2 |= (p0.f(f00) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v1) == 0) {
            v2 |= (p0.h(function23) ? 0x100000 : 0x80000);
        }
        if((v2 & 0x92493) != 0x92492 || !p0.x()) {
            Object object0 = p0.G();
            if((((v2 & 0x70) == 0x20 ? 1 : 0) | ((v2 & 0x1C00) == 0x800 ? 1 : 0) | ((0x70000 & v2) == 0x20000 ? 1 : 0) | ((0xE000 & v2) == 0x4000 ? 1 : 0) | ((v2 & 14) == 4 ? 1 : 0) | ((0x380000 & v2) == 0x100000 ? 1 : 0) | ((v2 & 0x380) == 0x100 ? 1 : 0)) != 0 || object0 == U.l.a) {
                object0 = new n0(function20, function21, function22, v, f00, function23, b0);
                p0.a0(object0);
            }
            b0.d(null, ((Function2)object0), p0, 0, 1);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new q0(v, function20, b0, function21, function22, f00, function23, v1);
        }
    }
}

