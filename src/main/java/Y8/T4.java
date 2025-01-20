package Y8;

import A3.e;
import Nb.j;
import com.sendwave.models.CurrencyAmount;
import java.util.Date;

public final class t4 {
    public final CurrencyAmount a;
    public final String b;
    public final String c;
    public final Date d;

    public t4(CurrencyAmount currencyAmount0, String s, String s1, Date date0) {
        this.a = currencyAmount0;
        this.b = s;
        this.c = s1;
        this.d = date0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof t4)) {
            return false;
        }
        if(!j.a(this.a, ((t4)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((t4)object0).b)) {
            return false;
        }
        return j.a(this.c, ((t4)object0).c) ? j.a(this.d, ((t4)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return this.d.hashCode() + e.s(e.s(this.a.hashCode() * 0x1F, 0x1F, this.b), 0x1F, this.c);
    }

    @Override
    public final String toString() {
        return "Payment(sendAmount=" + this.a + ", clientId=" + this.b + ", billType=" + this.c + ", whenCreated=" + this.d + ")";
    }
}

