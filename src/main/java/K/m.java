package K;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import Xb.J;
import Xb.Q;
import Xb.r0;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class m extends j implements Function2 {
    public int c0;
    public final r0 d0;
    public final o e0;

    public m(r0 r00, o o0, g g0) {
        this.d0 = r00;
        this.e0 = o0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((m)this.t(((G)object0), ((g)object1))).v(t.a);
        return a.X;
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new m(this.d0, this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        o o0;
        Object object1;
        try {
            object1 = a.X;
            o0 = this.e0;
            switch(this.c0) {
                case 0: {
                    goto label_4;
                }
                case 1: {
                    goto label_10;
                }
                case 2: {
                    goto label_12;
                }
                case 3: {
                    goto label_14;
                }
            }
        }
        catch(Throwable throwable0) {
            o0.b.m(0.0f);
            throw throwable0;
        }
        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
    label_4:
        f.b0(object0);
        r0 r00 = this.d0;
        if(r00 == null) {
            goto label_15;
        }
        else {
            this.c0 = 1;
            if(J.g(r00, this) == object1) {
                return object1;
            label_10:
                f.b0(object0);
                goto label_15;
                try {
                label_12:
                    f.b0(object0);
                    goto label_19;
                label_14:
                    f.b0(object0);
                    do {
                    label_15:
                        o0.b.m(1.0f);
                        this.c0 = 2;
                        if(Q.b(500L, this) == object1) {
                            return object1;
                        }
                    label_19:
                        o0.b.m(0.0f);
                        this.c0 = 3;
                    }
                    while(Q.b(500L, this) != object1);
                    return object1;
                }
                catch(Throwable throwable0) {
                }
            }
        }
        o0.b.m(0.0f);
        throw throwable0;
    }
}

