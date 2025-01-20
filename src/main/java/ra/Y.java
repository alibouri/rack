package ra;

import Ab.t;
import B.B;
import B.e;
import B.k;
import B.v0;
import B.x0;
import B.y0;
import B.z0;
import B.z;
import F0.h;
import F0.i;
import N.m2;
import Nb.j;
import O0.O;
import U.d;
import U.g0;
import U.p;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.Modifier;
import g0.b;
import g0.l;
import kotlin.jvm.functions.Function3;
import n0.M;
import n0.v;
import q9.M0;

public final class y implements Function3 {
    public final float X;
    public final float Y;
    public final I Z;

    public y(float f, float f1, I i0) {
        this.X = f;
        this.Y = f1;
        this.Z = i0;
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        j.f(((y0)object0), "$this$SwipeToDismissBox");
        if((v & 17) == 16 && ((p)object1).x()) {
            ((p)object1).K();
            return t.a;
        }
        l l0 = l.X;
        Modifier modifier0 = a.n(androidx.compose.foundation.a.b(l0, v.e, M.a), 0.0f, this.X, 0.0f, this.Y, 5);
        x0 x00 = v0.b(k.a, b.j, ((p)object1), 0);
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
        d.K(((p)object1), x00, h0);
        h h1 = F0.j.e;
        d.K(((p)object1), g00, h1);
        h h2 = F0.j.g;
        if(((p)object1).O || !j.a(((p)object1).G(), v1)) {
            m5.b.F(v1, ((p)object1), v1, h2);
        }
        h h3 = F0.j.d;
        d.K(((p)object1), modifier1, h3);
        e.b(((p)object1), c.n(l0, 16.0f));
        Modifier modifier2 = z0.a.a(l0, 1.0f, true);
        B b0 = z.a(k.c, b.m, ((p)object1), 0);
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
        d.K(((p)object1), b0, h0);
        d.K(((p)object1), g01, h1);
        if(((p)object1).O || !j.a(((p)object1).G(), v2)) {
            m5.b.F(v2, ((p)object1), v2, h2);
        }
        d.K(((p)object1), modifier3, h3);
        O o0 = ((db.a)((p)object1).k(db.b.d)).i;
        m2.b(this.Z.b, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o0, ((p)object1), 0, 0, 0xFFFE);
        O o1 = O.a(((db.a)((p)object1).k(db.b.d)).e, yc.d.h(0x7F06001A, ((p)object1)), 0L, null, null, 0L, null, 0L, null, null, 0xFFFFFE);  // color:Gray700
        m2.b(this.Z.c, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o1, ((p)object1), 0, 0, 0xFFFE);
        ((p)object1).p(true);
        m2.b(M0.a(this.Z.d), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((db.a)((p)object1).k(db.b.d)).i, ((p)object1), 0, 0, 0xFFFE);
        e.b(((p)object1), c.n(l0, 16.0f));
        ((p)object1).p(true);
        return t.a;
    }
}

