package O2;

import I2.g;
import Nb.j;
import P2.f;
import R2.p;
import Zb.a;

public abstract class c implements e {
    public final f a;

    public c(f f0) {
        j.f(f0, "tracker");
        super();
        this.a = f0;
    }

    @Override  // O2.e
    public final ac.c a(g g0) {
        j.f(g0, "constraints");
        return new ac.c(new b(this, null), kotlin.coroutines.j.X, -2, a.X);
    }

    // Deobfuscation rating: LOW(20)
    @Override  // O2.e
    public final boolean b(p p0) {
        return this.c(p0) && this.e(this.a.a());
    }

    public abstract int d();

    public abstract boolean e(Object arg1);
}

