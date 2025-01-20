package com.apollographql.apollo.api;

import Nb.j;
import Y8.o;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;

public final class Adapters.UploadAdapter.1 implements Adapter {
    public Upload fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        throw o.v(jsonReader0, "reader", customScalarAdapters0, "customScalarAdapters", "File Upload used in output position");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return this.fromJson(jsonReader0, customScalarAdapters0);
    }

    public void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Upload upload0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(upload0, "value");
        jsonWriter0.value(upload0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        this.toJson(jsonWriter0, customScalarAdapters0, ((Upload)object0));
    }
}

