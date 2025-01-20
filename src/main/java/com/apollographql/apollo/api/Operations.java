package com.apollographql.apollo.api;

import Nb.j;
import U3.b;
import U3.f;
import U3.g;
import U5.a;
import com.apollographql.apollo.api.internal.ResponseParser;
import com.apollographql.apollo.api.json.BufferedSinkJsonWriter;
import com.apollographql.apollo.api.json.JsonReader.Token;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.Set;
import java.util.UUID;

public final class Operations {
    public static final void composeJsonRequest(Operation operation0, JsonWriter jsonWriter0) {
        j.f(operation0, "<this>");
        j.f(jsonWriter0, "jsonWriter");
        Operations.composeJsonRequest$default(operation0, jsonWriter0, null, 2, null);
    }

    public static final void composeJsonRequest(Operation operation0, JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0) {
        j.f(operation0, "<this>");
        j.f(jsonWriter0, "jsonWriter");
        j.f(customScalarAdapters0, "customScalarAdapters");
        jsonWriter0.beginObject();
        jsonWriter0.name("operationName");
        jsonWriter0.value(operation0.name());
        jsonWriter0.name("variables");
        jsonWriter0.beginObject();
        operation0.serializeVariables(jsonWriter0, customScalarAdapters0, false);
        jsonWriter0.endObject();
        jsonWriter0.name("query");
        jsonWriter0.value(operation0.document());
        jsonWriter0.endObject();
    }

    public static void composeJsonRequest$default(Operation operation0, JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, int v, Object object0) {
        if((v & 2) != 0) {
            customScalarAdapters0 = CustomScalarAdapters.Empty;
        }
        Operations.composeJsonRequest(operation0, jsonWriter0, customScalarAdapters0);
    }

    public static final String composeJsonResponse(Operation operation0, Data operation$Data0, CustomScalarAdapters customScalarAdapters0) {
        j.f(operation0, "<this>");
        j.f(operation$Data0, "data");
        j.f(customScalarAdapters0, "customScalarAdapters");
        Ec.j j0 = new Ec.j();  // initializer: Ljava/lang/Object;-><init>()V
        BufferedSinkJsonWriter bufferedSinkJsonWriter0 = new BufferedSinkJsonWriter(j0, null);
        bufferedSinkJsonWriter0.beginObject();
        bufferedSinkJsonWriter0.name("data");
        operation0.adapter().toJson(bufferedSinkJsonWriter0, customScalarAdapters0, operation$Data0);
        bufferedSinkJsonWriter0.endObject();
        return j0.B();
    }

    public static final void composeJsonResponse(Operation operation0, JsonWriter jsonWriter0, Data operation$Data0) {
        j.f(operation0, "<this>");
        j.f(jsonWriter0, "jsonWriter");
        j.f(operation$Data0, "data");
        Operations.composeJsonResponse$default(operation0, jsonWriter0, operation$Data0, null, 4, null);
    }

    public static final void composeJsonResponse(Operation operation0, JsonWriter jsonWriter0, Data operation$Data0, CustomScalarAdapters customScalarAdapters0) {
        j.f(operation0, "<this>");
        j.f(jsonWriter0, "jsonWriter");
        j.f(operation$Data0, "data");
        j.f(customScalarAdapters0, "customScalarAdapters");
        try {
            jsonWriter0.beginObject();
            jsonWriter0.name("data");
            operation0.adapter().toJson(jsonWriter0, customScalarAdapters0, operation$Data0);
            jsonWriter0.endObject();
        }
        catch(Throwable throwable0) {
            try {
                jsonWriter0.close();
            }
            catch(Throwable throwable1) {
                a.y(throwable0, throwable1);
            }
            goto label_19;
        }
        try {
            jsonWriter0.close();
            throwable0 = null;
        }
        catch(Throwable throwable0) {
        }
    label_19:
        if(throwable0 != null) {
            throw throwable0;
        }
    }

    public static String composeJsonResponse$default(Operation operation0, Data operation$Data0, CustomScalarAdapters customScalarAdapters0, int v, Object object0) {
        if((v & 2) != 0) {
            customScalarAdapters0 = CustomScalarAdapters.Empty;
        }
        return Operations.composeJsonResponse(operation0, operation$Data0, customScalarAdapters0);
    }

