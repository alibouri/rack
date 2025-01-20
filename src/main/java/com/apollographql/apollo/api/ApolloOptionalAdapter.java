package com.apollographql.apollo.api;

import Nb.j;
import com.apollographql.apollo.api.json.JsonReader.Token;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;

public final class ApolloOptionalAdapter implements Adapter {
    private final Adapter wrappedAdapter;

    public ApolloOptionalAdapter(Adapter adapter0) {
        j.f(adapter0, "wrappedAdapter");
        super();
        this.wrappedAdapter = adapter0;
    }

    public Optional fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        if(jsonReader0.peek() == Token.NULL) {
            jsonReader0.skipValue();
            return Absent.INSTANCE;
        }
        return new Present(this.wrappedAdapter.fromJson(jsonReader0, customScalarAdapters0));
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return this.fromJson(jsonReader0, customScalarAdapters0);
    }

    public void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Optional optional0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(optional0, "value");
        if(optional0 instanceof Present) {
            Object object0 = ((Present)optional0).getValue();
            this.wrappedAdapter.toJson(jsonWriter0, customScalarAdapters0, object0);
            return;
        }
        jsonWriter0.nullValue();
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        this.toJson(jsonWriter0, customScalarAdapters0, ((Optional)object0));
    }
}

