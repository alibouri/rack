package p9;

import Fb.c;
import kotlin.coroutines.g;
import o9.W0;

public final class t extends c {
    public Object b0;
    public int c0;
    public final W0 d0;

    public t(W0 w00, g g0) {
        this.d0 = w00;
        super(g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.b0 = object0;
        this.c0 |= 0x80000000;
        return this.d0.c(null, this);
    }
}

