package Z8;

import Bb.q;
import Nb.j;
import Y8.v2;
import Y8.w2;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class e1 implements Adapter {
    public static final e1 a;
    public static final List b;

    static {
        e1.a = new e1();  // initializer: Ljava/lang/Object;-><init>()V
        e1.b = q.K("generateSecurityQuestionForm");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        w2 w20;
        for(w20 = null; jsonReader0.selectName(e1.b) == 0; w20 = (w2)Adapters.-nullable(Adapters.-obj$default(f1.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        return new v2(w20);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((v2)object0), "value");
        jsonWriter0.name("generateSecurityQuestionForm");
        Adapters.-nullable(Adapters.-obj$default(f1.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, ((v2)object0).a);
    }
}

