package d3;

import Fb.c;

public final class i extends c {
    public j b0;
    public h c0;
    public Object d0;
    public final j e0;
    public int f0;

    public i(j j0, c c0) {
        this.e0 = j0;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.d0 = object0;
        this.f0 |= 0x80000000;
        return this.e0.b(null, this);
    }
}

