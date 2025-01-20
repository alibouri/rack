package q2;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class y extends j implements Function2 {
    public int c0;
    public Object d0;
    public final v e0;
    public final j f0;

    public y(v v0, Function1 function10, g g0) {
        this.e0 = v0;
        this.f0 = (j)function10;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((y)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new y(this.e0, ((Function1)this.f0), g0);
        g1.d0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Throwable throwable3;
        Object object2;
        Throwable throwable1;
        q2.G g1;
        Object object1 = a.X;
        v v0 = this.e0;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                Element coroutineContext$Element0 = ((G)this.d0).getCoroutineContext().l(q2.G.Z);
                Nb.j.c(coroutineContext$Element0);
                q2.G g0 = (q2.G)coroutineContext$Element0;
                g0.Y.incrementAndGet();
                try {
                    v0.c();
                }
                catch(Throwable throwable0) {
                    g1 = g0;
                    throwable1 = throwable0;
                    goto label_38;
                }
                try {
                    this.d0 = g0;
                    this.c0 = 1;
                    object2 = ((Function1)this.f0).n(this);
                }
                catch(Throwable throwable2) {
                    g1 = g0;
                    throwable3 = throwable2;
                    break;
                }
                if(object2 == object1) {
                    return object1;
                }
                g1 = g0;
                object0 = object2;
                goto label_30;
            }
            case 1: {
                g1 = (q2.G)this.d0;
                try {
                    f.b0(object0);
                label_30:
                    v0.q();
                    goto label_35;
                }
                catch(Throwable throwable3) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            v0.k();
            throw throwable3;
        label_35:
            v0.k();
            goto label_41;
        }
        catch(Throwable throwable1) {
        }
    label_38:
        if(g1.Y.decrementAndGet() >= 0) {
            throw throwable1;
        }
        throw new IllegalStateException("Transaction was never started or was already released.");
    label_41:
        if(g1.Y.decrementAndGet() < 0) {
            throw new IllegalStateException("Transaction was never started or was already released.");
        }
        return object0;
    }
}

