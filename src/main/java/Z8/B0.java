package Z8;

import Bb.q;
import Nb.j;
import Y8.R0;
import Y8.T0;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class b0 implements Adapter {
    public static final b0 a;
    public static final List b;

    static {
        b0.a = new b0();  // initializer: Ljava/lang/Object;-><init>()V
        b0.b = q.K("me");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        T0 t00;
        for(t00 = null; jsonReader0.selectName(b0.b) == 0; t00 = (T0)Adapters.-nullable(Adapters.-obj$default(d0.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        return new R0(t00);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((R0)object0), "value");
        jsonWriter0.name("me");
        Adapters.-nullable(Adapters.-obj$default(d0.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, ((R0)object0).a);
    }
}

