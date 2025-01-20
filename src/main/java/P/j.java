package P;

import Fb.c;

public final class j extends c {
    public Object b0;
    public final k c0;
    public int d0;

    public j(k k0, c c0) {
        this.c0 = k0;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.b0 = object0;
        this.d0 |= 0x80000000;
        return this.c0.B(0L, this);
    }
}

