package M;

import Ab.t;
import B.e;
import B.v0;
import B.x0;
import F0.h;
import F0.i;
import F0.j;
import Nb.k;
import U.Z;
import U.d;
import U.g0;
import U.l;
import U.p;
import a1.f;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.Modifier;
import g0.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final class b extends k implements Function2 {
    public final long X;
    public final boolean Y;
    public final Modifier Z;
    public final n b0;

    public b(long v, boolean z, Modifier modifier0, n n0) {
        this.X = v;
        this.Y = z;
        this.Z = modifier0;
        this.b0 = n0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
            ((p)object0).K();
            return t.a;
        }
        long v = this.X;
        Z z0 = l.a;
        n n0 = this.b0;
        boolean z1 = this.Y;
        if(Long.compare(v, 0x7FC000007FC00000L) != 0) {
            ((p)object0).Q(0xCE114C68);
            x0 x00 = v0.b((z1 ? e.b : e.a), g0.b.j, ((p)object0), 0);
            int v1 = ((p)object0).P;
            g0 g00 = ((p)object0).m();
            Modifier modifier0 = a.d(((p)object0), c.j(this.Z, f.b(v), f.a(v), 0.0f, 0.0f, 12));
            F0.k.a.getClass();
            i i0 = j.b;
            ((p)object0).U();
            if(((p)object0).O) {
                ((p)object0).l(i0);
            }
            else {
                ((p)object0).d0();
            }
            d.K(((p)object0), x00, j.f);
            d.K(((p)object0), g00, j.e);
            h h0 = j.g;
            if(((p)object0).O || !Nb.j.a(((p)object0).G(), v1)) {
                m5.b.F(v1, ((p)object0), v1, h0);
            }
            d.K(((p)object0), modifier0, j.d);
            g0.l l0 = g0.l.X;
            boolean z2 = ((p)object0).h(n0);
            Object object2 = ((p)object0).G();
            if(z2 || object2 == z0) {
                object2 = new M.a(n0, 0);
                ((p)object0).a0(object2);
            }
            c0.e(6, ((p)object0), l0, ((Function0)object2), z1);
            ((p)object0).p(true);
            ((p)object0).p(false);
            return t.a;
        }
        ((p)object0).Q(0xCE1E6B10);
        boolean z3 = ((p)object0).h(n0);
        Object object3 = ((p)object0).G();
        if(z3 || object3 == z0) {
            object3 = new M.a(n0, 1);
            ((p)object0).a0(object3);
        }
        c0.e(0, ((p)object0), this.Z, ((Function0)object3), z1);
        ((p)object0).p(false);
        return t.a;
    }
}

