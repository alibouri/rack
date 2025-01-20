package da;

import Fb.c;

public final class o extends c {
    public String b0;
    public String c0;
    public Object d0;
    public final q e0;
    public int f0;

    public o(q q0, c c0) {
        this.e0 = q0;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.d0 = object0;
        this.f0 |= 0x80000000;
        return this.e0.p(null, null, this);
    }
}

