package com.sendwave.backend.fragment;

import M.J;
import Nb.j;
import com.apollographql.apollo.api.Fragment.Data;
import java.util.List;

public final class SupportChannelsFragment implements Data {
    public final List a;

    public SupportChannelsFragment(List list0) {
        this.a = list0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof SupportChannelsFragment ? j.a(this.a, ((SupportChannelsFragment)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return J.h(new StringBuilder("SupportChannelsFragment(supportChannels="), this.a, ")");
    }
}

