package P;

import Ab.t;
import B.r;
import D0.K;
import F0.h;
import F0.i;
import F0.j;
import N.b1;
import Nb.k;
import U.d;
import U.g0;
import U.p;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.Modifier;
import g0.a;
import g0.b;
import g0.l;
import kotlin.jvm.functions.Function3;

public final class e extends k implements Function3 {
    public final long X;
    public final n Y;

    public e(long v, n n0) {
        this.X = v;
        this.Y = n0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        boolean z = ((Boolean)object0).booleanValue();
        int v = ((Number)object2).intValue();
        if((v & 6) == 0) {
            v |= (((p)object1).g(z) ? 4 : 2);
        }
        if((v & 19) == 18 && ((p)object1).x()) {
            ((p)object1).K();
            return t.a;
        }
        l l0 = l.X;
        Modifier modifier0 = c.c(l0, 1.0f);
        K k0 = r.e(b.e, false);
        int v1 = ((p)object1).P;
        g0 g00 = ((p)object1).m();
        Modifier modifier1 = a.d(((p)object1), modifier0);
        F0.k.a.getClass();
        i i0 = j.b;
        ((p)object1).U();
        if(((p)object1).O) {
            ((p)object1).l(i0);
        }
        else {
            ((p)object1).d0();
        }
        d.K(((p)object1), k0, j.f);
        d.K(((p)object1), g00, j.e);
        h h0 = j.g;
        if(((p)object1).O || !Nb.j.a(((p)object1).G(), v1)) {
            m5.b.F(v1, ((p)object1), v1, h0);
        }
        d.K(((p)object1), modifier1, j.d);
        float f = g.d;
        float f1 = (g.c + f) * 2.0f;
        long v2 = this.X;
        if(z) {
            ((p)object1).Q(0xA2A8FED6);
            b1.b(c.k(l0, f1), v2, f, 0L, 0, ((p)object1), 390, 24);
        }
        else {
            ((p)object1).Q(0xA2ACC67F);
            Modifier modifier2 = c.k(l0, f1);
            g.b(this.Y, v2, modifier2, ((p)object1), 0x180);
        }
        ((p)object1).p(false);
        ((p)object1).p(true);
        return t.a;
    }
}

