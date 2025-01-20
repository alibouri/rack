package pa;

import Ab.n;
import Eb.a;
import Fb.c;

public final class h extends c {
    public Object b0;
    public final k c0;
    public int d0;

    public h(k k0, c c0) {
        this.c0 = k0;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.b0 = object0;
        this.d0 |= 0x80000000;
        Object object1 = this.c0.L(false, this);
        return object1 == a.X ? object1 : new n(object1);
    }
}

