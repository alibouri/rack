package J2;

import Ab.t;
import Eb.a;
import Fb.j;
import I2.A;
import Mb.e;
import W5.f;
import Xb.Q;
import ac.i;
import kotlin.coroutines.g;

public final class m extends j implements e {
    public int c0;
    public Throwable d0;
    public long e0;

    @Override  // Mb.e
    public final Object r(Object object0, Object object1, Object object2, Object object3) {
        i i0 = (i)object0;
        long v = ((Number)object2).longValue();
        m m0 = new m(4, ((g)object3));  // initializer: LFb/j;-><init>(ILkotlin/coroutines/g;)V
        m0.d0 = (Throwable)object1;
        m0.e0 = v;
        return m0.v(t.a);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                Throwable throwable0 = this.d0;
                long v = this.e0;
                A.e().d(o.a, "Cannot check for unfinished work", throwable0);
                this.c0 = 1;
                return Q.b(Math.min(v * 30000L, o.b), this) == object1 ? object1 : Boolean.TRUE;
            }
            case 1: {
                f.b0(object0);
                return Boolean.TRUE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

