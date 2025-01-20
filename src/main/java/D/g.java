package D;

import Bb.q;
import Nb.k;
import d0.b;
import kotlin.jvm.functions.Function2;

public final class g extends k implements Function2 {
    public final int X;
    public static final g Y;
    public static final g Z;

    static {
        g.Y = new g(2, 0);
        g.Z = new g(2, 1);
    }

    public g(int v, int v1) {
        this.X = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        if(this.X != 0) {
            b b0 = (b)object0;
            return q.L(new Integer[]{((A)object1).b.b.k(), ((A)object1).b.c.k()});
        }
        v v0 = (v)object0;
        ((Number)object1).intValue();
        return new D.b(1L);
    }
}

