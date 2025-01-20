package com.apollographql.apollo.api;

import Ab.a;
import Bb.A;
import Bb.p;
import Nb.j;
import U3.b;
import U3.d;
import U3.g;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ApolloResponse {
    public static final class Builder {
        private Data data;
        private List errors;
        private b exception;
        private ExecutionContext executionContext;
        private Map extensions;
        private boolean isLast;
        private final Operation operation;
        private UUID requestUuid;

        public Builder(Operation operation0, UUID uUID0) {
            j.f(operation0, "operation");
            j.f(uUID0, "requestUuid");
            this(operation0, uUID0, null, null, null, null);
        }

        @a
        public Builder(Operation operation0, UUID uUID0, Data operation$Data0) {
            j.f(operation0, "operation");
            j.f(uUID0, "requestUuid");
            this(operation0, uUID0, operation$Data0, null, null, null);
        }

        public Builder(Operation operation0, UUID uUID0, Data operation$Data0, List list0, Map map0, b b0) {
            j.f(operation0, "operation");
            j.f(uUID0, "requestUuid");
            super();
            this.operation = operation0;
            this.requestUuid = uUID0;
            this.data = operation$Data0;
            this.errors = list0;
            this.extensions = map0;
            this.exception = b0;
            this.executionContext = ExecutionContext.Empty;
        }

        public final Builder addExecutionContext(ExecutionContext executionContext0) {
            j.f(executionContext0, "executionContext");
            this.executionContext = this.executionContext.plus(executionContext0);
            return this;
        }

        public final ApolloResponse build() {
            Operation operation0 = this.operation;
            UUID uUID0 = this.requestUuid;
            Data operation$Data0 = this.data;
            ExecutionContext executionContext0 = this.executionContext;
            Map map0 = this.extensions;
            if(map0 == null) {
                map0 = A.X;
            }
            return new ApolloResponse(uUID0, operation0, operation$Data0, this.errors, this.exception, map0, executionContext0, this.isLast, null);
        }

        public final Builder data(Data operation$Data0) {
            this.data = operation$Data0;
            return this;
        }

        public final Builder errors(List list0) {
            this.errors = list0;
            return this;
        }

        public final Builder exception(b b0) {
            this.exception = b0;
            return this;
        }

        public final Builder extensions(Map map0) {
            this.extensions = map0;
            return this;
        }

        public final Builder isLast(boolean z) {
            this.isLast = z;
            return this;
        }

        public final Builder requestUuid(UUID uUID0) {
            j.f(uUID0, "requestUuid");
            this.requestUuid = uUID0;
            return this;
        }
    }

    public final Data data;
    public final List errors;
    public final b exception;
    public final ExecutionContext executionContext;
    public final Map extensions;
    public final boolean isLast;
    public final Operation operation;
    public final UUID requestUuid;

    private ApolloResponse(UUID uUID0, Operation operation0, Data operation$Data0, List list0, b b0, Map map0, ExecutionContext executionContext0, boolean z) {
        this.requestUuid = uUID0;
        this.operation = operation0;
        this.data = operation$Data0;
        this.errors = list0;
        this.exception = b0;
        this.extensions = map0;
        this.executionContext = executionContext0;
        this.isLast = z;
    }

    public ApolloResponse(UUID uUID0, Operation operation0, Data operation$Data0, List list0, b b0, Map map0, ExecutionContext executionContext0, boolean z, DefaultConstructorMarker defaultConstructorMarker0) {
        this(uUID0, operation0, operation$Data0, list0, b0, map0, executionContext0, z);
    }

    public final Data dataAssertNoErrors() {
        if(!this.hasErrors()) {
            if(this.exception != null) {
                throw new g("An exception happened", this.exception);  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
            }
            return this.dataOrThrow();
        }
        j.c(this.errors);
        throw new d(((Error)p.p0(this.errors)));
    }

    public final Data dataOrThrow() {
        Data operation$Data0 = this.data;
        if(operation$Data0 == null) {
            throw new g("No data was found", this.exception);  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
        }
        return operation$Data0;
    }

    public final boolean hasErrors() {
        return this.errors == null || this.errors.isEmpty() ? 0 : 1;
    }

    public final Builder newBuilder() {
        return new Builder(this.operation, this.requestUuid, this.data, this.errors, this.extensions, this.exception).addExecutionContext(this.executionContext).isLast(this.isLast);
    }
}

