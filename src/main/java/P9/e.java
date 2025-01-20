package p9;

import Fb.c;
import Y8.B4;
import Y8.R9;

public final class E extends c {
    public G b0;
    public R9 c0;
    public B4 d0;
    public int e0;
    public int f0;
    public Object g0;
    public final G h0;
    public int i0;

    public E(G g0, c c0) {
        this.h0 = g0;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.g0 = object0;
        this.i0 |= 0x80000000;
        return this.h0.o(null, null, this);
    }
}

