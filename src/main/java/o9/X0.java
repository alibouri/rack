package o9;

import Fb.c;

public final class x0 extends c {
    public Y0 b0;
    public Object c0;
    public final Y0 d0;
    public int e0;

    public x0(Y0 y00, c c0) {
        this.d0 = y00;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.c0 = object0;
        this.e0 |= 0x80000000;
        return Y0.t(this.d0, null, null, this);
    }
}

