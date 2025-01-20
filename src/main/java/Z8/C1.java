package Z8;

import Bb.q;
import Nb.j;
import Y8.s2;
import Y8.t2;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class c1 implements Adapter {
    public static final c1 a;
    public static final List b;

    static {
        c1.a = new c1();  // initializer: Ljava/lang/Object;-><init>()V
        c1.b = q.K("me");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        t2 t20;
        for(t20 = null; jsonReader0.selectName(c1.b) == 0; t20 = (t2)Adapters.-nullable(Adapters.-obj(d1.a, true)).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        return new s2(t20);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((s2)object0), "value");
        jsonWriter0.name("me");
        Adapters.-nullable(Adapters.-obj(d1.a, true)).toJson(jsonWriter0, customScalarAdapters0, ((s2)object0).a);
    }
}

