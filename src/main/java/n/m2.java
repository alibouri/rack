package N;

import Bb.A;
import E.E;
import I.f0;
import O0.O;
import O0.f;
import T0.l;
import T0.s;
import T0.w;
import U.Z;
import U.d;
import U.l0;
import U.p;
import U.x;
import Z0.i;
import Z0.j;
import androidx.compose.ui.Modifier;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import n0.v;

public abstract class m2 {
    public static final x a;

    static {
        m2.a = new x(Z.e, S.j0);
    }

    public static final void a(O o0, Function2 function20, p p0, int v) {
        p0.S(0x69A2BC9C);
        int v1 = (v & 6) == 0 ? (p0.f(o0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.h(function20) ? 0x20 : 16);
        }
        if((v1 & 19) != 18 || !p0.x()) {
            O o1 = ((O)p0.k(m2.a)).d(o0);
            d.a(m2.a.a(o1), function20, p0, v1 & 0x70 | 8);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new E(v, 6, o0, function20);
        }
    }

    public static final void b(String s, Modifier modifier0, long v, long v1, s s1, w w0, l l0, long v2, j j0, i i0, long v3, int v4, boolean z, int v5, int v6, Function1 function10, O o0, p p0, int v7, int v8, int v9) {
        l l1;
        w w1;
        long v24;
        O o1;
        Function1 function11;
        int v23;
        int v22;
        boolean z1;
        int v21;
        long v20;
        i i1;
        j j1;
        long v19;
        s s2;
        long v18;
        Modifier modifier1;
        long v33;
        j j2;
        long v31;
        long v30;
        int v29;
        O o2;
        int v28;
        boolean z2;
        int v27;
        long v26;
        i i2;
        long v25;
        l l2;
        w w2;
        s s3;
        long v11;
        p0.S(1028090691);
        int v10 = (v7 & 6) == 0 ? (p0.f(s) ? 4 : 2) | v7 : v7;
        if((v9 & 2) != 0) {
            v10 |= 0x30;
        }
        else if((v7 & 0x30) == 0) {
            v10 |= (p0.f(modifier0) ? 0x20 : 16);
        }
        if((v9 & 4) != 0) {
            v10 |= 0x180;
            v11 = v;
        }
        else if((v7 & 0x180) == 0) {
            v11 = v;
            v10 |= (p0.e(v11) ? 0x100 : 0x80);
        }
        else {
            v11 = v;
        }
        if((v9 & 8) != 0) {
            v10 |= 0xC00;
        }
        else if((v7 & 0xC00) == 0) {
            v10 |= (p0.e(v1) ? 0x800 : 0x400);
        }
        int v12 = v10 | 0x6000;
        if((v9 & 0x20) != 0) {
            v12 = v10 | 0x36000;
        }
        else if((0x30000 & v7) == 0) {
            v12 |= (p0.f(w0) ? 0x20000 : 0x10000);
        }
        int v13 = v12 | 0x180000;
        if((v9 & 0x80) != 0) {
            v13 = v12 | 0xD80000;
        }
        else if((0xC00000 & v7) == 0) {
            v13 |= (p0.e(v2) ? 0x800000 : 0x400000);
        }
        int v14 = v13 | 0x6000000;
        if((v9 & 0x200) != 0) {
            v14 = v13 | 0x36000000;
        }
        else if((v7 & 0x30000000) == 0) {
            v14 |= (p0.f(i0) ? 0x20000000 : 0x10000000);
        }
        int v15 = v8 | 6;
        if((v9 & 0x800) != 0) {
            v15 = v8 | 54;
        }
        else if((v8 & 0x30) == 0) {
            v15 |= (p0.d(v4) ? 0x20 : 16);
        }
        int v16 = v15 | 0x180;
        if((v9 & 0x2000) != 0) {
            v16 = v15 | 0xD80;
        }
        else if((v8 & 0xC00) == 0) {
            v16 |= (p0.d(v5) ? 0x800 : 0x400);
        }
        int v17 = (v8 & 0x180000) == 0 ? v16 | 0x36000 | ((v9 & 0x10000) != 0 || !p0.f(o0) ? 0x80000 : 0x100000) : v16 | 0x36000;
        if((v14 & 306783379) != 306783378 || (0x92493 & v17) != 0x92492 || !p0.x()) {
            p0.M();
            if((v7 & 1) == 0 || p0.w()) {
                modifier1 = (v9 & 2) == 0 ? modifier0 : g0.l.X;
                v30 = (v9 & 4) == 0 ? v11 : v.i;
                v31 = (v9 & 8) == 0 ? v1 : a1.j.c;
                w2 = (v9 & 0x20) == 0 ? w0 : null;
                v25 = (v9 & 0x80) == 0 ? v2 : a1.j.c;
                i2 = (v9 & 0x200) == 0 ? i0 : null;
                v26 = a1.j.c;
                z2 = true;
                if((v9 & 0x10000) == 0) {
                    o2 = o0;
                }
                else {
                    v17 &= 0xFFC7FFFF;
                    o2 = (O)p0.k(m2.a);
                }
                v29 = v17;
                v28 = (v9 & 0x2000) == 0 ? v5 : 0x7FFFFFFF;
                v23 = 1;
                l2 = null;
                j2 = null;
                function11 = null;
                v27 = (v9 & 0x800) == 0 ? v4 : 1;
                s3 = null;
            }
            else {
                p0.K();
                if((v9 & 0x10000) != 0) {
                    v17 &= 0xFFC7FFFF;
                }
                modifier1 = modifier0;
                s3 = s1;
                w2 = w0;
                l2 = l0;
                v25 = v2;
                i2 = i0;
                v26 = v3;
                v27 = v4;
                z2 = z;
                v28 = v5;
                v23 = v6;
                function11 = function10;
                o2 = o0;
                v29 = v17;
                v30 = v11;
                v31 = v1;
                j2 = j0;
            }
            p0.q();
            long v32 = ((v)p0.k(a0.a)).a;
            float f = ((Number)p0.k(N.Z.a)).floatValue();
            if(v30 == 16L) {
                v33 = o2.b() == 16L ? v.b(f, v32) : o2.b();
            }
            else {
                v33 = v30;
            }
            O o3 = O.e(o2, 0L, v31, w2, s3, l2, v25, j2, (i2 == null ? 0x80000000 : i2.a), v26, 0xFD6F51);
            boolean z3 = p0.e(v33);
            Object object0 = p0.G();
            if(z3 || object0 == U.l.a) {
                object0 = new j2(v33, 0);
                p0.a0(object0);
            }
            f0.b(s, modifier1, o3, function11, v27, z2, v28, v23, ((n0.w)object0), p0, v14 & 0x7E | v29 >> 6 & 0x1C00 | 0xE000 & v29 << 9 | 0x70000 & v29 << 9 | 0x380000 & v29 << 9 | v29 << 9 & 0x1C00000, 0);
            i1 = i2;
            v20 = v26;
            o1 = o2;
            s2 = s3;
            w1 = w2;
            v21 = v27;
            l1 = l2;
            v19 = v25;
            v22 = v28;
            v18 = v31;
            z1 = z2;
            j1 = j2;
            v24 = v30;
        }
        else {
            p0.K();
            modifier1 = modifier0;
            v18 = v1;
            s2 = s1;
            v19 = v2;
            j1 = j0;
            i1 = i0;
            v20 = v3;
            v21 = v4;
            z1 = z;
            v22 = v5;
            v23 = v6;
            function11 = function10;
            o1 = o0;
            v24 = v11;
            w1 = w0;
            l1 = l0;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            new k2(s, modifier1, v24, v18, s2, w1, l1, v19, j1, i1, v20, v21, z1, v22, v23, function11, o1, v7, v8, v9);
            l00.d = null;
        }
    }

