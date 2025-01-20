package W1;

import Ab.t;
import Bb.F;
import Eb.a;
import Fb.j;
import W5.f;
import java.util.Collections;
import java.util.Map;
import kotlin.jvm.functions.Function2;

public final class g extends j implements Function2 {
    public int c0;
    public Object d0;
    public final j e0;

    public g(Function2 function20, kotlin.coroutines.g g0) {
        this.e0 = (j)function20;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((g)this.t(((b)object0), ((kotlin.coroutines.g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final kotlin.coroutines.g t(Object object0, kotlin.coroutines.g g0) {
        kotlin.coroutines.g g1 = new g(((Function2)this.e0), g0);
        g1.d0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                Map map0 = Collections.unmodifiableMap(((b)this.d0).a);
                Nb.j.e(map0, "unmodifiableMap(preferencesMap)");
                b b0 = new b(F.a0(map0), false);
                this.d0 = b0;
                this.c0 = 1;
                return ((Function2)this.e0).j(b0, this) == object1 ? object1 : b0;
            }
            case 1: {
                Object object2 = (b)this.d0;
                f.b0(object0);
                return object2;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

