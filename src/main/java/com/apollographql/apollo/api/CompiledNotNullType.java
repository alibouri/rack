package com.apollographql.apollo.api;

import Ab.a;
import Nb.j;

public final class CompiledNotNullType extends CompiledType {
    private final CompiledType ofType;

    public CompiledNotNullType(CompiledType compiledType0) {
        j.f(compiledType0, "ofType");
        super(null);
        this.ofType = compiledType0;
    }

    public final CompiledType getOfType() {
        return this.ofType;
    }

    @Override  // com.apollographql.apollo.api.CompiledType
    @a
    public CompiledNamedType leafType() {
        return this.ofType.rawType();
    }

    @Override  // com.apollographql.apollo.api.CompiledType
    public CompiledNamedType rawType() {
        return this.ofType.rawType();
    }
}

