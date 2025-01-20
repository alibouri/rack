package ha;

import Fb.c;
import kotlin.coroutines.g;

public final class n2 extends c {
    public Object b0;
    public int c0;
    public final p1 d0;

    public n2(p1 p10, g g0) {
        this.d0 = p10;
        super(g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.b0 = object0;
        this.c0 |= 0x80000000;
        return this.d0.c(null, this);
    }
}

