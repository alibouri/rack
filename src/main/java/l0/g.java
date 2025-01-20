package l0;

import Ab.t;
import Nb.k;
import kotlin.jvm.functions.Function1;

public final class g extends k implements Function1 {
    public final int X;
    public static final g Y;
    public static final g Z;
    public static final g b0;
    public static final g c0;
    public static final g d0;

    static {
        g.Y = new g(1, 0);
        g.Z = new g(1, 1);
        g.b0 = new g(1, 2);
        g.c0 = new g(1, 3);
        g.d0 = new g(1, 4);
    }

    public g(int v, int v1) {
        this.X = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        switch(this.X) {
            case 0: {
                ((h)object0).c(false);
                return t.a;
            }
            case 1: {
                b b0 = (b)object0;
                return m.b;
            }
            case 2: {
                b b1 = (b)object0;
                return m.b;
            }
            case 3: {
                return Boolean.valueOf(d.A(((q)object0)));
            }
            default: {
                return Boolean.valueOf(d.A(((q)object0)));
            }
        }
    }
}

