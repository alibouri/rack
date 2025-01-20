package e0;

import Ab.t;
import Nb.k;
import kotlin.jvm.functions.Function1;

public final class l extends k implements Function1 {
    public final int X;
    public static final l Y;
    public static final l Z;

    static {
        l.Y = new l(1, 0);
        l.Z = new l(1, 1);
    }

    public l(int v, int v1) {
        this.X = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        if(this.X != 0) {
            e0.k k0 = (e0.k)object0;
            return t.a;
        }
        e0.k k1 = (e0.k)object0;
        return t.a;
    }
}

