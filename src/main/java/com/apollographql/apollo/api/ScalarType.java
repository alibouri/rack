package com.apollographql.apollo.api;

import Nb.j;

public final class ScalarType extends CompiledNamedType {
    public ScalarType(String s) {
        j.f(s, "name");
        super(s, null);
    }
}

