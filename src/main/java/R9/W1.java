package R9;

import Fb.c;

public final class w1 extends c {
    public x1 b0;
    public String c0;
    public Object d0;
    public final x1 e0;
    public int f0;

    public w1(x1 x10, c c0) {
        this.e0 = x10;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.d0 = object0;
        this.f0 |= 0x80000000;
        return this.e0.c(0, null, null, this);
    }
}

