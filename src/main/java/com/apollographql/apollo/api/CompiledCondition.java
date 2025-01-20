package com.apollographql.apollo.api;

import Nb.j;
import m5.b;

public final class CompiledCondition {
    private final boolean inverted;
    private final String name;

    public CompiledCondition(String s, boolean z) {
        j.f(s, "name");
        super();
        this.name = s;
        this.inverted = z;
    }

    public final String component1() {
        return this.name;
    }

    public final boolean component2() {
        return this.inverted;
    }

    public final CompiledCondition copy(String s, boolean z) {
        j.f(s, "name");
        return new CompiledCondition(s, z);
    }

    public static CompiledCondition copy$default(CompiledCondition compiledCondition0, String s, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            s = compiledCondition0.name;
        }
        if((v & 2) != 0) {
            z = compiledCondition0.inverted;
        }
        return compiledCondition0.copy(s, z);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof CompiledCondition)) {
            return false;
        }
        return j.a(this.name, ((CompiledCondition)object0).name) ? this.inverted == ((CompiledCondition)object0).inverted : false;
    }

    public final boolean getInverted() {
        return this.inverted;
    }

    public final String getName() {
        return this.name;
    }

    @Override
    public int hashCode() {
        int v = this.name.hashCode();
        return this.inverted ? v * 0x1F + 0x4CF : v * 0x1F + 0x4D5;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("CompiledCondition(name=");
        stringBuilder0.append(this.name);
        stringBuilder0.append(", inverted=");
        return b.z(stringBuilder0, this.inverted, ')');
    }
}

