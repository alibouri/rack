package com.apollographql.apollo.api.json;

import Ec.m;
import Nb.j;
import Nb.x;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.jvm.functions.Function1;

public final class -JsonWriters {
    public static final m buildJsonByteString(String s, Function1 function10) {
        j.f(function10, "block");
        Ec.j j0 = new Ec.j();  // initializer: Ljava/lang/Object;-><init>()V
        function10.n(new BufferedSinkJsonWriter(j0, s));
        return j0.N(j0.Y);
    }

    public static m buildJsonByteString$default(String s, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        j.f(function10, "block");
        Ec.j j0 = new Ec.j();  // initializer: Ljava/lang/Object;-><init>()V
        function10.n(new BufferedSinkJsonWriter(j0, s));
        return j0.N(j0.Y);
    }

    public static final Object buildJsonMap(Function1 function10) {
        j.f(function10, "block");
        MapJsonWriter mapJsonWriter0 = new MapJsonWriter();
        function10.n(mapJsonWriter0);
        return mapJsonWriter0.root();
    }

    public static final String buildJsonString(String s, Function1 function10) {
        j.f(function10, "block");
        Ec.j j0 = new Ec.j();  // initializer: Ljava/lang/Object;-><init>()V
        function10.n(new BufferedSinkJsonWriter(j0, s));
        return j0.B();
    }

    public static String buildJsonString$default(String s, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        j.f(function10, "block");
        Ec.j j0 = new Ec.j();  // initializer: Ljava/lang/Object;-><init>()V
        function10.n(new BufferedSinkJsonWriter(j0, s));
        return j0.B();
    }

    public static final void writeAny(JsonWriter jsonWriter0, Object object0) {
        j.f(jsonWriter0, "<this>");
        if(object0 == null) {
            jsonWriter0.nullValue();
            return;
        }
        if(object0 instanceof Map) {
            jsonWriter0.beginObject();
            for(Object object1: ((Map)object0).entrySet()) {
                Object object2 = ((Map.Entry)object1).getKey();
                Object object3 = ((Map.Entry)object1).getValue();
                jsonWriter0.name(String.valueOf(object2));
                -JsonWriters.writeAny(jsonWriter0, object3);
            }
            jsonWriter0.endObject();
            return;
        }
        if(object0 instanceof List) {
            jsonWriter0.beginArray();
            for(Object object4: ((Iterable)object0)) {
                -JsonWriters.writeAny(jsonWriter0, object4);
            }
            jsonWriter0.endArray();
            return;
        }
        if(object0 instanceof Boolean) {
            jsonWriter0.value(((Boolean)object0).booleanValue());
            return;
        }
        if(object0 instanceof Integer) {
            jsonWriter0.value(((Number)object0).intValue());
            return;
        }
        if(object0 instanceof Long) {
            jsonWriter0.value(((Number)object0).longValue());
            return;
        }
        if(object0 instanceof Double) {
            jsonWriter0.value(((Number)object0).doubleValue());
            return;
        }
        if(object0 instanceof JsonNumber) {
            jsonWriter0.value(((JsonNumber)object0));
            return;
        }
        if(!(object0 instanceof String)) {
            throw new IllegalStateException(("Cannot write " + object0 + " of class \'" + x.a(object0.getClass()) + "\' to Json").toString());
        }
        jsonWriter0.value(((String)object0));
    }

    public static final void writeArray(JsonWriter jsonWriter0, Function1 function10) {
        j.f(jsonWriter0, "<this>");
        j.f(function10, "block");
        jsonWriter0.beginArray();
        function10.n(jsonWriter0);
        jsonWriter0.endArray();
    }

    public static final void writeObject(JsonWriter jsonWriter0, Function1 function10) {
        j.f(jsonWriter0, "<this>");
        j.f(function10, "block");
        jsonWriter0.beginObject();
        function10.n(jsonWriter0);
        jsonWriter0.endObject();
    }
}

