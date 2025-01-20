package kb;

import Ab.t;
import U.d;
import U.p;
import W4.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class z implements Function2 {
    public final C X;
    public final long Y;
    public final Function0 Z;
    public final Function0 b0;
    public final Function1 c0;
    public final Function0 d0;
    public final int e0;

    public z(C c0, long v, Function0 function00, Function0 function01, Function1 function10, Function0 function02, int v1) {
        this.X = c0;
        this.Y = v;
        this.Z = function00;
        this.b0 = function01;
        this.c0 = function10;
        this.d0 = function02;
        this.e0 = v1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        Integer integer0 = (Integer)object1;
        f.a(this.X, this.Y, this.Z, this.b0, this.c0, this.d0, ((p)object0), d.O(this.e0 | 1));
        return t.a;
    }
}

