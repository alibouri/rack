package za;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Y8.R9;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class x extends j implements Function2 {
    public p c0;
    public int d0;
    public final z e0;

    public x(z z0, g g0) {
        this.e0 = z0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((x)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new x(this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        p p1;
        Object object1 = a.X;
        Object object2 = t.a;
        z z0 = this.e0;
        switch(this.d0) {
            case 0: {
                f.b0(object0);
                p p0 = z0.q();
                if(p0 == null) {
                    return object2;
                }
                this.c0 = p0;
                this.d0 = 1;
                Object object3 = z0.o(this);
                if(object3 == object1) {
                    return object1;
                }
                p1 = p0;
                object0 = object3;
                goto label_21;
            }
            case 1: {
                p1 = this.c0;
                f.b0(object0);
            label_21:
                if(((Boolean)object0).booleanValue()) {
                    return object2;
                }
                this.c0 = p1;
                this.d0 = 2;
                object0 = z0.d0.e(this);
                if(object0 == object1) {
                    return object1;
                }
                ((d)object0).q(p1.b);
                this.c0 = null;
                this.d0 = 3;
                return z0.r(this) == object1 ? object1 : object2;
            }
            case 2: {
                break;
            }
            case 3: {
                f.b0(object0);
                return object2;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        p1 = this.c0;
        f.b0(object0);
        ((d)object0).q(p1.b);
        this.c0 = null;
        this.d0 = 3;
        return z0.r(this) == object1 ? object1 : object2;
    }
}

