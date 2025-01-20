package R9;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Y8.R9;
import a5.w;
import a9.T7;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class v3 extends j implements Function2 {
    public int c0;
    public final y3 d0;
    public final T7 e0;

    public v3(y3 y30, T7 t70, g g0) {
        this.d0 = y30;
        this.e0 = t70;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((v3)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new v3(this.d0, this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                F2 f20 = new F2(3, this.d0);
                this.c0 = 1;
                return w.a0(this.d0.g0, this.e0, this.d0.d0, f20, s9.a.d0, this.d0.l0, null, this) == object1 ? object1 : t.a;
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

