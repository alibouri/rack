package Y9;

import Aa.D;
import Aa.K;
import Aa.N;
import B.B;
import B.e;
import B.k;
import B.v0;
import B.x0;
import B.z0;
import B.z;
import Bb.q;
import F0.h;
import F0.i;
import G0.r0;
import N.m2;
import Nb.j;
import O0.O;
import T0.w;
import U.d;
import U.g0;
import U.l0;
import U.p;
import Wa.f;
import Z2.t;
import a9.D4;
import a9.y4;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.Modifier;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.compose.LifecycleEffectKt;
import g0.b;
import g0.l;
import kotlin.jvm.functions.Function0;

public abstract class a {
    public static final float a;

    static {
        a.a = 141.0f;
    }

    public static final void a(D4 d40, Function0 function00, Function0 function01, p p0, int v) {
        l l1;
        j.f(d40, "header");
        j.f(function00, "onClick");
        j.f(function01, "onShow");
        p0.S(0xA534F896);
        int v1 = (v & 6) == 0 ? (p0.f(d40) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (p0.h(function00) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (p0.h(function01) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) != 0x92 || !p0.x()) {
            Event lifecycle$Event0 = Event.ON_START;
            p0.Q(0xE0F69FF7);
            Object object0 = p0.G();
            if((v1 & 0x380) == 0x100 || object0 == U.l.a) {
                object0 = new N(function01, 11);
                p0.a0(object0);
            }
            p0.p(false);
            LifecycleEffectKt.a(lifecycle$Event0, null, ((Function0)object0), p0, 6);
            l l0 = l.X;
            Modifier modifier0 = c.e(androidx.compose.foundation.a.d(l0, false, null, function00, 7), a.a);
            x0 x00 = v0.b(k.a, b.j, p0, 0);
            int v2 = p0.P;
            g0 g00 = p0.m();
            Modifier modifier1 = g0.a.d(p0, modifier0);
            F0.k.a.getClass();
            i i0 = F0.j.b;
            p0.U();
            if(p0.O) {
                p0.l(i0);
            }
            else {
                p0.d0();
            }
            h h0 = F0.j.f;
            d.K(p0, x00, h0);
            h h1 = F0.j.e;
            d.K(p0, g00, h1);
            h h2 = F0.j.g;
            if(p0.O || !j.a(p0.G(), v2)) {
                m5.b.F(v2, p0, v2, h2);
            }
            h h3 = F0.j.d;
            d.K(p0, modifier1, h3);
            Modifier modifier2 = z0.a.a(l0, 1.0f, true);
            Modifier modifier3 = androidx.compose.foundation.layout.a.l(z0.a.b(modifier2, b.k), 16.0f, 0.0f, 2);
            B b0 = z.a(new B.h(12.0f), b.m, p0, 6);
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
            d.K(p0, b0, h0);
            d.K(p0, g01, h1);
            if(p0.O || !j.a(p0.G(), v3)) {
                m5.b.F(v3, p0, v3, h2);
            }
            d.K(p0, modifier4, h3);
            m2.b(d40.b, null, d40.c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, db.b.a(new O(0L, q.C(24), w.n0, db.b.a, 0L, 0, q.C(24), null, 0xFDFFD9), p0), p0, 0, 0, 0xFFFA);
            p0.Q(-1910123847);
            y4 y40 = d40.e;
            if(y40 == null) {
                l1 = l0;
            }
            else {
                f f0 = new f(y40.b.a, y40.b.a, y40.b.b);
                c0.b b1 = c0.c.c(-1296220549, new K(5, y40), p0);
                l1 = l0;
                M6.b.i(function00, null, false, false, null, f0, Wa.b.c, b1, p0, v1 >> 3 & 14 | 0xC00000, 30);
            }
            p0.p(false);
            p0.p(true);
            Modifier modifier5 = androidx.compose.foundation.layout.a.c(l1, 1.0f, false);
            p0.Q(0x13F186F0);
            s0.b b2 = yc.l.y(0x7F080322, p0, 0);  // drawable:sn_scratch_card_december
            s0.b b3 = ((Boolean)p0.k(r0.a)).booleanValue() ? b2 : null;
            p0.p(false);
            t.b(d40.d, null, modifier5, b3, null, null, p0, 0x1B0, 0xFFF0);
            e.b(p0, c.n(l1, 26.0f));
            p0.p(true);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new D(d40, function00, function01, v, 13);
        }
    }
}

