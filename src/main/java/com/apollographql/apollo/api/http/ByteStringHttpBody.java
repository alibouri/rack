package com.apollographql.apollo.api.http;

import Ec.k;
import Ec.m;
import Nb.j;
import v7.d;

public final class ByteStringHttpBody implements HttpBody {
    private final m byteString;
    private final String contentType;

    public ByteStringHttpBody(String s, m m0) {
        j.f(s, "contentType");
        j.f(m0, "byteString");
        super();
        this.contentType = s;
        this.byteString = m0;
    }

    public ByteStringHttpBody(String s, String s1) {
        j.f(s, "contentType");
        j.f(s1, "string");
        this(s, d.l(s1));
    }

    @Override  // com.apollographql.apollo.api.http.HttpBody
    public long getContentLength() {
        return (long)this.byteString.e();
    }

    @Override  // com.apollographql.apollo.api.http.HttpBody
    public String getContentType() {
        return this.contentType;
    }

    @Override  // com.apollographql.apollo.api.http.HttpBody
    public void writeTo(k k0) {
        j.f(k0, "bufferedSink");
        k0.I(this.byteString);
    }
}

