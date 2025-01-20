package com.apollographql.apollo.api.json;

import Bb.q;
import Nb.j;

public final class JsonReaders {
    public static final String readTypename(JsonReader jsonReader0) {
        j.f(jsonReader0, "<this>");
        if(jsonReader0.selectName(q.K("__typename")) != 0) {
            throw new IllegalStateException("__typename not found");
        }
        String s = jsonReader0.nextString();
        if(s == null) {
            throw new IllegalStateException("__typename is null");
        }
        return s;
    }
}

