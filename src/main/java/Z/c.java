package Z;

import A0.b;
import Bb.h;
import a0.a;

public class c extends h {
    public final m X;
    public final int Y;
    public static final c Z;

    static {
        c.Z = new c(m.e, 0);
    }

    public c(m m0, int v) {
        this.X = m0;
        this.Y = v;
    }

    public final c a(Object object0, a a0) {
        b b0 = this.X.u((object0 == null ? 0 : object0.hashCode()), 0, object0, a0);
        return b0 == null ? this : new c(((m)b0.Y), this.Y + b0.X);
    }

    @Override
    public boolean containsKey(Object object0) {
        return object0 == null ? this.X.d(0, 0, null) : this.X.d(object0.hashCode(), 0, object0);
    }

    @Override
    public Object get(Object object0) {
        return object0 == null ? this.X.g(0, 0, null) : this.X.g(object0.hashCode(), 0, object0);
    }
}

