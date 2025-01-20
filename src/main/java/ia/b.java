package ia;

import Ab.t;
import B.f;
import B.r;
import B.v0;
import B.x0;
import D0.K;
import F0.h;
import F0.i;
import F0.k;
import Mb.e;
import N.e1;
import N.f1;
import Nb.j;
import U.d;
import U.g0;
import U.p;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.Modifier;
import com.sendwave.models.CurrencyAmount;
import g0.a;
import g0.l;
import kotlin.jvm.functions.Function0;
import u.g;

public final class b implements e {
    public final Function0 X;
    public final CurrencyAmount Y;
    public final long Z;

    public b(Function0 function00, CurrencyAmount currencyAmount0, long v) {
        this.X = function00;
        this.Y = currencyAmount0;
        this.Z = v;
    }

    @Override  // Mb.e
    public final Object r(Object object0, Object object1, Object object2, Object object3) {
        boolean z = ((Boolean)object1).booleanValue();
        ((Number)object3).intValue();
        j.f(((g)object0), "$this$AnimatedContent");
        l l0 = l.X;
        Modifier modifier0 = c.d(l0, 1.0f);
        K k0 = r.e(g0.b.a, false);
        int v = ((p)object2).P;
        g0 g00 = ((p)object2).m();
        Modifier modifier1 = a.d(((p)object2), modifier0);
        k.a.getClass();
        i i0 = F0.j.b;
        ((p)object2).U();
        if(((p)object2).O) {
            ((p)object2).l(i0);
        }
        else {
            ((p)object2).d0();
        }
        h h0 = F0.j.f;
        d.K(((p)object2), k0, h0);
        h h1 = F0.j.e;
        d.K(((p)object2), g00, h1);
        h h2 = F0.j.g;
        if(((p)object2).O || !j.a(((p)object2).G(), v)) {
            m5.b.F(v, ((p)object2), v, h2);
        }
        h h3 = F0.j.d;
        d.K(((p)object2), modifier1, h3);
        f f0 = B.k.e;
        Modifier modifier2 = androidx.compose.foundation.layout.b.a.a(l0, g0.b.e);
        f1 f10 = e1.b(6, 0L);
        ((p)object2).Q(0xF81605B4);
        Object object4 = ((p)object2).G();
        if(object4 == U.l.a) {
            object4 = v1.r.d(((p)object2));
        }
        ((p)object2).p(false);
        Modifier modifier3 = androidx.compose.ui.platform.c.a(androidx.compose.foundation.a.c(modifier2, ((A.k)object4), f10, false, null, this.X, 28), "TEST_TAG_BALANCE");
        x0 x00 = v0.b(f0, g0.b.j, ((p)object2), 6);
        int v1 = ((p)object2).P;
        g0 g01 = ((p)object2).m();
        Modifier modifier4 = a.d(((p)object2), modifier3);
        ((p)object2).U();
        if(((p)object2).O) {
            ((p)object2).l(i0);
        }
        else {
            ((p)object2).d0();
        }
        d.K(((p)object2), x00, h0);
        d.K(((p)object2), g01, h1);
        if(((p)object2).O || !j.a(((p)object2).G(), v1)) {
            m5.b.F(v1, ((p)object2), v1, h2);
        }
        d.K(((p)object2), modifier4, h3);
        if(z) {
            ((p)object2).Q(0xCFBBC308);
            ia.c.d(this.Y, this.Z, ((p)object2), 6);
        }
        else {
            ((p)object2).Q(0xCFBD06B7);
            ia.c.c(6, ((p)object2));
        }
        ((p)object2).p(false);
        ((p)object2).p(true);
        ((p)object2).p(true);
        return t.a;
    }
}

