package com.sendwave.backend.fragment;

import Nb.j;
import a9.g9;
import com.apollographql.apollo.api.Fragment.Data;

public final class TxHistoryOfflineSyncPropsFragment implements Data {
    public final String a;
    public final g9 b;

    public TxHistoryOfflineSyncPropsFragment(String s, g9 g90) {
        this.a = s;
        this.b = g90;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof TxHistoryOfflineSyncPropsFragment)) {
            return false;
        }
        return j.a(this.a, ((TxHistoryOfflineSyncPropsFragment)object0).a) ? j.a(this.b, ((TxHistoryOfflineSyncPropsFragment)object0).b) : false;
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
        return "TxHistoryOfflineSyncPropsFragment(id=" + this.a + ", user=" + this.b + ")";
    }
}

