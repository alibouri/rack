package N9;

import Ab.t;
import U.p;
import c0.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import yc.l;

public final class f implements Function2 {
    public final d X;
    public final e Y;
    public final int Z;
    public final Function0 b0;
    public final Function0 c0;
    public final Function0 d0;
    public final b e0;
    public final int f0;
    public final int g0;

    public f(d d0, e e0, int v, Function0 function00, Function0 function01, Function0 function02, b b0, int v1, int v2) {
        this.X = d0;
        this.Y = e0;
        this.Z = v;
        this.b0 = function00;
        this.c0 = function01;
        this.d0 = function02;
        this.e0 = b0;
        this.f0 = v1;
        this.g0 = v2;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((Integer)object1).getClass();
        l.i(this.X, this.Y, this.Z, this.b0, this.c0, this.d0, this.e0, ((p)object0), U.d.O(this.f0 | 1), this.g0);
        return t.a;
    }
}

