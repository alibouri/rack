package com.sendwave.backend.fragment;

import Nb.j;
import a9.R1;
import com.apollographql.apollo.api.Fragment.Data;

public final class CustomerMostRecentTxHistoryFragmentRenamed implements Data {
    public final String a;
    public final R1 b;

    public CustomerMostRecentTxHistoryFragmentRenamed(String s, R1 r10) {
        this.a = s;
        this.b = r10;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof CustomerMostRecentTxHistoryFragmentRenamed)) {
            return false;
        }
        return j.a(this.a, ((CustomerMostRecentTxHistoryFragmentRenamed)object0).a) ? j.a(this.b, ((CustomerMostRecentTxHistoryFragmentRenamed)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? v * 0x1F : v * 0x1F + this.b.a.hashCode();
    }

    @Override
    public final String toString() {
        return "CustomerMostRecentTxHistoryFragmentRenamed(id=" + this.a + ", customerHistoryConnection=" + this.b + ")";
    }
}

