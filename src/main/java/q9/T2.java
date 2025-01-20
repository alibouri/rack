package q9;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import Y8.N8;
import Y8.R6;
import com.sendwave.util.Country;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class t2 extends j implements Function2 {
    public int c0;
    public final Country d0;
    public final String e0;
    public final R6 f0;
    public final Function1 g0;

    public t2(R6 r60, Country country0, String s, g g0, Function1 function10) {
        this.d0 = country0;
        this.e0 = s;
        this.f0 = r60;
        this.g0 = function10;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((t2)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new t2(this.f0, this.d0, this.e0, g0, this.g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                this.c0 = 1;
                object0 = o0.A(this.d0, this.e0, this.f0, this);
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
        if(((N8)object0) != null) {
            this.g0.n(((N8)object0));
        }
        return t.a;
    }
}

