package q9;

import Fb.c;

public final class f0 extends c {
    public j0 b0;
    public Object c0;
    public final j0 d0;
    public int e0;

    public f0(j0 j00, c c0) {
        this.d0 = j00;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.c0 = object0;
        this.e0 |= 0x80000000;
        return j0.a(this.d0, this);
    }
}

