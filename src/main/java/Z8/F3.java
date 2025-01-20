package Z8;

import Bb.q;
import Nb.j;
import Y8.t5;
import Y8.u5;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class f3 implements Adapter {
    public static final f3 a;
    public static final List b;

    static {
        f3.a = new f3();  // initializer: Ljava/lang/Object;-><init>()V
        f3.b = q.K("response");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        u5 u50;
        for(u50 = null; jsonReader0.selectName(f3.b) == 0; u50 = (u5)Adapters.-nullable(Adapters.-obj(g3.a, true)).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        return new t5(u50);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((t5)object0), "value");
        jsonWriter0.name("response");
        Adapters.-nullable(Adapters.-obj(g3.a, true)).toJson(jsonWriter0, customScalarAdapters0, ((t5)object0).a);
    }
}

