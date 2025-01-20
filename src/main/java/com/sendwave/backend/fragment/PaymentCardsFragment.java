package com.sendwave.backend.fragment;

import Nb.j;
import a9.I5;
import com.apollographql.apollo.api.Fragment.Data;

public final class PaymentCardsFragment implements Data {
    public final String a;
    public final I5 b;

    public PaymentCardsFragment(String s, I5 i50) {
        this.a = s;
        this.b = i50;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof PaymentCardsFragment)) {
            return false;
        }
        return j.a(this.a, ((PaymentCardsFragment)object0).a) ? j.a(this.b, ((PaymentCardsFragment)object0).b) : false;
    }

    public final String getId() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "PaymentCardsFragment(id=" + this.a + ", user=" + this.b + ")";
    }
}

