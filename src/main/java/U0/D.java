package U0;

import Ab.t;
import Nb.k;
import java.util.List;
import kotlin.jvm.functions.Function1;
import n0.G;

public final class d extends k implements Function1 {
    public final int X;
    public static final d Y;
    public static final d Z;
    public static final d b0;
    public static final d c0;
    public static final d d0;
    public static final d e0;

    static {
        d.Y = new d(1, 0);
        d.Z = new d(1, 1);
        d.b0 = new d(1, 2);
        d.c0 = new d(1, 3);
        d.d0 = new d(1, 4);
        d.e0 = new d(1, 5);
    }

    public d(int v, int v1) {
        this.X = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        switch(this.X) {
            case 0: {
                G g0 = (G)object0;
                return t.a;
            }
            case 1: {
                G g1 = (G)object0;
                return t.a;
            }
            case 2: {
                List list0 = (List)object0;
                return t.a;
            }
            case 3: {
                m m1 = (m)object0;
                return t.a;
            }
            case 4: {
                List list1 = (List)object0;
                return t.a;
            }
            default: {
                m m0 = (m)object0;
                return t.a;
            }
        }
    }
}

