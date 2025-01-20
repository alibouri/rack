package z0;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import Xb.Q;
import Xb.k;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class v extends j implements Function2 {
    public int c0;
    public final long d0;
    public final x e0;

    public v(long v, x x0, g g0) {
        this.d0 = v;
        this.e0 = x0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((v)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new v(this.d0, this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        long v = this.d0;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                this.c0 = 1;
                if(Q.b(v - 1L, this) == object1) {
                    return object1;
                }
                goto label_9;
            }
            case 1: {
                f.b0(object0);
            label_9:
                this.c0 = 2;
                if(Q.b(1L, this) == object1) {
                    return object1;
                }
                break;
            }
            case 2: {
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        k k0 = this.e0.Z;
        if(k0 != null) {
            k0.i(f.v(new h(v)));
        }
        return t.a;
    }
}

