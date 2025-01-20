package Fa;

import Ab.t;
import U.d;
import U.p;
import kotlin.jvm.functions.Function2;

public final class g implements Function2 {
    public final e X;
    public final String Y;
    public final long Z;
    public final long b0;
    public final int c0;

    public g(e e0, String s, long v, long v1, int v2) {
        this.X = e0;
        this.Y = s;
        this.Z = v;
        this.b0 = v1;
        this.c0 = v2;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((Integer)object1).getClass();
        m.g(this.X, this.Y, this.Z, this.b0, ((p)object0), d.O(this.c0 | 1));
        return t.a;
    }
}

