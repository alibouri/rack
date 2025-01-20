package w;

import Ab.t;
import Fb.j;
import W5.f;
import Xb.q0;
import Xb.r0;
import hc.a;
import hc.d;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import y.G;
import y.I;

public final class k0 extends j implements Function2 {
    public a c0;
    public Object d0;
    public I e0;
    public l0 f0;
    public int g0;
    public Object h0;
    public final h0 i0;
    public final l0 j0;
    public final G k0;
    public final I l0;

    public k0(h0 h00, l0 l00, G g0, I i0, g g1) {
        this.i0 = h00;
        this.j0 = l00;
        this.k0 = g0;
        this.l0 = i0;
        super(2, g1);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((k0)this.t(((Xb.G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        k0 k00 = new k0(this.i0, this.j0, this.k0, this.l0, g0);
        k00.h0 = object0;
        return k00;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Throwable throwable1;
        l0 l02;
        i0 i02;
        Object object2;
        Function2 function20;
        a a0;
        i0 i01;
        I i1;
        l0 l00;
        Object object1 = Eb.a.X;
        switch(this.g0) {
            case 0: {
                f.b0(object0);
                Element coroutineContext$Element0 = ((Xb.G)this.h0).getCoroutineContext().l(q0.X);
                Nb.j.c(coroutineContext$Element0);
                i0 i00 = new i0(this.i0, ((r0)coroutineContext$Element0));
                l00 = this.j0;
                l0.a(l00, i00);
                this.h0 = i00;
                d d0 = l00.b;
                this.c0 = d0;
                G g0 = this.k0;
                this.d0 = g0;
                I i0 = this.l0;
                this.e0 = i0;
                this.f0 = l00;
                this.g0 = 1;
                if(d0.d(null, this) == object1) {
                    return object1;
                }
                i1 = i0;
                i01 = i00;
                a0 = d0;
                function20 = g0;
                goto label_33;
            }
            case 1: {
                l0 l01 = this.f0;
                i1 = this.e0;
                function20 = (Function2)this.d0;
                a a1 = this.c0;
                i01 = (i0)this.h0;
                f.b0(object0);
                l00 = l01;
                a0 = a1;
                try {
                label_33:
                    this.h0 = i01;
                    this.c0 = a0;
                    this.d0 = l00;
                    this.e0 = null;
                    this.f0 = null;
                    this.g0 = 2;
                    object2 = function20.j(i1, this);
                }
                catch(Throwable throwable0) {
                    i02 = i01;
                    l02 = l00;
                    throwable1 = throwable0;
                    goto label_58;
                }
                if(object2 == object1) {
                    return object1;
                }
                l02 = l00;
                object0 = object2;
                i02 = i01;
                goto label_62;
            }
            case 2: {
                l02 = (l0)this.d0;
                a0 = this.c0;
                i02 = (i0)this.h0;
                try {
                    f.b0(object0);
                    goto label_62;
                }
                catch(Throwable throwable1) {
                }
                try {
                label_58:
                    AtomicReference atomicReference0 = l02.a;
                    while(true) {
                        if(atomicReference0.compareAndSet(i02, null) || atomicReference0.get() != i02) {
                            throw throwable1;
                        }
                    }
                label_62:
                    AtomicReference atomicReference1 = l02.a;
                    while(true) {
                        if(atomicReference1.compareAndSet(i02, null) || atomicReference1.get() != i02) {
                            goto label_68;
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
        ((d)a0).f(null);
        throw throwable2;
    label_68:
        ((d)a0).f(null);
        return object0;
    }
}

