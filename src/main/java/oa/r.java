package oa;

import Fb.c;
import kotlin.coroutines.g;

public final class r extends c {
    public Object b0;
    public int c0;
    public final s d0;

    public r(s s0, g g0) {
        this.d0 = s0;
        super(g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.b0 = object0;
        this.c0 |= 0x80000000;
        return this.d0.c(null, this);
    }
}

