package com.apollographql.apollo.api;

import Nb.j;
import Y8.o;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;

public final class Adapters.StringAdapter.1 implements Adapter {
    @Override  // com.apollographql.apollo.api.Adapter
    public Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return this.fromJson(jsonReader0, customScalarAdapters0);
    }

    public String fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return o.x(jsonReader0, "reader", customScalarAdapters0, "customScalarAdapters");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        this.toJson(jsonWriter0, customScalarAdapters0, ((String)object0));
    }

    public void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, String s) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(s, "value");
        jsonWriter0.value(s);
    }
}

