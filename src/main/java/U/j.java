package u;

import Bb.A;
import D0.J;
import D0.L;
import D0.M;
import D0.V;
import D0.w;
import F0.O;
import T0.G;
import V2.a;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.IntSize;
import com.apollographql.apollo.api.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import v.d0;
import v.e0;

public final class j implements w {
    public final e0 X;
    public final MutableState Y;
    public final k Z;

    public j(k k0, e0 e00, MutableState mutableState0) {
        this.Z = k0;
        this.X = e00;
        this.Y = mutableState0;
    }

    @Override  // D0.w
    public final int a(O o0, J j0, int v) {
        return j0.N(v);
    }

    @Override  // D0.w
    public final int b(O o0, J j0, int v) {
        return j0.b(v);
    }

    @Override  // androidx.compose.ui.Modifier
    public final Modifier d(Modifier modifier0) {
        return b.c(this, modifier0);
    }

    @Override  // D0.w
    public final L e(M m0, J j0, long v) {
        V v1 = j0.a(v);
        G g0 = new G(this.Z, 22, this);
        a a0 = new a(21, this.Z);
        d0 d00 = this.X.a(g0, a0);
        long v2 = m0.s() ? io.sentry.config.a.d(v1.X, v1.Y) : ((IntSize)d00.getValue()).a;
        i i0 = new i(this.Z, v1, v2);
        return m0.L(((int)(v2 >> 0x20)), ((int)(0xFFFFFFFFL & v2)), A.X, i0);
    }

    @Override  // D0.w
    public final int f(O o0, J j0, int v) {
        return j0.O(v);
    }

    @Override  // D0.w
    public final int g(O o0, J j0, int v) {
        return j0.H(v);
    }

    @Override  // androidx.compose.ui.Modifier
    public final boolean i(Function1 function10) {
        return ((Boolean)function10.n(this)).booleanValue();
    }

    @Override  // androidx.compose.ui.Modifier
    public final Object l(Object object0, Function2 function20) {
        return function20.j(object0, this);
    }
}

