package Z8;

import Bb.q;
import Nb.j;
import Y8.x1;
import Y8.y1;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class z0 implements Adapter {
    public static final z0 a;
    public static final List b;

    static {
        z0.a = new z0();  // initializer: Ljava/lang/Object;-><init>()V
        z0.b = q.K("decodeWaveQr");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        y1 y10;
        for(y10 = null; jsonReader0.selectName(z0.b) == 0; y10 = (y1)Adapters.-nullable(Adapters.-obj$default(A0.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        return new x1(y10);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((x1)object0), "value");
        jsonWriter0.name("decodeWaveQr");
        Adapters.-nullable(Adapters.-obj$default(A0.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, ((x1)object0).a);
    }
}

