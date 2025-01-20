package com.apollographql.apollo.api;

import Ab.e;
import Nb.j;
import U3.d;
import U3.g;

public final class FieldResultKt {
    public static final Exception exceptionOrNull(FieldResult fieldResult0) {
        j.f(fieldResult0, "<this>");
        return fieldResult0 instanceof Failure ? ((Failure)fieldResult0).getException() : null;
    }

    public static final Object getOrElse(FieldResult fieldResult0, Object object0) {
        j.f(fieldResult0, "<this>");
        return fieldResult0 instanceof Success ? ((Success)fieldResult0).getValue() : object0;
    }

    public static final Object getOrNull(FieldResult fieldResult0) {
        j.f(fieldResult0, "<this>");
        return fieldResult0 instanceof Success ? ((Success)fieldResult0).getValue() : null;
    }

    public static final Object getOrThrow(FieldResult fieldResult0) {
        j.f(fieldResult0, "<this>");
        if(fieldResult0 instanceof Success) {
            return ((Success)fieldResult0).getValue();
        }
        if(!(fieldResult0 instanceof Failure)) {
            throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
        }
        throw new g("Field error", ((Failure)fieldResult0).getException());  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    }

    public static final Error graphQLErrorOrNull(FieldResult fieldResult0) {
        j.f(fieldResult0, "<this>");
        Exception exception0 = FieldResultKt.exceptionOrNull(fieldResult0);
        d d0 = exception0 instanceof d ? ((d)exception0) : null;
        return d0 == null ? null : d0.X;
    }

    public static final boolean isSuccess(FieldResult fieldResult0) {
        j.f(fieldResult0, "<this>");
        return fieldResult0 instanceof Success;
    }
}

