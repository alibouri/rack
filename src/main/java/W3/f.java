package W3;

import Ab.t;
import Ca.v;
import Eb.a;
import Fb.j;
import Ha.S;
import N9.l;
import ac.i;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class f extends j implements Function2 {
    public int c0;
    public Object d0;
    public final S e0;
    public final l f0;

    public f(S s0, l l0, g g0) {
        this.e0 = s0;
        this.f0 = l0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((f)this.t(((i)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new f(this.e0, this.f0, g0);
        g1.d0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        e e0;
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                W5.f.b0(object0);
                e e1 = new e(this.f0, ((i)this.d0));
                try {
                    v v0 = new v(7, e1);
                    this.d0 = e1;
                    this.c0 = 1;
                    return this.e0.d(v0, this) == object1 ? object1 : t.a;
                }
                catch(W3.a a0) {
                    e0 = e1;
                }
            label_17:
                Nb.j.f(e0, "owner");
                if(a0.X != e0) {
                    throw a0;
                }
                return t.a;
            }
            case 1: {
                e0 = (e)this.d0;
                try {
                    W5.f.b0(object0);
                    return t.a;
                }
                catch(W3.a a0) {
                    goto label_17;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

