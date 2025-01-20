package Y8;

import A3.e;
import Nb.j;
import com.sendwave.backend.fragment.CustomerMostRecentTxHistoryFragment;
import com.sendwave.backend.fragment.LimitFragment;
import com.sendwave.backend.type.PartnerOrg;
import com.sendwave.models.CurrencyAmount;
import g9.h;

public final class m1 {
    public final String a;
    public final String b;
    public final CurrencyAmount c;
    public final PartnerOrg d;
    public final h e;
    public final String f;
    public final LimitFragment g;
    public final CustomerMostRecentTxHistoryFragment h;

    public m1(String s, String s1, CurrencyAmount currencyAmount0, PartnerOrg partnerOrg0, h h0, String s2, LimitFragment limitFragment0, CustomerMostRecentTxHistoryFragment customerMostRecentTxHistoryFragment0) {
        this.a = s;
        this.b = s1;
        this.c = currencyAmount0;
        this.d = partnerOrg0;
        this.e = h0;
        this.f = s2;
        this.g = limitFragment0;
        this.h = customerMostRecentTxHistoryFragment0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof m1)) {
            return false;
        }
        if(!j.a(this.a, ((m1)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((m1)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((m1)object0).c)) {
            return false;
        }
        if(!j.a(this.d, ((m1)object0).d)) {
            return false;
        }
        if(!j.a(this.e, ((m1)object0).e)) {
            return false;
        }
        if(!j.a(this.f, ((m1)object0).f)) {
            return false;
        }
        return j.a(this.g, ((m1)object0).g) ? j.a(this.h, ((m1)object0).h) : false;
    }

    @Override
    public final int hashCode() {
        int v = o.n(this.c, e.s(this.a.hashCode() * 0x1F, 0x1F, this.b), 0x1F);
        int v1 = 0;
        int v2 = this.d == null ? 0 : this.d.hashCode();
        int v3 = this.e == null ? 0 : this.e.hashCode();
        String s = this.f;
        if(s != null) {
            v1 = s.hashCode();
        }
        return this.h.hashCode() + (this.g.hashCode() + (((v + v2) * 0x1F + v3) * 0x1F + v1) * 0x1F) * 0x1F;
    }

    @Override
    public final String toString() {
        return "SourceWallet(__typename=" + this.a + ", id=" + this.b + ", balance=" + this.c + ", partnerOrg=" + this.d + ", sendFeeFormula=" + this.e + ", sendFeeFormulaDescription=" + this.f + ", limitFragment=" + this.g + ", customerMostRecentTxHistoryFragment=" + this.h + ")";
    }
}

