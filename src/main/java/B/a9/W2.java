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

public abstract class w2 implements Adapter {
    public static final List a;

    static {
        w2.a = q.L(new String[]{"contractUrl", "documentFields", "minRequiredSignPoints"});
    }

    public static o2 a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        List list0 = null;
        Integer integer0 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(w2.a)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    list0 = (List)Adapters.-nullable(Adapters.-list(Adapters.-obj(s2.a, true))).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    integer0 = (Integer)Adapters.NullableIntAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(s == null) {
            throw o.q(jsonReader0, "contractUrl");
        }
        return new o2(s, list0, integer0);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, o2 o20) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(o20, "value");
        jsonWriter0.name("contractUrl");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, o20.a);
        jsonWriter0.name("documentFields");
        Adapters.-nullable(Adapters.-list(Adapters.-obj(s2.a, true))).toJson(jsonWriter0, customScalarAdapters0, o20.b);
        jsonWriter0.name("minRequiredSignPoints");
        Adapters.NullableIntAdapter.toJson(jsonWriter0, customScalarAdapters0, o20.c);
    }
}

