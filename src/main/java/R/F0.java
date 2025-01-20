package R;

import Ab.t;
import Nb.k;
import U.d;
import U.p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final class f0 extends k implements Function2 {
    public final long X;
    public final Function0 Y;
    public final boolean Z;
    public final int b0;

    public f0(long v, Function0 function00, boolean z, int v1) {
        this.X = v;
        this.Y = function00;
        this.Z = z;
        this.b0 = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((Number)object1).intValue();
        h0.c(this.X, this.Y, this.Z, ((p)object0), d.O(this.b0 | 1));
        return t.a;
    }
}

