package com.sendwave.backend.fragment;

import Nb.j;
import a9.g3;
import com.apollographql.apollo.api.Fragment.Data;

public final class HomescreenMenuConfigFragment implements Data {
    public final g3 a;

    public HomescreenMenuConfigFragment(g3 g30) {
        this.a = g30;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof HomescreenMenuConfigFragment ? j.a(this.a, ((HomescreenMenuConfigFragment)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "HomescreenMenuConfigFragment(homescreenMenuConfig=" + this.a + ")";
    }
}

