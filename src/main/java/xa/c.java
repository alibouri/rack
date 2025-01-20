package xa;

import Ca.v;
import kotlin.coroutines.g;

public final class c extends Fb.c {
    public Object b0;
    public final v c0;
    public int d0;

    public c(v v0, g g0) {
        this.c0 = v0;
        super(g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.b0 = object0;
        this.d0 |= 0x80000000;
        return this.c0.b(null, this);
    }
}

