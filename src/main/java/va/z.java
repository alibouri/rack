package va;

import Ab.t;
import Eb.a;
import Fb.j;
import Ma.e;
import Ma.w;
import Nb.s;
import W5.f;
import Y8.R6;
import com.sendwave.util.Country;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class z extends j implements Function2 {
    public int c0;
    public Object d0;
    public final s e0;
    public final w f0;
    public final Country g0;
    public final R6 h0;

    public z(s s0, w w0, Country country0, R6 r60, g g0) {
        this.e0 = s0;
        this.f0 = w0;
        this.g0 = country0;
        this.h0 = r60;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((z)this.t(((e)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        z z0 = new z(this.e0, this.f0, this.g0, this.h0, g0);
        z0.d0 = object0;
        return z0;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        s s0 = this.e0;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                e e0 = (e)this.d0;
                if(!s0.X) {
                    this.c0 = 1;
                    if(E.b(this.f0, e0.a, this.g0, this.h0, this) == object1) {
                        return object1;
                    }
                    s0.X = true;
                    return t.a;
                }
                break;
            }
            case 1: {
                f.b0(object0);
                s0.X = true;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return t.a;
    }
}

