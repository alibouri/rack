package a9;

import Nb.j;
import com.sendwave.models.CurrencyAmount;

public final class v3 {
    public final CurrencyAmount a;
    public final CurrencyAmount b;

    public v3(CurrencyAmount currencyAmount0, CurrencyAmount currencyAmount1) {
        this.a = currencyAmount0;
        this.b = currencyAmount1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof v3)) {
            return false;
        }
        return j.a(this.a, ((v3)object0).a) ? j.a(this.b, ((v3)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "MonthLimit(total=" + this.a + ", remaining=" + this.b + ")";
    }
}

