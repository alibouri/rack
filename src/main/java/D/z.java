package D;

import Ab.t;
import C.w;
import Fb.j;
import W5.f;
import androidx.compose.ui.node.LayoutNode;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import y.w0;

public final class z extends j implements Function2 {
    public final A c0;
    public final int d0;
    public final int e0;

    public z(A a0, int v, int v1, g g0) {
        this.c0 = a0;
        this.d0 = v;
        this.e0 = v1;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((z)this.t(((w0)object0), ((g)object1))).v(t.a);
        return t.a;
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new z(this.c0, this.d0, this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        f.b0(object0);
        A a0 = this.c0;
        w w0 = a0.b;
        int v = w0.b.k();
        int v1 = this.d0;
        int v2 = this.e0;
        if(v != v1 || w0.c.k() != v2) {
            a0.k.f();
        }
        w0.a(v1, v2);
        w0.e = null;
        LayoutNode layoutNode0 = a0.h;
        if(layoutNode0 != null) {
            layoutNode0.k();
        }
        return t.a;
    }
}

