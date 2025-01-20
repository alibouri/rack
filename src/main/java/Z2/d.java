package Z2;

import A3.e;
import Bb.A;
import D0.K;
import D0.L;
import D0.M;
import D0.o;
import a1.a;
import java.util.List;

public final class d implements K {
    public final int a;
    public static final d b;
    public static final d c;

    static {
        d.b = new d(0);
        d.c = new d(1);
    }

    public d(int v) {
        this.a = v;
        super();
    }

    @Override  // D0.K
    public final int a(o o0, List list0, int v) {
        return e.e(this, o0, list0, v);
    }

    @Override  // D0.K
    public final L b(M m0, List list0, long v) {
        if(this.a != 0) {
            T3.d d0 = new T3.d(9);
            return m0.L(a.j(v), a.i(v), A.X, d0);
        }
        T3.d d1 = new T3.d(9);
        return m0.L(a.j(v), a.i(v), A.X, d1);
    }

    @Override  // D0.K
    public final int c(o o0, List list0, int v) {
        return e.h(this, o0, list0, v);
    }

    @Override  // D0.K
    public final int d(o o0, List list0, int v) {
        return e.k(this, o0, list0, v);
    }

    @Override  // D0.K
    public final int e(o o0, List list0, int v) {
        return e.b(this, o0, list0, v);
    }
}

