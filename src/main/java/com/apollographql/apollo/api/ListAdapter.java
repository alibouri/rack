package com.apollographql.apollo.api;

import Nb.j;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.ArrayList;
import java.util.List;

public final class ListAdapter implements Adapter {
    private final Adapter wrappedAdapter;

    public ListAdapter(Adapter adapter0) {
        j.f(adapter0, "wrappedAdapter");
        super();
        this.wrappedAdapter = adapter0;
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return this.fromJson(jsonReader0, customScalarAdapters0);
    }

    public List fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        jsonReader0.beginArray();
        List list0 = new ArrayList();
        while(jsonReader0.hasNext()) {
            list0.add(this.wrappedAdapter.fromJson(jsonReader0, customScalarAdapters0));
        }
        jsonReader0.endArray();
        return list0;
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        this.toJson(jsonWriter0, customScalarAdapters0, ((List)object0));
    }

    public void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, List list0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(list0, "value");
        jsonWriter0.beginArray();
        for(Object object0: list0) {
            this.wrappedAdapter.toJson(jsonWriter0, customScalarAdapters0, object0);
        }
        jsonWriter0.endArray();
    }
}

