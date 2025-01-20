package q9;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import Zb.z;
import ac.i;
import ac.o0;
import gc.c;
import gc.e;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class g1 extends j implements Function2 {
    public z c0;
    public int d0;
    public Object e0;
    public final c1 f0;
    public final c1 g0;
    public final i h0;

    public g1(c1 c10, c1 c11, i i0, g g0) {
        this.f0 = c10;
        this.g0 = c11;
        this.h0 = i0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((g1)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new g1(this.f0, this.g0, this.h0, g0);
        g1.e0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object3;
        z z4;
        z z1;
        z z0;
        Object object1 = a.X;
        Object object2 = t.a;
        i i0 = this.h0;
        switch(this.d0) {
            case 0: {
                f.b0(object0);
                G g0 = (G)this.e0;
                z0 = o0.A(this.f0, g0);
                z1 = o0.A(this.g0, g0);
                try {
                    Nb.j.c(this.Y);
                    e e0 = new e(this.Y);
                    e0.f(z0.e(), new e1(i0, null));
                    e0.f(z1.j(), new f1(i0, null));
                    this.e0 = z0;
                    this.c0 = z1;
                    this.d0 = 1;
                    if((e.d0.get(e0) instanceof c ? e0.a(this) : e0.b(this)) == object1) {
                        return object1;
                    }
                    goto label_28;
                }
                catch(Throwable throwable0) {
                    z4 = z1;
                    throwable1 = throwable0;
                    z0.f(null);
                    z4.f(null);
                    throw throwable1;
                }
            }
            case 1: {
                z z2 = this.c0;
                z z3 = (z)this.e0;
                try {
                    f.b0(object0);
                    z1 = z2;
                    z0 = z3;
                }
                catch(Throwable throwable1) {
                    z4 = z2;
                    z0 = z3;
                    z0.f(null);
                    z4.f(null);
                    throw throwable1;
                }
                try {
                label_28:
                    z1.f(null);
                    this.e0 = z0;
                    this.c0 = z1;
                    this.d0 = 2;
                    object3 = o0.q(i0, z0, true, this);
                }
                catch(Throwable throwable0) {
                    z4 = z1;
                    throwable1 = throwable0;
                    z0.f(null);
                    z4.f(null);
                    throw throwable1;
                }
                if(object3 != object1) {
                    object3 = object2;
                }
                if(object3 == object1) {
                    return object1;
                }
                z4 = z1;
                break;
            }
            case 2: {
                z4 = this.c0;
                z0 = (z)this.e0;
                try {
                    f.b0(object0);
                    break;
                }
                catch(Throwable throwable1) {
                }
                z0.f(null);
                z4.f(null);
                throw throwable1;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        z0.f(null);
        z4.f(null);
        return object2;
    }
}

