package oa;

import Ab.t;
import Fb.j;
import U.N0;
import W5.f;
import Xb.G;
import androidx.compose.ui.focus.FocusOwner;
import kotlin.jvm.functions.Function2;

public final class g extends j implements Function2 {
    public final FocusOwner c0;
    public final N0 d0;

    public g(FocusOwner focusOwner0, N0 n00, kotlin.coroutines.g g0) {
        this.c0 = focusOwner0;
        this.d0 = n00;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((g)this.t(((G)object0), ((kotlin.coroutines.g)object1))).v(t.a);
        return t.a;
    }

    @Override  // Fb.a
    public final kotlin.coroutines.g t(Object object0, kotlin.coroutines.g g0) {
        return new g(this.c0, this.d0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        f.b0(object0);
        if(((Boolean)this.d0.getValue()).booleanValue()) {
            this.c0.n(false);
        }
        return t.a;
    }
}

