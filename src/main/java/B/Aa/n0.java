package Aa;

import Ab.t;
import Eb.a;
import Fb.j;
import Qa.e;
import W5.f;
import Y8.R9;
import com.wave.customer.transactions.ui.TransactionsActivity;
import com.wave.customer.transactions.ui.TransactionsParams;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class n0 extends j implements Function2 {
    public TransactionsParams c0;
    public int d0;
    public final u0 e0;

    public n0(u0 u00, g g0) {
        this.e0 = u00;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((n0)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new n0(this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        TransactionsParams transactionsParams1;
        Object object1 = a.X;
        switch(this.d0) {
            case 0: {
                f.b0(object0);
                TransactionsParams transactionsParams0 = TransactionsParams.b(this.e0.Y.Z, e.e0);
                this.c0 = transactionsParams0;
                this.d0 = 1;
                object0 = this.e0.l0.e(this);
                if(object0 == object1) {
                    return object1;
                }
                transactionsParams1 = transactionsParams0;
                break;
            }
            case 1: {
                transactionsParams1 = this.c0;
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ((m)object0).V(TransactionsActivity.class, transactionsParams1);
        return t.a;
    }
}

