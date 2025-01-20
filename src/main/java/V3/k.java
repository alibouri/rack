package v3;

import A3.e;
import B.l;
import Bb.A;
import D0.J;
import D0.L;
import D0.M;
import D0.V;
import F0.O;
import F0.x;
import Nb.j;
import W5.f;
import g0.n;
import io.sentry.config.a;

public final class k extends n implements x {
    public int l0;
    public int m0;

    @Override  // F0.x
    public final int a(O o0, J j0, int v) {
        return e.f(this, o0, j0, v);
    }

    @Override  // F0.x
    public final int b(O o0, J j0, int v) {
        return e.c(this, o0, j0, v);
    }

    @Override  // F0.x
    public final L e(M m0, J j0, long v) {
        long v4;
        j.f(j0, "measurable");
        long v1 = f.q(v, a.d(this.l0, this.m0));
        if(a1.a.g(v) == 0x7FFFFFFF && a1.a.h(v) != 0x7FFFFFFF) {
            int v2 = (int)(v1 >> 0x20);
            int v3 = this.m0 * v2 / this.l0;
            v4 = f.b(v2, v2, v3, v3);
        }
        else if(a1.a.h(v) != 0x7FFFFFFF || a1.a.g(v) == 0x7FFFFFFF) {
            int v7 = (int)(v1 >> 0x20);
            int v8 = (int)(v1 & 0xFFFFFFFFL);
            v4 = f.b(v7, v7, v8, v8);
        }
        else {
            int v5 = (int)(v1 & 0xFFFFFFFFL);
            int v6 = this.l0 * v5 / this.m0;
            v4 = f.b(v6, v6, v5, v5);
        }
        V v9 = j0.a(v4);
        int v10 = v9.X;
        int v11 = v9.Y;
        l l0 = new l(v9, 14);
        return m0.L(v10, v11, A.X, l0);
    }

    @Override  // F0.x
    public final int f(O o0, J j0, int v) {
        return e.i(this, o0, j0, v);
    }

    @Override  // F0.x
    public final int g(O o0, J j0, int v) {
        return e.l(this, o0, j0, v);
    }
}

