package v9;

import Ab.t;
import B.r;
import D0.K;
import F0.h;
import F0.i;
import F0.k;
import U.d;
import U.g0;
import U.p;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Density;
import g0.b;
import g0.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import q9.e3;
import u9.j;

public final class e implements Function2 {
    public final float X;
    public final float Y;
    public final j Z;
    public final Density b0;
    public final a c0;
    public final int d0;
    public final Function2 e0;

    public e(float f, float f1, j j0, Density density0, a a0, int v, Function2 function20) {
        this.X = f;
        this.Y = f1;
        this.Z = j0;
        this.b0 = density0;
        this.c0 = a0;
        this.d0 = v;
        this.e0 = function20;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
            ((p)object0).K();
            return t.a;
        }
        Modifier modifier0 = androidx.compose.foundation.layout.a.n(N4.j.g(l.X, 0.0f), this.X, 0.0f, this.Y, 0.0f, 10);
        ((p)object0).Q(0x50B2DB0D);
        j j0 = this.Z;
        boolean z = ((p)object0).h(j0);
        Density density0 = this.b0;
        boolean z1 = ((p)object0).f(density0);
        a a0 = this.c0;
        boolean z2 = ((p)object0).f(a0);
        Object object2 = ((p)object0).G();
        if((z | z1 | z2) != 0 || object2 == U.l.a) {
            object2 = new e3(this.d0, j0, density0, a0);
            ((p)object0).a0(object2);
        }
        ((p)object0).p(false);
        Modifier modifier1 = androidx.compose.ui.layout.a.d(modifier0, ((Function1)object2));
        K k0 = r.e(b.a, false);
        int v = ((p)object0).P;
        g0 g00 = ((p)object0).m();
        Modifier modifier2 = g0.a.d(((p)object0), modifier1);
        k.a.getClass();
        i i0 = F0.j.b;
        ((p)object0).U();
        if(((p)object0).O) {
            ((p)object0).l(i0);
        }
        else {
            ((p)object0).d0();
        }
        d.K(((p)object0), k0, F0.j.f);
        d.K(((p)object0), g00, F0.j.e);
        h h0 = F0.j.g;
        if(((p)object0).O || !Nb.j.a(((p)object0).G(), v)) {
            m5.b.F(v, ((p)object0), v, h0);
        }
        d.K(((p)object0), modifier2, F0.j.d);
        ((p)object0).Q(0x75327EF1);
        Function2 function20 = this.e0;
        if(function20 != null) {
            function20.j(((p)object0), 0);
        }
        ((p)object0).p(false);
        ((p)object0).p(true);
        return t.a;
    }
}

