package Z8;

import Bb.q;
import Nb.j;
import Y8.b3;
import Y8.d3;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class w1 implements Adapter {
    public static final w1 a;
    public static final List b;

    static {
        w1.a = new w1();  // initializer: Ljava/lang/Object;-><init>()V
        w1.b = q.K("session");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        d3 d30;
        for(d30 = null; jsonReader0.selectName(w1.b) == 0; d30 = (d3)Adapters.-obj$default(y1.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        if(d30 == null) {
            throw o.q(jsonReader0, "session");
        }
        return new b3(d30);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((b3)object0), "value");
        jsonWriter0.name("session");
        Adapters.-obj$default(y1.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, ((b3)object0).a);
    }
}

