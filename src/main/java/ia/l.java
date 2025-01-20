package ia;

import Aa.U;
import N.G;
import N9.d;
import Nb.j;
import S9.i;
import U.N0;
import U.l0;
import U.p;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.Modifier;
import c0.b;
import cb.m;
import g0.a;
import ha.n;

public abstract class l {
    public static final float a;

    static {
        l.a = 56.0f;
    }

    public static final void a(N0 n00, i i0, d d0, n n0, long v, p p0, int v1, int v2) {
        long v6;
        int v5;
        long v4;
        j.f(n00, "elevation");
        j.f(n0, "callbacks");
        p0.S(0x45F3E448);
        int v3 = (v1 & 6) == 0 ? (p0.f(n00) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v3 |= (((v1 & 0x40) == 0 ? p0.f(i0) : p0.h(i0)) ? 0x20 : 16);
        }
        if((v1 & 0x180) == 0) {
            v3 |= (((v1 & 0x200) == 0 ? p0.f(d0) : p0.h(d0)) ? 0x100 : 0x80);
        }
        if((v1 & 0xC00) == 0) {
            v3 |= (((v1 & 0x1000) == 0 ? p0.f(n0) : p0.h(n0)) ? 0x800 : 0x400);
        }
        if((v1 & 0x6000) == 0) {
            if((v2 & 16) == 0) {
                v4 = v;
                v5 = p0.e(v4) ? 0x4000 : 0x2000;
            }
            else {
                v4 = v;
                v5 = 0x2000;
            }
            v3 |= v5;
        }
        else {
            v4 = v;
        }
        if((v3 & 9363) != 9362 || !p0.x()) {
            p0.M();
            if((v1 & 1) != 0 && !p0.w()) {
                p0.K();
                if((v2 & 16) != 0) {
                    v3 &= 0xFFFF1FFF;
                }
            }
            else if((v2 & 16) != 0) {
                v4 = yc.d.h(0x7F06003E, p0);  // color:Violet600
                v3 &= 0xFFFF1FFF;
            }
            p0.q();
            Modifier modifier0 = a.e(c.e(g0.l.X, l.a), 10.0f);
            float f = ((a1.d)n00.getValue()).X;
            b b0 = c0.c.c(0xD8B0E3C2, new k(d0, n0), p0);
            b b1 = c0.c.c(0x453902F9, new U(i0, 6, n0), p0);
            G.d(g.a, modifier0, b0, b1, v4, 0L, f, p0, v3 & 0xE000 | 3510, 0x20);
        }
        else {
            p0.K();
        }
        v6 = v4;
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new m(n00, i0, d0, n0, v6, v1, v2);
        }
    }
}

