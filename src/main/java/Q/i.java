package Q;

import Fb.c;

public final class i extends c {
    public p b0;
    public Object c0;
    public final p d0;
    public int e0;

    public i(p p0, c c0) {
        this.d0 = p0;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.c0 = object0;
        this.e0 |= 0x80000000;
        return this.d0.a(this);
    }
}

