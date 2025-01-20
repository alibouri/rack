package Y2;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import i3.i;
import kotlin.jvm.functions.Function2;

public final class g extends j implements Function2 {
    public int c0;
    public final m d0;
    public final i e0;

    public g(m m0, i i0, kotlin.coroutines.g g0) {
        this.d0 = m0;
        this.e0 = i0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((g)this.t(((G)object0), ((kotlin.coroutines.g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final kotlin.coroutines.g t(Object object0, kotlin.coroutines.g g0) {
        return new g(this.d0, this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                this.c0 = 1;
                object0 = m.a(this.d0, this.e0, 1, this);
                return object0 == object1 ? object1 : object0;
            }
            case 1: {
                f.b0(object0);
                return object0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

