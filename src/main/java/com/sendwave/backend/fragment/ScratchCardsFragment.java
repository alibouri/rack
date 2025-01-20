package com.sendwave.backend.fragment;

import Nb.j;
import a9.b7;
import com.apollographql.apollo.api.Fragment.Data;

public final class ScratchCardsFragment implements Data {
    public final String a;
    public final b7 b;

    public ScratchCardsFragment(String s, b7 b70) {
        this.a = s;
        this.b = b70;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ScratchCardsFragment)) {
            return false;
        }
        return j.a(this.a, ((ScratchCardsFragment)object0).a) ? j.a(this.b, ((ScratchCardsFragment)object0).b) : false;
    }

    public final String getId() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? v * 0x1F : v * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "ScratchCardsFragment(id=" + this.a + ", scratchCards=" + this.b + ")";
    }
}

