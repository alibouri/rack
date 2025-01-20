package Z8;

import Bb.q;
import Nb.j;
import Y8.J8;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public abstract class m5 implements Adapter {
    public static final List a;

    static {
        m5.a = q.K("usePots");
    }

    public static J8 a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        Boolean boolean0;
        for(boolean0 = null; jsonReader0.selectName(m5.a) == 0; boolean0 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0)) {
        }
        if(boolean0 == null) {
            throw o.q(jsonReader0, "usePots");
        }
        return new J8(boolean0.booleanValue());
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, J8 j80) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(j80, "value");
        jsonWriter0.name("usePots");
        Adapters.BooleanAdapter.toJson(jsonWriter0, customScalarAdapters0, Boolean.valueOf(j80.a));
    }
}

