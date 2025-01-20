package k2;

import Fb.c;
import ha.D2;
import kotlin.coroutines.g;

public final class n extends c {
    public Object b0;
    public int c0;
    public final D2 d0;

    public n(D2 d20, g g0) {
        this.d0 = d20;
        super(g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.b0 = object0;
        this.c0 |= 0x80000000;
        return this.d0.c(null, this);
    }
}

