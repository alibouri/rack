package q2;

import Ab.t;
import Fb.j;
import W5.f;
import Xb.G;
import Xb.k;
import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function2;

public final class g extends j implements Function2 {
    public final Callable c0;
    public final k d0;

    public g(Callable callable0, k k0, kotlin.coroutines.g g0) {
        this.c0 = callable0;
        this.d0 = k0;
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
        k k0 = this.d0;
        f.b0(object0);
        try {
            k0.i(this.c0.call());
        }
        catch(Throwable throwable0) {
            k0.i(f.v(throwable0));
        }
        return t.a;
    }
}

