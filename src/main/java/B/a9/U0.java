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

public abstract class u0 implements Adapter {
    public static final List a;

    static {
        u0.a = q.L(new String[]{"groupSize", "separator"});
    }

    public static l0 a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        Integer integer0 = null;
        String s = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(u0.a)) {
                case 0: {
                    integer0 = (Integer)Adapters.IntAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(integer0 == null) {
            throw o.q(jsonReader0, "groupSize");
        }
        int v = (int)integer0;
        if(s == null) {
            throw o.q(jsonReader0, "separator");
        }
        return new l0(v, s);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, l0 l00) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(l00, "value");
        jsonWriter0.name("groupSize");
        o.D(l00.a, Adapters.IntAdapter, jsonWriter0, customScalarAdapters0, "separator");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, l00.b);
    }
}

