package q9;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import ac.i;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class l0 extends j implements Function2 {
    public int c0;
    public Object d0;
    public final n e0;
    public final String f0;

    public l0(n n0, String s, g g0) {
        this.e0 = n0;
        this.f0 = s;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((l0)this.t(((i)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new l0(this.e0, this.f0, g0);
        g1.d0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        i i1;
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                i i0 = (i)this.d0;
                this.d0 = i0;
                this.c0 = 1;
                if(i0.c(null, this) == object1) {
                    return object1;
                }
                i1 = i0;
                goto label_15;
            }
            case 1: {
                i1 = (i)this.d0;
                f.b0(object0);
            label_15:
                this.d0 = i1;
                this.c0 = 2;
                object0 = this.e0.e(this.f0, this);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 2: {
                i1 = (i)this.d0;
                f.b0(object0);
                break;
            }
            case 3: {
                f.b0(object0);
                return t.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        this.d0 = null;
        this.c0 = 3;
        return i1.c(object0, this) == object1 ? object1 : t.a;
    }
}

