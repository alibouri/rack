package k2;

import Bb.v;
import Fb.j;
import W5.f;
import Xb.G;
import java.lang.ref.WeakReference;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class a1 extends j implements Function2 {
    public final t c0;
    public final g0 d0;
    public final e0 e0;

    public a1(t t0, g0 g00, e0 e00, g g0) {
        this.c0 = t0;
        this.d0 = g00;
        this.e0 = e00;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((a1)this.t(((G)object0), ((g)object1))).v(Ab.t.a);
        return Ab.t.a;
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new a1(this.c0, this.d0, this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        f.b0(object0);
        v.i0(this.c0.e0, k2.v.c0);
        for(Object object1: this.c0.e0) {
            Function2 function20 = (Function2)((WeakReference)object1).get();
            if(function20 != null) {
                function20.j(this.d0, this.e0);
            }
        }
        return Ab.t.a;
    }
}

