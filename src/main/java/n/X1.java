package N;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import v.b;
import v.n0;

public final class x1 extends j implements Function2 {
    public int c0;
    public final b d0;
    public final boolean e0;
    public final n0 f0;
    public final Function0 g0;

    public x1(b b0, boolean z, n0 n00, Function0 function00, g g0) {
        this.d0 = b0;
        this.e0 = z;
        this.f0 = n00;
        this.g0 = function00;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((x1)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new x1(this.d0, this.e0, this.f0, this.g0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                this.c0 = 1;
                if(b.c(this.d0, new Float((this.e0 ? 1.0f : 0.0f)), this.f0, null, this, 12) == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        this.g0.invoke();
        return t.a;
    }
}

