package ja;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Y8.R9;
import com.sendwave.util.UNIT;
import com.wave.customer.overdraft.OverdraftActivity;
import ha.w;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class k extends j implements Function2 {
    public int c0;
    public final l d0;

    public k(l l0, g g0) {
        this.d0 = l0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((k)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new k(this.d0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                this.c0 = 1;
                object0 = this.d0.c0.e(this);
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
        ((w)object0).V(OverdraftActivity.class, UNIT.X);
        return t.a;
    }
}

