package R9;

import Ab.t;
import Bb.F;
import Eb.a;
import Fb.j;
import V8.d;
import W5.f;
import Y8.R9;
import Y8.V8;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class u3 extends j implements Function2 {
    public String c0;
    public int d0;
    public final y3 e0;

    public u3(y3 y30, g g0) {
        this.e0 = y30;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((u3)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new u3(this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        String s1;
        Object object1 = a.X;
        Object object2 = t.a;
        y3 y30 = this.e0;
        switch(this.d0) {
            case 0: {
                f.b0(object0);
                t9.a a0 = (t9.a)y30.p0.a(y3.s0[0], y30);
                this.d0 = 1;
                object0 = F.N(y30.g0, a0, this);
                if(object0 == object1) {
                    return object1;
                }
                goto label_12;
            }
            case 1: {
                f.b0(object0);
            label_12:
                if(((Boolean)object0).booleanValue()) {
                    y30.g();
                    return object2;
                }
                V8 v80 = (V8)y30.m0.getValue();
                String s = v80 == null ? y30.c0.j0 : v80.a.b;
                R2.f.u(y30.d0, s9.a.d0, true);
                this.c0 = s;
                this.d0 = 2;
                Object object3 = y30.g0.e(this);
                if(object3 == object1) {
                    return object1;
                }
                s1 = s;
                object0 = object3;
                break;
            }
            case 2: {
                s1 = this.c0;
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ((d)object0).F(s1);
        y30.g();
        return object2;
    }
}

