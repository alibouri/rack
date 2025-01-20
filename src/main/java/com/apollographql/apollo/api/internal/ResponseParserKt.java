package com.apollographql.apollo.api.internal;

import Bb.z;
import Nb.j;
import com.apollographql.apollo.api.Error.Location;
import com.apollographql.apollo.api.Error;
import com.apollographql.apollo.api.json.-JsonReaders;
import com.apollographql.apollo.api.json.JsonReader.Token;
import com.apollographql.apollo.api.json.JsonReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class ResponseParserKt {
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[Token.values().length];
            try {
                arr_v[Token.NUMBER.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Token.LONG.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    private static final Error readError(JsonReader jsonReader0) {
        String s2;
        jsonReader0.beginObject();
        String s = "";
        List list0 = null;
        List list1 = null;
        Map map0 = null;
        Map map1 = null;
        while(jsonReader0.hasNext()) {
            String s1 = jsonReader0.nextName();
            switch(s1) {
                case "extensions": {
                    Object object0 = -JsonReaders.readAny(jsonReader0);
                    map0 = object0 instanceof Map ? ((Map)object0) : null;
                    continue;
                }
                case "locations": {
                    list0 = ResponseParserKt.readErrorLocations(jsonReader0);
                    continue;
                }
                case "message": {
                    s2 = jsonReader0.nextString();
                    if(s2 == null) {
                        s = "";
                        continue;
                    }
                    break;
                }
                case "path": {
                    list1 = ResponseParserKt.readPath(jsonReader0);
                    continue;
                }
                default: {
                    if(map1 == null) {
                        map1 = new LinkedHashMap();
                    }
                    map1.put(s1, -JsonReaders.readAny(jsonReader0));
                    continue;
                }
            }
            s = s2;
        }
        jsonReader0.endObject();
        return new Error(s, list0, list1, map0, map1);
    }

    private static final Location readErrorLocation(JsonReader jsonReader0) {
        jsonReader0.beginObject();
        int v = -1;
        int v1 = -1;
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            if(j.a(s, "line")) {
                v = jsonReader0.nextInt();
            }
            else if(j.a(s, "column")) {
                v1 = jsonReader0.nextInt();
            }
            else {
                jsonReader0.skipValue();
            }
        }
        jsonReader0.endObject();
        return new Location(v, v1);
    }

    private static final List readErrorLocations(JsonReader jsonReader0) {
        if(jsonReader0.peek() == Token.NULL) {
            return (List)jsonReader0.nextNull();
        }
        List list0 = new ArrayList();
        jsonReader0.beginArray();
        while(jsonReader0.hasNext()) {
            list0.add(ResponseParserKt.readErrorLocation(jsonReader0));
        }
        jsonReader0.endArray();
        return list0;
    }

    public static final List readErrors(JsonReader jsonReader0) {
        j.f(jsonReader0, "<this>");
        if(jsonReader0.peek() == Token.NULL) {
            jsonReader0.nextNull();
            return z.X;
        }
        jsonReader0.beginArray();
        List list0 = new ArrayList();
        while(jsonReader0.hasNext()) {
            list0.add(ResponseParserKt.readError(jsonReader0));
        }
        jsonReader0.endArray();
        return list0;
    }

    private static final List readPath(JsonReader jsonReader0) {
        if(jsonReader0.peek() == Token.NULL) {
            return (List)jsonReader0.nextNull();
        }
        List list0 = new ArrayList();
        jsonReader0.beginArray();
        while(jsonReader0.hasNext()) {
            switch(WhenMappings.$EnumSwitchMapping$0[jsonReader0.peek().ordinal()]) {
                case 1: 
                case 2: {
                    list0.add(jsonReader0.nextInt());
                    break;
                }
                default: {
                    String s = jsonReader0.nextString();
                    j.c(s);
                    list0.add(s);
                }
            }
        }
        jsonReader0.endArray();
        return list0;
    }
}

