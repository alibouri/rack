package Z8;

import Bb.q;
import Nb.j;
import Y8.k1;
import Y8.l1;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class q0 implements Adapter {
    public static final q0 a;
    public static final List b;

    static {
        q0.a = new q0();  // initializer: Ljava/lang/Object;-><init>()V
        q0.b = q.K("send");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        l1 l10;
        for(l10 = null; jsonReader0.selectName(q0.b) == 0; l10 = (l1)Adapters.-nullable(Adapters.-obj$default(r0.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        return new k1(l10);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((k1)object0), "value");
        jsonWriter0.name("send");
        Adapters.-nullable(Adapters.-obj$default(r0.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, ((k1)object0).a);
    }
}

