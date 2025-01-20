package q9;

import Fb.c;

public final class i3 extends c {
    public Object b0;
    public final j3 c0;
    public int d0;

    public i3(j3 j30, c c0) {
        this.c0 = j30;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.b0 = object0;
        this.d0 |= 0x80000000;
        return j3.k0(this.c0, 0, null, null, this);
    }
}

