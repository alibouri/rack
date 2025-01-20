package E;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import v.A;
import v.U;
import v.b;

public final class p extends j implements Function2 {
    public A c0;
    public int d0;
    public final u e0;
    public final A f0;
    public final long g0;

    public p(u u0, A a0, long v, g g0) {
        this.e0 = u0;
        this.f0 = a0;
        this.g0 = v;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((p)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new p(this.e0, this.f0, this.g0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        b b0;
        long v;
        u u0;
        Object object1;
        try {
            object1 = a.X;
            u0 = this.e0;
            v = this.g0;
            b0 = u0.m;
            switch(this.d0) {
                case 0: {
                    goto label_6;
                }
                case 1: {
                    goto label_17;
                }
                case 2: {
                    goto label_27;
                }
            }
        }
        catch(CancellationException unused_ex) {
            return t.a;
        }
        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
    label_6:
        f.b0(object0);
        try {
            boolean z = ((Boolean)b0.d.getValue()).booleanValue();
            A a0 = this.f0;
            if(z) {
                a0 = a0 instanceof U ? ((U)a0) : v.a;
            }
            if(!((Boolean)b0.d.getValue()).booleanValue()) {
                a1.g g0 = new a1.g(v);
                this.c0 = a0;
                this.d0 = 1;
                if(b0.e(g0, this) == object1) {
                    return object1;
                label_17:
                    a0 = this.c0;
                    f.b0(object0);
                }
                u0.c.invoke();
            }
            long v1 = a1.g.c(((a1.g)b0.d()).a, v);
            a1.g g1 = new a1.g(v1);
            o o0 = new o(u0, v1);
            this.c0 = null;
            this.d0 = 2;
            if(b.c(u0.m, g1, a0, o0, this, 4) == object1) {
                return object1;
            label_27:
                f.b0(object0);
            }
            u0.d(false);
            u0.e = false;
        }
        catch(CancellationException unused_ex) {
        }
        return t.a;
    }
}

