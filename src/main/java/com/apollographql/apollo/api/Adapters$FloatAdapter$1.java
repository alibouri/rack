package com.apollographql.apollo.api;

import Nb.j;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;

public final class Adapters.FloatAdapter.1 implements Adapter {
    public Float fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        return (float)jsonReader0.nextDouble();
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return this.fromJson(jsonReader0, customScalarAdapters0);
    }

    public void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, float f) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        jsonWriter0.value(((double)f));
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        this.toJson(jsonWriter0, customScalarAdapters0, ((Number)object0).floatValue());
    }
}

