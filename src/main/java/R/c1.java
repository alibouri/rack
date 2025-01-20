package R;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import v.S;
import v.b;
import v.i;

public final class c1 extends j implements Function2 {
    public int c0;
    public final e1 d0;
    public final float e0;

    public c1(e1 e10, float f, g g0) {
        this.d0 = e10;
        this.e0 = f;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((c1)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new c1(this.d0, this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        i i0;
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                e1 e10 = this.d0;
                b b0 = e10.o0;
                if(b0 != null) {
                    Float float0 = new Float(this.e0);
                    S s0 = e10.n0 ? androidx.compose.material3.a.f : androidx.compose.material3.a.g;
                    this.c0 = 1;
                    object0 = b.c(b0, float0, s0, null, this, 12);
                    if(object0 == object1) {
                        return object1;
                    }
                    i0 = (i)object0;
                    return t.a;
                }
                break;
            }
            case 1: {
                f.b0(object0);
                i0 = (i)object0;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return t.a;
    }
}

