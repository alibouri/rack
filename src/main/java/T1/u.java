package T1;

import Fb.c;
import Xb.q;

public final class u extends c {
    public Object b0;
    public F c0;
    public q d0;
    public Object e0;
    public final F f0;
    public int g0;

    public u(F f0, c c0) {
        this.f0 = f0;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.e0 = object0;
        this.g0 |= 0x80000000;
        return F.c(this.f0, null, this);
    }
}

