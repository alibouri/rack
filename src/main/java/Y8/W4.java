package Y8;

import A3.e;
import Nb.j;
import com.sendwave.backend.fragment.CustomerMostRecentTxHistoryFragmentRenamed;
import com.sendwave.backend.fragment.MostRecentTxHistoryFragment;
import com.sendwave.models.CurrencyAmount;

public final class w4 {
    public final String a;
    public final String b;
    public final CurrencyAmount c;
    public final MostRecentTxHistoryFragment d;
    public final CustomerMostRecentTxHistoryFragmentRenamed e;

    public w4(String s, String s1, CurrencyAmount currencyAmount0, MostRecentTxHistoryFragment mostRecentTxHistoryFragment0, CustomerMostRecentTxHistoryFragmentRenamed customerMostRecentTxHistoryFragmentRenamed0) {
        this.a = s;
        this.b = s1;
        this.c = currencyAmount0;
        this.d = mostRecentTxHistoryFragment0;
        this.e = customerMostRecentTxHistoryFragmentRenamed0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof w4)) {
            return false;
        }
        if(!j.a(this.a, ((w4)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((w4)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((w4)object0).c)) {
            return false;
        }
        return j.a(this.d, ((w4)object0).d) ? j.a(this.e, ((w4)object0).e) : false;
    }

    @Override
    public final int hashCode() {
        int v = o.n(this.c, e.s(this.a.hashCode() * 0x1F, 0x1F, this.b), 0x1F);
        int v1 = 0;
        int v2 = this.d == null ? 0 : this.d.hashCode();
        CustomerMostRecentTxHistoryFragmentRenamed customerMostRecentTxHistoryFragmentRenamed0 = this.e;
        if(customerMostRecentTxHistoryFragmentRenamed0 != null) {
            v1 = customerMostRecentTxHistoryFragmentRenamed0.hashCode();
        }
        return (v + v2) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        return "SourceWallet1(__typename=" + this.a + ", id=" + this.b + ", balance=" + this.c + ", mostRecentTxHistoryFragment=" + this.d + ", customerMostRecentTxHistoryFragmentRenamed=" + this.e + ")";
    }
}

