package com.sendwave.backend.fragment;

import Nb.j;
import Y8.o;
import a9.z5;
import com.apollographql.apollo.api.Fragment.Data;
import com.sendwave.models.CurrencyAmount;

public final class PaymentCardWalletFragment implements Data {
    public final String a;
    public final CurrencyAmount b;
    public final z5 c;

    public PaymentCardWalletFragment(String s, CurrencyAmount currencyAmount0, z5 z50) {
        this.a = s;
        this.b = currencyAmount0;
        this.c = z50;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof PaymentCardWalletFragment)) {
            return false;
        }
        if(!j.a(this.a, ((PaymentCardWalletFragment)object0).a)) {
            return false;
        }
        return j.a(this.b, ((PaymentCardWalletFragment)object0).b) ? j.a(this.c, ((PaymentCardWalletFragment)object0).c) : false;
    }

    public final String getId() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = o.n(this.b, (this.a == null ? 0 : this.a.hashCode()) * 0x1F, 0x1F);
        z5 z50 = this.c;
        if(z50 != null) {
            v = z50.a.hashCode();
        }
        return v1 + v;
    }

    @Override
    public final String toString() {
        return "PaymentCardWalletFragment(id=" + this.a + ", balance=" + this.b + ", historyConnection=" + this.c + ")";
    }
}

