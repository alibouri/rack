package w;

import A.h;
import A.k;
import Ab.t;
import Fb.j;
import W5.f;
import Xb.G;
import Xb.J;
import kotlin.jvm.functions.Function2;

public final class g extends j implements Function2 {
    public final w.j c0;

    public g(w.j j0, kotlin.coroutines.g g0) {
        this.c0 = j0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((g)this.t(((G)object0), ((kotlin.coroutines.g)object1))).v(t.a);
        return t.a;
    }

    @Override  // Fb.a
    public final kotlin.coroutines.g t(Object object0, kotlin.coroutines.g g0) {
        return new g(this.c0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        f.b0(object0);
        w.j j0 = this.c0;
        if(j0.y0 == null) {
            h h0 = new h();  // initializer: Ljava/lang/Object;-><init>()V
            k k0 = j0.n0;
            if(k0 != null) {
                J.q(j0.l0(), null, null, new a(k0, h0, null), 3);
            }
            j0.y0 = h0;
        }
        return t.a;
    }
}

