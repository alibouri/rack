package ra;

import Fb.c;
import kotlin.coroutines.g;
import p9.h0;

public final class q0 extends c {
    public Object b0;
    public int c0;
    public final h0 d0;

    public q0(h0 h00, g g0) {
        this.d0 = h00;
        super(g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.b0 = object0;
        this.c0 |= 0x80000000;
        return this.d0.c(null, this);
    }
}

