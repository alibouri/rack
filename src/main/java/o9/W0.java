package o9;

import Fb.c;

public final class w0 extends c {
    public Y0 b0;
    public Object c0;
    public final Y0 d0;
    public int e0;

    public w0(Y0 y00, c c0) {
        this.d0 = y00;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.c0 = object0;
        this.e0 |= 0x80000000;
        return Y0.s(this.d0, null, null, this);
    }
}

