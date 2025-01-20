package Z3;

import Fb.c;

public final class t extends c {
    public u b0;
    public u c0;
    public Object d0;
    public final u e0;
    public int f0;

    public t(u u0, c c0) {
        this.e0 = u0;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.d0 = object0;
        this.f0 |= 0x80000000;
        return u.c(this.e0, this);
    }
}

