package R9;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Y8.R9;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class a1 extends j implements Function2 {
    public int c0;
    public final k1 d0;

    public a1(k1 k10, g g0) {
        this.d0 = k10;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((a1)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new a1(this.d0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                this.c0 = 1;
                return this.d0.o(this) == object1 ? object1 : t.a;
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

