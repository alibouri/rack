package com.apollographql.apollo.api;

import Nb.j;
import com.apollographql.apollo.api.json.BufferedSinkJsonWriter;

public final class ToJsonKt {
    public static final String toJson(Data operation$Data0, CustomScalarAdapters customScalarAdapters0) {
        j.f(operation$Data0, "<this>");
        j.f(customScalarAdapters0, "customScalarAdapters");
        Ec.j j0 = new Ec.j();  // initializer: Ljava/lang/Object;-><init>()V
        _DataKt.toJson(operation$Data0, new BufferedSinkJsonWriter(j0, null), customScalarAdapters0);
        return j0.B();
    }

    public static String toJson$default(Data operation$Data0, CustomScalarAdapters customScalarAdapters0, int v, Object object0) {
        if((v & 1) != 0) {
            customScalarAdapters0 = CustomScalarAdapters.Empty;
        }
        return ToJsonKt.toJson(operation$Data0, customScalarAdapters0);
    }

    public static final String toResponseJson(Data operation$Data0, CustomScalarAdapters customScalarAdapters0) {
        j.f(operation$Data0, "<this>");
        j.f(customScalarAdapters0, "customScalarAdapters");
        Ec.j j0 = new Ec.j();  // initializer: Ljava/lang/Object;-><init>()V
        BufferedSinkJsonWriter bufferedSinkJsonWriter0 = new BufferedSinkJsonWriter(j0, null);
        bufferedSinkJsonWriter0.beginObject();
        bufferedSinkJsonWriter0.name("data");
        _DataKt.toJson(operation$Data0, bufferedSinkJsonWriter0, customScalarAdapters0);
        bufferedSinkJsonWriter0.endObject();
        return j0.B();
    }

    public static String toResponseJson$default(Data operation$Data0, CustomScalarAdapters customScalarAdapters0, int v, Object object0) {
        if((v & 1) != 0) {
            customScalarAdapters0 = CustomScalarAdapters.Empty;
        }
        return ToJsonKt.toResponseJson(operation$Data0, customScalarAdapters0);
    }
}

