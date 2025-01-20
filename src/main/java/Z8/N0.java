package Z8;

import Bb.q;
import Nb.j;
import Y8.g1;
import Y8.h1;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class n0 implements Adapter {
    public static final n0 a;
    public static final List b;

    static {
        n0.a = new n0();  // initializer: Ljava/lang/Object;-><init>()V
        n0.b = q.K("session");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        h1 h10;
        for(h10 = null; jsonReader0.selectName(n0.b) == 0; h10 = (h1)Adapters.-obj(o0.a, true).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        if(h10 == null) {
            throw o.q(jsonReader0, "session");
        }
        return new g1(h10);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((g1)object0), "value");
        jsonWriter0.name("session");
        Adapters.-obj(o0.a, true).toJson(jsonWriter0, customScalarAdapters0, ((g1)object0).a);
    }
}

