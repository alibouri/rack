package Aa;

import Ab.t;
import Eb.a;
import Fb.j;
import N2.l;
import W5.f;
import Xb.G;
import com.sendwave.backend.fragment.SupportFragment;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class j0 extends j implements Function2 {
    public int c0;
    public final u0 d0;

    public j0(u0 u00, g g0) {
        this.d0 = u00;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((j0)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new j0(this.d0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                l l0 = this.d0.Z.h(this.d0.Y.Y, SupportFragment.class);
                d0 d00 = new d0(this.d0, 2);
                this.c0 = 1;
                return l0.d(d00, this) == object1 ? object1 : t.a;
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

