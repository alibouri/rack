package N;

import Ab.t;
import B.w;
import Nb.k;
import U.p;
import c0.b;
import c0.c;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

public final class i1 extends k implements Function2 {
    public final boolean X;
    public final int Y;
    public final Function2 Z;
    public final b b0;
    public final Function2 c0;
    public final V0 d0;
    public final Function2 e0;
    public final Function3 f0;
    public final q1 g0;

    public i1(boolean z, int v, Function2 function20, b b0, Function2 function21, V0 v00, Function2 function22, Function3 function30, q1 q10) {
        this.X = z;
        this.Y = v;
        this.Z = function20;
        this.b0 = b0;
        this.c0 = function21;
        this.d0 = v00;
        this.e0 = function22;
        this.f0 = function30;
        this.g0 = q10;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
            ((p)object0).K();
            return t.a;
        }
        b b0 = c.c(433906483, new w(this.f0, 11, this.g0), ((p)object0));
        o1.c(this.X, this.Y, this.Z, this.b0, b0, this.c0, this.d0, this.e0, ((p)object0), 0x6000);
        return t.a;
    }
}

