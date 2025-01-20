package g0;

import M.J;
import Nb.j;
import androidx.compose.ui.Modifier;
import com.apollographql.apollo.api.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class i implements Modifier {
    public final Modifier X;
    public final Modifier Y;

    public i(Modifier modifier0, Modifier modifier1) {
        this.X = modifier0;
        this.Y = modifier1;
    }

    @Override  // androidx.compose.ui.Modifier
    public final Modifier d(Modifier modifier0) {
        return b.c(this, modifier0);
    }

    // Deobfuscation rating: LOW(30)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof i && j.a(this.X, ((i)object0).X) && j.a(this.Y, ((i)object0).Y);
    }

    @Override
    public final int hashCode() {
        return this.Y.hashCode() * 0x1F + this.X.hashCode();
    }

    // Deobfuscation rating: LOW(20)
    @Override  // androidx.compose.ui.Modifier
    public final boolean i(Function1 function10) {
        return this.X.i(function10) && this.Y.i(function10);
    }

    @Override  // androidx.compose.ui.Modifier
    public final Object l(Object object0, Function2 function20) {
        Object object1 = this.X.l(object0, function20);
        return this.Y.l(object1, function20);
    }

    @Override
    public final String toString() {
        return J.g(new StringBuilder("["), ((String)this.l("", h.X)), ']');
    }
}

