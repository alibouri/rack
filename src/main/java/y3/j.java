package Y3;

import Fb.c;
import kotlin.coroutines.g;

public final class j extends c {
    public Object b0;
    public int c0;
    public final k d0;

    public j(k k0, g g0) {
        this.d0 = k0;
        super(g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.b0 = object0;
        this.c0 |= 0x80000000;
        return this.d0.c(null, this);
    }
}

