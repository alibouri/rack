package ma;

import Fb.c;
import kotlin.coroutines.g;

public final class d0 extends c {
    public Object b0;
    public int c0;
    public final e0 d0;

    public d0(e0 e00, g g0) {
        this.d0 = e00;
        super(g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.b0 = object0;
        this.c0 |= 0x80000000;
        return this.d0.c(null, this);
    }
}