    public static void composeJsonResponse$default(Operation operation0, JsonWriter jsonWriter0, Data operation$Data0, CustomScalarAdapters customScalarAdapters0, int v, Object object0) {
        if((v & 4) != 0) {
            customScalarAdapters0 = CustomScalarAdapters.Empty;
        }
        Operations.composeJsonResponse(operation0, jsonWriter0, operation$Data0, customScalarAdapters0);
    }

    @Ab.a
    public static final ApolloResponse parseJsonResponse(Operation operation0, JsonReader jsonReader0) {
        j.f(operation0, "<this>");
        j.f(jsonReader0, "jsonReader");
        return Operations.parseJsonResponse$default(operation0, jsonReader0, null, null, 6, null);
    }

    @Ab.a
    public static final ApolloResponse parseJsonResponse(Operation operation0, JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(operation0, "<this>");
        j.f(jsonReader0, "jsonReader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        return Operations.parseJsonResponse$default(operation0, jsonReader0, customScalarAdapters0, null, 4, null);
    }

    @Ab.a
    public static final ApolloResponse parseJsonResponse(Operation operation0, JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0, Set set0) {
        ApolloResponse apolloResponse1;
        j.f(operation0, "<this>");
        j.f(jsonReader0, "jsonReader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        ApolloResponse apolloResponse0 = null;
        try {
            apolloResponse1 = ResponseParser.INSTANCE.parse(jsonReader0, operation0, null, customScalarAdapters0, set0);
        }
        catch(Throwable throwable0) {
            try {
                jsonReader0.close();
            }
            catch(Throwable throwable1) {
                a.y(throwable0, throwable1);
            }
            goto label_18;
        }
        try {
            jsonReader0.close();
        }
        catch(Throwable apolloResponse0) {
        }
        ApolloResponse apolloResponse2 = apolloResponse0;
        apolloResponse0 = apolloResponse1;
        throwable0 = apolloResponse2;
    label_18:
        if(throwable0 != null) {
            throw throwable0;
        }
        return apolloResponse0;
    }

    public static ApolloResponse parseJsonResponse$default(Operation operation0, JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0, Set set0, int v, Object object0) {
        if((v & 2) != 0) {
            customScalarAdapters0 = CustomScalarAdapters.Empty;
        }
        if((v & 4) != 0) {
            set0 = null;
        }
        return Operations.parseJsonResponse(operation0, jsonReader0, customScalarAdapters0, set0);
    }

    public static final ApolloResponse parseResponse(Operation operation0, JsonReader jsonReader0) {
        j.f(operation0, "<this>");
        j.f(jsonReader0, "jsonReader");
        return Operations.parseResponse$default(operation0, jsonReader0, null, null, null, 14, null);
    }

    public static final ApolloResponse parseResponse(Operation operation0, JsonReader jsonReader0, UUID uUID0) {
        j.f(operation0, "<this>");
        j.f(jsonReader0, "jsonReader");
        return Operations.parseResponse$default(operation0, jsonReader0, uUID0, null, null, 12, null);
    }

    public static final ApolloResponse parseResponse(Operation operation0, JsonReader jsonReader0, UUID uUID0, CustomScalarAdapters customScalarAdapters0) {
        j.f(operation0, "<this>");
        j.f(jsonReader0, "jsonReader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        return Operations.parseResponse$default(operation0, jsonReader0, uUID0, customScalarAdapters0, null, 8, null);
    }

    public static final ApolloResponse parseResponse(Operation operation0, JsonReader jsonReader0, UUID uUID0, CustomScalarAdapters customScalarAdapters0, Set set0) {
        j.f(operation0, "<this>");
        j.f(jsonReader0, "jsonReader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        try {
            return ResponseParser.INSTANCE.parse(jsonReader0, operation0, uUID0, customScalarAdapters0, set0);
        }
        catch(Throwable throwable0) {
            if(uUID0 == null) {
                uUID0 = UUID.randomUUID();
                j.e(uUID0, "randomUUID(...)");
            }
            return new Builder(operation0, uUID0).exception(Operations.wrapIfNeeded(throwable0)).isLast(true).build();
        }
    }

    public static final ApolloResponse parseResponse(JsonReader jsonReader0, Operation operation0, UUID uUID0, CustomScalarAdapters customScalarAdapters0, Set set0) {
        j.f(jsonReader0, "<this>");
        j.f(operation0, "operation");
        j.f(customScalarAdapters0, "customScalarAdapters");
        try {
            return ResponseParser.INSTANCE.parse(jsonReader0, operation0, uUID0, customScalarAdapters0, set0);
        }
        catch(Throwable throwable0) {
            if(uUID0 == null) {
                uUID0 = UUID.randomUUID();
                j.e(uUID0, "randomUUID(...)");
            }
            return new Builder(operation0, uUID0).exception(Operations.wrapIfNeeded(throwable0)).isLast(true).build();
        }
    }

    public static ApolloResponse parseResponse$default(Operation operation0, JsonReader jsonReader0, UUID uUID0, CustomScalarAdapters customScalarAdapters0, Set set0, int v, Object object0) {
        if((v & 2) != 0) {
            uUID0 = null;
        }
        if((v & 4) != 0) {
            customScalarAdapters0 = CustomScalarAdapters.Empty;
        }
        if((v & 8) != 0) {
            set0 = null;
        }
        return Operations.parseResponse(operation0, jsonReader0, uUID0, customScalarAdapters0, set0);
    }

    public static ApolloResponse parseResponse$default(JsonReader jsonReader0, Operation operation0, UUID uUID0, CustomScalarAdapters customScalarAdapters0, Set set0, int v, Object object0) {
        if((v & 2) != 0) {
            uUID0 = null;
        }
        if((v & 4) != 0) {
            customScalarAdapters0 = CustomScalarAdapters.Empty;
        }
        if((v & 8) != 0) {
            set0 = null;
        }
        return Operations.parseResponse(jsonReader0, operation0, uUID0, customScalarAdapters0, set0);
    }

    public static final ApolloResponse toApolloResponse(JsonReader jsonReader0, Operation operation0, UUID uUID0, CustomScalarAdapters customScalarAdapters0, Set set0) {
        ApolloResponse apolloResponse1;
        j.f(jsonReader0, "<this>");
        j.f(operation0, "operation");
        j.f(customScalarAdapters0, "customScalarAdapters");
        ApolloResponse apolloResponse0 = null;
        try {
            apolloResponse1 = ResponseParser.INSTANCE.parse(jsonReader0, operation0, uUID0, customScalarAdapters0, set0);
            if(jsonReader0.peek() != Token.END_DOCUMENT) {
                throw new g("Expected END_DOCUMENT but was " + jsonReader0.peek(), 2);
            }
        }
        catch(Throwable throwable0) {
            try {
                if(uUID0 == null) {
                    uUID0 = UUID.randomUUID();
                    j.e(uUID0, "randomUUID(...)");
                }
                apolloResponse1 = new Builder(operation0, uUID0).exception(Operations.wrapIfNeeded(throwable0)).isLast(true).build();
                goto label_19;
            }
            catch(Throwable throwable1) {
            }
            try {
                jsonReader0.close();
            }
            catch(Throwable throwable2) {
                a.y(throwable1, throwable2);
            }
            goto label_24;
        }
        try {
        label_19:
            jsonReader0.close();
        }
        catch(Throwable apolloResponse0) {
        }
        throwable1 = apolloResponse0;
        apolloResponse0 = apolloResponse1;
    label_24:
        if(throwable1 != null) {
            throw throwable1;
        }
        return apolloResponse0;
    }

    public static ApolloResponse toApolloResponse$default(JsonReader jsonReader0, Operation operation0, UUID uUID0, CustomScalarAdapters customScalarAdapters0, Set set0, int v, Object object0) {
        if((v & 2) != 0) {
            uUID0 = null;
        }
        if((v & 4) != 0) {
            customScalarAdapters0 = CustomScalarAdapters.Empty;
        }
        if((v & 8) != 0) {
            set0 = null;
        }
        return Operations.toApolloResponse(jsonReader0, operation0, uUID0, customScalarAdapters0, set0);
    }

    private static final b wrapIfNeeded(Throwable throwable0) {
        return throwable0 instanceof b ? ((b)throwable0) : new f(throwable0, "Error while reading JSON response");
    }
}

