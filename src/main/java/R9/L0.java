package R9;

import Fb.c;
import R2.m;

public final class l0 extends c {
    public Object b0;
    public final m c0;
    public int d0;

    public l0(m m0, c c0) {
        this.c0 = m0;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.b0 = object0;
        this.d0 |= 0x80000000;
        return this.c0.i(this);
    }
}

