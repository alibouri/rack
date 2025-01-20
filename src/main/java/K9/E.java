package K9;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Y8.R9;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

public final class e extends j implements Function2 {
    public int c0;
    public final i d0;

    public e(i i0, g g0) {
        this.d0 = i0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((e)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new e(this.d0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        Object object2 = t.a;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                i i0 = this.d0;
                i0.getClass();
                Tb.e[] arr_e = i.t0;
                String s = (String)i0.k0.a(arr_e[0], i0);
                if(s == null) {
                    return object2;
                }
                if(i0.g0) {
                    String s1 = (String)i0.n0.a(arr_e[2], i0);
                    if(s1 == null) {
                        return object2;
                    }
                    this.c0 = 1;
                    return ((Function3)i0.s0).h(s, s1, this) == object1 ? object1 : object2;
                }
                String s2 = (String)i0.l0.a(arr_e[1], i0);
                if(s2 == null) {
                    return object2;
                }
                this.c0 = 2;
                return ((Function3)i0.s0).h(s, s2, this) == object1 ? object1 : object2;
            }
            case 1: 
            case 2: {
                f.b0(object0);
                return object2;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

