package R;

import E.E;
import I.f0;
import O0.O;
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
import c0.b;
import kotlin.jvm.functions.Function1;
import n0.v;

public abstract class a1 {
    public static final x a;

    static {
        a1.a = new x(Z.e, k.k0);
    }

    public static final void a(O o0, b b0, p p0, int v) {
        p0.S(0xE49060A1);
        int v1 = (v & 6) == 0 ? (p0.f(o0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.h(b0) ? 0x20 : 16);
        }
        if((v1 & 19) != 18 || !p0.x()) {
            O o1 = ((O)p0.k(a1.a)).d(o0);
            d.a(a1.a.a(o1), b0, p0, v1 & 0x70 | 8);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new E(v, 7, o0, b0);
        }
    }

    public static final void b(String s, Modifier modifier0, long v, long v1, s s1, w w0, l l0, long v2, j j0, i i0, long v3, int v4, boolean z, int v5, int v6, Function1 function10, O o0, p p0, int v7, int v8) {
        O o1;
        Function1 function11;
        int v17;
        int v16;
        boolean z1;
        int v15;
        long v14;
        i i1;
        j j1;
        long v13;
        l l1;
        w w1;
        s s2;
        long v12;
        long v11;
        Modifier modifier1;
        long v26;
        w w2;
        int v25;
        O o2;
        Function1 function12;
        int v24;
        int v23;
        boolean z2;
        int v22;
        long v21;
        i i2;
        j j2;
        long v20;
        l l2;
        s s3;
        long v19;
        long v18;
        Modifier modifier2;
        p0.S(-2055108902);
        int v9 = (v7 & 6) == 0 ? v7 | (p0.f(s) ? 4 : 2) : v7;
        int v10 = (v8 & 0x180000) == 0 ? v8 | 0xB6DB6 : v8 | 0x36DB6;
        if((306783379 & (v9 | 920350128)) != 306783378 || (0x92493 & v10) != 0x92492 || !p0.x()) {
            p0.M();
            if((v7 & 1) == 0 || p0.w()) {
                modifier2 = g0.l.X;
                v18 = v.i;
                v19 = a1.j.c;
                s3 = null;
                v25 = v10 & 0xFFC7FFFF;
                v22 = 1;
                z2 = true;
                v24 = 1;
                v21 = v19;
                o2 = (O)p0.k(a1.a);
                w2 = null;
                l2 = null;
                j2 = null;
                i2 = null;
                function12 = null;
                v23 = 0x7FFFFFFF;
                v20 = v21;
            }
            else {
                p0.K();
                modifier2 = modifier0;
                v18 = v;
                v19 = v1;
                s3 = s1;
                l2 = l0;
                v20 = v2;
                j2 = j0;
                i2 = i0;
                v21 = v3;
                v22 = v4;
                z2 = z;
                v23 = v5;
                v24 = v6;
                function12 = function10;
                o2 = o0;
                v25 = v10 & 0xFFC7FFFF;
                w2 = w0;
            }
            p0.q();
            p0.Q(0x930C9133);
            if(Long.compare(v18, 16L) == 0) {
                p0.Q(0x930C9438);
                v26 = o2.b();
                if(v26 == 16L) {
                    v26 = ((v)p0.k(t.a)).a;
                }
                p0.p(false);
            }
            else {
                v26 = v18;
            }
            p0.p(false);
            f0.b(s, modifier2, O.e(o2, v26, v19, w2, s3, l2, v20, j2, (i2 == null ? 0x80000000 : i2.a), v21, 0xFD6F50), function12, v22, z2, v23, v24, null, p0, (v9 | 920350128) & 0x7E | v25 >> 6 & 0x1C00 | 0xE000 & v25 << 9 | 0x70000 & v25 << 9 | 0x380000 & v25 << 9 | v25 << 9 & 0x1C00000, 0x100);
            modifier1 = modifier2;
            s2 = s3;
            w1 = w2;
            v11 = v18;
            l1 = l2;
            v12 = v19;
            j1 = j2;
            v13 = v20;
            i1 = i2;
            v14 = v21;
            v15 = v22;
            z1 = z2;
            v16 = v23;
            v17 = v24;
            function11 = function12;
            o1 = o2;
        }
        else {
            p0.K();
            modifier1 = modifier0;
            v11 = v;
            v12 = v1;
            s2 = s1;
            w1 = w0;
            l1 = l0;
            v13 = v2;
            j1 = j0;
            i1 = i0;
            v14 = v3;
            v15 = v4;
            z1 = z;
            v16 = v5;
            v17 = v6;
            function11 = function10;
            o1 = o0;
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            new Z0(s, modifier1, v11, v12, s2, w1, l1, v13, j1, i1, v14, v15, z1, v16, v17, function11, o1, v7, v8);
            l00.d = null;
        }
    }
}

