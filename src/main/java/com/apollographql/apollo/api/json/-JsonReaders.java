package com.apollographql.apollo.api.json;

import Ec.l;
import Nb.j;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class -JsonReaders {
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[Token.values().length];
            try {
                arr_v[Token.NULL.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Token.BOOLEAN.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Token.LONG.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Token.NUMBER.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Token.STRING.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Token.BEGIN_OBJECT.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Token.BEGIN_ARRAY.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    private static final Object guessNumber(JsonReader jsonReader0) {
        try {
            return jsonReader0.nextInt();
        }
        catch(Exception unused_ex) {
            try {
                return jsonReader0.nextLong();
            }
            catch(Exception unused_ex) {
                try {
                    return jsonReader0.nextDouble();
                }
                catch(Exception unused_ex) {
                    return jsonReader0.nextNumber();
                }
            }
        }
    }

    public static final JsonReader jsonReader(l l0) {
        j.f(l0, "<this>");
        return new BufferedSourceJsonReader(l0);
    }

    public static final JsonReader jsonReader(Map map0) {
        j.f(map0, "<this>");
        return new MapJsonReader(map0, null, 2, null);
    }

    public static final Object readAny(JsonReader jsonReader0) {
        Object object0;
        j.f(jsonReader0, "<this>");
        Token jsonReader$Token0 = jsonReader0.peek();
        switch(WhenMappings.$EnumSwitchMapping$0[jsonReader$Token0.ordinal()]) {
            case 1: {
                return jsonReader0.nextNull();
            }
            case 2: {
                return Boolean.valueOf(jsonReader0.nextBoolean());
            }
            case 3: 
            case 4: {
                return -JsonReaders.guessNumber(jsonReader0);
            }
            case 5: {
                return jsonReader0.nextString();
            }
            case 6: {
                jsonReader0.beginObject();
                object0 = new LinkedHashMap();
                while(jsonReader0.hasNext()) {
                    ((Map)object0).put(jsonReader0.nextName(), -JsonReaders.readAny(jsonReader0));
                }
                jsonReader0.endObject();
                return object0;
            }
            case 7: {
                jsonReader0.beginArray();
                object0 = new ArrayList();
                while(jsonReader0.hasNext()) {
                    ((List)object0).add(-JsonReaders.readAny(jsonReader0));
                }
                jsonReader0.endArray();
                return object0;
            }
            default: {
                throw new IllegalStateException(("unknown token " + jsonReader$Token0).toString());
            }
        }
    }
}

