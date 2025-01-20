package com.apollographql.apollo.api;

import Ab.t;
import Ba.l;
import Ec.b;
import Ec.k;
import Ec.m;
import Nb.j;
import T3.c;
import kotlin.jvm.functions.Function1;

public final class DefaultUpload implements Upload {
    public static final class Builder {
        private long contentLength;
        private String contentType;
        private String fileName;
        private Function1 writeTo;

        public Builder() {
            this.contentLength = -1L;
        }

        public final DefaultUpload build() {
            Function1 function10 = this.writeTo;
            if(function10 == null) {
                throw new IllegalStateException("DefaultUpload content is missing");
            }
            return new DefaultUpload(function10, (this.contentType == null ? "application/octet-stream" : this.contentType), this.contentLength, this.fileName);
        }

        public final Builder content(m m0) {
            j.f(m0, "byteString");
            if(this.writeTo != null) {
                throw new IllegalStateException("content() can only be called once");
            }
            this.writeTo = new l(22, m0);
            this.contentLength = (long)m0.e();
            return this;
        }

        public final Builder content(String s) {
            j.f(s, "content");
            if(this.writeTo != null) {
                throw new IllegalStateException("content() can only be called once");
            }
            this.writeTo = new c(s, 2);
            this.contentLength = b.j(s);
            return this;
        }

        public final Builder content(Function1 function10) {
            j.f(function10, "writeTo");
            if(this.writeTo != null) {
                throw new IllegalStateException("content() can only be called once");
            }
            this.writeTo = function10;
            return this;
        }

        public final Builder content(byte[] arr_b) {
            j.f(arr_b, "byteArray");
            if(this.writeTo != null) {
                throw new IllegalStateException("content() can only be called once");
            }
            this.writeTo = new l(23, arr_b);
            this.contentLength = (long)arr_b.length;
            return this;
        }

        private static final t content$lambda$10$lambda$9(byte[] arr_b, k k0) {
            j.f(k0, "sink");
            k0.C(arr_b);
            return t.a;
        }

        private static final t content$lambda$4$lambda$3(String s, k k0) {
            j.f(k0, "sink");
            k0.R(s);
            return t.a;
        }

        private static final t content$lambda$7$lambda$6(m m0, k k0) {
            j.f(k0, "sink");
            k0.I(m0);
            return t.a;
        }

        public final Builder contentLength(long v) {
            this.contentLength = v;
            return this;
        }

        public final Builder contentType(String s) {
            j.f(s, "contentType");
            this.contentType = s;
            return this;
        }

        public final Builder fileName(String s) {
            j.f(s, "fileName");
            this.fileName = s;
            return this;
        }
    }

    private final long contentLength;
    private final String contentType;
    private final String fileName;
    private final Function1 writeTo;

    public DefaultUpload(Function1 function10, String s, long v, String s1) {
        j.f(function10, "writeTo");
        j.f(s, "contentType");
        super();
        this.writeTo = function10;
        this.contentType = s;
        this.contentLength = v;
        this.fileName = s1;
    }

    @Override  // com.apollographql.apollo.api.Upload
    public long getContentLength() {
        return this.contentLength;
    }

    @Override  // com.apollographql.apollo.api.Upload
    public String getContentType() {
        return this.contentType;
    }

    @Override  // com.apollographql.apollo.api.Upload
    public String getFileName() {
        return this.fileName;
    }

    public final Builder newBuilder() {
        Builder defaultUpload$Builder0 = new Builder().content(this.writeTo).contentType(this.getContentType()).contentLength(this.getContentLength());
        if(this.getFileName() != null) {
            defaultUpload$Builder0.fileName(this.getFileName());
        }
        return defaultUpload$Builder0;
    }

    @Override  // com.apollographql.apollo.api.Upload
    public void writeTo(k k0) {
        j.f(k0, "sink");
        this.writeTo.n(k0);
    }
}

