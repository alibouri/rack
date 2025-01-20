package da;

import Ab.t;
import Eb.a;
import Fb.j;
import V8.d;
import W5.f;
import Y8.R9;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class m extends j implements Function2 {
    public d c0;
    public int d0;
    public final q e0;

    public m(q q0, g g0) {
        this.e0 = q0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((m)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new m(this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        d d0;
        Object object1 = a.X;
        q q0 = this.e0;
        switch(this.d0) {
            case 0: {
                f.b0(object0);
                q0.Z.d("device approval required: click call support", null);
                this.d0 = 1;
                object0 = q0.d0.e(this);
                if(object0 == object1) {
                    return object1;
                }
                goto label_11;
            }
            case 1: {
                f.b0(object0);
            label_11:
                this.c0 = (d)object0;
                this.d0 = 2;
                Object object2 = q0.o(this);
                if(object2 == object1) {
                    return object1;
                }
                d0 = (d)object0;
                object0 = object2;
                break;
            }
            case 2: {
                d0 = this.c0;
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        d0.F(((String)object0));
        return t.a;
    }
}

