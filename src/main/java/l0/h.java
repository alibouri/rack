package L0;

import Fb.c;

public final class h extends c {
    public i b0;
    public Object c0;
    public final i d0;
    public int e0;

    public h(i i0, c c0) {
        this.d0 = i0;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.c0 = object0;
        this.e0 |= 0x80000000;
        return this.d0.b(0.0f, this);
    }
}

