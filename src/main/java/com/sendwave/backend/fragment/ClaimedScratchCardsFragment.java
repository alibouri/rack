package com.sendwave.backend.fragment;

import Nb.j;
import a9.M0;
import com.apollographql.apollo.api.Fragment.Data;
import java.util.List;

public final class ClaimedScratchCardsFragment implements Data {
    public final M0 a;
    public final List b;

    public ClaimedScratchCardsFragment(M0 m00, List list0) {
        this.a = m00;
        this.b = list0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ClaimedScratchCardsFragment)) {
            return false;
        }
        return j.a(this.a, ((ClaimedScratchCardsFragment)object0).a) ? j.a(this.b, ((ClaimedScratchCardsFragment)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "ClaimedScratchCardsFragment(pageInfo=" + this.a + ", edges=" + this.b + ")";
    }
}

