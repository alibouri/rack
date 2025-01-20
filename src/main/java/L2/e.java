package l2;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import Xb.J;
import ac.o0;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class e extends j implements Function2 {
    public int c0;
    public final CoroutineContext d0;
    public final c e0;

    public e(CoroutineContext coroutineContext0, c c0, g g0) {
        this.d0 = coroutineContext0;
        this.e0 = c0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((e)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new e(this.d0, this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        Object object2 = t.a;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                CoroutineContext coroutineContext0 = this.d0;
                boolean z = Nb.j.a(coroutineContext0, kotlin.coroutines.j.X);
                c c0 = this.e0;
                if(z) {
                    this.c0 = 1;
                    c0.getClass();
                    l2.a a0 = new l2.a(c0, null);
                    Object object3 = o0.h(c0.a, a0, this);
                    if(object3 != object1) {
                        object3 = object2;
                    }
                    return object3 == object1 ? object1 : object2;
                }
                d d0 = new d(c0, null);
                this.c0 = 2;
                return J.y(coroutineContext0, d0, this) == object1 ? object1 : object2;
            }
            case 1: 
            case 2: {
                f.b0(object0);
                return object2;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

