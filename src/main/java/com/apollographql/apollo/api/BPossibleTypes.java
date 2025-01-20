package com.apollographql.apollo.api;

import Bb.n;
import Nb.j;
import java.util.Set;

public final class BPossibleTypes extends BTerm {
    private final Set possibleTypes;

    public BPossibleTypes(Set set0) {
        j.f(set0, "possibleTypes");
        super(null);
        this.possibleTypes = set0;
    }

    public BPossibleTypes(String[] arr_s) {
        j.f(arr_s, "types");
        this(n.z0(arr_s));
    }

    public final Set component1() {
        return this.possibleTypes;
    }

    public final BPossibleTypes copy(Set set0) {
        j.f(set0, "possibleTypes");
        return new BPossibleTypes(set0);
    }

    public static BPossibleTypes copy$default(BPossibleTypes bPossibleTypes0, Set set0, int v, Object object0) {
        if((v & 1) != 0) {
            set0 = bPossibleTypes0.possibleTypes;
        }
        return bPossibleTypes0.copy(set0);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof BPossibleTypes ? j.a(this.possibleTypes, ((BPossibleTypes)object0).possibleTypes) : false;
    }

    public final Set getPossibleTypes() {
        return this.possibleTypes;
    }

    @Override
    public int hashCode() {
        return this.possibleTypes.hashCode();
    }

    @Override
    public String toString() {
        return "BPossibleTypes(possibleTypes=" + this.possibleTypes + ')';
    }
}

