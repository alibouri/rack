package w;

import Fb.c;

public final class k extends c {
    public n b0;
    public long c0;
    public Object d0;
    public final n e0;
    public int f0;

    public k(n n0, c c0) {
        this.e0 = n0;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.d0 = object0;
        this.f0 |= 0x80000000;
        return this.e0.f(0L, null, this);
    }
}

