package Y8;

import A3.e;
import Nb.j;
import com.sendwave.backend.fragment.PayBillDialogFragment;
import com.sendwave.backend.fragment.PayMerchantFragment;
import com.sendwave.backend.fragment.SendMoneySelectFragment;
import com.sendwave.backend.type.PartnerOrg;

public final class b1 {
    public final String a;
    public final String b;
    public final PartnerOrg c;
    public final PartnerOrg d;
    public final boolean e;
    public final SendMoneySelectFragment f;
    public final PayMerchantFragment g;
    public final PayBillDialogFragment h;

    public b1(String s, String s1, PartnerOrg partnerOrg0, PartnerOrg partnerOrg1, boolean z, SendMoneySelectFragment sendMoneySelectFragment0, PayMerchantFragment payMerchantFragment0, PayBillDialogFragment payBillDialogFragment0) {
        this.a = s;
        this.b = s1;
        this.c = partnerOrg0;
        this.d = partnerOrg1;
        this.e = z;
        this.f = sendMoneySelectFragment0;
        this.g = payMerchantFragment0;
        this.h = payBillDialogFragment0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof b1)) {
            return false;
        }
        if(!j.a(this.a, ((b1)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((b1)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((b1)object0).c)) {
            return false;
        }
        if(!j.a(this.d, ((b1)object0).d)) {
            return false;
        }
        if(this.e != ((b1)object0).e) {
            return false;
        }
        if(!j.a(this.f, ((b1)object0).f)) {
            return false;
        }
        return j.a(this.g, ((b1)object0).g) ? j.a(this.h, ((b1)object0).h) : false;
    }

    @Override
    public final int hashCode() {
        int v = e.s(this.a.hashCode() * 0x1F, 0x1F, this.b);
        int v1 = this.c == null ? 0 : this.c.hashCode();
        int v2 = this.d.hashCode();
        return this.e ? this.h.hashCode() + (this.g.hashCode() + (this.f.hashCode() + ((v2 + (v + v1) * 0x1F) * 0x1F + 0x4CF) * 0x1F) * 0x1F) * 0x1F : this.h.hashCode() + (this.g.hashCode() + (this.f.hashCode() + ((v2 + (v + v1) * 0x1F) * 0x1F + 0x4D5) * 0x1F) * 0x1F) * 0x1F;
    }

    @Override
    public final String toString() {
        return "Wallet(__typename=" + this.a + ", id=" + this.b + ", partnerOrg=" + this.c + ", aimedPartnerOrg=" + this.d + ", shouldBlockUntilPartnerOrgMigrated=" + this.e + ", sendMoneySelectFragment=" + this.f + ", payMerchantFragment=" + this.g + ", payBillDialogFragment=" + this.h + ")";
    }
}

