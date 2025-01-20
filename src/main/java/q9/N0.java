package q9;

import Fb.c;
import N3.F;
import kotlin.coroutines.g;

public final class n0 extends c {
    public Object b0;
    public int c0;
    public final F d0;

    public n0(F f0, g g0) {
        this.d0 = f0;
        super(g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.b0 = object0;
        this.c0 |= 0x80000000;
        return this.d0.c(null, this);
    }
}

