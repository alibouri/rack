package za;

import Fb.c;

public final class u extends c {
    public Object b0;
    public final z c0;
    public int d0;

    public u(z z0, c c0) {
        this.c0 = z0;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.b0 = object0;
        this.d0 |= 0x80000000;
        return this.c0.p(null, this);
    }
}

