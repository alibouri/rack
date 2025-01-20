package ha;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import Xb.Q;
import a9.k6;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class r1 extends j implements Function2 {
    public int c0;
    public final k6 d0;
    public final S2 e0;

    public r1(k6 k60, S2 s20, g g0) {
        this.d0 = k60;
        this.e0 = s20;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((r1)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new r1(this.d0, this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                k6 k60 = this.d0;
                if(k60 != null) {
                    long v = k60.c.getTime() - System.currentTimeMillis();
                    if(v > 0L) {
                        this.c0 = 1;
                        if(Q.b(v, this) == object1) {
                            return object1;
                        }
                    }
                    goto label_14;
                }
                break;
            }
            case 1: {
                f.b0(object0);
            label_14:
                this.e0.i0.d("device approval request expired", null);
                this.c0 = 2;
                if(this.e0.V0.c(null, this) == object1) {
                    return object1;
                }
                break;
            }
            case 2: {
                f.b0(object0);
                return t.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return t.a;
    }
}

