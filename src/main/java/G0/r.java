package g0;

import Ab.t;
import Eb.a;
import Fb.j;
import Nb.k;
import W5.f;
import Xb.G;
import Xb.J;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class r extends j implements Function2 {
    public int c0;
    public Object d0;
    public final k e0;
    public final AtomicReference f0;
    public final j g0;

    public r(Function1 function10, AtomicReference atomicReference0, Function2 function20, g g0) {
        this.e0 = (k)function10;
        this.f0 = atomicReference0;
        this.g0 = (j)function20;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((r)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new r(((Function1)this.e0), this.f0, ((Function2)this.g0), g0);
        g1.d0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        q q2;
        q q0;
        Object object1 = a.X;
        AtomicReference atomicReference0 = this.f0;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                G g0 = (G)this.d0;
                q0 = new q(J.k(g0.getCoroutineContext()), ((Function1)this.e0).n(g0));
                q q1 = (q)atomicReference0.getAndSet(q0);
                if(q1 != null) {
                    this.d0 = q0;
                    this.c0 = 1;
                    if(J.g(q1.a, this) == object1) {
                        return object1;
                    }
                }
                goto label_15;
            }
            case 1: {
                q0 = (q)this.d0;
                f.b0(object0);
                try {
                label_15:
                    this.d0 = q0;
                    this.c0 = 2;
                    object0 = ((Function2)this.g0).j(q0.b, this);
                }
                catch(Throwable throwable0) {
                    q2 = q0;
                    goto label_30;
                }
                if(object0 == object1) {
                    return object1;
                }
                q2 = q0;
                break;
            }
            case 2: {
                q2 = (q)this.d0;
                try {
                    f.b0(object0);
                    break;
                }
                catch(Throwable throwable0) {
                }
            label_30:
                while(!atomicReference0.compareAndSet(q2, null) && atomicReference0.get() == q2) {
                }
                throw throwable0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(!atomicReference0.compareAndSet(q2, null) && atomicReference0.get() == q2) {
        }
        return object0;
    }
}

