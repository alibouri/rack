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

public abstract class z1 implements Adapter {
    public static final List a;

    static {
        z1.a = q.L(new String[]{"senderName", "senderMobile", "isFreezingFunds"});
    }

    public static j1 a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        String s1 = null;
        Boolean boolean0 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(z1.a)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    s1 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    boolean0 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(s == null) {
            throw o.q(jsonReader0, "senderName");
        }
        if(s1 == null) {
            throw o.q(jsonReader0, "senderMobile");
        }
        if(boolean0 == null) {
            throw o.q(jsonReader0, "isFreezingFunds");
        }
        return new j1(s, s1, boolean0.booleanValue());
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, j1 j10) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(j10, "value");
        jsonWriter0.name("senderName");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, j10.a);
        jsonWriter0.name("senderMobile");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, j10.b);
        jsonWriter0.name("isFreezingFunds");
        Adapters.BooleanAdapter.toJson(jsonWriter0, customScalarAdapters0, Boolean.valueOf(j10.c));
    }
}

