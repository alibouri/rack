package bb;

import Ab.t;
import U.d;
import U.p;
import W4.f;
import kotlin.jvm.functions.Function2;

public final class c implements Function2 {
    public final float X;
    public final float Y;
    public final e Z;
    public final long b0;
    public final float c0;
    public final Function2 d0;
    public final int e0;
    public final int f0;

    public c(float f, float f1, e e0, long v, float f2, Function2 function20, int v1, int v2) {
        this.X = f;
        this.Y = f1;
        this.Z = e0;
        this.b0 = v;
        this.c0 = f2;
        this.d0 = function20;
        this.e0 = v1;
        this.f0 = v2;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((Integer)object1).getClass();
        f.d(this.X, this.Y, this.Z, this.b0, this.c0, this.d0, ((p)object0), d.O(this.e0 | 1), this.f0);
        return t.a;
    }
}

