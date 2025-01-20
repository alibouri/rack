package ha;

import Fb.c;

public final class n1 extends c {
    public Object b0;
    public Object c0;
    public Object d0;
    public Object e0;
    public final S2 f0;
    public int g0;

    public n1(S2 s20, c c0) {
        this.f0 = s20;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.e0 = object0;
        this.g0 |= 0x80000000;
        return S2.q(this.f0, null, null, this);
    }
}

