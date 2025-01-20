package com.apollographql.apollo.api;

import Nb.j;
import U3.d;
import com.apollographql.apollo.api.json.JsonReader.Token;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;

final class ErrorAwareAdapter implements Adapter {
    private final Adapter wrappedAdapter;

    public ErrorAwareAdapter(Adapter adapter0) {
        j.f(adapter0, "wrappedAdapter");
        super();
        this.wrappedAdapter = adapter0;
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        if(jsonReader0.peek() == Token.NULL) {
            Error error0 = customScalarAdapters0.firstErrorStartingWith(jsonReader0.getPath());
            if(error0 != null) {
                jsonReader0.skipValue();
                throw new d(error0);
            }
        }
        return this.wrappedAdapter.fromJson(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        this.wrappedAdapter.toJson(jsonWriter0, customScalarAdapters0, object0);
    }
}

