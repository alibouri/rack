package com.apollographql.apollo.api;

import Nb.j;

public final class CustomScalarType extends CompiledNamedType {
    private final String className;

    public CustomScalarType(String s, String s1) {
        j.f(s, "name");
        j.f(s1, "className");
        super(s, null);
        this.className = s1;
    }

    public final String getClassName() {
        return this.className;
    }
}

