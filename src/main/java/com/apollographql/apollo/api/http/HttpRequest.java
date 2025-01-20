package com.apollographql.apollo.api.http;

import Nb.j;
import com.apollographql.apollo.api.ExecutionContext;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class HttpRequest {
    public static final class Builder {
        private HttpBody body;
        private ExecutionContext executionContext;
        private final List headers;
        private final HttpMethod method;
        private final String url;

        public Builder(HttpMethod httpMethod0, String s) {
            j.f(httpMethod0, "method");
            j.f(s, "url");
            super();
            this.method = httpMethod0;
            this.url = s;
            this.headers = new ArrayList();
            this.executionContext = ExecutionContext.Empty;
        }

        public final Builder addExecutionContext(ExecutionContext executionContext0) {
            j.f(executionContext0, "executionContext");
            this.executionContext = this.executionContext.plus(executionContext0);
            return this;
        }

        public final Builder addHeader(String s, String s1) {
            j.f(s, "name");
            j.f(s1, "value");
            HttpHeader httpHeader0 = new HttpHeader(s, s1);
            this.headers.add(httpHeader0);
            return this;
        }

        public final Builder addHeaders(List list0) {
            j.f(list0, "headers");
            this.headers.addAll(list0);
            return this;
        }

        public final Builder body(HttpBody httpBody0) {
            j.f(httpBody0, "body");
            this.body = httpBody0;
            return this;
        }

        public final HttpRequest build() {
            return new HttpRequest(this.method, this.url, this.headers, this.body, this.executionContext, null);
        }

        public final Builder headers(List list0) {
            j.f(list0, "headers");
            this.headers.clear();
            this.headers.addAll(list0);
            return this;
        }
    }

    private final HttpBody body;
    private final ExecutionContext executionContext;
    private final List headers;
    private final HttpMethod method;
    private final String url;

    private HttpRequest(HttpMethod httpMethod0, String s, List list0, HttpBody httpBody0, ExecutionContext executionContext0) {
        this.method = httpMethod0;
        this.url = s;
        this.headers = list0;
        this.body = httpBody0;
        this.executionContext = executionContext0;
    }

    public HttpRequest(HttpMethod httpMethod0, String s, List list0, HttpBody httpBody0, ExecutionContext executionContext0, DefaultConstructorMarker defaultConstructorMarker0) {
        this(httpMethod0, s, list0, httpBody0, executionContext0);
    }

    public final HttpBody getBody() {
        return this.body;
    }

    public final ExecutionContext getExecutionContext() {
        return this.executionContext;
    }

    public final List getHeaders() {
        return this.headers;
    }

    public final HttpMethod getMethod() {
        return this.method;
    }

    public final String getUrl() {
        return this.url;
    }

    public final Builder newBuilder() {
        return HttpRequest.newBuilder$default(this, null, null, 3, null);
    }

    public final Builder newBuilder(HttpMethod httpMethod0) {
        j.f(httpMethod0, "method");
        return HttpRequest.newBuilder$default(this, httpMethod0, null, 2, null);
    }

    public final Builder newBuilder(HttpMethod httpMethod0, String s) {
        j.f(httpMethod0, "method");
        j.f(s, "url");
        Builder httpRequest$Builder0 = new Builder(httpMethod0, s);
        HttpBody httpBody0 = this.body;
        if(httpBody0 != null) {
            httpRequest$Builder0.body(httpBody0);
        }
        httpRequest$Builder0.addHeaders(this.headers);
        return httpRequest$Builder0;
    }

    public static Builder newBuilder$default(HttpRequest httpRequest0, HttpMethod httpMethod0, String s, int v, Object object0) {
        if((v & 1) != 0) {
            httpMethod0 = httpRequest0.method;
        }
        if((v & 2) != 0) {
            s = httpRequest0.url;
        }
        return httpRequest0.newBuilder(httpMethod0, s);
    }
}

