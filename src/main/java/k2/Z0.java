package k2;

import Fb.c;
import bc.r;
import kotlin.coroutines.g;

public final class z0 extends c {
    public Object b0;
    public int c0;
    public final r d0;

    public z0(r r0, g g0) {
        this.d0 = r0;
        super(g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.b0 = object0;
        this.c0 |= 0x80000000;
        return this.d0.c(null, this);
    }
}

