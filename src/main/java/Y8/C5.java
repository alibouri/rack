package Y8;

import Nb.j;
import com.sendwave.backend.fragment.PaymentCardFragment;

public final class c5 {
    public final String a;
    public final b5 b;
    public final PaymentCardFragment c;

    public c5(String s, b5 b50, PaymentCardFragment paymentCardFragment0) {
        j.f(s, "__typename");
        super();
        this.a = s;
        this.b = b50;
        this.c = paymentCardFragment0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof c5)) {
            return false;
        }
        if(!j.a(this.a, ((c5)object0).a)) {
            return false;
        }
        return j.a(this.b, ((c5)object0).b) ? j.a(this.c, ((c5)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.a.hashCode();
        PaymentCardFragment paymentCardFragment0 = this.c;
        if(paymentCardFragment0 != null) {
            v1 = paymentCardFragment0.hashCode();
        }
        return (v * 0x1F + v2) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        return "Response(__typename=" + this.a + ", onPaymentCardPending=" + this.b + ", paymentCardFragment=" + this.c + ")";
    }
}

