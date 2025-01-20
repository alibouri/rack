package p9;

import Fb.c;
import ac.B0;
import java.util.concurrent.atomic.AtomicInteger;

public final class i0 extends c {
    public B0 b0;
    public AtomicInteger c0;
    public Object d0;
    public final j0 e0;
    public int f0;

    public i0(j0 j00, c c0) {
        this.e0 = j00;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.d0 = object0;
        this.f0 |= 0x80000000;
        return j0.o(this.e0, null, null, this);
    }
}

