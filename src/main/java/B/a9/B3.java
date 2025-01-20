package a9;

import Bb.q;
import Nb.j;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public abstract class b3 implements Adapter {
    public static final List a;

    static {
        b3.a = q.L(new String[]{"isFreezingFunds", "originalTransferId"});
    }

    public static T2 a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        Boolean boolean0 = null;
        String s = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(b3.a)) {
                case 0: {
                    boolean0 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    s = (String)Adapters.NullableStringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(boolean0 == null) {
            throw o.q(jsonReader0, "isFreezingFunds");
        }
        return new T2(boolean0.booleanValue(), s);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, T2 t20) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(t20, "value");
        jsonWriter0.name("isFreezingFunds");
        o.E(t20.a, Adapters.BooleanAdapter, jsonWriter0, customScalarAdapters0, "originalTransferId");
        Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, t20.b);
    }
}

