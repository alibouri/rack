package com.apollographql.apollo.api;

import com.apollographql.apollo.api.json.JsonReader;

public final class Assertions {
    public static final void assertOneOf(Optional[] arr_optional) {
        Assertions__AssertionsKt.assertOneOf(arr_optional);
    }

    @SafeVarargs
    public static final void assertOneOf(java.util.Optional[] arr_optional) {
        Assertions__Assertions_jvmKt.assertOneOf(arr_optional);
    }

    public static final void checkFieldNotMissing(Object object0, String s) {
        Assertions__AssertionsKt.checkFieldNotMissing(object0, s);
    }

    public static final Void missingField(JsonReader jsonReader0, String s) {
        return Assertions__AssertionsKt.missingField(jsonReader0, s);
    }
}

