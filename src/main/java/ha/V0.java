package ha;

import Fb.c;

public final class v0 extends c {
    public S2 b0;
    public Object c0;
    public final S2 d0;
    public int e0;

    public v0(S2 s20, c c0) {
        this.d0 = s20;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.c0 = object0;
        this.e0 |= 0x80000000;
        return S2.o(this.d0, this);
    }
}

