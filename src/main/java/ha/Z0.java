package ha;

import Fb.c;

public final class z0 extends c {
    public S2 b0;
    public V8.c c0;
    public boolean d0;
    public Object e0;
    public final S2 f0;
    public int g0;

    public z0(S2 s20, c c0) {
        this.f0 = s20;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.e0 = object0;
        this.g0 |= 0x80000000;
        return this.f0.z(false, this);
    }
}

