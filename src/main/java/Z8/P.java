package Z8;

import Bb.q;
import Nb.j;
import Y8.o;
import Y8.y;
import Y8.z;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class p implements Adapter {
    public static final p a;
    public static final List b;

    static {
        p.a = new p();  // initializer: Ljava/lang/Object;-><init>()V
        p.b = q.K("appUpdaterParams");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        z z0;
        for(z0 = null; jsonReader0.selectName(p.b) == 0; z0 = (z)Adapters.-obj$default(Z8.q.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        if(z0 == null) {
            throw o.q(jsonReader0, "appUpdaterParams");
        }
        return new y(z0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((y)object0), "value");
        jsonWriter0.name("appUpdaterParams");
        Adapters.-obj$default(Z8.q.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, ((y)object0).a);
    }
}

