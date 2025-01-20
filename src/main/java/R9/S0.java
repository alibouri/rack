package R9;

import Ab.t;
import Fb.j;
import W5.f;
import Xb.G;
import hb.n;
import io.sentry.i1;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class s0 extends j implements Function2 {
    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((s0)this.t(((G)object0), ((g)object1))).v(t.a);
        return t.a;
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new s0(2, g0);  // initializer: LFb/j;-><init>(ILkotlin/coroutines/g;)V
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        f.b0(object0);
        n.d("Was asked to open a sharesheet but there was no text to share", i1.INFO, null, false, 12);
        return t.a;
    }
}

