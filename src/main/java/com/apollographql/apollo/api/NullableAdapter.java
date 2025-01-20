package com.apollographql.apollo.api;

import Nb.j;
import com.apollographql.apollo.api.json.JsonReader.Token;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;

public final class NullableAdapter implements Adapter {
    private final Adapter wrappedAdapter;

    public NullableAdapter(Adapter adapter0) {
        j.f(adapter0, "wrappedAdapter");
        super();
        this.wrappedAdapter = adapter0;
        if(adapter0 instanceof NullableAdapter) {
            throw new IllegalStateException("The adapter is already nullable");
        }
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        if(jsonReader0.peek() == Token.NULL) {
            jsonReader0.skipValue();
            return null;
        }
        return this.wrappedAdapter.fromJson(jsonReader0, customScalarAdapters0);
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

