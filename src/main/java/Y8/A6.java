package Y8;

import Fb.c;
import M3.b;

public final class a6 extends c {
    public b b0;
    public Object c0;
    public final e6 d0;
    public int e0;

    public a6(e6 e60, c c0) {
        this.d0 = e60;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.c0 = object0;
        this.e0 |= 0x80000000;
        return this.d0.k(null, null, null, this);
    }
}

