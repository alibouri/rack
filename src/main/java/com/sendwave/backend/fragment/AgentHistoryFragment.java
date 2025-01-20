package com.sendwave.backend.fragment;

import Nb.j;
import com.apollographql.apollo.api.Fragment.Data;
import com.sendwave.models.CurrencyAmount;

public final class AgentHistoryFragment implements Data {
    public final String a;
    public final CurrencyAmount b;

    public AgentHistoryFragment(CurrencyAmount currencyAmount0, String s) {
        this.a = s;
        this.b = currencyAmount0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof AgentHistoryFragment)) {
            return false;
        }
        return j.a(this.a, ((AgentHistoryFragment)object0).a) ? j.a(this.b, ((AgentHistoryFragment)object0).b) : false;
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
        return "AgentHistoryFragment(id=" + this.a + ", balance=" + this.b + ")";
    }
}

