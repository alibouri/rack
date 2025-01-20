package z0;

import Fb.a;
import Fb.c;
import Xb.I0;

public final class u extends c {
    public I0 b0;
    public Object c0;
    public final x d0;
    public int e0;

    public u(x x0, a a0) {
        this.d0 = x0;
        super(a0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.c0 = object0;
        this.e0 |= 0x80000000;
        return this.d0.g(0L, null, this);
    }
}

