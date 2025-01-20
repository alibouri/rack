package Y3;

import Fb.c;

public final class r extends c {
    public q b0;
    public Object c0;
    public final s d0;
    public int e0;

    public r(s s0, c c0) {
        this.d0 = s0;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.c0 = object0;
        this.e0 |= 0x80000000;
        return this.d0.K(null, this);
    }
}

