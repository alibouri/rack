package com.apollographql.apollo.api;

import kotlin.jvm.functions.Function2;

public interface ExecutionContext {
    public static final class Companion {
        static final Companion $$INSTANCE;

        static {
            Companion.$$INSTANCE = new Companion();
        }
    }

    public interface Element extends ExecutionContext {
        @Override  // com.apollographql.apollo.api.ExecutionContext
        Object fold(Object arg1, Function2 arg2);

        @Override  // com.apollographql.apollo.api.ExecutionContext
        Element get(Key arg1);

        Key getKey();

        @Override  // com.apollographql.apollo.api.ExecutionContext
        ExecutionContext minusKey(Key arg1);
    }

    public interface Key {
    }

    public static final Companion Companion;
    public static final ExecutionContext Empty;

    static {
        ExecutionContext.Companion = Companion.$$INSTANCE;
        ExecutionContext.Empty = EmptyExecutionContext.INSTANCE;
    }

    Object fold(Object arg1, Function2 arg2);

    Element get(Key arg1);

    ExecutionContext minusKey(Key arg1);

    ExecutionContext plus(ExecutionContext arg1);
}

