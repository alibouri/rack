package com.sendwave.backend.fragment;

import M.J;
import Nb.j;
import com.apollographql.apollo.api.Fragment.Data;
import java.util.List;

public final class TooltipsFragment implements Data {
    public final List a;

    public TooltipsFragment(List list0) {
        this.a = list0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof TooltipsFragment ? j.a(this.a, ((TooltipsFragment)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return J.h(new StringBuilder("TooltipsFragment(tooltips="), this.a, ")");
    }
}

