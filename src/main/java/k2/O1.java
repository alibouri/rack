package k2;

import Fb.c;
import Ha.Q;
import ac.i;
import kotlin.coroutines.g;

public final class o1 extends c {
    public Object b0;
    public int c0;
    public i d0;
    public final Q e0;

    public o1(Q q0, g g0) {
        this.e0 = q0;
        super(g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.b0 = object0;
        this.c0 |= 0x80000000;
        return this.e0.c(null, this);
    }
}

