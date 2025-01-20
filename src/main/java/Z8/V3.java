package Z8;

import Bb.q;
import Nb.j;
import Y8.O5;
import Y8.P5;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class v3 implements Adapter {
    public static final v3 a;
    public static final List b;

    static {
        v3.a = new v3();  // initializer: Ljava/lang/Object;-><init>()V
        v3.b = q.K("session");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        P5 p50;
        for(p50 = null; jsonReader0.selectName(v3.b) == 0; p50 = (P5)Adapters.-obj(w3.a, true).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        if(p50 == null) {
            throw o.q(jsonReader0, "session");
        }
        return new O5(p50);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((O5)object0), "value");
        jsonWriter0.name("session");
        Adapters.-obj(w3.a, true).toJson(jsonWriter0, customScalarAdapters0, ((O5)object0).a);
    }
}

