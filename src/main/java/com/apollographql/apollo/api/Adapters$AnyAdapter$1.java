package com.apollographql.apollo.api;

import Nb.j;
import com.apollographql.apollo.api.json.-JsonReaders;
import com.apollographql.apollo.api.json.-JsonWriters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;

public final class Adapters.AnyAdapter.1 implements Adapter {
    public final Object fromJson(JsonReader jsonReader0) {
        j.f(jsonReader0, "reader");
        Object object0 = -JsonReaders.readAny(jsonReader0);
        j.c(object0);
        return object0;
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        return this.fromJson(jsonReader0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(object0, "value");
        this.toJson(jsonWriter0, object0);
    }

    public final void toJson(JsonWriter jsonWriter0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(object0, "value");
        -JsonWriters.writeAny(jsonWriter0, object0);
    }
}

