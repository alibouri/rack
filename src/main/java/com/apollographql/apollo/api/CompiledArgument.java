package com.apollographql.apollo.api;

import Ab.a;
import Nb.j;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CompiledArgument {
    public static final class Builder {
        private final CompiledArgumentDefinition definition;
        private Optional value;

        public Builder(CompiledArgumentDefinition compiledArgumentDefinition0) {
            j.f(compiledArgumentDefinition0, "definition");
            super();
            this.definition = compiledArgumentDefinition0;
            this.value = Optional.Companion.absent();
        }

        public final CompiledArgument build() {
            return new CompiledArgument(this.definition, this.value, null);
        }

        public final Builder value(Object object0) {
            this.value = Optional.Companion.present(object0);
            return this;
        }
    }

    private final CompiledArgumentDefinition definition;
    private final Optional value;

    private CompiledArgument(CompiledArgumentDefinition compiledArgumentDefinition0, Optional optional0) {
        this.definition = compiledArgumentDefinition0;
        this.value = optional0;
    }

    public CompiledArgument(CompiledArgumentDefinition compiledArgumentDefinition0, Optional optional0, DefaultConstructorMarker defaultConstructorMarker0) {
        this(compiledArgumentDefinition0, optional0);
    }

    public final CompiledArgumentDefinition getDefinition() {
        return this.definition;
    }

    public final String getName() {
        return this.definition.getName();
    }

    @a
    public static void getName$annotations() {
    }

    public final Optional getValue() {
        return this.value;
    }

    public final boolean isKey() {
        return this.definition.isKey();
    }

    @a
    public static void isKey$annotations() {
    }
}

