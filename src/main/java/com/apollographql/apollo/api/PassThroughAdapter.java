package com.apollographql.apollo.api;

import Nb.j;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.apollographql.apollo.api.json.MapJsonReader;
import com.apollographql.apollo.api.json.MapJsonWriter;

public final class PassThroughAdapter implements Adapter {
    @Override  // com.apollographql.apollo.api.Adapter
    public Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        if(!(jsonReader0 instanceof MapJsonReader)) {
            throw new IllegalStateException("UnsafeAdapter only supports MapJsonReader");
        }
        return ((MapJsonReader)jsonReader0).nextValue();
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        if(!(jsonWriter0 instanceof MapJsonWriter)) {
            throw new IllegalStateException("UnsafeAdapter only supports MapJsonWriter");
        }
        ((MapJsonWriter)jsonWriter0).value(object0);
    }
}

