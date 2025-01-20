package com.apollographql.apollo.api;

import Nb.j;
import U3.b;

public interface FieldResult {
    public static final class Failure implements FieldResult {
        private final b exception;

        public Failure(b b0) {
            j.f(b0, "exception");
            super();
            this.exception = b0;
        }

        public final b getException() {
            return this.exception;
        }
    }

    public static final class Success implements FieldResult {
        private final Object value;

        public Success(Object object0) {
            this.value = object0;
        }

        public final Object getValue() {
            return this.value;
        }
    }

}

