package Q3;

import Fb.c;
import java.util.Set;

public final class o extends c {
    public Set b0;
    public Object c0;
    public final q d0;
    public int e0;

    public o(q q0, c c0) {
        this.d0 = q0;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.c0 = object0;
        this.e0 |= 0x80000000;
        return this.d0.e(null, null, null, null, null, false, this);
    }
}

