package w;

import A.k;
import A.m;
import A.n;
import Ab.t;
import Eb.a;
import Fb.j;
import Xb.G;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class f extends j implements Function2 {
    public int c0;
    public final w.j d0;
    public final m e0;

    public f(w.j j0, m m0, g g0) {
        this.d0 = j0;
        this.e0 = m0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((f)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new f(this.d0, this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                W5.f.b0(object0);
                k k0 = this.d0.n0;
                if(k0 != null) {
                    n n0 = new n(this.e0);
                    this.c0 = 1;
                    if(k0.a(n0, this) == object1) {
                        return object1;
                    }
                }
                return t.a;
            }
            case 1: {
                W5.f.b0(object0);
                return t.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

