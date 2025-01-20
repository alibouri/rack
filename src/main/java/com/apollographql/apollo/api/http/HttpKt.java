package com.apollographql.apollo.api.http;

import Nb.j;
import java.util.List;
import java.util.Locale;

public final class HttpKt {
    public static final String get(List list0, String s) {
        j.f(list0, "<this>");
        j.f(s, "name");
        boolean z = false;
        Object object0 = null;
        for(Object object1: list0) {
            Locale locale0 = Locale.ROOT;
            String s1 = ((HttpHeader)object1).getName().toLowerCase(locale0);
            j.e(s1, "toLowerCase(...)");
            String s2 = s.toLowerCase(locale0);
            j.e(s2, "toLowerCase(...)");
            if(!s1.equals(s2)) {
                continue;
            }
            if(!z) {
                z = true;
                object0 = object1;
                continue;
            }
            object0 = null;
            goto label_21;
        }
        if(!z) {
            object0 = null;
        }
    label_21:
        if(((HttpHeader)object0) != null) {
            String s3 = ((HttpHeader)object0).getValue();
            return s3 == null ? null : Vb.j.z0(s3).toString();
        }
        return null;
    }
}

