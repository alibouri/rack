package com.apollographql.apollo.api;

import M.J;
import Nb.j;

public final class BVariable extends BTerm {
    private final String name;

    public BVariable(String s) {
        j.f(s, "name");
        super(null);
        this.name = s;
    }

    public final String component1() {
        return this.name;
    }

    public final BVariable copy(String s) {
        j.f(s, "name");
        return new BVariable(s);
    }

    public static BVariable copy$default(BVariable bVariable0, String s, int v, Object object0) {
        if((v & 1) != 0) {
            s = bVariable0.name;
        }
        return bVariable0.copy(s);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof BVariable ? j.a(this.name, ((BVariable)object0).name) : false;
    }

    public final String getName() {
        return this.name;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    @Override
    public String toString() {
        return J.g(new StringBuilder("BVariable(name="), this.name, ')');
    }
}

