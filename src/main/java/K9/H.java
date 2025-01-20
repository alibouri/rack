package K9;

import Ab.t;
import Fb.j;
import W5.f;
import Xb.G;
import ac.i;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function3;
import m0.b;
import y.t0;

public final class h extends j implements Function3 {
    public final int c0;

    public h(int v, g g0, int v1) {
        this.c0 = v1;
        super(v, g0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        switch(this.c0) {
            case 0: {
                String s = (String)object0;
                String s1 = (String)object1;
                new h(3, ((g)object2), 0).v(t.a);
                return t.a;
            }
            case 1: {
                i i0 = (i)object0;
                Throwable throwable0 = (Throwable)object1;
                new h(3, ((g)object2), 1).v(t.a);
                return t.a;
            }
            case 2: {
                ((Number)object0).intValue();
                Throwable throwable1 = (Throwable)object1;
                new h(3, ((g)object2), 2).v(t.a);
                return Boolean.FALSE;
            }
            case 3: {
                G g0 = (G)object0;
                b b1 = (b)object1;
                new h(3, ((g)object2), 3).v(t.a);
                return t.a;
            }
            case 4: {
                G g1 = (G)object0;
                ((Number)object1).floatValue();
                new h(3, ((g)object2), 4).v(t.a);
                return t.a;
            }
            default: {
                t0 t00 = (t0)object0;
                b b0 = (b)object1;
                new h(3, ((g)object2), 5).v(t.a);
                return t.a;
            }
        }
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = t.a;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                return object1;
            }
            case 1: {
                f.b0(object0);
                return object1;
            }
            case 2: {
                f.b0(object0);
                return Boolean.FALSE;
            }
            case 3: {
                f.b0(object0);
                return object1;
            }
            case 4: {
                f.b0(object0);
                return object1;
            }
            default: {
                f.b0(object0);
                return object1;
            }
        }
    }
}

