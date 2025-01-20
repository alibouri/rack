package a9;

import Bb.q;
import Nb.j;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class h9 implements Adapter {
    public static final h9 a;
    public static final List b;

    static {
        h9.a = new h9();  // initializer: Ljava/lang/Object;-><init>()V
        h9.b = q.K("txHistoryOfflineSyncProps");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        f9 f90;
        for(f90 = null; jsonReader0.selectName(h9.b) == 0; f90 = (f9)Adapters.-obj$default(i9.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        if(f90 == null) {
            throw o.q(jsonReader0, "txHistoryOfflineSyncProps");
        }
        return new e9(f90);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((e9)object0), "value");
        jsonWriter0.name("txHistoryOfflineSyncProps");
        Adapters.-obj$default(i9.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, ((e9)object0).a);
    }
}

