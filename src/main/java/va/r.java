package va;

import Ab.t;
import Eb.a;
import Fb.j;
import V8.c;
import W5.f;
import Y8.R9;
import a5.w;
import a9.T7;
import ac.B0;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import o9.R1;

public final class r extends j implements Function2 {
    public int c0;
    public final x d0;
    public final T7 e0;

    public r(x x0, T7 t70, g g0) {
        this.d0 = x0;
        this.e0 = t70;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((r)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new r(this.d0, this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        String s;
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                x x0 = this.d0;
                c c0 = x0.d0;
                R1 r10 = new R1(13, x0);
                s9.a a0 = s9.a.h0;
                k k0 = (k)((B0)x0.f0.X).getValue();
                if(k0 == null) {
                    s = null;
                }
                else {
                    J j0 = k0.g;
                    s = j0 == null ? null : j0.a;
                }
                this.c0 = 1;
                return w.a0(c0, this.e0, x0.Z, r10, a0, "receipt", s, this) == object1 ? object1 : t.a;
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

