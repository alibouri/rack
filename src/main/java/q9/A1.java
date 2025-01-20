package q9;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.H;
import Zb.x;
import java.util.ArrayList;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class a1 extends j implements Function2 {
    public int c0;
    public Object d0;
    public final ArrayList e0;

    public a1(ArrayList arrayList0, g g0) {
        this.e0 = arrayList0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((a1)this.t(((x)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new a1(this.e0, g0);
        g1.d0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                Z0 z00 = new Z0(this.e0, ((x)this.d0), null);
                this.c0 = 1;
                return H.c(z00, this) == object1 ? object1 : t.a;
            }
            case 1: {
                f.b0(object0);
                return t.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

