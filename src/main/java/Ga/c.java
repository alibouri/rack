package ga;

import Aa.D;
import Aa.l;
import B.v0;
import B.x0;
import Bb.F;
import Bb.q;
import Ea.s;
import F0.i;
import F0.k;
import N.m2;
import N4.h;
import Nb.j;
import O0.O;
import U.g0;
import U.l0;
import U.p;
import Z2.t;
import androidx.compose.foundation.layout.a;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import s0.b;
import w.C0;
import yc.d;

public abstract class c {
    static {
        e e0 = new e("Remote or in-person payments must be made via Wave. Long Text just to see how it displays.", "");
        q.L(new e[]{e0, e0, e0, e0, e0});
    }

    public static final void a(f f0, Function0 function00, Function1 function10, p p0, int v) {
        j.f(f0, "state");
        j.f(function00, "onNavigationUpClick");
        j.f(function10, "onActionButtonClick");
        p0.S(0x347A7EF2);
        int v1 = (v & 6) == 0 ? (p0.h(f0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.h(function00) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p0.h(function10) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) != 0x92 || !p0.x()) {
            C0 c00 = h.H(p0);
            N4.j.d("", null, 0L, function00, null, d.h(0x7F06018F, p0), 0L, null, c0.c.c(0x7699E336, new l(c00, f0, function10, 8), p0), p0, v1 << 6 & 0x1C00 | 0x6000006, 0xD6);  // color:white
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new D(f0, function00, function10, v, 16);
        }
    }

    public static final void b(f f0, Modifier modifier0, p p0, int v) {
        p0.S(0xF737F6B9);
        int v1 = (v & 6) == 0 ? (p0.h(f0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.f(modifier0) ? 0x20 : 16);
        }
        if((v1 & 19) != 18 || !p0.x()) {
            if(f0.a == null || f0.a.length() == 0) {
                p0.Q(-1840351691);
                b b0 = yc.l.y(0x7F0801E5, p0, 0);  // drawable:ic_businesss_empty
                t.b(f0.b, "", modifier0, b0, b0, null, p0, v1 << 3 & 0x380 | 0x30, 0xFFE0);
            }
            else {
                p0.Q(-1840044760);
                j.f(f0.a, "url");
                F.e(new v3.p(f0.a), modifier0, false, p0, v1 & 0x70);
            }
            p0.p(false);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new s(v, 10, f0, modifier0);
        }
    }

    public static final void c(e e0, p p0, int v) {
        p0.S(0x7525512C);
        if((((v & 6) == 0 ? (p0.f(e0) ? 4 : 2) | v : v) & 3) != 2 || !p0.x()) {
            b b0 = yc.l.y(0x7F080224, p0, 0);  // drawable:ic_deal_gray
            g0.l l0 = g0.l.X;
            Modifier modifier0 = a.l(androidx.compose.foundation.layout.c.d(l0, 1.0f), 16.0f, 0.0f, 2);
            x0 x00 = v0.b(new B.h(14.0f), g0.b.k, p0, 54);
            int v1 = p0.P;
            g0 g00 = p0.m();
            Modifier modifier1 = g0.a.d(p0, modifier0);
            k.a.getClass();
            i i0 = F0.j.b;
            p0.U();
            if(p0.O) {
                p0.l(i0);
            }
            else {
                p0.d0();
            }
            U.d.K(p0, x00, F0.j.f);
            U.d.K(p0, g00, F0.j.e);
            F0.h h0 = F0.j.g;
            if(p0.O || !j.a(p0.G(), v1)) {
                m5.b.F(v1, p0, v1, h0);
            }
            U.d.K(p0, modifier1, F0.j.d);
            Modifier modifier2 = androidx.compose.foundation.layout.c.k(l0, 20.0f);
            t.b(e0.b, "", modifier2, b0, b0, null, p0, 0x1B0, 0xFFE0);
            O o0 = ((db.a)p0.k(db.b.d)).h;
            m2.b(e0.a, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o0, p0, 0, 0, 0xFFFE);
            p0.p(true);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new Aa.d(v, 10, e0);
        }
    }
}

