package k2;

import Ab.t;
import Eb.a;
import Fb.j;
import Lc.b;
import W5.f;
import Xb.G;
import java.util.List;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class W extends j implements Function2 {
    public int c0;
    public final X d0;
    public final b e0;
    public final t1 f0;

    public W(X x0, b b0, t1 t10, g g0) {
        this.d0 = x0;
        this.e0 = b0;
        this.f0 = t10;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((W)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new W(this.d0, this.e0, this.f0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                this.c0 = 1;
                object0 = this.d0.c.b(this.e0, this);
                if(object0 == object1) {
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
        List list0 = ((u)object0).a;
        Object object2 = null;
        Object object3 = !list0.isEmpty() || !(this.f0 instanceof r1) ? ((u)object0).b : null;
        if(!((u)object0).a.isEmpty() || !(this.f0 instanceof q1)) {
            object2 = ((u)object0).c;
        }
        return new w1(list0, object3, object2, ((u)object0).d, ((u)object0).e);
    }
}

