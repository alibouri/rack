package S9;

import Fb.c;

public final class n extends c {
    public Object b0;
    public final o c0;
    public int d0;

    public n(o o0, c c0) {
        this.c0 = o0;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.b0 = object0;
        this.d0 |= 0x80000000;
        return this.c0.a(null, 0, null, null, this);
    }
}

