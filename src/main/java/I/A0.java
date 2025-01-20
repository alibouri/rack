package I;

import A3.e;
import B.w0;
import Bb.A;
import D0.J;
import D0.L;
import D0.M;
import D0.V;
import D0.w;
import F0.O;
import Nb.j;
import U0.I;
import a1.a;
import androidx.compose.ui.Modifier;
import com.apollographql.apollo.api.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class a0 implements w {
    public final N0 X;
    public final int Y;
    public final I Z;
    public final Function0 b0;

    public a0(N0 n00, int v, I i0, Function0 function00) {
        this.X = n00;
        this.Y = v;
        this.Z = i0;
        this.b0 = function00;
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
        V v1 = j0.a((j0.N(a.g(v)) >= a.h(v) ? a.a(v, 0, 0x7FFFFFFF, 0, 0, 13) : v));
        int v2 = Math.min(v1.X, a.h(v));
        int v3 = v1.Y;
        w0 w00 = new w0(m0, this, v1, v2, 1);
        return m0.L(v2, v3, A.X, w00);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof a0)) {
            return false;
        }
        if(!j.a(this.X, ((a0)object0).X)) {
            return false;
        }
        if(this.Y != ((a0)object0).Y) {
            return false;
        }
        return j.a(this.Z, ((a0)object0).Z) ? j.a(this.b0, ((a0)object0).b0) : false;
    }

    @Override  // D0.w
    public final int f(O o0, J j0, int v) {
        return e.g(this, o0, j0, v);
    }

    @Override  // D0.w
    public final int g(O o0, J j0, int v) {
        return e.j(this, o0, j0, v);
    }

    @Override
    public final int hashCode() {
        return this.b0.hashCode() + (this.Z.hashCode() + (this.X.hashCode() * 0x1F + this.Y) * 0x1F) * 0x1F;
    }

    @Override  // androidx.compose.ui.Modifier
    public final boolean i(Function1 function10) {
        return ((Boolean)function10.n(this)).booleanValue();
    }

    @Override  // androidx.compose.ui.Modifier
    public final Object l(Object object0, Function2 function20) {
        return function20.j(object0, this);
    }

    @Override
    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.X + ", cursorOffset=" + this.Y + ", transformedText=" + this.Z + ", textLayoutResultProvider=" + this.b0 + ')';
    }
}

