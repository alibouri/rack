package y;

import Ab.t;
import Eb.a;
import Fb.j;
import Mb.e;
import N.v;
import W5.f;
import kotlin.coroutines.g;

public final class c extends j implements e {
    public int c0;
    public s d0;
    public p0 e0;
    public Object f0;
    public final v g0;

    public c(v v0, g g0) {
        this.g0 = v0;
        super(4, g0);
    }

    @Override  // Mb.e
    public final Object r(Object object0, Object object1, Object object2, Object object3) {
        c c0 = new c(this.g0, ((g)object3));
        c0.d0 = (s)object0;
        c0.e0 = (p0)object1;
        c0.f0 = object2;
        return c0.v(t.a);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                s s0 = this.d0;
                p0 p00 = this.e0;
                Object object2 = this.f0;
                float f = this.g0.h.k();
                this.d0 = null;
                this.e0 = null;
                this.c0 = 1;
                return androidx.compose.foundation.gestures.a.a(this.g0, f, s0, p00, object2, this) == object1 ? object1 : t.a;
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

