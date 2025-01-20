package N;

import Aa.P;
import Ab.t;
import B.I;
import B.J0;
import G0.j;
import Nb.k;
import U.l;
import U.p;
import androidx.compose.ui.Modifier;
import c0.b;
import c0.c;
import g0.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

public final class j1 extends k implements Function3 {
    public final V0 X;
    public final I Y;
    public final long Z;
    public final long b0;
    public final boolean c0;
    public final int d0;
    public final Function2 e0;
    public final b f0;
    public final Function2 g0;
    public final Function2 h0;
    public final Function3 i0;
    public final q1 j0;

    public j1(V0 v00, I i0, long v, long v1, boolean z, int v2, Function2 function20, b b0, Function2 function21, Function2 function22, Function3 function30, q1 q10) {
        this.X = v00;
        this.Y = i0;
        this.Z = v;
        this.b0 = v1;
        this.c0 = z;
        this.d0 = v2;
        this.e0 = function20;
        this.f0 = b0;
        this.g0 = function21;
        this.h0 = function22;
        this.i0 = function30;
        this.j0 = q10;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        if((v & 6) == 0) {
            v |= (((p)object1).f(((Modifier)object0)) ? 4 : 2);
        }
        if((v & 19) == 18 && ((p)object1).x()) {
            ((p)object1).K();
            return t.a;
        }
        V0 v00 = this.X;
        boolean z = ((p)object1).f(v00);
        I i0 = this.Y;
        boolean z1 = ((p)object1).f(i0);
        Object object3 = ((p)object1).G();
        if((z | z1) != 0 || object3 == l.a) {
            object3 = new P(v00, 26, i0);
            ((p)object1).a0(object3);
        }
        J0 j00 = new J0(0, ((Function1)object3));
        Modifier modifier0 = a.b(((Modifier)object0), j.e0, j00);
        b b0 = c.c(1772955108, new i1(this.c0, this.d0, this.e0, this.f0, this.g0, this.X, this.h0, this.i0, this.j0), ((p)object1));
        io.sentry.config.a.k(modifier0, null, this.Z, this.b0, null, 0.0f, b0, ((p)object1), 0x180000, 50);
        return t.a;
    }
}

