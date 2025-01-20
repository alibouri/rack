package Z8;

import Bb.q;
import Nb.j;
import Y8.d1;
import Y8.e1;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class l0 implements Adapter {
    public static final l0 a;
    public static final List b;

    static {
        l0.a = new l0();  // initializer: Ljava/lang/Object;-><init>()V
        l0.b = q.K("logout");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        e1 e10;
        for(e10 = null; jsonReader0.selectName(l0.b) == 0; e10 = (e1)Adapters.-nullable(Adapters.-obj$default(m0.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        return new d1(e10);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((d1)object0), "value");
        jsonWriter0.name("logout");
        Adapters.-nullable(Adapters.-obj$default(m0.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, ((d1)object0).a);
    }
}

