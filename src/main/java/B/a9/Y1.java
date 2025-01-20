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

public abstract class y1 implements Adapter {
    public static final List a;

    static {
        y1.a = q.L(new String[]{"senderName", "senderMobile", "isRefunded"});
    }

    public static i1 a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        String s1 = null;
        Boolean boolean0 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(y1.a)) {
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
            throw o.q(jsonReader0, "isRefunded");
        }
        return new i1(s, s1, boolean0.booleanValue());
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, i1 i10) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(i10, "value");
        jsonWriter0.name("senderName");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, i10.a);
        jsonWriter0.name("senderMobile");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, i10.b);
        jsonWriter0.name("isRefunded");
        Adapters.BooleanAdapter.toJson(jsonWriter0, customScalarAdapters0, Boolean.valueOf(i10.c));
    }
}

