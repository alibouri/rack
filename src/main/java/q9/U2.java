package q9;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import Xb.J;
import Y8.R6;
import com.sendwave.util.Country;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class u2 extends j implements Function2 {
    public int c0;
    public Object d0;
    public final Function1 e0;
    public final Country f0;
    public final String g0;
    public final R6 h0;

    public u2(R6 r60, Country country0, String s, g g0, Function1 function10) {
        this.e0 = function10;
        this.f0 = country0;
        this.g0 = s;
        this.h0 = r60;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((u2)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        u2 u20 = new u2(this.h0, this.f0, this.g0, g0, this.e0);
        u20.d0 = object0;
        return u20;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                G g0 = (G)this.d0;
                Function1 function10 = this.e0;
                if(function10 != null) {
                    J.q(g0, null, null, new t2(this.h0, this.f0, this.g0, null, function10), 3);
                }
                this.c0 = 1;
                object0 = o0.B(this.f0, this.g0, this.h0, this);
                return object0 == object1 ? object1 : object0;
            }
            case 1: {
                f.b0(object0);
                return object0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

