package Z8;

import Bb.q;
import Nb.j;
import Y8.p;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class k implements Adapter {
    public static final k a;
    public static final List b;

    static {
        k.a = new k();  // initializer: Ljava/lang/Object;-><init>()V
        k.b = q.K("agreeToTerms");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        p p0;
        for(p0 = null; jsonReader0.selectName(k.b) == 0; p0 = (p)Adapters.-nullable(Adapters.-obj$default(Z8.j.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        return new Y8.q(p0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((Y8.q)object0), "value");
        jsonWriter0.name("agreeToTerms");
        Adapters.-nullable(Adapters.-obj$default(Z8.j.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, ((Y8.q)object0).a);
    }
}

