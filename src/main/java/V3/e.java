package v3;

import Nb.k;
import kotlin.jvm.functions.Function1;

public final class e extends k implements Function1 {
    public final int X;
    public final h Y;
    public final int Z;

    public e(h h0, int v, int v1) {
        this.X = v1;
        this.Y = h0;
        this.Z = v;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        if(this.X != 0) {
            long v = ((Number)object0).longValue();
            return Boolean.valueOf(h.a(this.Y, this.Z, v));
        }
        long v1 = ((Number)object0).longValue();
        return Boolean.valueOf(h.a(this.Y, this.Z, v1));
    }
}

