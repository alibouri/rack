package x;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import z0.z;

public final class e extends j implements Function2 {
    public int c0;
    public Object d0;
    public final n e0;

    public e(n n0, g g0) {
        this.e0 = n0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((e)this.t(((z)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new e(this.e0, g0);
        g1.d0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        Object object2 = t.a;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                z z0 = (z)this.d0;
                V2.a a0 = new V2.a(28, this.e0);
                this.c0 = 1;
                Object object3 = io.sentry.config.a.t(z0, new x.f(a0, null), this);
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

