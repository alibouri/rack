package Z8;

import Bb.q;
import Nb.j;
import Y8.q7;
import Y8.s7;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class j4 implements Adapter {
    public static final j4 a;
    public static final List b;

    static {
        j4.a = new j4();  // initializer: Ljava/lang/Object;-><init>()V
        j4.b = q.K("saveDocumentInfo");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        s7 s70;
        for(s70 = null; jsonReader0.selectName(j4.b) == 0; s70 = (s7)Adapters.-nullable(Adapters.-obj$default(l4.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        return new q7(s70);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((q7)object0), "value");
        jsonWriter0.name("saveDocumentInfo");
        Adapters.-nullable(Adapters.-obj$default(l4.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, ((q7)object0).a);
    }
}

