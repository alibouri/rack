package com.apollographql.apollo.api;

import Nb.j;
import com.apollographql.apollo.api.json.-JsonWriters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.apollographql.apollo.api.json.MapJsonReader;
import com.apollographql.apollo.api.json.MapJsonWriter;

public final class ObjectAdapter implements Adapter {
    private final boolean buffered;
    private final Adapter wrappedAdapter;

    public ObjectAdapter(Adapter adapter0, boolean z) {
        j.f(adapter0, "wrappedAdapter");
        super();
        this.wrappedAdapter = adapter0;
        this.buffered = z;
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        if(this.buffered) {
            jsonReader0 = MapJsonReader.Companion.buffer(jsonReader0);
        }
        jsonReader0.beginObject();
        Object object0 = this.wrappedAdapter.fromJson(jsonReader0, customScalarAdapters0);
        jsonReader0.endObject();
        return object0;
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        if(this.buffered && !(jsonWriter0 instanceof MapJsonWriter)) {
            MapJsonWriter mapJsonWriter0 = new MapJsonWriter();
            mapJsonWriter0.beginObject();
            this.wrappedAdapter.toJson(mapJsonWriter0, customScalarAdapters0, object0);
            mapJsonWriter0.endObject();
            Object object1 = mapJsonWriter0.root();
            j.c(object1);
            -JsonWriters.writeAny(jsonWriter0, object1);
            return;
        }
        jsonWriter0.beginObject();
        this.wrappedAdapter.toJson(jsonWriter0, customScalarAdapters0, object0);
        jsonWriter0.endObject();
    }
}

