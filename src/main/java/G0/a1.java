package G0;

import Ab.e;
import Ab.t;
import Ca.v;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import ac.z0;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class a1 extends j implements Function2 {
    public int c0;
    public final z0 d0;
    public final u0 e0;

    public a1(z0 z00, u0 u00, g g0) {
        this.d0 = z00;
        this.e0 = u00;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((a1)this.t(((G)object0), ((g)object1))).v(t.a);
        return a.X;
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new a1(this.d0, this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                v v0 = new v(1, this.e0);
                this.c0 = 1;
                if(this.d0.d(v0, this) == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
    }
}

