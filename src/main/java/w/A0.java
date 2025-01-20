package w;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import com.apollographql.apollo.api.b;
import k0.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class a0 implements e {
    public final Y X;

    public a0(Y y0) {
        this.X = y0;
    }

    @Override  // k0.e
    public final void c(LayoutNodeDrawScope layoutNodeDrawScope0) {
        this.X.b(layoutNodeDrawScope0);
    }

    @Override  // androidx.compose.ui.Modifier
    public final Modifier d(Modifier modifier0) {
        return b.c(this, modifier0);
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

