package o9;

import Fb.c;
import kotlin.coroutines.g;
import ma.i0;

public final class k extends c {
    public Object b0;
    public int c0;
    public final i0 d0;

    public k(i0 i00, g g0) {
        this.d0 = i00;
        super(g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.b0 = object0;
        this.c0 |= 0x80000000;
        return this.d0.c(null, this);
    }
}

