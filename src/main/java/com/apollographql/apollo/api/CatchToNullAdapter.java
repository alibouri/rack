package com.apollographql.apollo.api;

import Nb.j;
import U3.b;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;

final class CatchToNullAdapter implements Adapter {
    private final Adapter wrappedAdapter;

    public CatchToNullAdapter(Adapter adapter0) {
        j.f(adapter0, "wrappedAdapter");
        super();
        this.wrappedAdapter = adapter0;
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        try {
            return this.wrappedAdapter.fromJson(jsonReader0, customScalarAdapters0);
        }
        catch(b unused_ex) {
            return null;
        }
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        if(object0 == null) {
            jsonWriter0.nullValue();
            return;
        }
        this.wrappedAdapter.toJson(jsonWriter0, customScalarAdapters0, object0);
    }
}

