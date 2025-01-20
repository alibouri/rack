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

public abstract class v1 implements Adapter {
    public static final List a;

    static {
        v1.a = q.L(new String[]{"merchantName", "qrUrl", "iconUrl"});
    }

    public static f1 a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        String s1 = null;
        String s2 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(v1.a)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    s1 = (String)Adapters.NullableStringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    s2 = (String)Adapters.NullableStringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(s == null) {
            throw o.q(jsonReader0, "merchantName");
        }
        return new f1(s, s1, s2);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, f1 f10) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(f10, "value");
        jsonWriter0.name("merchantName");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, f10.a);
        jsonWriter0.name("qrUrl");
        Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, f10.b);
        jsonWriter0.name("iconUrl");
        Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, f10.c);
    }
}

