package o9;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Y8.R9;
import a5.w;
import a9.T7;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class c2 extends j implements Function2 {
    public int c0;
    public final s2 d0;
    public final T7 e0;

    public c2(s2 s20, T7 t70, g g0) {
        this.d0 = s20;
        this.e0 = t70;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((c2)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new c2(this.d0, this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                R1 r10 = new R1(1, this.d0);
                this.c0 = 1;
                return w.a0(this.d0.j0, this.e0, this.d0.b0, r10, s9.a.f0, this.d0.G0, null, this) == object1 ? object1 : t.a;
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

