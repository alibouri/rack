package y;

import Fb.c;

public final class r0 extends c {
    public t0 b0;
    public Object c0;
    public final t0 d0;
    public int e0;

    public r0(t0 t00, c c0) {
        this.d0 = t00;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.c0 = object0;
        this.e0 |= 0x80000000;
        return this.d0.a(this);
    }
}

