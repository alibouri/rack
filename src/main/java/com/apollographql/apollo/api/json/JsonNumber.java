package com.apollographql.apollo.api.json;

import Nb.j;

public final class JsonNumber {
    private final String value;

    public JsonNumber(String s) {
        j.f(s, "value");
        super();
        this.value = s;
    }

    public final String getValue() {
        return this.value;
    }
}

