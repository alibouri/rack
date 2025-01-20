package Z8;

import Bb.q;
import Nb.j;
import Y8.u;
import Y8.v;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class n implements Adapter {
    public static final n a;
    public static final List b;

    static {
        n.a = new n();  // initializer: Ljava/lang/Object;-><init>()V
        n.b = q.K("user");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        v v0;
        for(v0 = null; jsonReader0.selectName(n.b) == 0; v0 = (v)Adapters.-obj(o.a, true).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        if(v0 == null) {
            throw Y8.o.q(jsonReader0, "user");
        }
        return new u(v0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((u)object0), "value");
        jsonWriter0.name("user");
        Adapters.-obj(o.a, true).toJson(jsonWriter0, customScalarAdapters0, ((u)object0).a);
    }
}

