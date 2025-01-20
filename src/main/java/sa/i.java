package sa;

import Bb.q;
import Nb.j;
import R9.g3;
import com.sendwave.backend.type.Currency;
import com.sendwave.models.CurrencyAmount;
import q9.M0;

public final class i {
    public final boolean a;
    public final Currency b;
    public final CurrencyAmount c;
    public final CurrencyAmount d;
    public final CurrencyAmount e;
    public final String f;
    public final g3 g;
    public final boolean h;

    public i(boolean z, Currency currency0, CurrencyAmount currencyAmount0, CurrencyAmount currencyAmount1, CurrencyAmount currencyAmount2, String s) {
        j.f(currency0, "currency");
        super();
        this.a = z;
        this.b = currency0;
        this.c = currencyAmount0;
        this.d = currencyAmount1;
        this.e = currencyAmount2;
        this.f = s;
        this.g = s != null || currencyAmount0 == null ? null : new g3(0x7F120495, q.K(M0.a(currencyAmount0)));  // string:wave_balance_x "Main Wave balance: %s"
        this.h = !z && currencyAmount2 != null && s == null;
    }

    public static i a(i i0, boolean z, Currency currency0, CurrencyAmount currencyAmount0, CurrencyAmount currencyAmount1, CurrencyAmount currencyAmount2, String s, int v) {
        if((v & 1) != 0) {
            z = i0.a;
        }
        if((v & 2) != 0) {
            currency0 = i0.b;
        }
        if((v & 4) != 0) {
            currencyAmount0 = i0.c;
        }
        if((v & 8) != 0) {
            currencyAmount1 = i0.d;
        }
        if((v & 16) != 0) {
            currencyAmount2 = i0.e;
        }
        if((v & 0x20) != 0) {
            s = i0.f;
        }
        i0.getClass();
        j.f(currency0, "currency");
        return new i(z, currency0, currencyAmount0, currencyAmount1, currencyAmount2, s);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof i)) {
            return false;
        }
        if(this.a != ((i)object0).a) {
            return false;
        }
        if(!j.a(this.b, ((i)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((i)object0).c)) {
            return false;
        }
        if(!j.a(this.d, ((i)object0).d)) {
            return false;
        }
        return j.a(this.e, ((i)object0).e) ? j.a(this.f, ((i)object0).f) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a ? 0x4CF : 0x4D5;
        int v1 = this.b.hashCode();
        int v2 = 0;
        int v3 = this.c == null ? 0 : this.c.hashCode();
        int v4 = this.d == null ? 0 : this.d.hashCode();
        int v5 = this.e == null ? 0 : this.e.hashCode();
        String s = this.f;
        if(s != null) {
            v2 = s.hashCode();
        }
        return ((((v1 + v * 0x1F) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v2;
    }

    @Override
    public final String toString() {
        return "RechargeCardState(loading=" + this.a + ", currency=" + this.b + ", primaryWalletBalance=" + this.c + ", cardBalance=" + this.d + ", rechargeAmount=" + this.e + ", rechargeAmountWarning=" + this.f + ")";
    }
}

