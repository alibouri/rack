package I;

import Ab.t;
import B.J0;
import B.L0;
import Eb.a;
import Fb.j;
import Nb.v;
import W5.f;
import Xb.G;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import y.T;
import y.U;
import z0.z;

public final class n0 extends j implements Function2 {
    public int c0;
    public final z d0;
    public final v0 e0;

    public n0(z z0, v0 v00, g g0) {
        this.d0 = z0;
        this.e0 = v00;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((n0)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new n0(this.d0, this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        Object object2 = t.a;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                this.c0 = 1;
                p0 p00 = new p0(this.e0, 0);
                q0 q00 = new q0(this.e0, 0);
                q0 q01 = new q0(this.e0, 1);
                L0 l00 = new L0(6, this.e0);
                J0 j00 = new J0(11, p00);
                V2.a a0 = new V2.a(29, q00);
                v v0 = new v();  // initializer: Ljava/lang/Object;-><init>()V
                U u0 = new U(T.X, v0, null, j00, l00, q01, a0, null);
                Object object3 = io.sentry.config.a.t(this.d0, u0, this);
                if(object3 != object1) {
                    object3 = object2;
                }
                if(object3 != object1) {
                    object3 = object2;
                }
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

