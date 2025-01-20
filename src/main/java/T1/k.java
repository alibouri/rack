package T1;

import Ab.t;
import E7.C;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import Xb.J;
import Zb.i;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class k extends j implements Function2 {
    public q c0;
    public int d0;
    public final C e0;

    public k(C c0, g g0) {
        this.e0 = c0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((k)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new k(this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        q q0;
        Object object1 = a.X;
        C c0 = this.e0;
        switch(this.d0) {
            case 0: {
                f.b0(object0);
                if(((AtomicInteger)c0.b0).get() <= 0) {
                    throw new IllegalStateException("Check failed.");
                }
                goto label_13;
            }
            case 1: {
                q0 = this.c0;
                f.b0(object0);
                goto label_20;
            }
            case 2: {
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        do {
            if(((AtomicInteger)c0.b0).decrementAndGet() == 0) {
                return t.a;
            }
        label_13:
            J.h(((G)c0.X).getCoroutineContext());
            q0 = (q)c0.Y;
            this.c0 = q0;
            this.d0 = 1;
            object0 = ((i)c0.Z).t(this);
            if(object0 == object1) {
                return object1;
            }
        label_20:
            this.c0 = null;
            this.d0 = 2;
        }
        while(q0.j(object0, this) != object1);
        return object1;
    }
}

