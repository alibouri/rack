package a9;

import A3.e;
import Nb.j;
import com.sendwave.models.CurrencyAmount;
import java.util.Date;

public final class v0 {
    public final CurrencyAmount a;
    public final Date b;
    public final String c;
    public final String d;
    public final Date e;

    public v0(CurrencyAmount currencyAmount0, Date date0, String s, String s1, Date date1) {
        this.a = currencyAmount0;
        this.b = date0;
        this.c = s;
        this.d = s1;
        this.e = date1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof v0)) {
            return false;
        }
        if(!j.a(this.a, ((v0)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((v0)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((v0)object0).c)) {
            return false;
        }
        return j.a(this.d, ((v0)object0).d) ? j.a(this.e, ((v0)object0).e) : false;
    }

    @Override
    public final int hashCode() {
        int v = e.s((this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F, 0x1F, this.c);
        int v1 = 0;
        int v2 = this.d == null ? 0 : this.d.hashCode();
        Date date0 = this.e;
        if(date0 != null) {
            v1 = date0.hashCode();
        }
        return (v + v2) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        return "Bill(amount=" + this.a + ", dueDate=" + this.b + ", invoiceReference=" + this.c + ", customerName=" + this.d + ", period=" + this.e + ")";
    }
}

