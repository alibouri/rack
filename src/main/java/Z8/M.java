package Z8;

import Bb.q;
import Nb.j;
import Y8.o;
import Y8.t;
import Y8.u;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class m implements Adapter {
    public static final m a;
    public static final List b;

    static {
        m.a = new m();  // initializer: Ljava/lang/Object;-><init>()V
        m.b = q.K("session");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        u u0;
        for(u0 = null; jsonReader0.selectName(m.b) == 0; u0 = (u)Adapters.-obj$default(n.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        if(u0 == null) {
            throw o.q(jsonReader0, "session");
        }
        return new t(u0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((t)object0), "value");
        jsonWriter0.name("session");
        Adapters.-obj$default(n.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, ((t)object0).a);
    }
}

