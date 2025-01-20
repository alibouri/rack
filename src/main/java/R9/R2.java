package R9;

import Ab.t;
import Eb.a;
import Fb.j;
import V8.d;
import W5.f;
import Y8.R9;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class r2 extends j implements Function2 {
    public int c0;
    public final u2 d0;
    public final String e0;
    public final a0 f0;

    public r2(u2 u20, String s, a0 a00, g g0) {
        this.d0 = u20;
        this.e0 = s;
        this.f0 = a00;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((r2)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new r2(this.d0, this.e0, this.f0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        String s = this.e0;
        u2 u20 = this.d0;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                this.c0 = 1;
                object0 = u20.d0.e(this);
                if(object0 == object1) {
                    return object1;
                }
                goto label_11;
            }
            case 1: {
                f.b0(object0);
            label_11:
                this.c0 = 2;
                object0 = w2.f(((d)object0), s, u20.Z.X, 0x7F1201B1, this);  // string:go_back "Go back"
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 2: {
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Object object2 = t.a;
        if(((Boolean)object0).booleanValue()) {
            u20.e0.a();
            return object2;
        }
        B9.d d0 = u20.b0;
        if(d0 != null) {
            d0.j(((u2)this.f0.c).Z.X, s);
        }
        return object2;
    }
}

