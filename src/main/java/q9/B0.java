package q9;

import Fb.c;
import kotlin.coroutines.g;

public final class b0 extends c {
    public Object b0;
    public int c0;
    public final a0 d0;

    public b0(a0 a00, g g0) {
        this.d0 = a00;
        super(g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.b0 = object0;
        this.c0 |= 0x80000000;
        return this.d0.c(null, this);
    }
}

