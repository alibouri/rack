package com.apollographql.apollo.api;

import Nb.j;
import com.apollographql.apollo.api.json.BufferedSinkJsonWriter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.apollographql.apollo.api.json.MapJsonWriter;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class Executables {
    public static final void composeData(Executable executable0, JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Data executable$Data0) {
        j.f(executable0, "<this>");
        j.f(jsonWriter0, "jsonWriter");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(executable$Data0, "value");
        executable0.adapter().toJson(jsonWriter0, customScalarAdapters0, executable$Data0);
    }

    public static final Set falseVariables(Executable executable0, CustomScalarAdapters customScalarAdapters0) {
        j.f(executable0, "<this>");
        j.f(customScalarAdapters0, "customScalarAdapters");
        Map map0 = Executables.variables(executable0, customScalarAdapters0, true).getValueMap();
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        for(Object object0: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(j.a(map$Entry0.getValue(), Boolean.FALSE)) {
                linkedHashMap0.put(map$Entry0.getKey(), map$Entry0.getValue());
            }
        }
        return linkedHashMap0.keySet();
    }

    public static final Data parseData(Executable executable0, JsonReader jsonReader0) {
        j.f(executable0, "<this>");
        j.f(jsonReader0, "jsonReader");
        return Executables.parseData$default(executable0, jsonReader0, null, null, null, null, 30, null);
    }

    public static final Data parseData(Executable executable0, JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(executable0, "<this>");
        j.f(jsonReader0, "jsonReader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        return Executables.parseData$default(executable0, jsonReader0, customScalarAdapters0, null, null, null, 28, null);
    }

    public static final Data parseData(Executable executable0, JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0, Set set0) {
        j.f(executable0, "<this>");
        j.f(jsonReader0, "jsonReader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        return Executables.parseData$default(executable0, jsonReader0, customScalarAdapters0, set0, null, null, 24, null);
    }

    public static final Data parseData(Executable executable0, JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0, Set set0, Set set1) {
        j.f(executable0, "<this>");
        j.f(jsonReader0, "jsonReader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        return Executables.parseData$default(executable0, jsonReader0, customScalarAdapters0, set0, set1, null, 16, null);
    }

    public static final Data parseData(Executable executable0, JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0, Set set0, Set set1, List list0) {
        j.f(executable0, "<this>");
        j.f(jsonReader0, "jsonReader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        CustomScalarAdapters customScalarAdapters1 = customScalarAdapters0.newBuilder().falseVariables(set0).deferredFragmentIdentifiers(set1).errors(list0).build();
        return (Data)Adapters.-nullable(executable0.adapter()).fromJson(jsonReader0, customScalarAdapters1);
    }

    public static Data parseData$default(Executable executable0, JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0, Set set0, Set set1, List list0, int v, Object object0) {
        if((v & 2) != 0) {
            customScalarAdapters0 = CustomScalarAdapters.Empty;
        }
        Set set2 = (v & 4) == 0 ? set0 : null;
        Set set3 = (v & 8) == 0 ? set1 : null;
        return (v & 16) == 0 ? Executables.parseData(executable0, jsonReader0, customScalarAdapters0, set2, set3, list0) : Executables.parseData(executable0, jsonReader0, customScalarAdapters0, set2, set3, null);
    }

    public static final Variables variables(Executable executable0, CustomScalarAdapters customScalarAdapters0) {
        j.f(executable0, "<this>");
        j.f(customScalarAdapters0, "customScalarAdapters");
        return Executables.variables(executable0, customScalarAdapters0, false);
    }

    public static final Variables variables(Executable executable0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        j.f(executable0, "<this>");
        j.f(customScalarAdapters0, "customScalarAdapters");
        MapJsonWriter mapJsonWriter0 = new MapJsonWriter();
        mapJsonWriter0.beginObject();
        executable0.serializeVariables(mapJsonWriter0, customScalarAdapters0, z);
        mapJsonWriter0.endObject();
        Object object0 = mapJsonWriter0.root();
        j.d(object0, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        return new Variables(((Map)object0));
    }

    public static final String variablesJson(Executable executable0, CustomScalarAdapters customScalarAdapters0) {
        j.f(executable0, "<this>");
        j.f(customScalarAdapters0, "customScalarAdapters");
        Ec.j j0 = new Ec.j();  // initializer: Ljava/lang/Object;-><init>()V
        BufferedSinkJsonWriter bufferedSinkJsonWriter0 = new BufferedSinkJsonWriter(j0, null, 2, null);
        bufferedSinkJsonWriter0.beginObject();
        executable0.serializeVariables(bufferedSinkJsonWriter0, customScalarAdapters0, false);
        bufferedSinkJsonWriter0.endObject();
        return j0.B();
    }
}

