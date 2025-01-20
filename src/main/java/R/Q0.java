package R;

import Ab.t;
import B.F0;
import Nb.k;
import U.d;
import U.p;
import c0.b;
import kotlin.jvm.functions.Function2;

public final class q0 extends k implements Function2 {
    public final int X;
    public final Function2 Y;
    public final b Z;
    public final Function2 b0;
    public final Function2 c0;
    public final F0 d0;
    public final Function2 e0;
    public final int f0;

    public q0(int v, Function2 function20, b b0, Function2 function21, Function2 function22, F0 f00, Function2 function23, int v1) {
        this.X = v;
        this.Y = function20;
        this.Z = b0;
        this.b0 = function21;
        this.c0 = function22;
        this.d0 = f00;
        this.e0 = function23;
        this.f0 = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((Number)object1).intValue();
        r0.b(this.X, this.Y, this.Z, this.b0, this.c0, this.d0, this.e0, ((p)object0), d.O(this.f0 | 1));
        return t.a;
    }
}

