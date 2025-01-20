package com.sendwave.backend.fragment;

import Nb.j;
import a9.l4;
import com.apollographql.apollo.api.Fragment.Data;
import java.util.List;

public final class LinkedAccountsFragment implements Data {
    public final String a;
    public final l4 b;
    public final List c;

    public LinkedAccountsFragment(String s, l4 l40, List list0) {
        this.a = s;
        this.b = l40;
        this.c = list0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof LinkedAccountsFragment)) {
            return false;
        }
        if(!j.a(this.a, ((LinkedAccountsFragment)object0).a)) {
            return false;
        }
        return j.a(this.b, ((LinkedAccountsFragment)object0).b) ? j.a(this.c, ((LinkedAccountsFragment)object0).c) : false;
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
        return "LinkedAccountsFragment(id=" + this.a + ", linkedAccountTransferCounts=" + this.b + ", linkedAccounts=" + this.c + ")";
    }
}

