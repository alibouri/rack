package y;

import Ab.t;
import Eb.a;
import Fb.i;
import W5.f;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import z0.x;

public final class j1 extends i implements Function2 {
    public int Z;
    public Object b0;

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((j1)this.t(((x)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new j1(g0);  // initializer: LFb/i;-><init>(Lkotlin/coroutines/g;)V
        g1.b0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.Z) {
            case 0: {
                f.b0(object0);
                this.Z = 1;
                object0 = v1.e(((x)this.b0), z0.g.Y, this);
                return object0 == object1 ? object1 : object0;
            }
            case 1: {
                f.b0(object0);
                return object0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

