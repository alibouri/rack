package Z8;

import Bb.q;
import Nb.j;
import Y8.V8;
import Y8.W8;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class v5 implements Adapter {
    public static final v5 a;
    public static final List b;

    static {
        v5.a = new v5();  // initializer: Ljava/lang/Object;-><init>()V
        v5.b = q.K("support");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        W8 w80;
        for(w80 = null; jsonReader0.selectName(v5.b) == 0; w80 = (W8)Adapters.-obj(w5.a, true).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        if(w80 == null) {
            throw o.q(jsonReader0, "support");
        }
        return new V8(w80);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((V8)object0), "value");
        jsonWriter0.name("support");
        Adapters.-obj(w5.a, true).toJson(jsonWriter0, customScalarAdapters0, ((V8)object0).a);
    }
}

