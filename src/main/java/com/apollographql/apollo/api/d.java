package com.apollographql.apollo.api;

import Aa.J;
import Nb.j;

public abstract class d {
    static {
    }

    public static ExecutionContext a(ExecutionContext executionContext0, ExecutionContext executionContext1) {
        j.f(executionContext1, "context");
        return executionContext1 == EmptyExecutionContext.INSTANCE ? executionContext0 : ((ExecutionContext)executionContext1.fold(executionContext0, new J(7)));
    }

    public static ExecutionContext b(ExecutionContext executionContext0, Element executionContext$Element0) {
        j.f(executionContext0, "acc");
        j.f(executionContext$Element0, "element");
        ExecutionContext executionContext1 = executionContext0.minusKey(executionContext$Element0.getKey());
        return executionContext1 != EmptyExecutionContext.INSTANCE ? new CombinedExecutionContext(executionContext1, executionContext$Element0) : executionContext$Element0;
    }
}

