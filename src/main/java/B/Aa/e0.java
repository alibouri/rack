package Aa;

import Ab.e;
import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import ac.B0;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class e0 extends j implements Function2 {
    public int c0;
    public final u0 d0;

    public e0(u0 u00, g g0) {
        this.d0 = u00;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((e0)this.t(((G)object0), ((g)object1))).v(t.a);
        return a.X;
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new e0(this.d0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                d0 d00 = new d0(this.d0, 0);
                this.c0 = 1;
                ((B0)this.d0.h0.f.X).d(d00, this);
                return object1;
            }
            case 1: {
                f.b0(object0);
                throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

