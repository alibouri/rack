package z0;

import Fb.a;
import Fb.c;

public final class w extends c {
    public Object b0;
    public final x c0;
    public int d0;

    public w(x x0, a a0) {
        this.c0 = x0;
        super(a0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.b0 = object0;
        this.d0 |= 0x80000000;
        return this.c0.h(0L, null, this);
    }
}

