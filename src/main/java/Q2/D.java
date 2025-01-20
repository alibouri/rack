package q2;

import Ab.t;
import Eb.a;
import Fb.j;
import T4.l;
import W5.f;
import Xb.G;
import Xb.J;
import ac.i;
import ac.o0;
import java.util.concurrent.Callable;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class d extends j implements Function2 {
    public int c0;
    public Object d0;
    public final boolean e0;
    public final v f0;
    public final i g0;
    public final String[] h0;
    public final Callable i0;

    public d(boolean z, v v0, i i0, String[] arr_s, Callable callable0, g g0) {
        this.e0 = z;
        this.f0 = v0;
        this.g0 = i0;
        this.h0 = arr_s;
        this.i0 = callable0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((d)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        d d0 = new d(this.e0, this.f0, this.g0, this.h0, this.i0, g0);
        d0.d0 = object0;
        return d0;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        kotlin.coroutines.i i1;
        Object object1 = a.X;
        Object object2 = t.a;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                G g0 = (G)this.d0;
                Zb.i i0 = l.i(-1, 6, null);
                c c0 = new c(this.h0, i0);
                i0.s(object2);
                q2.G g1 = (q2.G)g0.getCoroutineContext().l(q2.G.Z);
                if(g1 == null) {
                    i1 = this.e0 ? yc.l.w(this.f0) : yc.l.v(this.f0);
                }
                else {
                    i1 = g1.X;
                }
                Zb.i i2 = l.i(0, 7, null);
                J.q(g0, i1, null, new b(this.f0, c0, i0, this.i0, i2, null), 2);
                this.c0 = 1;
                Object object3 = o0.q(this.g0, i2, true, this);
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

