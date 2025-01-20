package Aa;

import A3.e;
import Nb.j;
import com.apollographql.apollo.api.b;
import com.sendwave.models.CurrencyAmount;
import com.wave.customer.receipts.HistoryEntryId;

public final class a0 {
    public final String a;
    public final String b;
    public final String c;
    public final CurrencyAmount d;
    public final int e;

    public a0(String s, String s1, String s2, CurrencyAmount currencyAmount0) {
        j.f(s, "id");
        super();
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = currencyAmount0;
        this.e = currencyAmount0.f() ? 0x7F080276 : 0x7F08025C;  // drawable:ic_plus_tx
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof a0)) {
            return false;
        }
        if(!j.a(this.a, ((a0)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((a0)object0).b)) {
            return false;
        }
        return j.a(this.c, ((a0)object0).c) ? j.a(this.d, ((a0)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return this.d.hashCode() + e.s(e.s(this.a.hashCode() * 0x1F, 0x1F, this.b), 0x1F, this.c);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = b.s("Transaction(id=", HistoryEntryId.b(this.a), ", summary=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", date=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", amount=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

