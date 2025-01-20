package com.apollographql.apollo.api.http;

import Ec.k;

public interface HttpBody {
    long getContentLength();

    String getContentType();

    void writeTo(k arg1);
}

