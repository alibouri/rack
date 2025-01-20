package N;

import Ab.t;
import Nb.k;
import U.d;
import U.p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final class x0 extends k implements Function2 {
    public final boolean X;
    public final Function0 Y;
    public final Function0 Z;
    public final long b0;
    public final int c0;

    public x0(boolean z, Function0 function00, Function0 function01, long v, int v1) {
        this.X = z;
        this.Y = function00;
        this.Z = function01;
        this.b0 = v;
        this.c0 = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((Number)object1).intValue();
        B0.b(this.X, this.Y, this.Z, this.b0, ((p)object0), d.O(this.c0 | 1));
        return t.a;
    }
}

