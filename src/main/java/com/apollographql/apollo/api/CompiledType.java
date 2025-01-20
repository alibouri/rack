package com.apollographql.apollo.api;

import Ab.a;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class CompiledType {
    private CompiledType() {
    }

    public CompiledType(DefaultConstructorMarker defaultConstructorMarker0) {
    }

    @a
    public abstract CompiledNamedType leafType();

    public abstract CompiledNamedType rawType();
}

