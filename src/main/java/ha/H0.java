package ha;

import Ab.t;
import B.e;
import Bb.q;
import C.c;
import I2.J;
import J2.w;
import N.m2;
import Nb.j;
import O0.O;
import U.p;
import X9.i;
import androidx.compose.foundation.a;
import androidx.compose.ui.Modifier;
import com.sendwave.models.CurrencyAmount;
import db.b;
import g0.l;
import j6.u;
import kotlin.jvm.functions.Function3;
import n0.M;
import n0.v;
import q9.N0;
import yc.d;

public final class h0 implements Function3 {
    public final int X;
    public final m0 Y;
    public final n Z;

    public h0(m0 m00, n n0, int v) {
        this.X = v;
        this.Y = m00;
        this.Z = n0;
        super();
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        p p0;
        Object object3 = t.a;
        u u0 = M.a;
        l l0 = l.X;
        n n0 = this.Z;
        m0 m00 = this.Y;
        if(this.X != 0) {
            int v = ((Number)object2).intValue();
            j.f(((c)object0), "$this$item");
            if((v & 6) == 0) {
                v |= (((p)object1).f(((c)object0)) ? 4 : 2);
            }
            if((v & 19) == 18 && ((p)object1).x()) {
                ((p)object1).K();
                return object3;
            }
            Modifier modifier0 = ((c)object0).a(l0, l0.a);
            i.a(m00.g, n0.q, modifier0, ((p)object1), 0);
            e.b(((p)object1), ((c)object0).a(a.b(androidx.compose.foundation.layout.c.e(androidx.compose.foundation.layout.c.d(l0, 1.0f), 8.0f), d.h(0x7F060013, ((p)object1)), u0), l0.a));  // color:Gray100
            return object3;
        }
        int v1 = ((Number)object2).intValue();
        j.f(((c)object0), "$this$item");
        if((v1 & 17) == 16 && ((p)object1).x()) {
            ((p)object1).K();
            return object3;
        }
        CurrencyAmount currencyAmount0 = m00.q;
        if(m00.m == null) {
            ((p)object1).Q(0xB159604D);
            e.b(((p)object1), androidx.compose.foundation.layout.c.e(l0, (currencyAmount0 == null ? l0.b : l0.b - 16.0f)));
        }
        else {
            ((p)object1).Q(0xB14F82A6);
            e.b(((p)object1), androidx.compose.foundation.layout.c.e(l0, ia.l.a));
            Y9.a.a(m00.m, n0.n, n0.o, ((p)object1), 0);
            e.b(((p)object1), androidx.compose.foundation.layout.c.e(l0, (currencyAmount0 == null ? ia.c.a : ia.c.a - 16.0f)));
        }
        ((p)object1).p(false);
        ((p)object1).Q(0xB3241BA3);
        if(currencyAmount0 != null) {
            m2.b(w.T(0x7F1202E3, new Object[]{N0.a(currencyAmount0)}, ((p)object1)), androidx.compose.foundation.layout.a.n(androidx.compose.foundation.layout.c.d(l0, 1.0f), 0.0f, 0.0f, 0.0f, 12.0f, 7), 0L, 0L, null, null, null, 0L, null, new Z0.i(3), 0L, 0, false, 0, 0, null, O.a(((db.a)((p)object1).k(b.d)).h, v.e, q.C(14), null, b.c, 0L, null, 0L, null, null, 0xFFFFDC), ((p)object1), 0x30, 0, 0xFDFC);  // string:overdraft_available_x "Lebalma available: %s"
        }
        p0 = (p)object1;
        p0.p(false);
        w.k(0, p0, m00.d, n0.d, m00.e);
        J.f(m00.f, m00.n, n0.p, p0, 0x40);
        e.b(p0, a.b(androidx.compose.foundation.layout.c.e(androidx.compose.foundation.layout.c.d(l0, 1.0f), 8.0f), d.h(0x7F060013, p0), u0));  // color:Gray100
        return object3;
    }
}

