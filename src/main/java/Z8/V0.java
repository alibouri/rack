package Z8;

import Bb.q;
import Nb.j;
import Y8.q1;
import Y8.s1;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class v0 implements Adapter {
    public static final v0 a;
    public static final List b;

    static {
        v0.a = new v0();  // initializer: Ljava/lang/Object;-><init>()V
        v0.b = q.K("verifyAuthCode");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        s1 s10;
        for(s10 = null; jsonReader0.selectName(v0.b) == 0; s10 = (s1)Adapters.-nullable(Adapters.-obj$default(x0.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        return new q1(s10);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((q1)object0), "value");
        jsonWriter0.name("verifyAuthCode");
        Adapters.-nullable(Adapters.-obj$default(x0.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, ((q1)object0).a);
    }
}

