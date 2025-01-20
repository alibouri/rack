package P;

import Ab.t;
import B.L0;
import Eb.a;
import Fb.j;
import W5.f;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import v.b0;

public final class l extends j implements Function1 {
    public int c0;
    public final n d0;
    public final float e0;

    public l(n n0, float f, g g0) {
        this.d0 = n0;
        this.e0 = f;
        super(1, g0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        return new l(this.d0, this.e0, ((g)object0)).v(t.a);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                float f = this.d0.e.k();
                L0 l00 = new L0(11, this.d0);
                this.c0 = 1;
                return b0.c(f, this.e0, null, l00, this, 12) == object1 ? object1 : t.a;
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

