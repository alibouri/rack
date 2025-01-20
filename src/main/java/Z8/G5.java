package Z8;

import Bb.q;
import Nb.j;
import Y8.B8;
import Y8.C8;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class g5 implements Adapter {
    public static final g5 a;
    public static final List b;

    static {
        g5.a = new g5();  // initializer: Ljava/lang/Object;-><init>()V
        g5.b = q.K("setPin");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        C8 c80;
        for(c80 = null; jsonReader0.selectName(g5.b) == 0; c80 = (C8)Adapters.-nullable(Adapters.-obj$default(h5.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        return new B8(c80);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((B8)object0), "value");
        jsonWriter0.name("setPin");
        Adapters.-nullable(Adapters.-obj$default(h5.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, ((B8)object0).a);
    }
}

