package Z8;

import Bb.q;
import Nb.j;
import Y8.H2;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import java.util.List;

public abstract class o1 implements Adapter {
    public static final List a;

    static {
        o1.a = q.K("clientId");
    }

    public static H2 a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s;
        for(s = null; jsonReader0.selectName(o1.a) == 0; s = (String)Adapters.NullableStringAdapter.fromJson(jsonReader0, customScalarAdapters0)) {
        }
        return new H2(s);
    }
}

