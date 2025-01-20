package bb;

import Ab.t;
import U.d;
import U.p;
import W5.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

public final class i implements Function2 {
    public final String X;
    public final long Y;
    public final long Z;
    public final Function0 b0;
    public final int c0;
    public final float d0;
    public final Function3 e0;
    public final int f0;
    public final int g0;

    public i(String s, long v, long v1, Function0 function00, int v2, float f, Function3 function30, int v3, int v4) {
        this.X = s;
        this.Y = v;
        this.Z = v1;
        this.b0 = function00;
        this.c0 = v2;
        this.d0 = f;
        this.e0 = function30;
        this.f0 = v3;
        this.g0 = v4;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((Integer)object1).getClass();
        f.h(this.X, this.Y, this.Z, this.b0, this.c0, this.d0, this.e0, ((p)object0), d.O(this.f0 | 1), this.g0);
        return t.a;
    }
}

