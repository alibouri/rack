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

public abstract class f3 implements Adapter {
    public static final List a;

    static {
        f3.a = q.L(new String[]{"recipientName", "recipientMobile", "isFreezingFunds"});
    }

    public static X2 a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        String s1 = null;
        Boolean boolean0 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(f3.a)) {
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
            throw o.q(jsonReader0, "recipientName");
        }
        if(s1 == null) {
            throw o.q(jsonReader0, "recipientMobile");
        }
        if(boolean0 == null) {
            throw o.q(jsonReader0, "isFreezingFunds");
        }
        return new X2(s, s1, boolean0.booleanValue());
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, X2 x20) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(x20, "value");
        jsonWriter0.name("recipientName");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, x20.a);
        jsonWriter0.name("recipientMobile");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, x20.b);
        jsonWriter0.name("isFreezingFunds");
        Adapters.BooleanAdapter.toJson(jsonWriter0, customScalarAdapters0, Boolean.valueOf(x20.c));
    }
}

