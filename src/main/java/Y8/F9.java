package Y8;

import A3.e;
import Nb.j;
import com.sendwave.backend.fragment.CustomerMostRecentTxHistoryFragment;
import com.sendwave.models.CurrencyAmount;

public final class f9 {
    public final String a;
    public final String b;
    public final CurrencyAmount c;
    public final CustomerMostRecentTxHistoryFragment d;

    public f9(String s, String s1, CurrencyAmount currencyAmount0, CustomerMostRecentTxHistoryFragment customerMostRecentTxHistoryFragment0) {
        this.a = s;
        this.b = s1;
        this.c = currencyAmount0;
        this.d = customerMostRecentTxHistoryFragment0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof f9)) {
            return false;
        }
        if(!j.a(this.a, ((f9)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((f9)object0).b)) {
            return false;
        }
        return j.a(this.c, ((f9)object0).c) ? j.a(this.d, ((f9)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return this.d.hashCode() + o.n(this.c, e.s(this.a.hashCode() * 0x1F, 0x1F, this.b), 0x1F);
    }

    @Override
    public final String toString() {
        return "SourceWallet(__typename=" + this.a + ", id=" + this.b + ", balance=" + this.c + ", customerMostRecentTxHistoryFragment=" + this.d + ")";
    }
}

