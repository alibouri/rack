package com.apollographql.apollo.api;

import Bb.p;
import M.J;
import Nb.j;
import U3.g;
import com.apollographql.apollo.api.json.JsonReader;
import java.util.ArrayList;

final class Assertions__AssertionsKt {
    public static final void assertOneOf(Optional[] arr_optional) {
        j.f(arr_optional, "args");
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < arr_optional.length; ++v) {
            Optional optional0 = arr_optional[v];
            if(optional0 instanceof Present) {
                arrayList0.add(optional0);
            }
        }
        if(arrayList0.size() != 1) {
            throw new IllegalArgumentException("@oneOf input must have one field set (got " + arrayList0.size() + ')');
        }
        Present optional$Present0 = (Present)p.p0(arrayList0);
        if(optional$Present0.getValue() == null || j.a(optional$Present0.getValue(), Absent.INSTANCE)) {
            throw new IllegalArgumentException("The value set on @oneOf input field must be non-null");
        }
    }

    public static final void checkFieldNotMissing(Object object0, String s) {
        j.f(s, "name");
        if(object0 == null) {
            throw new g(J.e("Field \'", s, "\' is missing or null"), 6);
        }
    }

    public static final Void missingField(JsonReader jsonReader0, String s) {
        j.f(jsonReader0, "jsonReader");
        j.f(s, "name");
        StringBuilder stringBuilder0 = b.s("Field \'", s, "\' is missing or null at path ");
        stringBuilder0.append(jsonReader0.getPath());
        throw new g(stringBuilder0.toString(), 6);
    }
}

