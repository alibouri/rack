package bb;

import Ab.t;
import U.d;
import U.p;
import W5.f;
import kotlin.jvm.functions.Function2;

public final class k implements Function2 {
    public final String X;
    public final long Y;
    public final int Z;
    public final int b0;

    public k(int v, int v1, long v2, String s) {
        this.X = s;
        this.Y = v2;
        this.Z = v;
        this.b0 = v1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((Integer)object1).getClass();
        f.g(this.X, this.Y, ((p)object0), d.O(this.Z | 1), this.b0);
        return t.a;
    }
}

