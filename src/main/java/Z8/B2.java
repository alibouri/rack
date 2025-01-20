package Z8;

import Bb.q;
import Nb.j;
import Y8.g4;
import Y8.h4;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class b2 implements Adapter {
    public static final b2 a;
    public static final List b;

    static {
        b2.a = new b2();  // initializer: Ljava/lang/Object;-><init>()V
        b2.b = q.K("session");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        h4 h40;
        for(h40 = null; jsonReader0.selectName(b2.b) == 0; h40 = (h4)Adapters.-obj$default(c2.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        if(h40 == null) {
            throw o.q(jsonReader0, "session");
        }
        return new g4(h40);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((g4)object0), "value");
        jsonWriter0.name("session");
        Adapters.-obj$default(c2.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, ((g4)object0).a);
    }
}

