package R9;

import Fb.c;
import ac.B0;
import com.wave.customer.CustomerApp;
import java.util.concurrent.atomic.AtomicInteger;

public final class h0 extends c {
    public CustomerApp b0;
    public Object c0;
    public B0 d0;
    public AtomicInteger e0;
    public Object f0;
    public final CustomerApp g0;
    public int h0;

    public h0(CustomerApp customerApp0, c c0) {
        this.g0 = customerApp0;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.f0 = object0;
        this.h0 |= 0x80000000;
        return this.g0.l(null, null, this);
    }
}

