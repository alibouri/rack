package com.apollographql.apollo.api;

import Nb.j;

public final class CompiledVariable {
    private final String name;

    public CompiledVariable(String s) {
        j.f(s, "name");
        super();
        this.name = s;
    }

    public final String getName() {
        return this.name;
    }
}

