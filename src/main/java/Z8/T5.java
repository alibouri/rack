package Z8;

import Bb.q;
import Nb.j;
import Y8.S8;
import Y8.T8;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class t5 implements Adapter {
    public static final t5 a;
    public static final List b;

    static {
        t5.a = new t5();  // initializer: Ljava/lang/Object;-><init>()V
        t5.b = q.K("support");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        T8 t80;
        for(t80 = null; jsonReader0.selectName(t5.b) == 0; t80 = (T8)Adapters.-obj$default(u5.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        if(t80 == null) {
            throw o.q(jsonReader0, "support");
        }
        return new S8(t80);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((S8)object0), "value");
        jsonWriter0.name("support");
        Adapters.-obj$default(u5.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, ((S8)object0).a);
    }
}

