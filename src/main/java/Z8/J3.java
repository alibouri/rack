package Z8;

import Bb.q;
import Nb.j;
import Y8.y5;
import Y8.z5;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class j3 implements Adapter {
    public static final j3 a;
    public static final List b;

    static {
        j3.a = new j3();  // initializer: Ljava/lang/Object;-><init>()V
        j3.b = q.K("response");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        z5 z50;
        for(z50 = null; jsonReader0.selectName(j3.b) == 0; z50 = (z5)Adapters.-nullable(Adapters.-obj(k3.a, true)).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        return new y5(z50);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((y5)object0), "value");
        jsonWriter0.name("response");
        Adapters.-nullable(Adapters.-obj(k3.a, true)).toJson(jsonWriter0, customScalarAdapters0, ((y5)object0).a);
    }
}

