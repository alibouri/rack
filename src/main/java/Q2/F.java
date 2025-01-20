package q2;

import Ab.t;
import Fb.j;
import Xb.G;
import java.util.concurrent.Callable;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class f extends j implements Function2 {
    public final Callable c0;

    public f(Callable callable0, g g0) {
        this.c0 = callable0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((f)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new f(this.c0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        W5.f.b0(object0);
        return this.c0.call();
    }
}

