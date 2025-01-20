package W3;

import Fb.c;
import kotlin.coroutines.g;

public final class d extends c {
    public e b0;
    public Object c0;
    public int d0;
    public final e e0;

    public d(e e0, g g0) {
        this.e0 = e0;
        super(g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.c0 = object0;
        this.d0 |= 0x80000000;
        return this.e0.c(null, this);
    }
}

