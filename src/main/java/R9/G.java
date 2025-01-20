package R9;

import Fb.c;
import Na.j;

public final class g extends c {
    public Object b0;
    public int c0;
    public final j d0;

    public g(j j0, kotlin.coroutines.g g0) {
        this.d0 = j0;
        super(g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.b0 = object0;
        this.c0 |= 0x80000000;
        return this.d0.c(null, this);
    }
}

