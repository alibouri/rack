package com.apollographql.apollo.api.http;

import Ab.a;
import Ec.l;
import Ec.m;
import Nb.j;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class HttpResponse {
    public static final class Builder {
        private l bodySource;
        private m bodyString;
        private final List headers;
        private final int statusCode;

        public Builder(int v) {
            this.statusCode = v;
            this.headers = new ArrayList();
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

        public final Builder body(l l0) {
            j.f(l0, "bodySource");
            if(this.getHasBody()) {
                throw new IllegalStateException("body() can only be called once");
            }
            this.bodySource = l0;
            return this;
        }

        @a
        public final Builder body(m m0) {
            j.f(m0, "bodyString");
            if(this.getHasBody()) {
                throw new IllegalStateException("body() can only be called once");
            }
            this.bodyString = m0;
            return this;
        }

        public final HttpResponse build() {
            return new HttpResponse(this.statusCode, this.headers, this.bodySource, this.bodyString, null);
        }

        private final boolean getHasBody() {
            return this.bodySource != null || this.bodyString != null;
        }

        public final int getStatusCode() {
            return this.statusCode;
        }

        public final Builder headers(List list0) {
            j.f(list0, "headers");
            this.headers.clear();
            this.headers.addAll(list0);
            return this;
        }
    }

    private final l bodySource;
    private final m bodyString;
    private final List headers;
    private final int statusCode;

    private HttpResponse(int v, List list0, l l0, m m0) {
        this.statusCode = v;
        this.headers = list0;
        this.bodySource = l0;
        this.bodyString = m0;
    }

    public HttpResponse(int v, List list0, l l0, m m0, DefaultConstructorMarker defaultConstructorMarker0) {
        this(v, list0, l0, m0);
    }

    public final l getBody() {
        l l0 = this.bodySource;
        if(l0 == null) {
            m m0 = this.bodyString;
            if(m0 != null) {
                Ec.j j0 = new Ec.j();  // initializer: Ljava/lang/Object;-><init>()V
                j0.e0(m0);
                return j0;
            }
            return null;
        }
        return l0;
    }

    public final List getHeaders() {
        return this.headers;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final Builder newBuilder() {
        Builder httpResponse$Builder0 = new Builder(this.statusCode);
        l l0 = this.bodySource;
        if(l0 != null) {
            httpResponse$Builder0.body(l0);
        }
        m m0 = this.bodyString;
        if(m0 != null) {
            httpResponse$Builder0.body(m0);
        }
        httpResponse$Builder0.addHeaders(this.headers);
        return httpResponse$Builder0;
    }
}

