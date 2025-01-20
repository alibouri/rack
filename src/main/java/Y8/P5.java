package Y8;

import Nb.j;
import com.sendwave.models.CurrencyAmount;

public final class p5 {
    public final String a;
    public final CurrencyAmount b;
    public final m5 c;

    public p5(String s, CurrencyAmount currencyAmount0, m5 m50) {
        this.a = s;
        this.b = currencyAmount0;
        this.c = m50;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof p5)) {
            return false;
        }
        if(!j.a(this.a, ((p5)object0).a)) {
            return false;
        }
        return j.a(this.b, ((p5)object0).b) ? j.a(this.c, ((p5)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = o.n(this.b, (this.a == null ? 0 : this.a.hashCode()) * 0x1F, 0x1F);
        m5 m50 = this.c;
        if(m50 != null) {
            v = m50.a.hashCode();
        }
        return v1 + v;
    }

    @Override
    public final String toString() {
        return "PaymentCardWallet(id=" + this.a + ", balance=" + this.b + ", historyConnection=" + this.c + ")";
    }
}

