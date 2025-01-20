package Z8;

import Bb.q;
import Nb.j;
import Y8.G7;
import Y8.H7;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class v4 implements Adapter {
    public static final v4 a;
    public static final List b;

    static {
        v4.a = new v4();  // initializer: Ljava/lang/Object;-><init>()V
        v4.b = q.K("performSavingsTransaction");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        H7 h70;
        for(h70 = null; jsonReader0.selectName(v4.b) == 0; h70 = (H7)Adapters.-nullable(Adapters.-obj$default(w4.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        return new G7(h70);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((G7)object0), "value");
        jsonWriter0.name("performSavingsTransaction");
        Adapters.-nullable(Adapters.-obj$default(w4.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, ((G7)object0).a);
    }
}

