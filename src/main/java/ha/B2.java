package ha;

import Fb.c;

public final class b2 extends c {
    public S2 b0;
    public Object c0;
    public final S2 d0;
    public int e0;

    public b2(S2 s20, c c0) {
        this.d0 = s20;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.c0 = object0;
        this.e0 |= 0x80000000;
        return this.d0.E(this);
    }
}

