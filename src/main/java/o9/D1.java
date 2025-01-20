package o9;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Y8.R9;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class d1 extends j implements Function2 {
    public c c0;
    public int d0;
    public Object e0;
    public final g1 f0;

    public d1(g1 g10, g g0) {
        this.f0 = g10;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((d1)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new d1(this.f0, g0);
        g1.e0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        R9 r92;
        R9 r91;
        c c0;
        Object object1 = a.X;
        Object object2 = t.a;
        g1 g10 = this.f0;
        switch(this.d0) {
            case 0: {
                f.b0(object0);
                R9 r90 = (R9)this.e0;
                g10.getClass();
                c0 = (c)g10.S0.a(g1.U0[2], g10);
                if(c0 == null) {
                    return object2;
                }
                try {
                    this.e0 = r90;
                    this.c0 = c0;
                    this.d0 = 1;
                    Object object3 = g10.l0.e(this);
                    if(object3 == object1) {
                        return object1;
                    }
                    r91 = r90;
                    object0 = object3;
                    goto label_25;
                }
                catch(N1 unused_ex) {
                    break;
                }
            }
            case 1: {
                c0 = this.c0;
                r91 = (R9)this.e0;
                try {
                    f.b0(object0);
                label_25:
                    this.e0 = r91;
                    this.c0 = null;
                    this.d0 = 2;
                    if(((b0)object0).e0(c0, this) == object1) {
                        return object1;
                    }
                    r92 = r91;
                    goto label_34;
                }
                catch(N1 unused_ex) {
                    break;
                }
            }
            case 2: {
                r92 = (R9)this.e0;
                try {
                    f.b0(object0);
                label_34:
                    this.e0 = null;
                    this.d0 = 3;
                    if(g1.y(g10, r92, this) == object1) {
                        return object1;
                    }
                }
                catch(N1 unused_ex) {
                }
                break;
            }
            case 3: {
                try {
                    f.b0(object0);
                    return object2;
                }
                catch(N1 unused_ex) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return object2;
    }
}

