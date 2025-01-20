package a9;

import A3.e;
import Nb.j;
import Y8.o;
import com.sendwave.backend.fragment.FavoriteRecipientsFragment;
import com.sendwave.backend.fragment.SendMoneySelectFragment;
import com.sendwave.backend.type.PartnerOrg;
import com.sendwave.models.CurrencyAmount;

public final class r8 {
    public final String a;
    public final String b;
    public final CurrencyAmount c;
    public final String d;
    public final PartnerOrg e;
    public final PartnerOrg f;
    public final boolean g;
    public final SendMoneySelectFragment h;
    public final FavoriteRecipientsFragment i;

    public r8(String s, String s1, CurrencyAmount currencyAmount0, String s2, PartnerOrg partnerOrg0, PartnerOrg partnerOrg1, boolean z, SendMoneySelectFragment sendMoneySelectFragment0, FavoriteRecipientsFragment favoriteRecipientsFragment0) {
        this.a = s;
        this.b = s1;
        this.c = currencyAmount0;
        this.d = s2;
        this.e = partnerOrg0;
        this.f = partnerOrg1;
        this.g = z;
        this.h = sendMoneySelectFragment0;
        this.i = favoriteRecipientsFragment0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof r8)) {
            return false;
        }
        if(!j.a(this.a, ((r8)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((r8)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((r8)object0).c)) {
            return false;
        }
        if(!j.a(this.d, ((r8)object0).d)) {
            return false;
        }
        if(!j.a(this.e, ((r8)object0).e)) {
            return false;
        }
        if(!j.a(this.f, ((r8)object0).f)) {
            return false;
        }
        if(this.g != ((r8)object0).g) {
            return false;
        }
        return j.a(this.h, ((r8)object0).h) ? j.a(this.i, ((r8)object0).i) : false;
    }

    @Override
    public final int hashCode() {
        int v = e.s(o.n(this.c, e.s(this.a.hashCode() * 0x1F, 0x1F, this.b), 0x1F), 0x1F, this.d);
        int v1 = this.e == null ? 0 : this.e.hashCode();
        int v2 = this.f.hashCode();
        return this.g ? this.i.hashCode() + (this.h.hashCode() + ((v2 + (v + v1) * 0x1F) * 0x1F + 0x4CF) * 0x1F) * 0x1F : this.i.hashCode() + (this.h.hashCode() + ((v2 + (v + v1) * 0x1F) * 0x1F + 0x4D5) * 0x1F) * 0x1F;
    }

    @Override
    public final String toString() {
        return "Wallet(__typename=" + this.a + ", id=" + this.b + ", balance=" + this.c + ", country=" + this.d + ", partnerOrg=" + this.e + ", aimedPartnerOrg=" + this.f + ", shouldBlockUntilPartnerOrgMigrated=" + this.g + ", sendMoneySelectFragment=" + this.h + ", favoriteRecipientsFragment=" + this.i + ")";
    }
}

