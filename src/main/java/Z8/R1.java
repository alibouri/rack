package Z8;

import Bb.q;
import Nb.j;
import Y8.L2;
import Y8.M2;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class r1 implements Adapter {
    public static final r1 a;
    public static final List b;

    static {
        r1.a = new r1();  // initializer: Ljava/lang/Object;-><init>()V
        r1.b = q.K("getLinkedAccountBalanceInfo");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        M2 m20;
        for(m20 = null; jsonReader0.selectName(r1.b) == 0; m20 = (M2)Adapters.-nullable(Adapters.-obj$default(s1.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        return new L2(m20);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((L2)object0), "value");
        jsonWriter0.name("getLinkedAccountBalanceInfo");
        Adapters.-nullable(Adapters.-obj$default(s1.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, ((L2)object0).a);
    }
}

