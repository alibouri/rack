package K9;

import Aa.s0;
import Fb.c;
import kotlin.coroutines.g;

public final class b0 extends c {
    public Object b0;
    public int c0;
    public final s0 d0;

    public b0(s0 s00, g g0) {
        this.d0 = s00;
        super(g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.b0 = object0;
        this.c0 |= 0x80000000;
        return this.d0.c(null, this);
    }
}

