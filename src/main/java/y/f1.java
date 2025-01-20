package y;

import Ab.t;
import Eb.a;
import Fb.j;
import Nb.k;
import W5.f;
import Xb.G;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import z0.z;

public final class f1 extends j implements Function2 {
    public int c0;
    public Object d0;
    public final z e0;
    public final j f0;
    public final k g0;
    public final t0 h0;

    public f1(z z0, Function3 function30, Function1 function10, t0 t00, g g0) {
        this.e0 = z0;
        this.f0 = (j)function30;
        this.g0 = (k)function10;
        this.h0 = t00;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((f1)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        f1 f10 = new f1(this.e0, ((Function3)this.f0), ((Function1)this.g0), this.h0, g0);
        f10.d0 = object0;
        return f10;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                e1 e10 = new e1(((G)this.d0), ((Function3)this.f0), ((Function1)this.g0), this.h0, null);
                this.c0 = 1;
                return io.sentry.config.a.t(this.e0, e10, this) == object1 ? object1 : t.a;
            }
            case 1: {
                f.b0(object0);
                return t.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

