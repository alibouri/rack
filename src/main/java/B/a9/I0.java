package a9;

import Nb.j;
import com.sendwave.models.CurrencyAmount;
import g9.h;

public final class i0 {
    public final h a;
    public final CurrencyAmount b;
    public final CurrencyAmount c;
    public final Boolean d;

    public i0(h h0, CurrencyAmount currencyAmount0, CurrencyAmount currencyAmount1, Boolean boolean0) {
        this.a = h0;
        this.b = currencyAmount0;
        this.c = currencyAmount1;
        this.d = boolean0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof i0)) {
            return false;
        }
        if(!j.a(this.a, ((i0)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((i0)object0).b)) {
            return false;
        }
        return j.a(this.c, ((i0)object0).c) ? j.a(this.d, ((i0)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        Boolean boolean0 = this.d;
        if(boolean0 != null) {
            v = boolean0.hashCode();
        }
        return ((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v;
    }

    @Override
    public final String toString() {
        return "OnAmountField(feeFormula=" + this.a + ", minimum=" + this.b + ", maximum=" + this.c + ", requiresRounding=" + this.d + ")";
    }
}

