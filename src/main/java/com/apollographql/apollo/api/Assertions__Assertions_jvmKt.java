package com.apollographql.apollo.api;

import Bb.p;
import Nb.j;
import V0.a;
import java.util.ArrayList;
import java.util.Optional;

final class Assertions__Assertions_jvmKt {
    @SafeVarargs
    public static final void assertOneOf(Optional[] arr_optional) {
        j.f(arr_optional, "args");
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < arr_optional.length; ++v) {
            Optional optional0 = arr_optional[v];
            if(optional0.isPresent()) {
                arrayList0.add(optional0);
            }
        }
        if(arrayList0.size() != 1) {
            throw new IllegalArgumentException("@oneOf input must have one field set (got " + arrayList0.size() + ')');
        }
        if(!a.o(a.o(p.p0(arrayList0)).get()).isPresent()) {
            throw new IllegalArgumentException("The value set on @oneOf input field must be non-null");
        }
    }
}

