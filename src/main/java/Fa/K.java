package Fa;

import Ab.t;
import B.B;
import B.r;
import B.y;
import B.z;
import D0.K;
import Ea.O;
import F0.h;
import F0.i;
import H.f;
import N4.o;
import Nb.j;
import U.d;
import U.g0;
import U.p;
import androidx.compose.foundation.BorderModifierNodeElement;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.Modifier;
import g0.a;
import g0.b;
import g0.l;
import kotlin.jvm.functions.Function3;
import n0.M;
import n0.U;

public final class k implements Function3 {
    public final O X;
    public final e Y;
    public final int Z;

    public k(O o0, e e0, int v) {
        this.X = o0;
        this.Y = e0;
        this.Z = v;
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        h h5;
        h h4;
        int v = ((Number)object2).intValue();
        j.f(((y)object0), "$this$Card");
        if((v & 6) == 0) {
            v |= (((p)object1).f(((y)object0)) ? 4 : 2);
        }
        if((v & 19) == 18 && ((p)object1).x()) {
            ((p)object1).K();
            return t.a;
        }
        l l0 = l.X;
        B b0 = z.a(B.k.c, b.n, ((p)object1), 0x30);
        int v1 = ((p)object1).P;
        g0 g00 = ((p)object1).m();
        Modifier modifier0 = a.d(((p)object1), l0);
        F0.k.a.getClass();
        i i0 = F0.j.b;
        ((p)object1).U();
        if(((p)object1).O) {
            ((p)object1).l(i0);
        }
        else {
            ((p)object1).d0();
        }
        h h0 = F0.j.f;
        d.K(((p)object1), b0, h0);
        h h1 = F0.j.e;
        d.K(((p)object1), g00, h1);
        h h2 = F0.j.g;
        if(((p)object1).O || !j.a(((p)object1).G(), v1)) {
            m5.b.F(v1, ((p)object1), v1, h2);
        }
        d.K(((p)object1), modifier0, F0.j.d);
        s0.b b1 = yc.l.y(this.Z, ((p)object1), 0);
        Modifier modifier1 = androidx.compose.foundation.layout.a.c(c.d(l0, 1.0f), 2.444444f, false);
        h h3 = F0.j.d;
        M6.b.d(b1, null, modifier1, null, null, 0.0f, null, ((p)object1), 0x1B0, 120);
        Modifier modifier2 = c.c(l0, 0.88f);
        K k0 = r.e(b.g, false);
        int v2 = ((p)object1).P;
        g0 g01 = ((p)object1).m();
        Modifier modifier3 = a.d(((p)object1), modifier2);
        ((p)object1).U();
        if(((p)object1).O) {
            ((p)object1).l(i0);
        }
        else {
            ((p)object1).d0();
        }
        d.K(((p)object1), k0, h0);
        d.K(((p)object1), g01, h1);
        if(!((p)object1).O && j.a(((p)object1).G(), v2)) {
            h5 = h3;
            h4 = h2;
        }
        else {
            h4 = h2;
            m5.b.F(v2, ((p)object1), v2, h4);
            h5 = h3;
        }
        d.K(((p)object1), modifier3, h5);
        long v3 = yc.d.h(0x7F060019, ((p)object1));  // color:Gray600
        O o0 = this.X;
        m.a(this.Y, this.X.Z, this.X.b0, v3, ((p)object1), 0);
        ((p)object1).p(true);
        B.e.b(((p)object1), A3.e.D(l0, 1.0f));
        ((p)object1).p(true);
        ((p)object1).Q(0x6064B2B3);
        String s = o0.Y;
        if(s != null) {
            float f = ((y)object0).b();
            float f1 = ((y)object0).a();
            Modifier modifier4 = androidx.compose.foundation.layout.a.c(androidx.compose.foundation.a.b(o.j(c.d(androidx.compose.foundation.layout.a.h(androidx.compose.foundation.layout.b.a.a(l0, b.a), ((y)object0).b() * 0.07f, f1 / 2.444444f - f * 0.3f / 2.0f), 0.3f), f.a).d(new BorderModifierNodeElement(1.0f, new U(yc.d.h(0x7F060016, ((p)object1))), f.a)), yc.d.h(0x7F06018F, ((p)object1)), M.a), 1.0f, false);  // color:Gray400
            K k1 = r.e(b.a, false);
            int v4 = ((p)object1).P;
            g0 g02 = ((p)object1).m();
            Modifier modifier5 = a.d(((p)object1), modifier4);
            ((p)object1).U();
            if(((p)object1).O) {
                ((p)object1).l(i0);
            }
            else {
                ((p)object1).d0();
            }
            d.K(((p)object1), k1, h0);
            d.K(((p)object1), g02, h1);
            if(((p)object1).O || !j.a(((p)object1).G(), v4)) {
                m5.b.F(v4, ((p)object1), v4, h4);
            }
            d.K(((p)object1), modifier5, h5);
            Z2.t.c(s, null, c.c(l0, 1.0f), null, null, ((p)object1), 0x1B0, 0xFF8);
            ((p)object1).p(true);
        }
        ((p)object1).p(false);
        m.d(o0.c0, this.Y, ((p)object1), 0);
        return t.a;
    }
}

