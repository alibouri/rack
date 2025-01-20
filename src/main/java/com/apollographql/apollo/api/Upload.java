package com.apollographql.apollo.api;

import Ec.k;

public interface Upload {
    long getContentLength();

    String getContentType();

    String getFileName();

    void writeTo(k arg1);
}

