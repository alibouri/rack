package R9;

import Ab.t;
import Eb.a;
import Fb.j;
import K9.p;
import K9.q;
import W5.f;
import Xb.G;
import com.wave.customer.BuyAirtimeSelectActivity;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class w extends j implements Function2 {
    public p c0;
    public int d0;
    public final BuyAirtimeSelectActivity e0;

    public w(BuyAirtimeSelectActivity buyAirtimeSelectActivity0, g g0) {
        this.e0 = buyAirtimeSelectActivity0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((w)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new w(this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        p p1;
        Object object1 = a.X;
        switch(this.d0) {
            case 0: {
                f.b0(object0);
                p p0 = ((q)this.e0.H0.getValue()).a;
                this.c0 = p0;
                this.d0 = 1;
                object0 = this.e0.J0.c(false, this);
                if(object0 == object1) {
                    return object1;
                }
                p1 = p0;
                break;
            }
            case 1: {
                p1 = this.c0;
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        p1.d(((Boolean)object0).booleanValue());
        return t.a;
    }
}

