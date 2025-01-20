package Y8;

import Nb.j;
import com.sendwave.models.CurrencyAmount;

public final class c8 {
    public final CurrencyAmount a;

    public c8(CurrencyAmount currencyAmount0) {
        this.a = currencyAmount0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof c8 ? j.a(this.a, ((c8)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "OnCashScratchCardAward(awardAmount=" + this.a + ")";
    }
}

