package k2;

import Ab.t;
import C3.i;
import Ca.v;
import Eb.a;
import Fb.j;
import Nb.u;
import W5.f;
import Xb.G;
import ac.b0;
import ac.h;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class l extends j implements Function2 {
    public int c0;
    public final h d0;
    public final i e0;

    public l(h h0, i i0, g g0) {
        this.d0 = h0;
        this.e0 = i0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((l)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new l(this.d0, this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        Object object2 = t.a;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                v v0 = new v(12, this.e0);
                this.c0 = 1;
                b0 b00 = new b0(v0, new u());  // initializer: Ljava/lang/Object;-><init>()V
                Object object3 = this.d0.d(b00, this);
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

