package p9;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class e0 extends j implements Function2 {
    public int c0;
    public Object d0;
    public final H e0;
    public final j0 f0;

    public e0(H h0, j0 j00, g g0) {
        this.e0 = h0;
        this.f0 = j00;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((e0)this.t(((String)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new e0(this.e0, this.f0, g0);
        g1.d0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                String s = (String)this.d0;
                H h0 = this.e0;
                if(!Nb.j.a(s, h0.b)) {
                    this.c0 = 1;
                    if(j0.o(this.f0, h0.a, s, this) == object1) {
                        return object1;
                    }
                }
                return t.a;
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

