package com.apollographql.apollo.api;

import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;

public interface Adapter {
    Object fromJson(JsonReader arg1, CustomScalarAdapters arg2);

    void toJson(JsonWriter arg1, CustomScalarAdapters arg2, Object arg3);
}

