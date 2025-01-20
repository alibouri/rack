package com.apollographql.apollo.api;

import Ab.a;
import Nb.j;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;

@a
public final class OptionalAdapter implements Adapter {
    private final Adapter wrappedAdapter;

    public OptionalAdapter(Adapter adapter0) {
        j.f(adapter0, "wrappedAdapter");
        super();
        this.wrappedAdapter = adapter0;
    }

    public Present fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        return new Present(this.wrappedAdapter.fromJson(jsonReader0, customScalarAdapters0));
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return this.fromJson(jsonReader0, customScalarAdapters0);
    }

    public void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Present optional$Present0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(optional$Present0, "value");
        this.wrappedAdapter.toJson(jsonWriter0, customScalarAdapters0, optional$Present0.getValue());
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        this.toJson(jsonWriter0, customScalarAdapters0, ((Present)object0));
    }
}

