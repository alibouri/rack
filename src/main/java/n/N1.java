package N;

import Ab.t;
import B.F0;
import Nb.k;
import U.d;
import U.p;
import c0.b;
import kotlin.jvm.functions.Function2;

public final class n1 extends k implements Function2 {
    public final boolean X;
    public final int Y;
    public final Function2 Z;
    public final b b0;
    public final b c0;
    public final Function2 d0;
    public final F0 e0;
    public final Function2 f0;
    public final int g0;

    public n1(boolean z, int v, Function2 function20, b b0, b b1, Function2 function21, F0 f00, Function2 function22, int v1) {
        this.X = z;
        this.Y = v;
        this.Z = function20;
        this.b0 = b0;
        this.c0 = b1;
        this.d0 = function21;
        this.e0 = f00;
        this.f0 = function22;
        this.g0 = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((Number)object1).intValue();
        o1.c(this.X, this.Y, this.Z, this.b0, this.c0, this.d0, this.e0, this.f0, ((p)object0), d.O(this.g0 | 1));
        return t.a;
    }
}

