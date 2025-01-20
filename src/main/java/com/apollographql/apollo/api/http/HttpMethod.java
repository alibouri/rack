package com.apollographql.apollo.api.http;

import Gb.a;
import Gb.b;

public enum HttpMethod {
    Get,
    Post;

    static {
        HttpMethod.$VALUES = arr_httpMethod;
        HttpMethod.$ENTRIES = new b(arr_httpMethod);
    }

    public static a getEntries() {
        return HttpMethod.$ENTRIES;
    }
}

