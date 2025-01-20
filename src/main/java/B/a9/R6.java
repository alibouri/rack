package a9;

import Bb.q;
import Nb.j;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.type.ScratchCardBackground;
import e9.a;
import java.util.List;

public abstract class r6 implements Adapter {
    public static final List a;

    static {
        r6.a = q.K("background");
    }

    public static q6 a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        ScratchCardBackground scratchCardBackground0;
        for(scratchCardBackground0 = null; jsonReader0.selectName(r6.a) == 0; scratchCardBackground0 = (ScratchCardBackground)Adapters.-nullable(a.r).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        return new q6(scratchCardBackground0);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, q6 q60) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(q60, "value");
        jsonWriter0.name("background");
        Adapters.-nullable(a.r).toJson(jsonWriter0, customScalarAdapters0, q60.a);
    }
}

