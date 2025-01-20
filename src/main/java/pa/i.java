package pa;

import Ab.n;
import Eb.a;
import Fb.c;

public final class i extends c {
    public k b0;
    public Object c0;
    public final k d0;
    public int e0;

    public i(k k0, c c0) {
        this.d0 = k0;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.c0 = object0;
        this.e0 |= 0x80000000;
        Object object1 = this.d0.l0(this);
        return object1 == a.X ? object1 : new n(object1);
    }
}

