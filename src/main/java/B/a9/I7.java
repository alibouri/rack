package a9;

import Bb.q;
import Nb.j;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class i7 implements Adapter {
    public static final i7 a;
    public static final List b;

    static {
        i7.a = new i7();  // initializer: Ljava/lang/Object;-><init>()V
        i7.b = q.K("node");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        T6 t60;
        for(t60 = null; jsonReader0.selectName(i7.b) == 0; t60 = (T6)Adapters.-obj$default(l7.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        if(t60 == null) {
            throw o.q(jsonReader0, "node");
        }
        return new Q6(t60);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((Q6)object0), "value");
        jsonWriter0.name("node");
        Adapters.-obj$default(l7.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, ((Q6)object0).a);
    }
}

