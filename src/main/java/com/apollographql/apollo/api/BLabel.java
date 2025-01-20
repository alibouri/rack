package com.apollographql.apollo.api;

import M.J;
import Nb.j;

public final class BLabel extends BTerm {
    private final String label;

    public BLabel(String s) {
        super(null);
        this.label = s;
    }

    public final String component1() {
        return this.label;
    }

    public final BLabel copy(String s) {
        return new BLabel(s);
    }

    public static BLabel copy$default(BLabel bLabel0, String s, int v, Object object0) {
        if((v & 1) != 0) {
            s = bLabel0.label;
        }
        return bLabel0.copy(s);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof BLabel ? j.a(this.label, ((BLabel)object0).label) : false;
    }

    public final String getLabel() {
        return this.label;
    }

    @Override
    public int hashCode() {
        return this.label == null ? 0 : this.label.hashCode();
    }

    @Override
    public String toString() {
        return J.g(new StringBuilder("BLabel(label="), this.label, ')');
    }
}

