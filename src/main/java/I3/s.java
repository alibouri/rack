package i3;

import Fb.j;
import W5.f;
import Xb.G;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import k3.a;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class s extends j implements Function2 {
    public final t c0;

    public s(t t0, g g0) {
        this.c0 = t0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((s)this.t(((G)object0), ((g)object1))).v(Ab.t.a);
        return Ab.t.a;
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new s(this.c0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        f.b0(object0);
        t t0 = this.c0;
        r r0 = t0.Z;
        if(r0 != null) {
            r0.c0.f(null);
            a a0 = r0.Z;
            Lifecycle lifecycle0 = r0.b0;
            if(a0 instanceof LifecycleObserver) {
                lifecycle0.c(a0);
            }
            lifecycle0.c(r0);
        }
        t0.Z = null;
        return Ab.t.a;
    }
}

