package ra;

import Fb.c;

public final class o0 extends c {
    public j b0;
    public byte[] c0;
    public Object d0;
    public final t0 e0;
    public int f0;

    public o0(t0 t00, c c0) {
        this.e0 = t00;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.d0 = object0;
        this.f0 |= 0x80000000;
        return this.e0.f(this);
    }
}

