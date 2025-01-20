package c8;

import Fb.c;

public final class l extends c {
    public Object b0;
    public final n c0;
    public int d0;

    public l(n n0, c c0) {
        this.c0 = n0;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.b0 = object0;
        this.d0 |= 0x80000000;
        return this.c0.c(null, null, this);
    }
}

