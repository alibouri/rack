package com.apollographql.apollo.api;

import Bb.p;
import Bb.z;
import Nb.j;
import com.apollographql.apollo.api.http.HttpHeader;
import com.apollographql.apollo.api.http.HttpMethod;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ApolloRequest implements ExecutionOptions {
    public static final class Builder implements MutableExecutionOptions {
        private Boolean canBeBatched;
        private Boolean enableAutoPersistedQueries;
        private ExecutionContext executionContext;
        private Boolean failFastIfOffline;
        private List httpHeaders;
        private HttpMethod httpMethod;
        private Boolean ignoreApolloClientHttpHeaders;
        private final Operation operation;
        private UUID requestUuid;
        private Boolean retryOnError;
        private Boolean sendApqExtensions;
        private Boolean sendDocument;

        public Builder(Operation operation0) {
            j.f(operation0, "operation");
            super();
            this.operation = operation0;
            this.executionContext = ExecutionContext.Empty;
        }

        public Builder addExecutionContext(ExecutionContext executionContext0) {
            j.f(executionContext0, "executionContext");
            this.executionContext = this.getExecutionContext().plus(executionContext0);
            return this;
        }

        @Override  // com.apollographql.apollo.api.MutableExecutionOptions
        public Object addExecutionContext(ExecutionContext executionContext0) {
            return this.addExecutionContext(executionContext0);
        }

        public Builder addHttpHeader(String s, String s1) {
            j.f(s, "name");
            j.f(s1, "value");
            List list0 = this.getHttpHeaders();
            if(list0 == null) {
                list0 = z.X;
            }
            this.httpHeaders = p.G0(list0, new HttpHeader(s, s1));
            return this;
        }

        @Override  // com.apollographql.apollo.api.MutableExecutionOptions
        public Object addHttpHeader(String s, String s1) {
            return this.addHttpHeader(s, s1);
        }

        public final ApolloRequest build() {
            Operation operation0 = this.operation;
            UUID uUID0 = this.requestUuid;
            if(uUID0 == null) {
                uUID0 = UUID.randomUUID();
                j.e(uUID0, "randomUUID(...)");
            }
            return new ApolloRequest(operation0, uUID0, this.getExecutionContext(), this.getHttpMethod(), this.getHttpHeaders(), this.getSendApqExtensions(), this.getSendDocument(), this.getEnableAutoPersistedQueries(), this.getCanBeBatched(), this.ignoreApolloClientHttpHeaders, this.retryOnError, this.failFastIfOffline, null);
        }

        public Builder canBeBatched(Boolean boolean0) {
            this.canBeBatched = boolean0;
            return this;
        }

        @Override  // com.apollographql.apollo.api.MutableExecutionOptions
        public Object canBeBatched(Boolean boolean0) {
            return this.canBeBatched(boolean0);
        }

        public Builder enableAutoPersistedQueries(Boolean boolean0) {
            this.enableAutoPersistedQueries = boolean0;
            return this;
        }

        @Override  // com.apollographql.apollo.api.MutableExecutionOptions
        public Object enableAutoPersistedQueries(Boolean boolean0) {
            return this.enableAutoPersistedQueries(boolean0);
        }

        public final Builder executionContext(ExecutionContext executionContext0) {
            j.f(executionContext0, "executionContext");
            this.executionContext = executionContext0;
            return this;
        }

        public final Builder failFastIfOffline(Boolean boolean0) {
            this.failFastIfOffline = boolean0;
            return this;
        }

        @Override  // com.apollographql.apollo.api.ExecutionOptions
        public Boolean getCanBeBatched() {
            return this.canBeBatched;
        }

        @Override  // com.apollographql.apollo.api.ExecutionOptions
        public Boolean getEnableAutoPersistedQueries() {
            return this.enableAutoPersistedQueries;
        }

        @Override  // com.apollographql.apollo.api.ExecutionOptions
        public ExecutionContext getExecutionContext() {
            return this.executionContext;
        }

        public final Boolean getFailFastIfOffline() {
            return this.failFastIfOffline;
        }

        public static void getFailFastIfOffline$annotations() {
        }

        @Override  // com.apollographql.apollo.api.ExecutionOptions
        public List getHttpHeaders() {
            return this.httpHeaders;
        }

        @Override  // com.apollographql.apollo.api.ExecutionOptions
        public HttpMethod getHttpMethod() {
            return this.httpMethod;
        }

        public final Boolean getIgnoreApolloClientHttpHeaders() {
            return this.ignoreApolloClientHttpHeaders;
        }

        public final Operation getOperation() {
            return this.operation;
        }

        public final UUID getRequestUuid() {
            return this.requestUuid;
        }

        public final Boolean getRetryOnError() {
            return this.retryOnError;
        }

        public static void getRetryOnError$annotations() {
        }

        @Override  // com.apollographql.apollo.api.ExecutionOptions
        public Boolean getSendApqExtensions() {
            return this.sendApqExtensions;
        }

        @Override  // com.apollographql.apollo.api.ExecutionOptions
        public Boolean getSendDocument() {
            return this.sendDocument;
        }

        public Builder httpHeaders(List list0) {
            this.httpHeaders = list0;
            return this;
        }

        @Override  // com.apollographql.apollo.api.MutableExecutionOptions
        public Object httpHeaders(List list0) {
            return this.httpHeaders(list0);
        }

        public Builder httpMethod(HttpMethod httpMethod0) {
            this.httpMethod = httpMethod0;
            return this;
        }

        @Override  // com.apollographql.apollo.api.MutableExecutionOptions
        public Object httpMethod(HttpMethod httpMethod0) {
            return this.httpMethod(httpMethod0);
        }

        public final Builder ignoreApolloClientHttpHeaders(Boolean boolean0) {
            this.ignoreApolloClientHttpHeaders = boolean0;
            return this;
        }

        public final Builder requestUuid(UUID uUID0) {
            j.f(uUID0, "requestUuid");
            this.requestUuid = uUID0;
            return this;
        }

        public final Builder retryOnError(Boolean boolean0) {
            this.retryOnError = boolean0;
            return this;
        }

        public Builder sendApqExtensions(Boolean boolean0) {
            this.sendApqExtensions = boolean0;
            return this;
        }

        @Override  // com.apollographql.apollo.api.MutableExecutionOptions
        public Object sendApqExtensions(Boolean boolean0) {
            return this.sendApqExtensions(boolean0);
        }

        public Builder sendDocument(Boolean boolean0) {
            this.sendDocument = boolean0;
            return this;
        }

        @Override  // com.apollographql.apollo.api.MutableExecutionOptions
        public Object sendDocument(Boolean boolean0) {
            return this.sendDocument(boolean0);
        }
    }

    private final Boolean canBeBatched;
    private final Boolean enableAutoPersistedQueries;
    private final ExecutionContext executionContext;
    private final Boolean failFastIfOffline;
    private final List httpHeaders;
    private final HttpMethod httpMethod;
    private final Boolean ignoreApolloClientHttpHeaders;
    private final Operation operation;
    private final UUID requestUuid;
    private final Boolean retryOnError;
    private final Boolean sendApqExtensions;
    private final Boolean sendDocument;

    private ApolloRequest(Operation operation0, UUID uUID0, ExecutionContext executionContext0, HttpMethod httpMethod0, List list0, Boolean boolean0, Boolean boolean1, Boolean boolean2, Boolean boolean3, Boolean boolean4, Boolean boolean5, Boolean boolean6) {
        this.operation = operation0;
        this.requestUuid = uUID0;
        this.executionContext = executionContext0;
        this.httpMethod = httpMethod0;
        this.httpHeaders = list0;
        this.sendApqExtensions = boolean0;
        this.sendDocument = boolean1;
        this.enableAutoPersistedQueries = boolean2;
        this.canBeBatched = boolean3;
        this.ignoreApolloClientHttpHeaders = boolean4;
        this.retryOnError = boolean5;
        this.failFastIfOffline = boolean6;
    }

    public ApolloRequest(Operation operation0, UUID uUID0, ExecutionContext executionContext0, HttpMethod httpMethod0, List list0, Boolean boolean0, Boolean boolean1, Boolean boolean2, Boolean boolean3, Boolean boolean4, Boolean boolean5, Boolean boolean6, DefaultConstructorMarker defaultConstructorMarker0) {
        this(operation0, uUID0, executionContext0, httpMethod0, list0, boolean0, boolean1, boolean2, boolean3, boolean4, boolean5, boolean6);
    }

    @Override  // com.apollographql.apollo.api.ExecutionOptions
    public Boolean getCanBeBatched() {
        return this.canBeBatched;
    }

    @Override  // com.apollographql.apollo.api.ExecutionOptions
    public Boolean getEnableAutoPersistedQueries() {
        return this.enableAutoPersistedQueries;
    }

    @Override  // com.apollographql.apollo.api.ExecutionOptions
    public ExecutionContext getExecutionContext() {
        return this.executionContext;
    }

    public final Boolean getFailFastIfOffline() {
        return this.failFastIfOffline;
    }

    public static void getFailFastIfOffline$annotations() {
    }

    @Override  // com.apollographql.apollo.api.ExecutionOptions
    public List getHttpHeaders() {
        return this.httpHeaders;
    }

    @Override  // com.apollographql.apollo.api.ExecutionOptions
    public HttpMethod getHttpMethod() {
        return this.httpMethod;
    }

    public final Boolean getIgnoreApolloClientHttpHeaders() {
        return this.ignoreApolloClientHttpHeaders;
    }

    public final Operation getOperation() {
        return this.operation;
    }

    public final UUID getRequestUuid() {
        return this.requestUuid;
    }

    public final Boolean getRetryOnError() {
        return this.retryOnError;
    }

    public static void getRetryOnError$annotations() {
    }

    @Override  // com.apollographql.apollo.api.ExecutionOptions
    public Boolean getSendApqExtensions() {
        return this.sendApqExtensions;
    }

    @Override  // com.apollographql.apollo.api.ExecutionOptions
    public Boolean getSendDocument() {
        return this.sendDocument;
    }

    public final Builder newBuilder() {
        return this.newBuilder(this.operation);
    }

    public final Builder newBuilder(Operation operation0) {
        j.f(operation0, "operation");
        return new Builder(operation0).requestUuid(this.requestUuid).executionContext(this.getExecutionContext()).httpMethod(this.getHttpMethod()).httpHeaders(this.getHttpHeaders()).sendApqExtensions(this.getSendApqExtensions()).sendDocument(this.getSendDocument()).enableAutoPersistedQueries(this.getEnableAutoPersistedQueries()).canBeBatched(this.getCanBeBatched()).retryOnError(this.retryOnError).failFastIfOffline(this.failFastIfOffline).ignoreApolloClientHttpHeaders(this.ignoreApolloClientHttpHeaders);
    }
}

