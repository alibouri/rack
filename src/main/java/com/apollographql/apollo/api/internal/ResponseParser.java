package com.apollographql.apollo.api.internal;

import Nb.j;
import com.apollographql.apollo.api.ApolloResponse.Builder;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Error;
import com.apollographql.apollo.api.Executables;
import com.apollographql.apollo.api.Operation.Data;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.json.-JsonReaders;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.MapJsonReader;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public final class ResponseParser {
    public static final ResponseParser INSTANCE;

    static {
        ResponseParser.INSTANCE = new ResponseParser();
    }

    public final ApolloResponse parse(JsonReader jsonReader0, Operation operation0, UUID uUID0, CustomScalarAdapters customScalarAdapters0, Set set0) {
        j.f(jsonReader0, "jsonReader");
        j.f(operation0, "operation");
        j.f(customScalarAdapters0, "customScalarAdapters");
        jsonReader0.beginObject();
        Data operation$Data0 = null;
        List list0 = null;
        Map map0 = null;
        while(jsonReader0.hasNext()) {
            switch(jsonReader0.nextName()) {
                case "data": {
                    operation$Data0 = (Data)Executables.parseData(operation0, jsonReader0, customScalarAdapters0, Executables.falseVariables(operation0, customScalarAdapters0), set0, list0);
                    continue;
                }
                case "errors": {
                    list0 = ResponseParserKt.readErrors(jsonReader0);
                    continue;
                }
                case "extensions": {
                    Object object0 = -JsonReaders.readAny(jsonReader0);
                    map0 = object0 instanceof Map ? ((Map)object0) : null;
                    continue;
                }
                default: {
                    jsonReader0.skipValue();
                }
            }
        }
        jsonReader0.endObject();
        if(uUID0 == null) {
            uUID0 = UUID.randomUUID();
            j.e(uUID0, "randomUUID(...)");
        }
        return new Builder(operation0, uUID0).errors(list0).data(operation$Data0).extensions(map0).build();
    }

    public final Error parseError(Map map0) {
        j.f(map0, "payload");
        return ResponseParserKt.readError(new MapJsonReader(map0, null, 2, null));
    }
}

