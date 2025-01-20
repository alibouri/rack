package Aa;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Y8.R9;
import com.wave.customer.savings.withdraw.WithdrawSavingsActivity;
import com.wave.customer.savings.withdraw.WithdrawSavingsParams;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class p0 extends j implements Function2 {
    public int c0;
    public final u0 d0;

    public p0(u0 u00, g g0) {
        this.d0 = u00;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((p0)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new p0(this.d0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        u0 u00 = this.d0;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                this.c0 = 1;
                object0 = u00.l0.e(this);
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
        WithdrawSavingsParams withdrawSavingsParams0 = new WithdrawSavingsParams(u00.Y.X);
        ((m)object0).V(WithdrawSavingsActivity.class, withdrawSavingsParams0);
        return t.a;
    }
}

