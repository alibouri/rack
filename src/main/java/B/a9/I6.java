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

public abstract class i6 implements Adapter {
    public static final List a;

    static {
        i6.a = q.L(new String[]{"dealId", "name", "shortDescription", "dealIconUrl", "detail"});
    }

    public static d6 a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        b6 b60 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(i6.a)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    s1 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    s2 = (String)Adapters.NullableStringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 3: {
                    s3 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 4: {
                    b60 = (b6)Adapters.-obj(g6.a, true).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(s == null) {
            throw o.q(jsonReader0, "dealId");
        }
        if(s1 == null) {
            throw o.q(jsonReader0, "name");
        }
        if(s3 == null) {
            throw o.q(jsonReader0, "dealIconUrl");
        }
        if(b60 == null) {
            throw o.q(jsonReader0, "detail");
        }
        return new d6(s, s1, s2, s3, b60);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, d6 d60) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(d60, "value");
        jsonWriter0.name("dealId");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, d60.a);
        jsonWriter0.name("name");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, d60.b);
        jsonWriter0.name("shortDescription");
        Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, d60.c);
        jsonWriter0.name("dealIconUrl");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, d60.d);
        jsonWriter0.name("detail");
        Adapters.-obj(g6.a, true).toJson(jsonWriter0, customScalarAdapters0, d60.e);
    }
}

