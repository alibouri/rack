package I;

import Ab.t;
import Eb.a;
import Fb.j;
import K.n;
import K.o;
import W5.f;
import Xb.G;
import Xb.H;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class w0 extends j implements Function2 {
    public int c0;
    public final o d0;

    public w0(o o0, g g0) {
        this.d0 = o0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((w0)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new w0(this.d0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        Object object2 = t.a;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                this.c0 = 1;
                this.d0.getClass();
                Object object3 = H.c(new n(this.d0, null), this);
                if(object3 != object1) {
                    object3 = object2;
                }
                return object3 == object1 ? object1 : object2;
            }
            case 1: {
                f.b0(object0);
                return object2;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

