package Y2;

import Ab.t;
import Eb.a;
import Fb.j;
import Xb.G;
import i3.e;
import i3.i;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class f extends j implements Function2 {
    public int c0;
    public final m d0;
    public final i e0;

    public f(m m0, i i0, g g0) {
        this.d0 = m0;
        this.e0 = i0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((f)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new f(this.d0, this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        m m0 = this.d0;
        switch(this.c0) {
            case 0: {
                W5.f.b0(object0);
                this.c0 = 1;
                object0 = m.a(m0, this.e0, 0, this);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                W5.f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((i3.j)object0) instanceof e) {
            m0.getClass();
        }
        return object0;
    }
}

