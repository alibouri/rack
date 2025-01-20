package com.sendwave.backend.fragment;

import Nb.j;
import Y8.o;
import com.apollographql.apollo.api.Fragment.Data;
import com.sendwave.backend.type.Currency;
import com.sendwave.models.CurrencyAmount;

public final class PayMerchantFragment implements Data {
    public final String a;
    public final CurrencyAmount b;
    public final Currency c;

    public PayMerchantFragment(String s, CurrencyAmount currencyAmount0, Currency currency0) {
        this.a = s;
        this.b = currencyAmount0;
        this.c = currency0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof PayMerchantFragment)) {
            return false;
        }
        if(!j.a(this.a, ((PayMerchantFragment)object0).a)) {
            return false;
        }
        return j.a(this.b, ((PayMerchantFragment)object0).b) ? j.a(this.c, ((PayMerchantFragment)object0).c) : false;
    }

    public final String getId() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        return this.c.hashCode() + o.n(this.b, this.a.hashCode() * 0x1F, 0x1F);
    }

    @Override
    public final String toString() {
        return "PayMerchantFragment(id=" + this.a + ", balance=" + this.b + ", currency=" + this.c + ")";
    }
}

