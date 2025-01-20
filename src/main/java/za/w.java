package za;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Y8.R9;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class w extends j implements Function2 {
    public String c0;
    public int d0;
    public final z e0;

    public w(z z0, g g0) {
        this.e0 = z0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((w)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new w(this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        String s;
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
                s = p0.b;
                if(s == null) {
                    return object2;
                }
                z0.Z.d("ussd security challenge: open dialer with ussd code", null);
                z0.e0.a("opening dialer with ussd code", new Object[0]);
                this.c0 = s;
                this.d0 = 1;
                object0 = z0.d0.e(this);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                s = this.c0;
                f.b0(object0);
                break;
            }
            case 2: {
                f.b0(object0);
                return object2;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ((d)object0).q(s);
        this.c0 = null;
        this.d0 = 2;
        return z0.r(this) == object1 ? object1 : object2;
    }
}

