package l2;

import Ab.t;
import Eb.a;
import Fb.j;
import Xb.G;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class f extends j implements Function2 {
    public int c0;
    public final c d0;

    public f(c c0, g g0) {
        this.d0 = c0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((f)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new f(this.d0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                W5.f.b0(object0);
                this.c0 = 1;
                this.d0.a(this);
                return object1;
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

