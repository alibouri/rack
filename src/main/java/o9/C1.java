package o9;

import Fb.c;
import java.util.concurrent.atomic.AtomicInteger;

public final class c1 extends c {
    public g1 b0;
    public Object c0;
    public Object d0;
    public Object e0;
    public AtomicInteger f0;
    public Object g0;
    public final g1 h0;
    public int i0;

    public c1(g1 g10, c c0) {
        this.h0 = g10;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.g0 = object0;
        this.i0 |= 0x80000000;
        return g1.y(this.h0, null, this);
    }
}

