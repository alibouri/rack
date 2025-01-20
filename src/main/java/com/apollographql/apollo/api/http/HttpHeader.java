package com.apollographql.apollo.api.http;

import M.J;
import Nb.j;

public final class HttpHeader {
    private final String name;
    private final String value;

    public HttpHeader(String s, String s1) {
        j.f(s, "name");
        j.f(s1, "value");
        super();
        this.name = s;
        this.value = s1;
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.value;
    }

    public final HttpHeader copy(String s, String s1) {
        j.f(s, "name");
        j.f(s1, "value");
        return new HttpHeader(s, s1);
    }

    public static HttpHeader copy$default(HttpHeader httpHeader0, String s, String s1, int v, Object object0) {
        if((v & 1) != 0) {
            s = httpHeader0.name;
        }
        if((v & 2) != 0) {
            s1 = httpHeader0.value;
        }
        return httpHeader0.copy(s, s1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof HttpHeader)) {
            return false;
        }
        return j.a(this.name, ((HttpHeader)object0).name) ? j.a(this.value, ((HttpHeader)object0).value) : false;
    }

    public final String getName() {
        return this.name;
    }

    public final String getValue() {
        return this.value;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode() + this.name.hashCode() * 0x1F;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("HttpHeader(name=");
        stringBuilder0.append(this.name);
        stringBuilder0.append(", value=");
        return J.g(stringBuilder0, this.value, ')');
    }
}

