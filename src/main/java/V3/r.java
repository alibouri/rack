package v3;

import Nb.j;
import W5.f;
import Xb.k;
import r3.m;

public final class r implements m {
    public final int a;
    public final k b;

    public r(k k0, int v) {
        this.a = v;
        this.b = k0;
        super();
    }

    @Override  // r3.m
    public final void a(Object object0) {
        if(this.a != 0) {
            k k0 = this.b;
            if(!k0.A()) {
                j.c(((Throwable)object0));
                k0.i(f.v(((Throwable)object0)));
            }
            return;
        }
        k k1 = this.b;
        if(!k1.A()) {
            k1.i(object0);
        }
    }
}

