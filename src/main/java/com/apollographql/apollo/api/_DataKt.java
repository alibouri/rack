package com.apollographql.apollo.api;

import Vb.j;
import com.apollographql.apollo.api.json.BufferedSinkJsonWriter;
import com.apollographql.apollo.api.json.JsonWriter;

public final class _DataKt {
    private static final Adapter adapter(Data operation$Data0) {
        String s1;
        String s = j.k0(operation$Data0.getClass().getName(), "$Data");
        int v = j.d0(6, s, ".");
        if(v == -1) {
            s1 = s;
        }
        else {
            s1 = s.substring(v + 1, s.length());
            Nb.j.e(s1, "substring(...)");
        }
        int v1 = j.d0(6, s, ".");
        if(v1 != -1) {
            s = s.substring(0, v1);
            Nb.j.e(s, "substring(...)");
        }
        Object object0 = Class.forName((s + ".adapter." + s1 + "_ResponseAdapter$Data")).getDeclaredField("INSTANCE").get(null);
        Nb.j.d(object0, "null cannot be cast to non-null type com.apollographql.apollo.api.Adapter<com.apollographql.apollo.api.Operation.Data>");
        return Adapters.-obj$default(((Adapter)object0), false, 1, null);
    }

    public static final void toJson(Data operation$Data0, JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0) {
        Nb.j.f(operation$Data0, "<this>");
        Nb.j.f(jsonWriter0, "jsonWriter");
        Nb.j.f(customScalarAdapters0, "customScalarAdapters");
        _DataKt.adapter(operation$Data0).toJson(jsonWriter0, customScalarAdapters0, operation$Data0);
    }

    public static void toJson$default(Data operation$Data0, JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, int v, Object object0) {
        if((v & 2) != 0) {
            customScalarAdapters0 = CustomScalarAdapters.Empty;
        }
        _DataKt.toJson(operation$Data0, jsonWriter0, customScalarAdapters0);
    }

    public static final String toJsonString(Data operation$Data0, CustomScalarAdapters customScalarAdapters0, String s) {
        Nb.j.f(operation$Data0, "<this>");
        Nb.j.f(customScalarAdapters0, "customScalarAdapters");
        Ec.j j0 = new Ec.j();  // initializer: Ljava/lang/Object;-><init>()V
        _DataKt.toJson(operation$Data0, new BufferedSinkJsonWriter(j0, s), customScalarAdapters0);
        return j0.B();
    }

    public static String toJsonString$default(Data operation$Data0, CustomScalarAdapters customScalarAdapters0, String s, int v, Object object0) {
        if((v & 1) != 0) {
            customScalarAdapters0 = CustomScalarAdapters.Empty;
        }
        if((v & 2) != 0) {
            s = null;
        }
        return _DataKt.toJsonString(operation$Data0, customScalarAdapters0, s);
    }
}

