package Ba;

import Bb.q;
import Nb.j;
import R9.g3;
import com.sendwave.backend.fragment.SavingsFragment;
import com.sendwave.backend.type.Currency;
import com.sendwave.models.CurrencyAmount;
import java.util.Date;
import q9.M0;

public final class k {
    public final boolean a;
    public final SavingsFragment b;
    public final String c;
    public final Currency d;
    public final CurrencyAmount e;
    public final CurrencyAmount f;
    public final Date g;
    public final CurrencyAmount h;
    public final String i;
    public final boolean j;
    public final g3 k;
    public final boolean l;

    public k(boolean z, SavingsFragment savingsFragment0, String s, Currency currency0, CurrencyAmount currencyAmount0, CurrencyAmount currencyAmount1, Date date0, CurrencyAmount currencyAmount2, String s1, boolean z1) {
        j.f(currency0, "currency");
        super();
        this.a = z;
        this.b = savingsFragment0;
        this.c = s;
        this.d = currency0;
        this.e = currencyAmount0;
        this.f = currencyAmount1;
        this.g = date0;
        this.h = currencyAmount2;
        this.i = s1;
        this.j = z1;
        this.k = s1 != null || currencyAmount0 == null ? null : new g3(0x7F120495, q.K(M0.a(currencyAmount0)));  // string:wave_balance_x "Main Wave balance: %s"
        this.l = !z && currencyAmount2 != null && s1 == null;
    }

    public static k a(k k0, boolean z, SavingsFragment savingsFragment0, String s, Currency currency0, CurrencyAmount currencyAmount0, CurrencyAmount currencyAmount1, Date date0, CurrencyAmount currencyAmount2, String s1, boolean z1, int v) {
        Currency currency1 = (v & 8) == 0 ? currency0 : k0.d;
        k0.getClass();
        j.f(currency1, "currency");
        return new k(((v & 1) == 0 ? z : k0.a), ((v & 2) == 0 ? savingsFragment0 : k0.b), ((v & 4) == 0 ? s : k0.c), currency1, ((v & 16) == 0 ? currencyAmount0 : k0.e), ((v & 0x20) == 0 ? currencyAmount1 : k0.f), ((v & 0x40) == 0 ? date0 : k0.g), ((v & 0x80) == 0 ? currencyAmount2 : k0.h), ((v & 0x100) == 0 ? s1 : k0.i), ((v & 0x200) == 0 ? z1 : k0.j));
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof k)) {
            return false;
        }
        if(this.a != ((k)object0).a) {
            return false;
        }
        if(!j.a(this.b, ((k)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((k)object0).c)) {
            return false;
        }
        if(!j.a(this.d, ((k)object0).d)) {
            return false;
        }
        if(!j.a(this.e, ((k)object0).e)) {
            return false;
        }
        if(!j.a(this.f, ((k)object0).f)) {
            return false;
        }
        if(!j.a(this.g, ((k)object0).g)) {
            return false;
        }
        if(!j.a(this.h, ((k)object0).h)) {
            return false;
        }
        return j.a(this.i, ((k)object0).i) ? this.j == ((k)object0).j : false;
    }

    @Override
    public final int hashCode() {
        int v = 0x4D5;
        int v1 = this.a ? 0x4CF : 0x4D5;
        int v2 = 0;
        int v3 = this.b == null ? 0 : this.b.hashCode();
        int v4 = this.c == null ? 0 : this.c.hashCode();
        int v5 = this.d.hashCode();
        int v6 = this.e == null ? 0 : this.e.hashCode();
        int v7 = this.f == null ? 0 : this.f.hashCode();
        int v8 = this.g == null ? 0 : this.g.hashCode();
        int v9 = this.h == null ? 0 : this.h.hashCode();
        String s = this.i;
        if(s != null) {
            v2 = s.hashCode();
        }
        if(this.j) {
            v = 0x4CF;
        }
        return ((((((v5 + ((v1 * 0x1F + v3) * 0x1F + v4) * 0x1F) * 0x1F + v6) * 0x1F + v7) * 0x1F + v8) * 0x1F + v9) * 0x1F + v2) * 0x1F + v;
    }

    @Override
    public final String toString() {
        return "DepositSavingsUiState(loading=" + this.a + ", _savingsFragment=" + this.b + ", savingsWalletId=" + this.c + ", currency=" + this.d + ", primaryWalletBalance=" + this.e + ", savingsWalletBalance=" + this.f + ", whenSavingsWalletUnlocks=" + this.g + ", depositAmount=" + this.h + ", depositAmountWarning=" + this.i + ", shouldShowLockedConfirmationScreen=" + this.j + ")";
    }
}

