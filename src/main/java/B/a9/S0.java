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

public abstract class s0 implements Adapter {
    public static final List a;

    static {
        s0.a = q.K("choices");
    }

    public static j0 a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        List list0;
        for(list0 = null; jsonReader0.selectName(s0.a) == 0; list0 = Adapters.-list(Adapters.-obj$default(n0.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        if(list0 == null) {
            throw o.q(jsonReader0, "choices");
        }
        return new j0(list0);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, j0 j00) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(j00, "value");
        jsonWriter0.name("choices");
        Adapters.-list(Adapters.-obj$default(n0.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, j00.a);
    }
}

