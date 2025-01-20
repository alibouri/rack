package com.apollographql.apollo.api;

import Nb.j;
import java.util.List;

public final class EnumType extends CompiledNamedType {
    private final List values;

    public EnumType(String s, List list0) {
        j.f(s, "name");
        j.f(list0, "values");
        super(s, null);
        this.values = list0;
    }

    public final List getValues() {
        return this.values;
    }
}

