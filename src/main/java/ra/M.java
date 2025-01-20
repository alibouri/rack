package ra;

import Ab.t;
import T4.l;
import U.d;
import U.p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final class m implements Function2 {
    public final int X;
    public final Function0 Y;
    public final float Z;
    public final int b0;

    public m(int v, Function0 function00, float f, int v1) {
        this.X = v;
        this.Y = function00;
        this.Z = f;
        this.b0 = v1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        Integer integer0 = (Integer)object1;
        l.u(this.X, this.Y, this.Z, ((p)object0), d.O(this.b0 | 1));
        return t.a;
    }
}

