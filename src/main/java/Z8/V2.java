package Z8;

import Bb.q;
import Nb.j;
import Y8.C4;
import Y8.D4;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class v2 implements Adapter {
    public static final v2 a;
    public static final List b;

    static {
        v2.a = new v2();  // initializer: Ljava/lang/Object;-><init>()V
        v2.b = q.K("session");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        D4 d40;
        for(d40 = null; jsonReader0.selectName(v2.b) == 0; d40 = (D4)Adapters.-obj$default(w2.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        if(d40 == null) {
            throw o.q(jsonReader0, "session");
        }
        return new C4(d40);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((C4)object0), "value");
        jsonWriter0.name("session");
        Adapters.-obj$default(w2.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, ((C4)object0).a);
    }
}

