package q9;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import Xb.N;
import hb.A;
import hb.u;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class h0 extends j implements Function2 {
    public u c0;
    public int d0;
    public final j0 e0;

    public h0(j0 j00, g g0) {
        this.e0 = j00;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((h0)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new h0(this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object2;
        u u1;
        Object object1 = a.X;
        switch(this.d0) {
            case 0: {
                f.b0(object0);
                u u0 = A.a.e("get_app_check_token");
                u0.start();
                try {
                    N n0 = this.e0.b;
                    Nb.j.c(n0);
                    this.c0 = u0;
                    this.d0 = 1;
                    object0 = n0.A(this);
                }
                catch(Throwable throwable0) {
                    u1 = u0;
                    break;
                }
                if(object0 == object1) {
                    return object1;
                }
                u1 = u0;
                object2 = (String)object0;
                goto label_26;
            }
            case 1: {
                try {
                    u1 = this.c0;
                    f.b0(object0);
                    object2 = (String)object0;
                    goto label_26;
                }
                catch(Throwable throwable0) {
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        u1.stop();
        throw throwable0;
    label_26:
        u1.stop();
        return object2;
    }
}

