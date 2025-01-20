package ha;

import Ab.t;
import Eb.a;
import Fb.j;
import V8.d;
import W5.f;
import Y8.R9;
import com.sendwave.util.UNIT;
import com.wave.customer.PaymentListActivity;
import com.wave.customer.PaymentListParams;
import hb.n;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class m1 extends j implements Function2 {
    public int c0;
    public final S2 d0;

    public m1(S2 s20, g g0) {
        this.d0 = s20;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((m1)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new m1(this.d0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                this.d0.i0.d("click payments button", null);
                n.a("Navigate to billpay from homescreen", null, null, null, null, 30);
                this.c0 = 1;
                object0 = this.d0.r0.e(this);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                f.b0(object0);
                break;
            }
            case 2: {
                f.b0(object0);
                return t.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        PaymentListParams paymentListParams0 = new PaymentListParams(null);
        this.c0 = 2;
        return ((d)object0).l(PaymentListActivity.class, paymentListParams0, UNIT.class, this) == object1 ? object1 : t.a;
    }
}

