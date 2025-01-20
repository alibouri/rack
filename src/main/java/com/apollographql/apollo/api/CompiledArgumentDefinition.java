package com.apollographql.apollo.api;

import Nb.j;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CompiledArgumentDefinition {
    public static final class Builder {
        private boolean isKey;
        private boolean isPagination;
        private final String name;

        public Builder(CompiledArgumentDefinition compiledArgumentDefinition0) {
            j.f(compiledArgumentDefinition0, "argumentDefinition");
            this(compiledArgumentDefinition0.getName());
            this.isKey = compiledArgumentDefinition0.isKey();
            this.isPagination = compiledArgumentDefinition0.isPagination();
        }

        public Builder(String s) {
            j.f(s, "name");
            super();
            this.name = s;
        }

        public final CompiledArgumentDefinition build() {
            return new CompiledArgumentDefinition(this.name, this.isKey, this.isPagination, null);
        }

        public final Builder isKey(boolean z) {
            this.isKey = z;
            return this;
        }

        public final Builder isPagination(boolean z) {
            this.isPagination = z;
            return this;
        }
    }

    private final boolean isKey;
    private final boolean isPagination;
    private final String name;

    private CompiledArgumentDefinition(String s, boolean z, boolean z1) {
        this.name = s;
        this.isKey = z;
        this.isPagination = z1;
    }

    public CompiledArgumentDefinition(String s, boolean z, boolean z1, DefaultConstructorMarker defaultConstructorMarker0) {
        this(s, z, z1);
    }

    public final String getName() {
        return this.name;
    }

    public final boolean isKey() {
        return this.isKey;
    }

    public final boolean isPagination() {
        return this.isPagination;
    }

    public static void isPagination$annotations() {
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }
}

