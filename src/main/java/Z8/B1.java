package Z8;

import Bb.q;
import Nb.j;
import Y8.j2;
import Y8.k2;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class b1 implements Adapter {
    public static final b1 a;
    public static final List b;

    static {
        b1.a = new b1();  // initializer: Ljava/lang/Object;-><init>()V
        b1.b = q.K("appProps");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j2 j20;
        for(j20 = null; jsonReader0.selectName(b1.b) == 0; j20 = (j2)Adapters.-obj$default(a1.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        if(j20 == null) {
            throw o.q(jsonReader0, "appProps");
        }
        return new k2(j20);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((k2)object0), "value");
        jsonWriter0.name("appProps");
        Adapters.-obj$default(a1.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, ((k2)object0).a);
    }
}

