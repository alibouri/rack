package Aa;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Y8.R9;
import com.wave.customer.receipts.ReceiptActivity;
import com.wave.customer.receipts.ReceiptParams;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class o0 extends j implements Function2 {
    public ReceiptParams c0;
    public int d0;
    public final String e0;
    public final u0 f0;

    public o0(String s, u0 u00, g g0) {
        this.e0 = s;
        this.f0 = u00;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((o0)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new o0(this.e0, this.f0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        ReceiptParams receiptParams1;
        Object object1 = a.X;
        switch(this.d0) {
            case 0: {
                f.b0(object0);
                ReceiptParams receiptParams0 = new ReceiptParams(this.e0, this.f0.Y.Z.X, this.f0.Y.Z.Y, this.f0.Y.Y);
                this.c0 = receiptParams0;
                this.d0 = 1;
                Object object2 = this.f0.l0.e(this);
                if(object2 == object1) {
                    return object1;
                }
                receiptParams1 = receiptParams0;
                object0 = object2;
                break;
            }
            case 1: {
                receiptParams1 = this.c0;
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ((m)object0).V(ReceiptActivity.class, receiptParams1);
        return t.a;
    }
}

