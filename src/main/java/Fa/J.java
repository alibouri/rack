package Fa;

import Ab.t;
import Ea.N;
import U.d;
import U.p;
import kotlin.jvm.functions.Function2;

public final class j implements Function2 {
    public final int X;
    public final N Y;
    public final e Z;
    public final int b0;

    public j(N n0, e e0, int v, int v1) {
        this.X = v1;
        this.Y = n0;
        this.Z = e0;
        this.b0 = v;
        super();
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        Integer integer0 = (Integer)object1;
        if(this.X != 0) {
            m.d(this.Y, this.Z, ((p)object0), d.O(this.b0 | 1));
            return t.a;
        }
        m.d(this.Y, this.Z, ((p)object0), d.O(this.b0 | 1));
        return t.a;
    }
}

