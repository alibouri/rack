package a9;

import A3.e;
import Nb.j;
import com.sendwave.models.CurrencyAmount;

public final class d0 {
    public final String a;
    public final String b;
    public final CurrencyAmount c;

    public d0(String s, String s1, CurrencyAmount currencyAmount0) {
        this.a = s;
        this.b = s1;
        this.c = currencyAmount0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof d0)) {
            return false;
        }
        if(!j.a(this.a, ((d0)object0).a)) {
            return false;
        }
        return j.a(this.b, ((d0)object0).b) ? j.a(this.c, ((d0)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return this.c.hashCode() + e.s(this.a.hashCode() * 0x1F, 0x1F, this.b);
    }

    @Override
    public final String toString() {
        return "Choice1(value=" + this.a + ", displayName=" + this.b + ", price=" + this.c + ")";
    }
}

