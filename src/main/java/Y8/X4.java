package Y8;

import A3.e;
import Nb.j;
import com.sendwave.backend.fragment.CustomerMostRecentTxHistoryFragmentRenamed;
import com.sendwave.backend.fragment.MostRecentTxHistoryFragment;
import com.sendwave.models.CurrencyAmount;

public final class x4 {
    public final String a;
    public final String b;
    public final CurrencyAmount c;
    public final y4 d;
    public final MostRecentTxHistoryFragment e;
    public final CustomerMostRecentTxHistoryFragmentRenamed f;

    public x4(String s, String s1, CurrencyAmount currencyAmount0, y4 y40, MostRecentTxHistoryFragment mostRecentTxHistoryFragment0, CustomerMostRecentTxHistoryFragmentRenamed customerMostRecentTxHistoryFragmentRenamed0) {
        this.a = s;
        this.b = s1;
        this.c = currencyAmount0;
        this.d = y40;
        this.e = mostRecentTxHistoryFragment0;
        this.f = customerMostRecentTxHistoryFragmentRenamed0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof x4)) {
            return false;
        }
        if(!j.a(this.a, ((x4)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((x4)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((x4)object0).c)) {
            return false;
        }
        if(!j.a(this.d, ((x4)object0).d)) {
            return false;
        }
        return j.a(this.e, ((x4)object0).e) ? j.a(this.f, ((x4)object0).f) : false;
    }

    @Override
    public final int hashCode() {
        int v = o.n(this.c, e.s(this.a.hashCode() * 0x1F, 0x1F, this.b), 0x1F);
        int v1 = 0;
        int v2 = this.d == null ? 0 : this.d.hashCode();
        int v3 = this.e == null ? 0 : this.e.hashCode();
        CustomerMostRecentTxHistoryFragmentRenamed customerMostRecentTxHistoryFragmentRenamed0 = this.f;
        if(customerMostRecentTxHistoryFragmentRenamed0 != null) {
            v1 = customerMostRecentTxHistoryFragmentRenamed0.hashCode();
        }
        return ((v + v2) * 0x1F + v3) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        return "SourceWallet(__typename=" + this.a + ", id=" + this.b + ", balance=" + this.c + ", user=" + this.d + ", mostRecentTxHistoryFragment=" + this.e + ", customerMostRecentTxHistoryFragmentRenamed=" + this.f + ")";
    }
}

