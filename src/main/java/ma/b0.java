package ma;

import Fb.c;

public final class b0 extends c {
    public q0 b0;
    public Object c0;
    public final q0 d0;
    public int e0;

    public b0(q0 q00, c c0) {
        this.d0 = q00;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.c0 = object0;
        this.e0 |= 0x80000000;
        return q0.p(this.d0, this);
    }
}

