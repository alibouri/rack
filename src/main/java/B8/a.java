package b8;

import Fb.c;

public final class a extends c {
    public Object b0;
    public final b c0;
    public int d0;

    public a(b b0, c c0) {
        this.c0 = b0;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.b0 = object0;
        this.d0 |= 0x80000000;
        return this.c0.a(this);
    }
}

