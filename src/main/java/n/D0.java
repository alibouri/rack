package N;

import A.k;
import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import e0.p;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class d0 extends j implements Function2 {
    public int c0;
    public final k d0;
    public final p e0;

    public d0(k k0, p p0, g g0) {
        this.d0 = k0;
        this.e0 = p0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((d0)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new d0(this.d0, this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                c0 c00 = new c0(this.e0, 0);
                this.c0 = 1;
                this.d0.a.d(c00, this);
                return object1;
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

