package G0;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import Zb.b;
import Zb.i;
import Zb.z;
import e0.m;
import java.util.concurrent.CancellationException;
import jeb.synthetic.FIN;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import s.E;

public final class m0 extends j implements Function2 {
    public z c0;
    public b d0;
    public int e0;
    public final i f0;

    public m0(i i0, g g0) {
        this.f0 = i0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((m0)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new m0(this.f0, g0);
    }

    // This method was un-flattened
    @Override  // Fb.a
    public final Object v(Object object0) {
        z z0;
        Object object1 = a.X;
        CancellationException cancellationException0 = null;
        switch(this.e0) {
            case 0: {
                f.b0(object0);
                z0 = this.f0;
                try {
                    b b0 = new b(((i)z0));
                    goto label_25;
                label_8:
                    b0 = this.d0;
                    z0 = this.c0;
                    f.b0(object0);
                    while(true) {
                        if(!((Boolean)object0).booleanValue()) {
                            goto label_39;
                        }
                        t t0 = (t)b0.b();
                        n0.b.set(false);
                        Object object2 = m.b;
                        __monitor_enter(object2);
                        int v = FIN.finallyOpen$NT();
                        E e0 = ((e0.b)m.i.get()).h;
                        if(e0 == null || !e0.h()) {
                            FIN.finallyExec$NT(v);
                        }
                        else {
                            FIN.finallyCodeBegin$NT(v);
                            __monitor_exit(object2);
                            FIN.finallyCodeEnd$NT(v);
                            m.a();
                        }
                    label_25:
                        this.c0 = z0;
                        this.d0 = b0;
                        this.e0 = 1;
                        object0 = b0.a(this);
                        if(object0 != object1) {
                            continue;
                        }
                        return object1;
                    }
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            case 1: {
                goto label_8;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(throwable0 instanceof CancellationException) {
            cancellationException0 = (CancellationException)throwable0;
        }
        if(cancellationException0 == null) {
            cancellationException0 = new CancellationException("Channel was consumed, consumer had failed");
            cancellationException0.initCause(throwable0);
        }
        z0.f(cancellationException0);
        throw throwable0;
    label_39:
        z0.f(null);
        return t.a;
    }
}

