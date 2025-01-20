package com.sendwave.backend.fragment;

import Nb.j;
import a9.r4;
import com.apollographql.apollo.api.Fragment.Data;

public final class MostRecentTxHistoryFragment implements Data {
    public final String a;
    public final r4 b;

    public MostRecentTxHistoryFragment(String s, r4 r40) {
        this.a = s;
        this.b = r40;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof MostRecentTxHistoryFragment)) {
            return false;
        }
        return j.a(this.a, ((MostRecentTxHistoryFragment)object0).a) ? j.a(this.b, ((MostRecentTxHistoryFragment)object0).b) : false;
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
        return "MostRecentTxHistoryFragment(id=" + this.a + ", historyConnection=" + this.b + ")";
    }
}

