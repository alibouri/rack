package bb;

import Ab.t;
import U.d;
import U.p;
import W5.f;
import c0.b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

public final class j implements Function2 {
    public final b X;
    public final Function2 Y;
    public final Function3 Z;
    public final long b0;
    public final float c0;
    public final int d0;
    public final int e0;

    public j(b b0, Function2 function20, Function3 function30, long v, float f, int v1, int v2) {
        this.X = b0;
        this.Y = function20;
        this.Z = function30;
        this.b0 = v;
        this.c0 = f;
        this.d0 = v1;
        this.e0 = v2;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((Integer)object1).getClass();
        f.i(this.X, this.Y, this.Z, this.b0, this.c0, ((p)object0), d.O(this.d0 | 1), this.e0);
        return t.a;
    }
}

