package ha;

import Fb.c;

public final class g2 extends c {
    public Object b0;
    public Object c0;
    public Object d0;
    public Object e0;
    public Class f0;
    public Object g0;
    public final S2 h0;
    public int i0;

    public g2(S2 s20, c c0) {
        this.h0 = s20;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.g0 = object0;
        this.i0 |= 0x80000000;
        return S2.w(this.h0, null, null, this);
    }
}

