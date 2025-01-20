package y;

import Fb.c;
import N.v;

public final class q extends c {
    public v b0;
    public Object c0;
    public final v d0;
    public int e0;

    public q(v v0, c c0) {
        this.d0 = v0;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.c0 = object0;
        this.e0 |= 0x80000000;
        return this.d0.a(null, null, null, this);
    }
}

