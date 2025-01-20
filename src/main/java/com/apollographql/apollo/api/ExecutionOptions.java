package com.apollographql.apollo.api;

import com.apollographql.apollo.api.http.HttpMethod;
import java.util.List;

public interface ExecutionOptions {
    public static final class Companion {
        static final Companion $$INSTANCE = null;
        public static final String CAN_BE_BATCHED = "X-APOLLO-CAN-BE-BATCHED";

        static {
            Companion.$$INSTANCE = new Companion();
        }
    }

    public static final String CAN_BE_BATCHED = "X-APOLLO-CAN-BE-BATCHED";
    public static final Companion Companion;

    static {
        ExecutionOptions.Companion = Companion.$$INSTANCE;
    }

    Boolean getCanBeBatched();

    Boolean getEnableAutoPersistedQueries();

    ExecutionContext getExecutionContext();

    List getHttpHeaders();

    HttpMethod getHttpMethod();

    Boolean getSendApqExtensions();

    Boolean getSendDocument();
}

