package com.apollographql.apollo.api;

import Ab.a;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class CompiledNamedType extends CompiledType {
    private final String name;

    private CompiledNamedType(String s) {
        super(null);
        this.name = s;
    }

    public CompiledNamedType(String s, DefaultConstructorMarker defaultConstructorMarker0) {
        this(s);
    }

    public final String getName() {
        return this.name;
    }

    @Override  // com.apollographql.apollo.api.CompiledType
    @a
    public CompiledNamedType leafType() {
        return this;
    }

    @Override  // com.apollographql.apollo.api.CompiledType
    public CompiledNamedType rawType() {
        return this;
    }
}

