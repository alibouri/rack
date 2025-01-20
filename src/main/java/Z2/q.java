package Z2;

import A3.e;
import D0.J;
import D0.L;
import D0.M;
import D0.V;
import D0.w;
import Ea.h0;
import F0.O;
import Qa.T;
import Y2.j;
import a1.a;
import ac.B0;
import ac.o0;
import androidx.compose.ui.Modifier;
import com.apollographql.apollo.api.b;
import j3.i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class q implements w, i {
    public final B0 X;

    public q() {
        this.X = o0.c(new a(A.a));
    }

    @Override  // D0.w
    public final int a(O o0, J j0, int v) {
        return e.d(this, o0, j0, v);
    }

    @Override  // D0.w
    public final int b(O o0, J j0, int v) {
        return e.a(this, o0, j0, v);
    }

    @Override  // androidx.compose.ui.Modifier
    public final Modifier d(Modifier modifier0) {
        return b.c(this, modifier0);
    }

    @Override  // D0.w
    public final L e(M m0, J j0, long v) {
        a a0 = new a(v);
        this.X.getClass();
        this.X.l(null, a0);
        V v1 = j0.a(v);
        int v2 = v1.X;
        int v3 = v1.Y;
        h0 h00 = new h0(v1, 1);
        return m0.L(v2, v3, Bb.A.X, h00);
    }

    @Override  // D0.w
    public final int f(O o0, J j0, int v) {
        return e.g(this, o0, j0, v);
    }

    @Override  // D0.w
    public final int g(O o0, J j0, int v) {
        return e.j(this, o0, j0, v);
    }

    @Override  // androidx.compose.ui.Modifier
    public final boolean i(Function1 function10) {
        return ((Boolean)function10.n(this)).booleanValue();
    }

    @Override  // j3.i
    public final Object k(j j0) {
        return o0.s(new T(this.X, 8), j0);
    }

    @Override  // androidx.compose.ui.Modifier
    public final Object l(Object object0, Function2 function20) {
        return function20.j(object0, this);
    }
}

