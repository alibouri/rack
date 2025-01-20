package K;

import Ab.t;
import Eb.a;
import Fb.j;
import G0.z0;
import W5.f;
import Xb.G;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class w extends j implements Function2 {
    public int c0;
    public final x d0;
    public final e e0;

    public w(x x0, e e0, g g0) {
        this.d0 = x0;
        this.e0 = e0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((w)this.t(((G)object0), ((g)object1))).v(t.a);
        return a.X;
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new w(this.d0, this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                this.c0 = 1;
                z0.a(this.d0, this.e0, this);
                return object1;
            }
            case 1: {
                f.b0(object0);
                throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

