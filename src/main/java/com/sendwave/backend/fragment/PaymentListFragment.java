package com.sendwave.backend.fragment;

import Nb.j;
import a9.S5;
import a9.T5;
import com.apollographql.apollo.api.Fragment.Data;

public final class PaymentListFragment implements Data {
    public final String a;
    public final S5 b;
    public final T5 c;

    public PaymentListFragment(String s, S5 s50, T5 t50) {
        this.a = s;
        this.b = s50;
        this.c = t50;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof PaymentListFragment)) {
            return false;
        }
        if(!j.a(this.a, ((PaymentListFragment)object0).a)) {
            return false;
        }
        return j.a(this.b, ((PaymentListFragment)object0).b) ? j.a(this.c, ((PaymentListFragment)object0).c) : false;
    }

    public final String getId() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F;
    }

    @Override
    public final String toString() {
        return "PaymentListFragment(id=" + this.a + ", user=" + this.b + ", wallet=" + this.c + ")";
    }
}

