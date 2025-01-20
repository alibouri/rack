package Z8;

import Bb.q;
import Y8.p;
import Y8.r;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class j implements Adapter {
    public static final j a;
    public static final List b;

    static {
        j.a = new j();  // initializer: Ljava/lang/Object;-><init>()V
        j.b = q.K("wallet");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        Nb.j.f(jsonReader0, "reader");
        Nb.j.f(customScalarAdapters0, "customScalarAdapters");
        r r0;
        for(r0 = null; jsonReader0.selectName(j.b) == 0; r0 = (r)Adapters.-nullable(Adapters.-obj$default(l.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        return new p(r0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        Nb.j.f(jsonWriter0, "writer");
        Nb.j.f(customScalarAdapters0, "customScalarAdapters");
        Nb.j.f(((p)object0), "value");
        jsonWriter0.name("wallet");
        Adapters.-nullable(Adapters.-obj$default(l.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, ((p)object0).a);
    }
}

