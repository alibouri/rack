package f9;

import Fb.c;
import U2.i;
import kotlin.coroutines.g;

public final class q extends c {
    public Object b0;
    public int c0;
    public final i d0;

    public q(i i0, g g0) {
        this.d0 = i0;
        super(g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.b0 = object0;
        this.c0 |= 0x80000000;
        return this.d0.c(null, this);
    }
}

