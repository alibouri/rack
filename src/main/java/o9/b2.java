package o9;

import Ab.t;
import Bb.F;
import Eb.a;
import Fb.j;
import W5.f;
import Y8.R9;
import Y8.W8;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class b2 extends j implements Function2 {
    public String c0;
    public int d0;
    public final s2 e0;

    public b2(s2 s20, g g0) {
        this.e0 = s20;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((b2)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new b2(this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        String s1;
        Object object1 = a.X;
        Object object2 = t.a;
        s2 s20 = this.e0;
        switch(this.d0) {
            case 0: {
                f.b0(object0);
                t9.a a0 = (t9.a)s20.K0.a(s2.N0[4], s20);
                this.d0 = 1;
                object0 = F.N(s20.j0, a0, this);
                if(object0 == object1) {
                    return object1;
                }
                goto label_12;
            }
            case 1: {
                f.b0(object0);
            label_12:
                if(((Boolean)object0).booleanValue()) {
                    s20.g();
                    return object2;
                }
                W8 w80 = s20.H0;
                String s = w80 == null ? s20.p().j0 : w80.b;
                R2.f.u(s20.b0, s9.a.f0, true);
                this.c0 = s;
                this.d0 = 2;
                Object object3 = s20.j0.e(this);
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
        ((P1)object0).F(s1);
        s20.g();
        return object2;
    }
}

