package Z8;

import Bb.q;
import Nb.j;
import Y8.i;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class g implements Adapter {
    public static final g a;
    public static final List b;

    static {
        g.a = new g();  // initializer: Ljava/lang/Object;-><init>()V
        g.b = q.K("acknowledgePushNotification");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        i i0;
        for(i0 = null; jsonReader0.selectName(g.b) == 0; i0 = (i)Adapters.-nullable(Adapters.-obj$default(f.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        return new Y8.j(i0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((Y8.j)object0), "value");
        jsonWriter0.name("acknowledgePushNotification");
        Adapters.-nullable(Adapters.-obj$default(f.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, ((Y8.j)object0).a);
    }
}

