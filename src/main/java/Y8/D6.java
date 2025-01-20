package Y8;

import Fb.c;

public final class d6 extends c {
    public e6 b0;
    public String c0;
    public String d0;
    public String e0;
    public Object f0;
    public final e6 g0;
    public int h0;

    public d6(e6 e60, c c0) {
        this.g0 = e60;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.f0 = object0;
        this.h0 |= 0x80000000;
        return this.g0.m(null, null, this);
    }
}

