package com.apollographql.apollo.api;

import Nb.j;
import kotlin.jvm.functions.Function2;

public abstract class e {
    public static Object a(Element executionContext$Element0, Object object0, Function2 function20) {
        j.f(function20, "operation");
        return function20.j(object0, executionContext$Element0);
    }

    public static Element b(Element executionContext$Element0, Key executionContext$Key0) {
        j.f(executionContext$Key0, "key");
        return j.a(executionContext$Element0.getKey(), executionContext$Key0) ? executionContext$Element0 : null;
    }

    public static ExecutionContext c(Element executionContext$Element0, Key executionContext$Key0) {
        j.f(executionContext$Key0, "key");
        return j.a(executionContext$Element0.getKey(), executionContext$Key0) ? EmptyExecutionContext.INSTANCE : executionContext$Element0;
    }
}

