package q9;

import Ab.k;
import Ab.t;
import Fb.j;
import W5.f;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;

public final class y0 extends j implements Function1 {
    public final int c0;
    public final k d0;

    public y0(k k0, g g0, int v) {
        this.c0 = v;
        this.d0 = k0;
        super(1, g0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        return this.c0 == 0 ? new y0(this.d0, ((g)object0), 0).v(t.a) : new y0(this.d0, ((g)object0), 1).v(t.a);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        k k0 = this.d0;
        if(this.c0 != 0) {
            f.b0(object0);
            return k0 != null ? ((Double)k0.Y) : null;
        }
        f.b0(object0);
        return k0 != null ? ((Double)k0.X) : null;
    }
}

