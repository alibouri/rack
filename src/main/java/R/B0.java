package R;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class b0 extends j implements Function2 {
    public int c0;
    public final z0 d0;

    public b0(z0 z00, g g0) {
        this.d0 = z00;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((b0)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new b0(this.d0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        Object object2 = t.a;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                this.c0 = 1;
                float f = this.d0.c.h.k();
                Object object3 = androidx.compose.material3.internal.a.b(this.d0.c, A0.Y, f, this);
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

