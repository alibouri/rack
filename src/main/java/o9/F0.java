package o9;

import Ab.t;
import Fb.j;
import W5.f;
import Xb.G;
import android.view.View;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class f0 extends j implements Function2 {
    public final g0 c0;
    public final n d0;

    public f0(g0 g00, n n0, g g0) {
        this.c0 = g00;
        this.d0 = n0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((f0)this.t(((G)object0), ((g)object1))).v(t.a);
        return t.a;
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new f0(this.c0, this.d0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        f.b0(object0);
        View view0 = this.c0.findViewById(this.d0.c0);
        if(view0 != null) {
            view0.requestFocus();
        }
        return t.a;
    }
}

