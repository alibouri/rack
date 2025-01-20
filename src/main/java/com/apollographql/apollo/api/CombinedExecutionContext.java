package com.apollographql.apollo.api;

import Nb.j;
import kotlin.jvm.functions.Function2;

public final class CombinedExecutionContext implements ExecutionContext {
    private final Element element;
    private final ExecutionContext left;

    public CombinedExecutionContext(ExecutionContext executionContext0, Element executionContext$Element0) {
        j.f(executionContext0, "left");
        j.f(executionContext$Element0, "element");
        super();
        this.left = executionContext0;
        this.element = executionContext$Element0;
    }

    @Override  // com.apollographql.apollo.api.ExecutionContext
    public Object fold(Object object0, Function2 function20) {
        j.f(function20, "operation");
        return function20.j(this.left.fold(object0, function20), this.element);
    }

    @Override  // com.apollographql.apollo.api.ExecutionContext
    public Element get(Key executionContext$Key0) {
        ExecutionContext executionContext0;
        j.f(executionContext$Key0, "key");
        for(CombinedExecutionContext combinedExecutionContext0 = this; true; combinedExecutionContext0 = (CombinedExecutionContext)executionContext0) {
            Element executionContext$Element0 = combinedExecutionContext0.element.get(executionContext$Key0);
            if(executionContext$Element0 != null) {
                return executionContext$Element0;
            }
            executionContext0 = combinedExecutionContext0.left;
            if(!(executionContext0 instanceof CombinedExecutionContext)) {
                break;
            }
        }
        return executionContext0.get(executionContext$Key0);
    }

    @Override  // com.apollographql.apollo.api.ExecutionContext
    public ExecutionContext minusKey(Key executionContext$Key0) {
        j.f(executionContext$Key0, "key");
        if(this.element.get(executionContext$Key0) != null) {
            return this.left;
        }
        ExecutionContext executionContext0 = this.left.minusKey(executionContext$Key0);
        if(executionContext0 == this.left) {
            return this;
        }
        return executionContext0 == EmptyExecutionContext.INSTANCE ? this.element : new CombinedExecutionContext(executionContext0, this.element);
    }

    @Override  // com.apollographql.apollo.api.ExecutionContext
    public final ExecutionContext plus(ExecutionContext executionContext0) {
        return d.a(this, executionContext0);
    }
}

