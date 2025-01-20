package o9;

import Fb.c;
import kotlin.coroutines.g;

public final class o0 extends c {
    public Object b0;
    public int c0;
    public final p d0;

    public o0(p p0, g g0) {
        this.d0 = p0;
        super(g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.b0 = object0;
        this.c0 |= 0x80000000;
        return this.d0.c(null, this);
    }
}

