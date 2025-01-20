package Z8;

import Bb.q;
import Nb.j;
import Y8.E8;
import Y8.F8;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class i5 implements Adapter {
    public static final i5 a;
    public static final List b;

    static {
        i5.a = new i5();  // initializer: Ljava/lang/Object;-><init>()V
        i5.b = q.K("signup");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        F8 f80;
        for(f80 = null; jsonReader0.selectName(i5.b) == 0; f80 = (F8)Adapters.-nullable(Adapters.-obj$default(j5.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        return new E8(f80);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((E8)object0), "value");
        jsonWriter0.name("signup");
        Adapters.-nullable(Adapters.-obj$default(j5.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, ((E8)object0).a);
    }
}

