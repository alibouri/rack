package z0;

import A7.b;
import Y3.o;
import androidx.compose.ui.Modifier;
import d1.c;
import g0.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class r implements m {
    public c X;
    public o Y;
    public boolean Z;
    public final b b0;

    public r() {
        this.b0 = new b(this);
    }

    @Override  // androidx.compose.ui.Modifier
    public final Modifier d(Modifier modifier0) {
        return com.apollographql.apollo.api.b.c(this, modifier0);
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

