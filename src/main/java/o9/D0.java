package o9;

import Fb.c;

public final class d0 extends c {
    public Object b0;
    public final e0 c0;
    public int d0;

    public d0(e0 e00, c c0) {
        this.c0 = e00;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.b0 = object0;
        this.d0 |= 0x80000000;
        return this.c0.e0(null, this);
    }
}

