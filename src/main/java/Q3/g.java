package Q3;

import Ab.t;
import Eb.a;
import Fb.j;
import U3.c;
import W5.f;
import Xb.G;
import kotlin.jvm.functions.Function2;

public final class g extends j implements Function2 {
    public int c0;
    public final h d0;

    public g(h h0, kotlin.coroutines.g g0) {
        this.d0 = h0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((g)this.t(((G)object0), ((kotlin.coroutines.g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final kotlin.coroutines.g t(Object object0, kotlin.coroutines.g g0) {
        return new g(this.d0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                try {
                    this.c0 = 1;
                    if(this.d0.n(this) == object1) {
                        return object1;
                    }
                }
                catch(Throwable throwable0) {
                    c.a.n(new Exception("An exception occurred while writing to the cache asynchronously", throwable0));
                }
                return t.a;
            }
            case 1: {
                try {
                    f.b0(object0);
                }
                catch(Throwable throwable0) {
                    c.a.n(new Exception("An exception occurred while writing to the cache asynchronously", throwable0));
                }
                return t.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

