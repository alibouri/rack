package com.sendwave.backend.fragment;

import Nb.j;
import com.apollographql.apollo.api.Fragment.Data;
import com.sendwave.models.CurrencyAmount;

public final class KycLimitFragment implements Data {
    public final String a;
    public final CurrencyAmount b;

    public KycLimitFragment(CurrencyAmount currencyAmount0, String s) {
        this.a = s;
        this.b = currencyAmount0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof KycLimitFragment)) {
            return false;
        }
        return j.a(this.a, ((KycLimitFragment)object0).a) ? j.a(this.b, ((KycLimitFragment)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "KycLimitFragment(description=" + this.a + ", value=" + this.b + ")";
    }
}

