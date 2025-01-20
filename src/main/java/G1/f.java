package g1;

import D0.T;
import G0.j;
import G0.s0;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class f extends s0 implements T {
    public final b Y;
    public final Function1 Z;

    public f(b b0, Function1 function10) {
        super(j.e0);
        this.Y = b0;
        this.Z = function10;
    }

    @Override  // androidx.compose.ui.Modifier
    public final Modifier d(Modifier modifier0) {
        return com.apollographql.apollo.api.b.c(this, modifier0);
    }

    @Override
    public final boolean equals(Object object0) {
        Function1 function10 = null;
        f f0 = object0 instanceof f ? ((f)object0) : null;
        if(f0 != null) {
            function10 = f0.Z;
        }
        return this.Z == function10;
    }

    @Override  // D0.T
    public final Object h() {
        return new e(this.Y, this.Z);
    }

    @Override
    public final int hashCode() {
        return this.Z.hashCode();
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

