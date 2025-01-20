package ab;

import Ab.t;
import N4.o;
import O0.f;
import U.p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final class d implements Function2 {
    public final Integer X;
    public final f Y;
    public final f Z;
    public final i b0;
    public final boolean c0;
    public final Function0 d0;

    public d(Integer integer0, f f0, f f1, i i0, boolean z, Function0 function00) {
        this.X = integer0;
        this.Y = f0;
        this.Z = f1;
        this.b0 = i0;
        this.c0 = z;
        this.d0 = function00;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
            ((p)object0).K();
            return t.a;
        }
        o.c(this.X, this.Y, this.Z, null, this.b0, this.c0, this.d0, ((p)object0), 0);
        return t.a;
    }
}

