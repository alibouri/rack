package R9;

import Fb.c;
import Ha.Q;
import kotlin.coroutines.g;

public final class o extends c {
    public Object b0;
    public int c0;
    public final Q d0;

    public o(Q q0, g g0) {
        this.d0 = q0;
        super(g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.b0 = object0;
        this.c0 |= 0x80000000;
        return this.d0.c(null, this);
    }
}

