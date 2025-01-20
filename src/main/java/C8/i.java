package c8;

import Fb.c;

public final class i extends c {
    public j b0;
    public Object c0;
    public final j d0;
    public int e0;

    public i(j j0, c c0) {
        this.d0 = j0;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.c0 = object0;
        this.e0 |= 0x80000000;
        return this.d0.b(this);
    }
}

