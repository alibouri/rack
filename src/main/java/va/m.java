package Va;

import Ab.t;
import U.d;
import U.p;
import U5.a;
import kotlin.jvm.functions.Function2;
import n0.v;

public final class m implements Function2 {
    public final int X;
    public final v Y;
    public final int Z;

    public m(v v0, int v1, int v2) {
        this.X = v2;
        this.Y = v0;
        this.Z = v1;
        super();
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        Integer integer0 = (Integer)object1;
        if(this.X != 0) {
            a.s(this.Y, ((p)object0), d.O(this.Z | 1));
            return t.a;
        }
        a.s(this.Y, ((p)object0), d.O(this.Z | 1));
        return t.a;
    }
}

