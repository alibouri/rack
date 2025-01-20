package ra;

import Ab.t;
import B.B;
import B.e;
import B.k;
import B.v0;
import B.x0;
import B.y;
import B.z0;
import B.z;
import F0.h;
import F0.i;
import H.f;
import N.b1;
import N4.o;
import Nb.j;
import U.g0;
import U.p;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.Modifier;
import g0.b;
import g0.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import n0.M;
import yc.d;

public final class b0 implements Function3 {
    public final float X;
    public final boolean Y;
    public final S0 Z;
    public final boolean b0;
    public final Function0 c0;

    public b0(float f, boolean z, S0 s00, boolean z1, Function0 function00) {
        this.X = f;
        this.Y = z;
        this.Z = s00;
        this.b0 = z1;
        this.c0 = function00;
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        j.f(((y)object0), "$this$BoxWithConstraints");
        if((v & 6) == 0) {
            v |= (((p)object1).f(((y)object0)) ? 4 : 2);
        }
        if((v & 19) == 18 && ((p)object1).x()) {
            ((p)object1).K();
            return t.a;
        }
        float f = ((y)object0).b() / 328.0f;
        l l0 = l.X;
        Modifier modifier0 = a.b(o.j(androidx.compose.foundation.layout.a.c(c.d(androidx.compose.foundation.layout.a.j(N4.j.g(l0, this.X), 16.0f), 1.0f), 1.644444f, false), f.b(12.0f)), d.h(0x7F060042, ((p)object1)), M.a);  // color:WaveBlue
        B b0 = z.a(k.c, b.m, ((p)object1), 0);
        int v1 = ((p)object1).P;
        g0 g00 = ((p)object1).m();
        Modifier modifier1 = g0.a.d(((p)object1), modifier0);
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
        U.d.K(((p)object1), b0, h0);
        h h1 = F0.j.e;
        U.d.K(((p)object1), g00, h1);
        h h2 = F0.j.g;
        if(((p)object1).O || !j.a(((p)object1).G(), v1)) {
            m5.b.F(v1, ((p)object1), v1, h2);
        }
        h h3 = F0.j.d;
        U.d.K(((p)object1), modifier1, h3);
        e.b(((p)object1), A3.e.D(l0, 21.0f));
        Modifier modifier2 = androidx.compose.foundation.layout.a.l(l0, 16.0f, 0.0f, 2);
        x0 x00 = v0.b(k.a, b.k, ((p)object1), 0x30);
        int v2 = ((p)object1).P;
        g0 g01 = ((p)object1).m();
        Modifier modifier3 = g0.a.d(((p)object1), modifier2);
        ((p)object1).U();
        if(((p)object1).O) {
            ((p)object1).l(i0);
        }
        else {
            ((p)object1).d0();
        }
        U.d.K(((p)object1), x00, h0);
        U.d.K(((p)object1), g01, h1);
        if(((p)object1).O || !j.a(((p)object1).G(), v2)) {
            m5.b.F(v2, ((p)object1), v2, h2);
        }
        U.d.K(((p)object1), modifier3, h3);
        U5.a.w(f, ((p)object1), 0);
        e.b(((p)object1), z0.a.a(l0, 1.0f, true));
        S0 s00 = this.Z;
        U5.a.a(s00.e, f, ((p)object1), 0);
        ((p)object1).p(true);
        e.b(((p)object1), A3.e.D(l0, 13.0f));
        ((p)object1).Q(1223800521);
        String s = s00.f;
        if(s != null) {
            U5.a.u(s, android.support.v4.media.session.a.O(14.0f * f, ((p)object1)), androidx.compose.foundation.layout.a.l(l0, 16.0f, 0.0f, 2), ((p)object1), 0x180, 0);
        }
        ((p)object1).p(false);
        e.b(((p)object1), A3.e.D(l0, 16.0f));
        Modifier modifier4 = androidx.compose.foundation.layout.a.l(l0, 8.0f, 0.0f, 2);
        U5.a.h(s00.a, f, 8.0f, this.b0, this.c0, modifier4, ((p)object1), 0x30180);
        e.b(((p)object1), A3.e.D(l0, 20.0f));
        Modifier modifier5 = androidx.compose.foundation.layout.a.l(l0, 16.0f, 0.0f, 2);
        U5.a.j(s00.b, s00.c, f, modifier5, ((p)object1), 0xC00);
        e.b(((p)object1), A3.e.D(l0, 24.0f));
        ((p)object1).p(true);
        if(this.Y) {
            b1.b(androidx.compose.foundation.layout.b.a.a(l0, b.e), 0L, 0.0f, 0L, 0, ((p)object1), 0, 30);
        }
        return t.a;
    }
}

