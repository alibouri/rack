package Y8;

import Fb.c;
import I.w;
import kotlin.coroutines.g;

public final class b6 extends c {
    public Object b0;
    public int c0;
    public final w d0;

    public b6(w w0, g g0) {
        this.d0 = w0;
        super(g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.b0 = object0;
        this.c0 |= 0x80000000;
        return this.d0.c(null, this);
    }
}

