package com.sendwave.backend.fragment;

import Nb.j;
import a9.M1;
import com.apollographql.apollo.api.Fragment.Data;

public final class CustomerMostRecentTxHistoryFragment implements Data {
    public final String a;
    public final M1 b;

    public CustomerMostRecentTxHistoryFragment(String s, M1 m10) {
        this.a = s;
        this.b = m10;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof CustomerMostRecentTxHistoryFragment)) {
            return false;
        }
        return j.a(this.a, ((CustomerMostRecentTxHistoryFragment)object0).a) ? j.a(this.b, ((CustomerMostRecentTxHistoryFragment)object0).b) : false;
    }

    public final String getId() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? v * 0x1F : v * 0x1F + this.b.a.hashCode();
    }

    @Override
    public final String toString() {
        return "CustomerMostRecentTxHistoryFragment(id=" + this.a + ", historyConnection=" + this.b + ")";
    }
}

