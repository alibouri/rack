package c8;

import Fb.c;

public final class a extends c {
    public Object b0;
    public hc.a c0;
    public Object d0;
    public final d e0;
    public int f0;

    public a(d d0, c c0) {
        this.e0 = d0;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.d0 = object0;
        this.f0 |= 0x80000000;
        return this.e0.c(this);
    }
}

