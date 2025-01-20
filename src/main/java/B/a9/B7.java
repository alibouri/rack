package a9;

import Nb.j;
import com.sendwave.models.CurrencyAmount;
import java.util.List;

public final class b7 {
    public final CurrencyAmount a;
    public final N6 b;
    public final Z6 c;
    public final List d;
    public final List e;
    public final O6 f;

    public b7(CurrencyAmount currencyAmount0, N6 n60, Z6 z60, List list0, List list1, O6 o60) {
        this.a = currencyAmount0;
        this.b = n60;
        this.c = z60;
        this.d = list0;
        this.e = list1;
        this.f = o60;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof b7)) {
            return false;
        }
        if(!j.a(this.a, ((b7)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((b7)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((b7)object0).c)) {
            return false;
        }
        if(!j.a(this.d, ((b7)object0).d)) {
            return false;
        }
        return j.a(this.e, ((b7)object0).e) ? j.a(this.f, ((b7)object0).f) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        int v4 = this.d == null ? 0 : this.d.hashCode();
        int v5 = this.e == null ? 0 : this.e.hashCode();
        O6 o60 = this.f;
        if(o60 != null) {
            v = o60.hashCode();
        }
        return ((((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v;
    }

    @Override
    public final String toString() {
        return "ScratchCards(totalAwardsClaimed=" + this.a + ", banner=" + this.b + ", rewardsPath=" + this.c + ", lockedCards=" + this.d + ", unlockedCards=" + this.e + ", claimedCards=" + this.f + ")";
    }
}

