package K9;

import Fb.c;
import Ha.Q;
import ac.i;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.g;

public final class o extends c {
    public Object b0;
    public int c0;
    public Q d0;
    public final Q e0;
    public i f0;
    public Collection g0;
    public Iterator h0;
    public Collection i0;

    public o(Q q0, g g0) {
        this.e0 = q0;
        super(g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.b0 = object0;
        this.c0 |= 0x80000000;
        return this.e0.c(null, this);
    }
}

