package R9;

import Fb.c;
import ac.h0;
import java.util.concurrent.atomic.AtomicInteger;

public final class b3 extends c {
    public Object b0;
    public Object c0;
    public Object d0;
    public Object e0;
    public Object f0;
    public h0 g0;
    public AtomicInteger h0;
    public Object i0;
    public final e3 j0;
    public int k0;

    public b3(e3 e30, c c0) {
        this.j0 = e30;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.i0 = object0;
        this.k0 |= 0x80000000;
        return e3.o(this.j0, null, this);
    }
}

