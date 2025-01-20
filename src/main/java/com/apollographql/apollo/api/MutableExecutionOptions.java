package com.apollographql.apollo.api;

import com.apollographql.apollo.api.http.HttpMethod;
import java.util.List;

public interface MutableExecutionOptions extends ExecutionOptions {
    Object addExecutionContext(ExecutionContext arg1);

    Object addHttpHeader(String arg1, String arg2);

    Object canBeBatched(Boolean arg1);

    Object enableAutoPersistedQueries(Boolean arg1);

    Object httpHeaders(List arg1);

    Object httpMethod(HttpMethod arg1);

    Object sendApqExtensions(Boolean arg1);

    Object sendDocument(Boolean arg1);
}

