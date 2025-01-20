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

public abstract class u5 implements Adapter {
    public static final List a;

    static {
        u5.a = q.K("detail");
    }

    public static n5 a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j5 j50;
        for(j50 = null; jsonReader0.selectName(u5.a) == 0; j50 = (j5)Adapters.-obj(q5.a, true).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        if(j50 == null) {
            throw o.q(jsonReader0, "detail");
        }
        return new n5(j50);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, n5 n50) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(n50, "value");
        jsonWriter0.name("detail");
        Adapters.-obj(q5.a, true).toJson(jsonWriter0, customScalarAdapters0, n50.a);
    }
}

