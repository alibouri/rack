package Z8;

import Bb.q;
import Nb.j;
import Y8.A2;
import Y8.z2;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class h1 implements Adapter {
    public static final h1 a;
    public static final List b;

    static {
        h1.a = new h1();  // initializer: Ljava/lang/Object;-><init>()V
        h1.b = q.K("getBillTypeBalanceInfo");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        A2 a20;
        for(a20 = null; jsonReader0.selectName(h1.b) == 0; a20 = (A2)Adapters.-nullable(Adapters.-obj$default(i1.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        return new z2(a20);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((z2)object0), "value");
        jsonWriter0.name("getBillTypeBalanceInfo");
        Adapters.-nullable(Adapters.-obj$default(i1.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, ((z2)object0).a);
    }
}

