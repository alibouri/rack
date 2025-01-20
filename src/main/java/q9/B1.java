package q9;

import Fb.c;
import kotlin.coroutines.g;
import va.B;

public final class b1 extends c {
    public Object b0;
    public int c0;
    public final B d0;

    public b1(B b0, g g0) {
        this.d0 = b0;
        super(g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.b0 = object0;
        this.c0 |= 0x80000000;
        return this.d0.c(null, this);
    }
}

