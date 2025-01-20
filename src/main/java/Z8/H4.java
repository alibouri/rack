package Z8;

import Bb.q;
import Nb.j;
import Y8.n7;
import Y8.o7;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class h4 implements Adapter {
    public static final h4 a;
    public static final List b;

    static {
        h4.a = new h4();  // initializer: Ljava/lang/Object;-><init>()V
        h4.b = q.K("respondOstrichEasterEggs");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        o7 o70;
        for(o70 = null; jsonReader0.selectName(h4.b) == 0; o70 = (o7)Adapters.-nullable(Adapters.-obj$default(i4.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        return new n7(o70);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((n7)object0), "value");
        jsonWriter0.name("respondOstrichEasterEggs");
        Adapters.-nullable(Adapters.-obj$default(i4.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, ((n7)object0).a);
    }
}

