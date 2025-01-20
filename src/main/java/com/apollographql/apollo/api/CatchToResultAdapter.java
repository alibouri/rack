package com.apollographql.apollo.api;

import Nb.j;
import U3.b;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;

final class CatchToResultAdapter implements Adapter {
    private final Adapter wrappedAdapter;

    public CatchToResultAdapter(Adapter adapter0) {
        j.f(adapter0, "wrappedAdapter");
        super();
        this.wrappedAdapter = adapter0;
    }

    public FieldResult fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        try {
            return new Success(this.wrappedAdapter.fromJson(jsonReader0, customScalarAdapters0));
        }
        catch(b b0) {
            return new Failure(b0);
        }
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return this.fromJson(jsonReader0, customScalarAdapters0);
    }

    public void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, FieldResult fieldResult0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(fieldResult0, "value");
        if(fieldResult0 instanceof Success) {
            Object object0 = FieldResultKt.getOrThrow(fieldResult0);
            this.wrappedAdapter.toJson(jsonWriter0, customScalarAdapters0, object0);
        }
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        this.toJson(jsonWriter0, customScalarAdapters0, ((FieldResult)object0));
    }
}

