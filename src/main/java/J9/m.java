package J9;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import Y8.G6;
import Y8.O;
import Y8.R6;
import Y8.k;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class m extends j implements Function2 {
    public int c0;
    public final R6 d0;
    public final k e0;

    public m(R6 r60, k k0, g g0) {
        this.d0 = r60;
        this.e0 = k0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((m)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new m(this.d0, this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                try {
                    this.c0 = 1;
                    if(this.d0.f(this.e0, G6.X, this) == object1) {
                        return object1;
                    }
                }
                catch(O unused_ex) {
                }
                return t.a;
            }
            case 1: {
                try {
                    f.b0(object0);
                }
                catch(O unused_ex) {
                }
                return t.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

