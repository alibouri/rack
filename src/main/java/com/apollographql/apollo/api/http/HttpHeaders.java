package com.apollographql.apollo.api.http;

import Nb.j;
import Vb.q;
import java.util.List;

public final class HttpHeaders {
    public static final String valueOf(List list0, String s) {
        j.f(list0, "<this>");
        j.f(s, "name");
        for(Object object0: list0) {
            if(q.J(((HttpHeader)object0).getName(), s)) {
                return ((HttpHeader)object0) == null ? null : ((HttpHeader)object0).getValue();
            }
            if(false) {
                break;
            }
        }
        return null;
    }
}

