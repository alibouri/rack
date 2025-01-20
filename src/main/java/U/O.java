package u;

import Ab.t;
import Eb.a;
import Fb.j;
import N2.l;
import N3.F;
import U.d;
import U.i0;
import W5.f;
import androidx.compose.runtime.MutableState;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import v.k0;

public final class o extends j implements Function2 {
    public int c0;
    public Object d0;
    public final k0 e0;
    public final MutableState f0;

    public o(k0 k00, MutableState mutableState0, g g0) {
        this.e0 = k00;
        this.f0 = mutableState0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((o)this.t(((i0)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new o(this.e0, this.f0, g0);
        g1.d0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                i0 i00 = (i0)this.d0;
                l l0 = d.L(new n(this.e0, 0));
                F f0 = new F(i00, this.e0, this.f0, 8);
                this.c0 = 1;
                return l0.d(f0, this) == object1 ? object1 : t.a;
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