    public static final void c(f f0, Modifier modifier0, long v, long v1, s s0, w w0, l l0, long v2, j j0, i i0, long v3, int v4, boolean z, int v5, int v6, Map map0, Function1 function10, O o0, p p0, int v7, int v8, int v9) {
        long v21;
        s s1;
        long v20;
        O o2;
        long v19;
        Modifier modifier2;
        i i2;
        Function1 function11;
        Map map1;
        int v18;
        int v17;
        boolean z1;
        int v16;
        long v15;
        j j1;
        l l1;
        w w1;
        long v29;
        w w2;
        long v27;
        O o3;
        int v26;
        Modifier modifier3;
        i i3;
        Function1 function12;
        Map map2;
        int v25;
        int v24;
        boolean z2;
        int v23;
        long v22;
        j j2;
        s s2;
        int v14;
        O o1;
        i i1;
        long v11;
        Modifier modifier1;
        p0.S(0x2C5A8491);
        int v10 = (v7 & 6) == 0 ? (p0.f(f0) ? 4 : 2) | v7 : v7;
        if((v9 & 2) != 0) {
            v10 |= 0x30;
            modifier1 = modifier0;
        }
        else if((v7 & 0x30) == 0) {
            modifier1 = modifier0;
            v10 |= (p0.f(modifier1) ? 0x20 : 16);
        }
        else {
            modifier1 = modifier0;
        }
        if((v9 & 4) != 0) {
            v10 |= 0x180;
            v11 = v;
        }
        else if((v7 & 0x180) == 0) {
            v11 = v;
            v10 |= (p0.e(v11) ? 0x100 : 0x80);
        }
        else {
            v11 = v;
        }
        int v12 = 0x6DB6C00 | v10;
        if((v9 & 0x200) != 0) {
            v12 = 0x36DB6C00 | v10;
            i1 = i0;
        }
        else if((0x30000000 & v7) == 0) {
            i1 = i0;
            v12 |= (p0.f(i1) ? 0x20000000 : 0x10000000);
        }
        else {
            i1 = i0;
        }
        int v13 = v8 | 0x1B6DB6;
        if((v8 & 0xC00000) == 0) {
            if((v9 & 0x20000) == 0) {
                o1 = o0;
                v14 = p0.f(o1) ? 0x800000 : 0x400000;
            }
            else {
                o1 = o0;
                v14 = 0x400000;
            }
            v13 |= v14;
        }
        else {
            o1 = o0;
        }
        if((306783379 & v12) != 306783378 || (0x492493 & v13) != 4793490 || !p0.x()) {
            p0.M();
            if((v7 & 1) == 0 || p0.w()) {
                modifier3 = (v9 & 2) == 0 ? modifier1 : g0.l.X;
                if((v9 & 4) != 0) {
                    v11 = v.i;
                }
                v27 = a1.j.c;
                s2 = null;
                if((v9 & 0x200) != 0) {
                    i1 = null;
                }
                A a0 = A.X;
                I i4 = I.c0;
                v23 = 1;
                if((v9 & 0x20000) != 0) {
                    o1 = (O)p0.k(m2.a);
                    v13 &= 0xFE3FFFFF;
                }
                i3 = i1;
                map2 = a0;
                v26 = v13;
                o3 = o1;
                w2 = null;
                l1 = null;
                j2 = null;
                function12 = i4;
                v25 = 1;
                v24 = 0x7FFFFFFF;
                v21 = v27;
                v22 = v21;
                z2 = true;
            }
            else {
                p0.K();
                if((0x20000 & v9) != 0) {
                    v13 &= 0xFE3FFFFF;
                }
                s2 = s0;
                l1 = l0;
                j2 = j0;
                v22 = v3;
                v23 = v4;
                z2 = z;
                v24 = v5;
                v25 = v6;
                map2 = map0;
                function12 = function10;
                i3 = i1;
                modifier3 = modifier1;
                v26 = v13;
                o3 = o1;
                v27 = v1;
                w2 = w0;
                v21 = v2;
            }
            p0.q();
            long v28 = ((v)p0.k(a0.a)).a;
            float f1 = ((Number)p0.k(N.Z.a)).floatValue();
            if(v11 == 16L) {
                v29 = o3.b() == 16L ? v.b(f1, v28) : o3.b();
            }
            else {
                v29 = v11;
            }
            O o4 = O.e(o3, 0L, v27, w2, s2, l1, v21, j2, (i3 == null ? 0x80000000 : i3.a), v22, 0xFD6F51);
            boolean z3 = p0.e(v29);
            Object object0 = p0.G();
            if(z3 || object0 == U.l.a) {
                object0 = new j2(v29, 1);
                p0.a0(object0);
            }
            f0.a(f0, modifier3, o4, function12, v23, z2, v24, v25, map2, ((n0.w)object0), p0, v12 & 0x7E | v26 >> 9 & 0x1C00 | 0xE000 & v26 << 9 | 0x70000 & v26 << 9 | 0x380000 & v26 << 9 | 0x1C00000 & v26 << 9 | v26 << 9 & 0xE000000, 0);
            w1 = w2;
            modifier2 = modifier3;
            v15 = v22;
            v16 = v23;
            z1 = z2;
            v17 = v24;
            v18 = v25;
            map1 = map2;
            function11 = function12;
            o2 = o3;
            i2 = i3;
            s1 = s2;
            v20 = v27;
            v19 = v11;
            j1 = j2;
        }
        else {
            p0.K();
            w1 = w0;
            l1 = l0;
            j1 = j0;
            v15 = v3;
            v16 = v4;
            z1 = z;
            v17 = v5;
            v18 = v6;
            map1 = map0;
            function11 = function10;
            i2 = i1;
            modifier2 = modifier1;
            v19 = v11;
            o2 = o1;
            v20 = v1;
            s1 = s0;
            v21 = v2;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            new l2(f0, modifier2, v19, v20, s1, w1, l1, v21, j1, i2, v15, v16, z1, v17, v18, map1, function11, o2, v7, v8, v9);
            l00.d = null;
        }
    }
}

