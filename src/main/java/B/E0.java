package B;

import Bb.A;
import D0.J;
import D0.L;
import D0.M;
import D0.V;
import D0.w;
import E0.c;
import E0.e;
import E0.g;
import F0.O;
import Nb.j;
import U.Z;
import U.d;
import W5.f;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.Modifier;
import com.apollographql.apollo.api.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class e0 implements w, c, e {
    public final F0 X;
    public final ParcelableSnapshotMutableState Y;
    public final ParcelableSnapshotMutableState Z;

    public e0(F0 f00) {
        this.X = f00;
        this.Y = d.D(f00, Z.e);
        this.Z = d.D(f00, Z.e);
    }

    @Override  // D0.w
    public final int a(O o0, J j0, int v) {
        return A3.e.d(this, o0, j0, v);
    }

    @Override  // D0.w
    public final int b(O o0, J j0, int v) {
        return A3.e.a(this, o0, j0, v);
    }

    @Override  // androidx.compose.ui.Modifier
    public final Modifier d(Modifier modifier0) {
        return b.c(this, modifier0);
    }

    @Override  // D0.w
    public final L e(M m0, J j0, long v) {
        int v1 = ((F0)this.Y.getValue()).d(m0, m0.getLayoutDirection());
        int v2 = ((F0)this.Y.getValue()).a(m0);
        int v3 = ((F0)this.Y.getValue()).c(m0, m0.getLayoutDirection()) + v1;
        int v4 = ((F0)this.Y.getValue()).b(m0) + v2;
        V v5 = j0.a(f.K(-v3, v, -v4));
        int v6 = f.t(v5.X + v3, v);
        int v7 = f.s(v5.Y + v4, v);
        d0 d00 = new d0(v5, v1, v2, 0);
        return m0.L(v6, v7, A.X, d00);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof e0 ? j.a(((e0)object0).X, this.X) : false;
    }

    @Override  // D0.w
    public final int f(O o0, J j0, int v) {
        return A3.e.g(this, o0, j0, v);
    }

    @Override  // D0.w
    public final int g(O o0, J j0, int v) {
        return A3.e.j(this, o0, j0, v);
    }

    @Override  // E0.e
    public final g getKey() {
        return K0.a;
    }

    @Override  // E0.e
    public final Object getValue() {
        return (F0)this.Z.getValue();
    }

    @Override
    public final int hashCode() {
        return this.X.hashCode();
    }

    @Override  // androidx.compose.ui.Modifier
    public final boolean i(Function1 function10) {
        return ((Boolean)function10.n(this)).booleanValue();
    }

    @Override  // E0.c
    public final void j(E0.f f0) {
        F0 f00 = (F0)f0.X(K0.a);
        G g0 = new G(this.X, f00);
        this.Y.setValue(g0);
        B0 b00 = new B0(f00, this.X);
        this.Z.setValue(b00);
    }

    @Override  // androidx.compose.ui.Modifier
    public final Object l(Object object0, Function2 function20) {
        return function20.j(object0, this);
    }
}

