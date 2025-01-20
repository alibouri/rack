package l2;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import Xb.J;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

public final class g extends j implements Function2 {
    public int c0;
    public final CoroutineContext d0;
    public final c e0;

    public g(CoroutineContext coroutineContext0, c c0, kotlin.coroutines.g g0) {
        this.d0 = coroutineContext0;
        this.e0 = c0;
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
                CoroutineContext coroutineContext0 = this.d0;
                boolean z = Nb.j.a(coroutineContext0, kotlin.coroutines.j.X);
                c c0 = this.e0;
                if(z) {
                    this.c0 = 1;
                    c0.a(this);
                    return object1;
                }
                l2.f f0 = new l2.f(c0, null);
                this.c0 = 2;
                return J.y(coroutineContext0, f0, this) == object1 ? object1 : t.a;
            }
            case 1: 
            case 2: {
                f.b0(object0);
                return t.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

