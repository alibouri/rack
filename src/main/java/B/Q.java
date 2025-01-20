package B;

import A3.e;
import Bb.A;
import D0.K;
import D0.L;
import D0.M;
import D0.o;
import a1.a;
import java.util.List;

public final class q implements K {
    public final int a;
    public static final q b;
    public static final q c;

    static {
        q.b = new q(0);
        q.c = new q(1);
    }

    public q(int v) {
        this.a = v;
        super();
    }

    @Override  // D0.K
    public final int a(o o0, List list0, int v) {
        return e.e(this, o0, list0, v);
    }

    @Override  // D0.K
    public final L b(M m0, List list0, long v) {
        int v1 = 0;
        if(this.a != 0) {
            int v2 = a.f(v) ? a.h(v) : 0;
            if(a.e(v)) {
                v1 = a.g(v);
            }
            return m0.L(v2, v1, A.X, p.d0);
        }
        return m0.L(a.j(v), a.i(v), A.X, p.Y);
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

