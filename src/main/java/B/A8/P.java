package a8;

import Fb.c;

public final class p extends c {
    public Object b0;
    public Object c0;
    public final W d0;
    public int e0;

    public p(W w0, c c0) {
        this.d0 = w0;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.c0 = object0;
        this.e0 |= 0x80000000;
        return this.d0.a(null, this);
    }
}

