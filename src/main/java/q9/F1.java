package q9;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Zb.n;
import Zb.o;
import Zb.p;
import ac.i;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class f1 extends j implements Function2 {
    public int c0;
    public Object d0;
    public final i e0;

    public f1(i i0, g g0) {
        this.e0 = i0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((f1)this.t(new p(((p)object0).a), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new f1(this.e0, g0);
        g1.d0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                Object object2 = ((p)this.d0).a;
                if(!(object2 instanceof n)) {
                    if(object2 instanceof o) {
                        goto label_10;
                    }
                    this.c0 = 1;
                    if(this.e0.c(object2, this) == object1) {
                        return object1;
                    label_10:
                        if(object2 instanceof n) {
                            Throwable throwable0 = ((n)object2).a;
                            if(throwable0 != null) {
                                throw throwable0;
                            }
                        }
                        throw new IllegalStateException(("Trying to call \'getOrThrow\' on a failed channel result: " + object2).toString());
                    }
                }
                return t.a;
            }
            case 1: {
                f.b0(object0);
                return t.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

