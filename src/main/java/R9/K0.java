package R9;

import Fb.c;
import com.wave.customer.CustomerApp;
import f.b;

public final class k0 extends c {
    public CustomerApp b0;
    public String c0;
    public String d0;
    public b e0;
    public Object f0;
    public final CustomerApp g0;
    public int h0;

    public k0(CustomerApp customerApp0, c c0) {
        this.g0 = customerApp0;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.f0 = object0;
        this.h0 |= 0x80000000;
        return this.g0.s(null, null, null, null, this);
    }
}

