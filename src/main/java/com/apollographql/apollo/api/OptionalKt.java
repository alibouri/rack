package com.apollographql.apollo.api;

import Ab.e;
import Nb.j;
import kotlin.jvm.functions.Function1;

public final class OptionalKt {
    public static final Object getOrElse(Optional optional0, Object object0) {
        j.f(optional0, "<this>");
        return optional0 instanceof Present ? ((Present)optional0).getValue() : object0;
    }

    public static final Optional map(Optional optional0, Function1 function10) {
        j.f(optional0, "<this>");
        j.f(function10, "mapper");
        if(optional0 instanceof Absent) {
            return Absent.INSTANCE;
        }
        if(!(optional0 instanceof Present)) {
            throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
        }
        return Optional.Companion.present(function10.n(((Present)optional0).getValue()));
    }
}

