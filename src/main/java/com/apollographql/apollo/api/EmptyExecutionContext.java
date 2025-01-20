package com.apollographql.apollo.api;

import Nb.j;
import kotlin.jvm.functions.Function2;

public final class EmptyExecutionContext implements ExecutionContext {
    public static final EmptyExecutionContext INSTANCE;

    static {
        EmptyExecutionContext.INSTANCE = new EmptyExecutionContext();
    }

    @Override  // com.apollographql.apollo.api.ExecutionContext
    public Object fold(Object object0, Function2 function20) {
        j.f(function20, "operation");
        return object0;
    }

    @Override  // com.apollographql.apollo.api.ExecutionContext
    public Element get(Key executionContext$Key0) {
        j.f(executionContext$Key0, "key");
        return null;
    }

    @Override  // com.apollographql.apollo.api.ExecutionContext
    public ExecutionContext minusKey(Key executionContext$Key0) {
        j.f(executionContext$Key0, "key");
        return this;
    }

    @Override  // com.apollographql.apollo.api.ExecutionContext
    public ExecutionContext plus(ExecutionContext executionContext0) {
        j.f(executionContext0, "context");
        return executionContext0;
    }
}

