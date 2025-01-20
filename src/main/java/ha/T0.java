package ha;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import wa.h;

public final class t0 extends j implements Function2 {
    public int c0;
    public Object d0;
    public final S2 e0;

    public t0(S2 s20, g g0) {
        this.e0 = s20;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((t0)this.t(((h)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new t0(this.e0, g0);
        g1.d0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                h h0 = (h)this.d0;
                S2 s20 = this.e0;
                if(h0 instanceof wa.f && ((wa.f)h0).g) {
                    this.c0 = 1;
                    object0 = s20.r0.e(this);
                    if(object0 != object1) {
                        ((w)object0).H(1.0f);
                        ((w)object0).k(true);
                        return t.a;
                    }
                    return object1;
                }
                this.c0 = 2;
                object0 = s20.r0.e(this);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                f.b0(object0);
                ((w)object0).H(1.0f);
                ((w)object0).k(true);
                return t.a;
            }
            case 2: {
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ((w)object0).H(-1.0f);
        ((w)object0).k(false);
        return t.a;
    }
}

