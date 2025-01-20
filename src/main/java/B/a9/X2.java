package a9;

import Bb.q;
import Nb.j;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import java.util.List;

public abstract class x2 implements Adapter {
    public static final List a;

    static {
        x2.a = q.K("warningForSkip");
    }

    public static p2 a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s;
        for(s = null; jsonReader0.selectName(x2.a) == 0; s = (String)Adapters.NullableStringAdapter.fromJson(jsonReader0, customScalarAdapters0)) {
        }
        return new p2(s);
    }
}

