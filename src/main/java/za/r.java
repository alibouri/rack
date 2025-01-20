package za;

import Fb.c;

public final class r extends c {
    public z b0;
    public p c0;
    public Object d0;
    public final z e0;
    public int f0;

    public r(z z0, c c0) {
        this.e0 = z0;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.d0 = object0;
        this.f0 |= 0x80000000;
        return this.e0.o(this);
    }
}

