package w;

import Ab.t;
import Fb.j;
import W5.f;
import Xb.G;
import Xb.q0;
import Xb.r0;
import hc.a;
import hc.d;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class j0 extends j implements Function2 {
    public a c0;
    public Object d0;
    public l0 e0;
    public int f0;
    public Object g0;
    public final h0 h0;
    public final l0 i0;
    public final j j0;

    public j0(h0 h00, l0 l00, Function1 function10, g g0) {
        this.h0 = h00;
        this.i0 = l00;
        this.j0 = (j)function10;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((j0)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new j0(this.h0, this.i0, ((Function1)this.j0), g0);
        g1.g0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Throwable throwable1;
        l0 l02;
        i0 i02;
        Object object2;
        a a1;
        i0 i01;
        Function1 function10;
        a a0;
        l0 l00;
        Object object1 = Eb.a.X;
        switch(this.f0) {
            case 0: {
                f.b0(object0);
                Element coroutineContext$Element0 = ((G)this.g0).getCoroutineContext().l(q0.X);
                Nb.j.c(coroutineContext$Element0);
                i0 i00 = new i0(this.h0, ((r0)coroutineContext$Element0));
                l00 = this.i0;
                l0.a(l00, i00);
                this.g0 = i00;
                a0 = l00.b;
                this.c0 = a0;
                j j0 = this.j0;
                this.d0 = j0;
                this.e0 = l00;
                this.f0 = 1;
                if(((d)a0).d(null, this) == object1) {
                    return object1;
                }
                function10 = j0;
                i01 = i00;
                a1 = a0;
                goto label_29;
            }
            case 1: {
                l0 l01 = this.e0;
                function10 = (Function1)this.d0;
                a0 = this.c0;
                i01 = (i0)this.g0;
                f.b0(object0);
                l00 = l01;
                a1 = a0;
                try {
                label_29:
                    this.g0 = i01;
                    this.c0 = a1;
                    this.d0 = l00;
                    this.e0 = null;
                    this.f0 = 2;
                    object2 = function10.n(this);
                }
                catch(Throwable throwable0) {
                    i02 = i01;
                    l02 = l00;
                    throwable1 = throwable0;
                    goto label_53;
                }
                if(object2 == object1) {
                    return object1;
                }
                l02 = l00;
                object0 = object2;
                i02 = i01;
                goto label_57;
            }
            case 2: {
                l02 = (l0)this.d0;
                a1 = this.c0;
                i02 = (i0)this.g0;
                try {
                    f.b0(object0);
                    goto label_57;
                }
                catch(Throwable throwable1) {
                }
                try {
                label_53:
                    AtomicReference atomicReference0 = l02.a;
                    while(true) {
                        if(atomicReference0.compareAndSet(i02, null) || atomicReference0.get() != i02) {
                            throw throwable1;
                        }
                    }
                label_57:
                    AtomicReference atomicReference1 = l02.a;
                    while(true) {
                        if(atomicReference1.compareAndSet(i02, null) || atomicReference1.get() != i02) {
                            goto label_63;
                        }
                    }
                }
                catch(Throwable throwable2) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ((d)a1).f(null);
        throw throwable2;
    label_63:
        ((d)a1).f(null);
        return object0;
    }
}

