package ha;

import Ab.t;
import Eb.a;
import Fb.j;
import R9.F2;
import W5.f;
import Y8.R9;
import a5.w;
import a9.T7;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class b1 extends j implements Function2 {
    public int c0;
    public final S2 d0;
    public final T7 e0;

    public b1(S2 s20, T7 t70, g g0) {
        this.d0 = s20;
        this.e0 = t70;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((b1)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new b1(this.d0, this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                F2 f20 = new F2(16, this.d0);
                this.c0 = 1;
                return w.a0(this.d0.r0, this.e0, this.d0.i0, f20, s9.a.Z, this.d0.Y0, null, this) == object1 ? object1 : t.a;
            }
            case 1: {
                f.b0(object0);
                return t.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

