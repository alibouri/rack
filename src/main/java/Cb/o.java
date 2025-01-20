package cb;

import Ab.t;
import U.p;
import W5.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

public final class o implements Function2 {
    public final String X;
    public final long Y;
    public final long Z;
    public final Function0 b0;
    public final Function3 c0;

    public o(String s, long v, long v1, Function0 function00, Function3 function30) {
        this.X = s;
        this.Y = v;
        this.Z = v1;
        this.b0 = function00;
        this.c0 = function30;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
            ((p)object0).K();
            return t.a;
        }
        f.h(this.X, this.Y, this.Z, this.b0, 0, 0.0f, this.c0, ((p)object0), 0, 0x30);
        return t.a;
    }
}

